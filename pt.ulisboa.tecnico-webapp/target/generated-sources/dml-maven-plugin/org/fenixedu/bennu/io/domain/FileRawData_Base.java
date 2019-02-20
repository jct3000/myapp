package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class FileRawData_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileRawData,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileRawData,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileRawData o1) {
            return ((FileRawData_Base.DO_State)o1.get$obj$state(false)).fileSupport;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileRawData o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileRawData_Base.DO_State)o1.get$obj$state(true)).fileSupport = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$fileRawData;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getRelationFileRawDatas() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationFileRawDatas();
    }
    
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
    protected  FileRawData_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getContentKey() {
        return ((DO_State)this.get$obj$state(false)).contentKey;
    }
    
    protected void setContentKey(java.lang.String contentKey) {
        ((DO_State)this.get$obj$state(true)).contentKey = contentKey;
    }
    
    private java.lang.String get$contentKey() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).contentKey;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$contentKey(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).contentKey = (java.lang.String)((value == null) ? null : value);
    }
    
    protected byte[] getContent() {
        return ((DO_State)this.get$obj$state(false)).content;
    }
    
    protected void setContent(byte[] content) {
        ((DO_State)this.get$obj$state(true)).content = content;
    }
    
    private java.lang.Object get$content() {
        byte[] value = ((DO_State)this.get$obj$state(false)).content;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForbytearray(value);
    }
    
    private final void set$content(byte[] value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).content = (byte[])((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return ((DO_State)this.get$obj$state(false)).fileSupport;
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationFileRawDatas().add(fileSupport, (org.fenixedu.bennu.io.domain.FileRawData)this);
    }
    
    private java.lang.Long get$oidFileSupport() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).fileSupport;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfFileSupport() {
        if (getFileSupport() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.fileSupport != null) handleAttemptToDeleteConnectedObject("FileSupport");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$contentKey(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CONTENT_KEY"), state);
        set$content(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readbytearray(rs, "CONTENT"), state);
        castedState.fileSupport = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FILE_SUPPORT");
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
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String contentKey;
        private byte[] content;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupport;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.contentKey = this.contentKey;
            newCasted.content = this.content;
            newCasted.fileSupport = this.fileSupport;
            
        }
        
    }
    
}
