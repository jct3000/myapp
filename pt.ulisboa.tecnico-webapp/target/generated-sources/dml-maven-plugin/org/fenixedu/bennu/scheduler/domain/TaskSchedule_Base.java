package org.fenixedu.bennu.scheduler.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class TaskSchedule_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> role$$schedulerSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>() {
        @Override
        public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getValue(org.fenixedu.bennu.scheduler.domain.TaskSchedule o1) {
            return ((TaskSchedule_Base.DO_State)o1.get$obj$state(false)).schedulerSystem;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.domain.TaskSchedule o1, org.fenixedu.bennu.scheduler.domain.SchedulerSystem o2) {
            ((TaskSchedule_Base.DO_State)o1.get$obj$state(true)).schedulerSystem = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.role$$taskSchedule;
        }
        
    };
    
    private final static class TaskTaskSchedule {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>(role$$schedulerSystem, "TaskTaskSchedule");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getRelationTaskTaskSchedule() {
        return TaskTaskSchedule.relation;
    }
    
    static {
        TaskTaskSchedule.relation.setRelationName("org.fenixedu.bennu.scheduler.domain.TaskSchedule.TaskTaskSchedule");
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
    protected  TaskSchedule_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getTaskClassName() {
        return ((DO_State)this.get$obj$state(false)).taskClassName;
    }
    
    public void setTaskClassName(java.lang.String taskClassName) {
        ((DO_State)this.get$obj$state(true)).taskClassName = taskClassName;
    }
    
    private java.lang.String get$taskClassName() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).taskClassName;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$taskClassName(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).taskClassName = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getSchedule() {
        return ((DO_State)this.get$obj$state(false)).schedule;
    }
    
    public void setSchedule(java.lang.String schedule) {
        ((DO_State)this.get$obj$state(true)).schedule = schedule;
    }
    
    private java.lang.String get$schedule() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).schedule;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$schedule(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).schedule = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.Boolean getRunOnce() {
        return ((DO_State)this.get$obj$state(false)).runOnce;
    }
    
    public void setRunOnce(java.lang.Boolean runOnce) {
        ((DO_State)this.get$obj$state(true)).runOnce = runOnce;
    }
    
    private java.lang.Boolean get$runOnce() {
        java.lang.Boolean value = ((DO_State)this.get$obj$state(false)).runOnce;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForBoolean(value);
    }
    
    private final void set$runOnce(java.lang.Boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).runOnce = (java.lang.Boolean)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        return ((DO_State)this.get$obj$state(false)).schedulerSystem;
    }
    
    protected void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        getRelationTaskTaskSchedule().add((org.fenixedu.bennu.scheduler.domain.TaskSchedule)this, schedulerSystem);
    }
    
    private java.lang.Long get$oidSchedulerSystem() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).schedulerSystem;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfSchedulerSystem() {
        if (getSchedulerSystem() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.schedulerSystem != null) handleAttemptToDeleteConnectedObject("SchedulerSystem");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$taskClassName(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "TASK_CLASS_NAME"), state);
        set$schedule(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "SCHEDULE"), state);
        set$runOnce(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readBoolean(rs, "RUN_ONCE"), state);
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
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String taskClassName;
        private java.lang.String schedule;
        private java.lang.Boolean runOnce;
        private org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.taskClassName = this.taskClassName;
            newCasted.schedule = this.schedule;
            newCasted.runOnce = this.runOnce;
            newCasted.schedulerSystem = this.schedulerSystem;
            
        }
        
    }
    
}
