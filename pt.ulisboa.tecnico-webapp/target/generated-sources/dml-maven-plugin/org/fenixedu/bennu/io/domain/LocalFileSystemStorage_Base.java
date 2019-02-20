package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class LocalFileSystemStorage_Base extends org.fenixedu.bennu.io.domain.FileStorage {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileSystemStorage,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> role$$schedulerSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileSystemStorage,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>() {
        @Override
        public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getValue(org.fenixedu.bennu.io.domain.LocalFileSystemStorage o1) {
            return ((LocalFileSystemStorage_Base.DO_State)o1.get$obj$state(false)).schedulerSystem;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.LocalFileSystemStorage o1, org.fenixedu.bennu.scheduler.domain.SchedulerSystem o2) {
            ((LocalFileSystemStorage_Base.DO_State)o1.get$obj$state(true)).schedulerSystem = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.role$$loggingStorage;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getRelationSchedulerSystemLocalFileSystemStorage() {
        return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.getRelationSchedulerSystemLocalFileSystemStorage();
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
    protected  LocalFileSystemStorage_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getPath() {
        return ((DO_State)this.get$obj$state(false)).path;
    }
    
    protected void setPath(java.lang.String path) {
        ((DO_State)this.get$obj$state(true)).path = path;
    }
    
    private java.lang.String get$path() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).path;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$path(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).path = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.Integer getTreeDirectoriesNameLength() {
        return ((DO_State)this.get$obj$state(false)).treeDirectoriesNameLength;
    }
    
    protected void setTreeDirectoriesNameLength(java.lang.Integer treeDirectoriesNameLength) {
        ((DO_State)this.get$obj$state(true)).treeDirectoriesNameLength = treeDirectoriesNameLength;
    }
    
    private java.lang.Integer get$treeDirectoriesNameLength() {
        java.lang.Integer value = ((DO_State)this.get$obj$state(false)).treeDirectoriesNameLength;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForInteger(value);
    }
    
    private final void set$treeDirectoriesNameLength(java.lang.Integer value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).treeDirectoriesNameLength = (java.lang.Integer)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        return ((DO_State)this.get$obj$state(false)).schedulerSystem;
    }
    
    public void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        getRelationSchedulerSystemLocalFileSystemStorage().add(schedulerSystem, (org.fenixedu.bennu.io.domain.LocalFileSystemStorage)this);
    }
    
    private java.lang.Long get$oidSchedulerSystem() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).schedulerSystem;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.schedulerSystem != null) handleAttemptToDeleteConnectedObject("SchedulerSystem");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        set$path(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PATH"), state);
        set$treeDirectoriesNameLength(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readInteger(rs, "TREE_DIRECTORIES_NAME_LENGTH"), state);
        castedState.schedulerSystem = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_SCHEDULER_SYSTEM");
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
    protected static class DO_State extends org.fenixedu.bennu.io.domain.FileStorage.DO_State {
        private java.lang.String path;
        private java.lang.Integer treeDirectoriesNameLength;
        private org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.path = this.path;
            newCasted.treeDirectoriesNameLength = this.treeDirectoriesNameLength;
            newCasted.schedulerSystem = this.schedulerSystem;
            
        }
        
    }
    
}
