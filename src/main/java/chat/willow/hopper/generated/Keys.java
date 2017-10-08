/*
 * This file is generated by jOOQ.
*/
package chat.willow.hopper.generated;


import chat.willow.hopper.generated.tables.Logins;
import chat.willow.hopper.generated.tables.SchemaVersion;
import chat.willow.hopper.generated.tables.Sessions;
import chat.willow.hopper.generated.tables.records.LoginsRecord;
import chat.willow.hopper.generated.tables.records.SchemaVersionRecord;
import chat.willow.hopper.generated.tables.records.SessionsRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<LoginsRecord> PK_LOGINS = UniqueKeys0.PK_LOGINS;
    public static final UniqueKey<SessionsRecord> PK_SESSIONS = UniqueKeys0.PK_SESSIONS;
    public static final UniqueKey<SchemaVersionRecord> PK_SCHEMA_VERSION = UniqueKeys0.PK_SCHEMA_VERSION;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<LoginsRecord> PK_LOGINS = createUniqueKey(Logins.LOGINS, "pk_Logins", Logins.LOGINS.ID);
        public static final UniqueKey<SessionsRecord> PK_SESSIONS = createUniqueKey(Sessions.SESSIONS, "pk_Sessions", Sessions.SESSIONS.ID);
        public static final UniqueKey<SchemaVersionRecord> PK_SCHEMA_VERSION = createUniqueKey(SchemaVersion.SCHEMA_VERSION, "pk_schema_version", SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK);
    }
}