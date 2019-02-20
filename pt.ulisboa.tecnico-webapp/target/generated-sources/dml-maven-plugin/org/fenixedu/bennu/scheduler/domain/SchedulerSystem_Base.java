package org.fenixedu.bennu.scheduler.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class SchedulerSystem_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> role$$loggingStorage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage>() {
        @Override
        public org.fenixedu.bennu.io.domain.LocalFileSystemStorage getValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1) {
            return ((SchedulerSystem_Base.DO_State)o1.get$obj$state(false)).loggingStorage;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1, org.fenixedu.bennu.io.domain.LocalFileSystemStorage o2) {
            ((SchedulerSystem_Base.DO_State)o1.get$obj$state(true)).loggingStorage = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.LocalFileSystemStorage,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getInverseRole() {
            return org.fenixedu.bennu.io.domain.LocalFileSystemStorage.role$$schedulerSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule> role$$taskSchedule = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.scheduler.domain.TaskSchedule> getSet(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1) {
            return ((SchedulerSystem_Base)o1).get$rl$taskSchedule();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.TaskSchedule.role$$schedulerSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1) {
            return ((SchedulerSystem_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((SchedulerSystem_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$schedulerSystem;
        }
        
    };
    
    private final static class SchedulerSystemLocalFileSystemStorage {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage>(role$$loggingStorage, "SchedulerSystemLocalFileSystemStorage");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getRelationSchedulerSystemLocalFileSystemStorage() {
        return SchedulerSystemLocalFileSystemStorage.relation;
    }
    
    static {
        SchedulerSystemLocalFileSystemStorage.relation.setRelationName("org.fenixedu.bennu.scheduler.domain.SchedulerSystem.SchedulerSystemLocalFileSystemStorage");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getRelationTaskTaskSchedule() {
        return org.fenixedu.bennu.scheduler.domain.TaskSchedule.getRelationTaskTaskSchedule();
    }
    
    private final static class SchedulerSystemSchedulerSystem {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "SchedulerSystemSchedulerSystem");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationSchedulerSystemSchedulerSystem() {
        return SchedulerSystemSchedulerSystem.relation;
    }
    
    static {
        SchedulerSystemSchedulerSystem.relation.setRelationName("org.fenixedu.bennu.scheduler.domain.SchedulerSystem.SchedulerSystemSchedulerSystem");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule> get$rl$taskSchedule() {
        return get$$relationList("taskSchedule", getRelationTaskTaskSchedule().getInverseRelation());
        
    }
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  SchedulerSystem_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected org.joda.time.DateTime getLease() {
        return ((DO_State)this.get$obj$state(false)).lease;
    }
    
    protected void setLease(org.joda.time.DateTime lease) {
        ((DO_State)this.get$obj$state(true)).lease = lease;
    }
    
    private java.sql.Timestamp get$lease() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).lease;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$lease(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).lease = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.LocalFileSystemStorage getLoggingStorage() {
        return ((DO_State)this.get$obj$state(false)).loggingStorage;
    }
    
    public void setLoggingStorage(org.fenixedu.bennu.io.domain.LocalFileSystemStorage loggingStorage) {
        getRelationSchedulerSystemLocalFileSystemStorage().add((org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this, loggingStorage);
    }
    
    private java.lang.Long get$oidLoggingStorage() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).loggingStorage;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfLoggingStorage() {
        if (getLoggingStorage() == null) return false;
        return true;
    }
    
    protected void addTaskSchedule(org.fenixedu.bennu.scheduler.domain.TaskSchedule taskSchedule) {
        getRelationTaskTaskSchedule().add(taskSchedule, (org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this);
    }
    
    protected void removeTaskSchedule(org.fenixedu.bennu.scheduler.domain.TaskSchedule taskSchedule) {
        getRelationTaskTaskSchedule().remove(taskSchedule, (org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.domain.TaskSchedule> getTaskScheduleSet() {
        return get$rl$taskSchedule();
    }
    
    public void set$taskSchedule(OJBFunctionalSetWrapper taskSchedule) {
        get$rl$taskSchedule().setFromOJB(this, "taskSchedule", taskSchedule);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.scheduler.domain.TaskSchedule> getTaskSchedule() {
        return getTaskScheduleSet();
    }
    
    @Deprecated
    public int getTaskScheduleCount() {
        return getTaskScheduleSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationSchedulerSystemSchedulerSystem().add((org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this, bennu);
    }
    
    private java.lang.Long get$oidBennu() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bennu;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBennu() {
        if (getBennu() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.loggingStorage != null) handleAttemptToDeleteConnectedObject("LoggingStorage");
        if (get$rl$taskSchedule().size() > 0) handleAttemptToDeleteConnectedObject("TaskSchedule");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$lease(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "LEASE"), state);
        castedState.loggingStorage = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_LOGGING_STORAGE");
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("taskSchedule")) return getRelationTaskTaskSchedule().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("taskSchedule", getRelationTaskTaskSchedule().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.joda.time.DateTime lease;
        private org.fenixedu.bennu.io.domain.LocalFileSystemStorage loggingStorage;
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.lease = this.lease;
            newCasted.loggingStorage = this.loggingStorage;
            newCasted.bennu = this.bennu;
            
        }
        
    }
    
}
