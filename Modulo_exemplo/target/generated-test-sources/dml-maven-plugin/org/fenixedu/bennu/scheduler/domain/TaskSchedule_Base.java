package org.fenixedu.bennu.scheduler.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class TaskSchedule_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> role$$schedulerSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>() {
        public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getValue(org.fenixedu.bennu.scheduler.domain.TaskSchedule o1) {
            return ((TaskSchedule_Base)o1).schedulerSystem.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.domain.TaskSchedule o1, org.fenixedu.bennu.scheduler.domain.SchedulerSystem o2) {
            ((TaskSchedule_Base)o1).schedulerSystem.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.role$$taskSchedule;
        }
        
    };
    
    private final static class TaskTaskSchedule {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>(role$$schedulerSystem, "TaskTaskSchedule", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getRelationTaskTaskSchedule() {
        return TaskTaskSchedule.relation;
    }
    
    // Slots
    private OwnedVBox<java.lang.String> taskClassName;
    private OwnedVBox<java.lang.String> schedule;
    private OwnedVBox<java.lang.Boolean> runOnce;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.scheduler.domain.SchedulerSystem> schedulerSystem;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        taskClassName = OwnedVBox.makeNew(this, "taskClassName", allocateOnly, false);
        if (!allocateOnly) this.taskClassName.put(null);
        schedule = OwnedVBox.makeNew(this, "schedule", allocateOnly, false);
        if (!allocateOnly) this.schedule.put(null);
        runOnce = OwnedVBox.makeNew(this, "runOnce", allocateOnly, false);
        if (!allocateOnly) this.runOnce.put(null);
        schedulerSystem = OwnedVBox.makeNew(this, "schedulerSystem", allocateOnly, true);
        if (!allocateOnly) this.schedulerSystem.put(null);
        
    }
    
    // Constructors
    protected  TaskSchedule_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.String getTaskClassName() {
        return this.taskClassName.get();
    }
    
    public void setTaskClassName(java.lang.String taskClassName) {
        this.taskClassName.put(taskClassName);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getSchedule() {
        return this.schedule.get();
    }
    
    public void setSchedule(java.lang.String schedule) {
        this.schedule.put(schedule);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.Boolean getRunOnce() {
        return this.runOnce.get();
    }
    
    public void setRunOnce(java.lang.Boolean runOnce) {
        this.runOnce.put(runOnce);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        return this.schedulerSystem.get();
    }
    
    protected void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        getRelationTaskTaskSchedule().add((org.fenixedu.bennu.scheduler.domain.TaskSchedule)this, schedulerSystem);
    }
    
    
}
