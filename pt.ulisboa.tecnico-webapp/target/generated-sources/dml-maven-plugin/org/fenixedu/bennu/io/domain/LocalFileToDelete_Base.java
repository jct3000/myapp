package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class LocalFileToDelete_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileToDelete,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileToDelete,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.LocalFileToDelete o1) {
            return ((LocalFileToDelete_Base.DO_State)o1.get$obj$state(false)).fileSupport;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.LocalFileToDelete o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((LocalFileToDelete_Base.DO_State)o1.get$obj$state(true)).fileSupport = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$delete;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getRelationLocalFilesToDelete() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationLocalFilesToDelete();
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
    protected  LocalFileToDelete_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getFilePath() {
        return ((DO_State)this.get$obj$state(false)).filePath;
    }
    
    protected void setFilePath(java.lang.String filePath) {
        ((DO_State)this.get$obj$state(true)).filePath = filePath;
    }
    
    private java.lang.String get$filePath() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).filePath;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$filePath(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).filePath = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return ((DO_State)this.get$obj$state(false)).fileSupport;
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationLocalFilesToDelete().add(fileSupport, (org.fenixedu.bennu.io.domain.LocalFileToDelete)this);
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
        set$filePath(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FILE_PATH"), state);
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
        private java.lang.String filePath;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupport;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.filePath = this.filePath;
            newCasted.fileSupport = this.fileSupport;
            
        }
        
    }
    
}
