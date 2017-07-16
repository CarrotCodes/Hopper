package chat.willow.hopper.routes.connection

import chat.willow.hopper.HopperRunner
import chat.willow.hopper.connections.HopperConnection
import chat.willow.hopper.connections.IHopperConnections
import chat.willow.hopper.logging.loggerFor
import chat.willow.hopper.routes.*
import chat.willow.hopper.routes.shared.EmptyBody
import chat.willow.hopper.routes.shared.ErrorResponseBody
import chat.willow.warren.WarrenClient
import com.google.common.net.HostSpecifier
import com.google.common.net.InternetDomainName
import com.squareup.moshi.Moshi
import spark.Request
import kotlin.concurrent.thread

data class ConnectionStopContext(val authenticatedContext: AuthenticatedContext, val id: String) {

    companion object Builder: IContextBuilder<ConnectionStopContext> {
        override fun build(request: Request): ConnectionStopContext? {
            val authContext = AuthenticatedContext.Builder.build(request) ?: return null
            val id = request.params("id") ?: return null

            return ConnectionStopContext(authContext, id)
        }
    }

}

class ConnectionStopRouteHandler(moshi: Moshi, private val connections: IHopperConnections) :
        JsonRouteHandler<EmptyBody, EmptyBody, ConnectionStopContext>(
                EmptyBody,
                EmptyBody,
                moshi.stringSerialiser(),
                ConnectionStopContext.Builder
        ) {

    private val LOGGER = loggerFor<ConnectionStopRouteHandler>()

    override fun handle(request: EmptyBody, context: ConnectionStopContext): RouteResult<EmptyBody, ErrorResponseBody> {
        LOGGER.info("handling GET /connection/<id>/stop: $request")

        // todo: sanity check id
        connections.stop(context.id)

        return RouteResult.success(value = EmptyBody)
    }

}