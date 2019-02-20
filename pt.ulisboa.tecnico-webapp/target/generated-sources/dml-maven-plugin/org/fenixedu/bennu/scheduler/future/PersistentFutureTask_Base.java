package org.fenixedu.bennu.scheduler.future;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentFutureTask_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> role$$persistentFuture = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
        @Override
        public org.fenixedu.bennu.scheduler.future.PersistentFuture getValue(org.fenixedu.bennu.scheduler.future.PersistentFutureTask o1) {
            return ((PersistentFutureTask_Base.DO_State)o1.get$obj$state(false)).persistentFuture;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFutureTask o1, org.fenixedu.bennu.scheduler.future.PersistentFuture o2) {
            ((PersistentFutureTask_Base.DO_State)o1.get$obj$state(true)).persistentFuture = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.PersistentFutureTask> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFuture.role$$persistentFutureTask;
        }
        
    };
    
    private final static class PersistentFuturePersistentFutureTask {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture>(role$$persistentFuture, "PersistentFuturePersistentFutureTask");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getRelationPersistentFuturePersistentFutureTask() {
        return PersistentFuturePersistentFutureTask.relation;
    }
    
    static {
        PersistentFuturePersistentFutureTask.relation.setRelationName("org.fenixedu.bennu.scheduler.future.PersistentFutureTask.PersistentFuturePersistentFutureTask");
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
    protected  PersistentFutureTask_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.io.Serializable getTask() {
        return ((DO_State)this.get$obj$state(false)).task;
    }
    
    public void setTask(java.io.Serializable task) {
        ((DO_State)this.get$obj$state(true)).task = task;
    }
    
    private java.lang.Object get$task() {
        java.io.Serializable value = ((DO_State)this.get$obj$state(false)).task;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForSerializable(value);
    }
    
    private final void set$task(java.io.Serializable value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).task = (java.io.Serializable)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.future.PersistentFuture getPersistentFuture() {
        return ((DO_State)this.get$obj$state(false)).persistentFuture;
    }
    
    public void setPersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        getRelationPersistentFuturePersistentFutureTask().add((org.fenixedu.bennu.scheduler.future.PersistentFutureTask)this, persistentFuture);
    }
    
    private java.lang.Long get$oidPersistentFuture() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).persistentFuture;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfPersistentFuture() {
        if (getPersistentFuture() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.persistentFuture != null) handleAttemptToDeleteConnectedObject("PersistentFuture");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$task(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readSerializable(rs, "TASK"), state);
        castedState.persistentFuture = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PERSISTENT_FUTURE");
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
        private java.io.Serializable task;
        private org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.task = this.task;
            newCasted.persistentFuture = this.persistentFuture;
            
        }
        
    }
    
}
