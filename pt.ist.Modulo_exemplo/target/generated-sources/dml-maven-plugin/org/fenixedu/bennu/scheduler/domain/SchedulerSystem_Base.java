package org.fenixedu.bennu.scheduler.domain;


@SuppressWarnings("all")
public abstract class SchedulerSystem_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getRelationSchedulerSystemLocalFileSystemStorage() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getRelationTaskTaskSchedule() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationSchedulerSystemSchedulerSystem() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  SchedulerSystem_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected org.joda.time.DateTime getLease() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setLease(org.joda.time.DateTime lease) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.LocalFileSystemStorage getLoggingStorage() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setLoggingStorage(org.fenixedu.bennu.io.domain.LocalFileSystemStorage loggingStorage) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addTaskSchedule(org.fenixedu.bennu.scheduler.domain.TaskSchedule taskSchedule) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeTaskSchedule(org.fenixedu.bennu.scheduler.domain.TaskSchedule taskSchedule) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.scheduler.domain.TaskSchedule> getTaskScheduleSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
