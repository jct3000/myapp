package org.fenixedu.bennu.scheduler.future;


@SuppressWarnings("all")
public abstract class FutureSystem_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemPersistentFuture() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemIncompletePersistentFuture() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationFutureSystemBennu() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  FutureSystem_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addPersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getPersistentFutureSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addIncompletePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture incompletePersistentFuture) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeIncompletePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture incompletePersistentFuture) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getIncompletePersistentFutureSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
