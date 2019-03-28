package org.fenixedu.bennu.scheduler.domain;


@SuppressWarnings("all")
public abstract class TaskSchedule_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getRelationTaskTaskSchedule() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  TaskSchedule_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getTaskClassName() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTaskClassName(java.lang.String taskClassName) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getSchedule() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSchedule(java.lang.String schedule) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.Boolean getRunOnce() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setRunOnce(java.lang.Boolean runOnce) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
