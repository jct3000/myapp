package org.fenixedu.bennu.scheduler.future;


@SuppressWarnings("all")
public abstract class PersistentFuture_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemPersistentFuture() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemIncompletePersistentFuture() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getRelationPersistentFuturePersistentFutureTask() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentFuture_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getShortDescription() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setShortDescription(java.lang.String shortDescription) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.scheduler.future.PersistentFutureState getState() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setState(org.fenixedu.bennu.scheduler.future.PersistentFutureState state) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.joda.time.DateTime getCreated() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setCreated(org.joda.time.DateTime created) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.joda.time.DateTime getStartedExecution() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setStartedExecution(org.joda.time.DateTime startedExecution) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.joda.time.DateTime getFinishedExecution() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFinishedExecution(org.joda.time.DateTime finishedExecution) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getFutureSystem() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getIncompleteFutureSystem() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setIncompleteFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem incompleteFutureSystem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.scheduler.future.PersistentFutureTask getPersistentFutureTask() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPersistentFutureTask(org.fenixedu.bennu.scheduler.future.PersistentFutureTask persistentFutureTask) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
