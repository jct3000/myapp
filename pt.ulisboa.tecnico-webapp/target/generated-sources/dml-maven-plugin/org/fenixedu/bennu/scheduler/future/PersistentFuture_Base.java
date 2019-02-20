package org.fenixedu.bennu.scheduler.future;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentFuture_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> role$$futureSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>() {
        @Override
        public org.fenixedu.bennu.scheduler.future.FutureSystem getValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1) {
            return ((PersistentFuture_Base.DO_State)o1.get$obj$state(false)).futureSystem;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1, org.fenixedu.bennu.scheduler.future.FutureSystem o2) {
            ((PersistentFuture_Base.DO_State)o1.get$obj$state(true)).futureSystem = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.FutureSystem.role$$persistentFuture;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> role$$incompleteFutureSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>() {
        @Override
        public org.fenixedu.bennu.scheduler.future.FutureSystem getValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1) {
            return ((PersistentFuture_Base.DO_State)o1.get$obj$state(false)).incompleteFutureSystem;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1, org.fenixedu.bennu.scheduler.future.FutureSystem o2) {
            ((PersistentFuture_Base.DO_State)o1.get$obj$state(true)).incompleteFutureSystem = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.FutureSystem.role$$incompletePersistentFuture;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.PersistentFutureTask> role$$persistentFutureTask = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.PersistentFutureTask>() {
        @Override
        public org.fenixedu.bennu.scheduler.future.PersistentFutureTask getValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1) {
            return ((PersistentFuture_Base.DO_State)o1.get$obj$state(false)).persistentFutureTask;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1, org.fenixedu.bennu.scheduler.future.PersistentFutureTask o2) {
            ((PersistentFuture_Base.DO_State)o1.get$obj$state(true)).persistentFutureTask = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFutureTask.role$$persistentFuture;
        }
        
    };
    
    private final static class FutureSystemPersistentFuture {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>(role$$futureSystem, "FutureSystemPersistentFuture");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemPersistentFuture() {
        return FutureSystemPersistentFuture.relation;
    }
    
    static {
        FutureSystemPersistentFuture.relation.setRelationName("org.fenixedu.bennu.scheduler.future.PersistentFuture.FutureSystemPersistentFuture");
    }
    
    private final static class FutureSystemIncompletePersistentFuture {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>(role$$incompleteFutureSystem, "FutureSystemIncompletePersistentFuture");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemIncompletePersistentFuture() {
        return FutureSystemIncompletePersistentFuture.relation;
    }
    
    static {
        FutureSystemIncompletePersistentFuture.relation.setRelationName("org.fenixedu.bennu.scheduler.future.PersistentFuture.FutureSystemIncompletePersistentFuture");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getRelationPersistentFuturePersistentFutureTask() {
        return org.fenixedu.bennu.scheduler.future.PersistentFutureTask.getRelationPersistentFuturePersistentFutureTask();
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
    protected  PersistentFuture_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getShortDescription() {
        return ((DO_State)this.get$obj$state(false)).shortDescription;
    }
    
    public void setShortDescription(java.lang.String shortDescription) {
        ((DO_State)this.get$obj$state(true)).shortDescription = shortDescription;
    }
    
    private java.lang.String get$shortDescription() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).shortDescription;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$shortDescription(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).shortDescription = (java.lang.String)((value == null) ? null : value);
    }
    
    public org.fenixedu.bennu.scheduler.future.PersistentFutureState getState() {
        return ((DO_State)this.get$obj$state(false)).state;
    }
    
    public void setState(org.fenixedu.bennu.scheduler.future.PersistentFutureState state) {
        ((DO_State)this.get$obj$state(true)).state = state;
    }
    
    private java.lang.String get$state() {
        org.fenixedu.bennu.scheduler.future.PersistentFutureState value = ((DO_State)this.get$obj$state(false)).state;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForEnum(value);
    }
    
    private final void set$state(org.fenixedu.bennu.scheduler.future.PersistentFutureState value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).state = (org.fenixedu.bennu.scheduler.future.PersistentFutureState)((value == null) ? null : value);
    }
    
    public org.joda.time.DateTime getCreated() {
        return ((DO_State)this.get$obj$state(false)).created;
    }
    
    public void setCreated(org.joda.time.DateTime created) {
        ((DO_State)this.get$obj$state(true)).created = created;
    }
    
    private java.sql.Timestamp get$created() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).created;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$created(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).created = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    public org.joda.time.DateTime getStartedExecution() {
        return ((DO_State)this.get$obj$state(false)).startedExecution;
    }
    
    public void setStartedExecution(org.joda.time.DateTime startedExecution) {
        ((DO_State)this.get$obj$state(true)).startedExecution = startedExecution;
    }
    
    private java.sql.Timestamp get$startedExecution() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).startedExecution;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$startedExecution(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).startedExecution = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    public org.joda.time.DateTime getFinishedExecution() {
        return ((DO_State)this.get$obj$state(false)).finishedExecution;
    }
    
    public void setFinishedExecution(org.joda.time.DateTime finishedExecution) {
        ((DO_State)this.get$obj$state(true)).finishedExecution = finishedExecution;
    }
    
    private java.sql.Timestamp get$finishedExecution() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).finishedExecution;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$finishedExecution(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).finishedExecution = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getFutureSystem() {
        return ((DO_State)this.get$obj$state(false)).futureSystem;
    }
    
    public void setFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem) {
        getRelationFutureSystemPersistentFuture().add((org.fenixedu.bennu.scheduler.future.PersistentFuture)this, futureSystem);
    }
    
    private java.lang.Long get$oidFutureSystem() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).futureSystem;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfFutureSystem() {
        if (getFutureSystem() == null) return false;
        return true;
    }
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getIncompleteFutureSystem() {
        return ((DO_State)this.get$obj$state(false)).incompleteFutureSystem;
    }
    
    public void setIncompleteFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem incompleteFutureSystem) {
        getRelationFutureSystemIncompletePersistentFuture().add((org.fenixedu.bennu.scheduler.future.PersistentFuture)this, incompleteFutureSystem);
    }
    
    private java.lang.Long get$oidIncompleteFutureSystem() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).incompleteFutureSystem;
        return (value == null) ? null : value.getOid();
    }
    
    public org.fenixedu.bennu.scheduler.future.PersistentFutureTask getPersistentFutureTask() {
        return ((DO_State)this.get$obj$state(false)).persistentFutureTask;
    }
    
    public void setPersistentFutureTask(org.fenixedu.bennu.scheduler.future.PersistentFutureTask persistentFutureTask) {
        getRelationPersistentFuturePersistentFutureTask().add(persistentFutureTask, (org.fenixedu.bennu.scheduler.future.PersistentFuture)this);
    }
    
    private java.lang.Long get$oidPersistentFutureTask() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).persistentFutureTask;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.futureSystem != null) handleAttemptToDeleteConnectedObject("FutureSystem");
        if (castedState.incompleteFutureSystem != null) handleAttemptToDeleteConnectedObject("IncompleteFutureSystem");
        if (castedState.persistentFutureTask != null) handleAttemptToDeleteConnectedObject("PersistentFutureTask");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$shortDescription(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "SHORT_DESCRIPTION"), state);
        set$state(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readEnum(org.fenixedu.bennu.scheduler.future.PersistentFutureState.class, rs, "STATE"), state);
        set$created(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "CREATED"), state);
        set$startedExecution(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "STARTED_EXECUTION"), state);
        set$finishedExecution(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "FINISHED_EXECUTION"), state);
        castedState.futureSystem = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FUTURE_SYSTEM");
        castedState.incompleteFutureSystem = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_INCOMPLETE_FUTURE_SYSTEM");
        castedState.persistentFutureTask = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PERSISTENT_FUTURE_TASK");
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
        private java.lang.String shortDescription;
        private org.fenixedu.bennu.scheduler.future.PersistentFutureState state;
        private org.joda.time.DateTime created;
        private org.joda.time.DateTime startedExecution;
        private org.joda.time.DateTime finishedExecution;
        private org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem;
        private org.fenixedu.bennu.scheduler.future.FutureSystem incompleteFutureSystem;
        private org.fenixedu.bennu.scheduler.future.PersistentFutureTask persistentFutureTask;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.shortDescription = this.shortDescription;
            newCasted.state = this.state;
            newCasted.created = this.created;
            newCasted.startedExecution = this.startedExecution;
            newCasted.finishedExecution = this.finishedExecution;
            newCasted.futureSystem = this.futureSystem;
            newCasted.incompleteFutureSystem = this.incompleteFutureSystem;
            newCasted.persistentFutureTask = this.persistentFutureTask;
            
        }
        
    }
    
}
