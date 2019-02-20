package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class MenuFunctionality_Base extends org.fenixedu.bennu.portal.domain.MenuItem {
    // Static Slots
    
    // Slots
    
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  MenuFunctionality_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getItemKey() {
        return ((DO_State)this.get$obj$state(false)).itemKey;
    }
    
    protected void setItemKey(java.lang.String itemKey) {
        ((DO_State)this.get$obj$state(true)).itemKey = itemKey;
    }
    
    private java.lang.String get$itemKey() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).itemKey;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$itemKey(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).itemKey = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getProvider() {
        return ((DO_State)this.get$obj$state(false)).provider;
    }
    
    protected void setProvider(java.lang.String provider) {
        ((DO_State)this.get$obj$state(true)).provider = provider;
    }
    
    private java.lang.String get$provider() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).provider;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$provider(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).provider = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getDocumentationUrl() {
        return ((DO_State)this.get$obj$state(false)).documentationUrl;
    }
    
    public void setDocumentationUrl(java.lang.String documentationUrl) {
        ((DO_State)this.get$obj$state(true)).documentationUrl = documentationUrl;
    }
    
    private java.lang.String get$documentationUrl() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).documentationUrl;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$documentationUrl(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).documentationUrl = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        set$itemKey(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ITEM_KEY"), state);
        set$provider(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PROVIDER"), state);
        set$documentationUrl(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "DOCUMENTATION_URL"), state);
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        
    }
    protected static class DO_State extends org.fenixedu.bennu.portal.domain.MenuItem.DO_State {
        private java.lang.String itemKey;
        private java.lang.String provider;
        private java.lang.String documentationUrl;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.itemKey = this.itemKey;
            newCasted.provider = this.provider;
            newCasted.documentationUrl = this.documentationUrl;
            
        }
        
    }
    
}
