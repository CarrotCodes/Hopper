/*
 * This file is generated by jOOQ.
*/
package chat.willow.hopper.generated.tables.records;


import chat.willow.hopper.generated.tables.Connections;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConnectionsRecord extends UpdatableRecordImpl<ConnectionsRecord> implements Record7<Integer, String, String, String, Integer, Boolean, String> {

    private static final long serialVersionUID = 930985899;

    /**
     * Setter for <code>Connections.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Connections.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Connections.userid</code>.
     */
    public void setUserid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Connections.userid</code>.
     */
    public String getUserid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Connections.connectionid</code>.
     */
    public void setConnectionid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Connections.connectionid</code>.
     */
    public String getConnectionid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Connections.host</code>.
     */
    public void setHost(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Connections.host</code>.
     */
    public String getHost() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Connections.port</code>.
     */
    public void setPort(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Connections.port</code>.
     */
    public Integer getPort() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Connections.tls</code>.
     */
    public void setTls(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>Connections.tls</code>.
     */
    public Boolean getTls() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>Connections.nick</code>.
     */
    public void setNick(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Connections.nick</code>.
     */
    public String getNick() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Integer, Boolean, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, Integer, Boolean, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Connections.CONNECTIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Connections.CONNECTIONS.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Connections.CONNECTIONS.CONNECTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Connections.CONNECTIONS.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Connections.CONNECTIONS.PORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return Connections.CONNECTIONS.TLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Connections.CONNECTIONS.NICK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConnectionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getTls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getNick();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value2(String value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value3(String value) {
        setConnectionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value4(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value5(Integer value) {
        setPort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value6(Boolean value) {
        setTls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord value7(String value) {
        setNick(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionsRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Boolean value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConnectionsRecord
     */
    public ConnectionsRecord() {
        super(Connections.CONNECTIONS);
    }

    /**
     * Create a detached, initialised ConnectionsRecord
     */
    public ConnectionsRecord(Integer id, String userid, String connectionid, String host, Integer port, Boolean tls, String nick) {
        super(Connections.CONNECTIONS);

        set(0, id);
        set(1, userid);
        set(2, connectionid);
        set(3, host);
        set(4, port);
        set(5, tls);
        set(6, nick);
    }
}
