package org.fenixedu.bennu.scheduler.future;


@SuppressWarnings("all")
public abstract class PersistentFutureTask_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getRelationPersistentFuturePersistentFutureTask() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentFutureTask_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.io.Serializable getTask() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTask(java.io.Serializable task) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.future.PersistentFuture getPersistentFuture() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
