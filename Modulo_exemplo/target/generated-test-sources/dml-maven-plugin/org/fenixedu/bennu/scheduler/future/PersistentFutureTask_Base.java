package org.fenixedu.bennu.scheduler.future;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentFutureTask_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> role$$persistentFuture = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
        public org.fenixedu.bennu.scheduler.future.PersistentFuture getValue(org.fenixedu.bennu.scheduler.future.PersistentFutureTask o1) {
            return ((PersistentFutureTask_Base)o1).persistentFuture.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFutureTask o1, org.fenixedu.bennu.scheduler.future.PersistentFuture o2) {
            ((PersistentFutureTask_Base)o1).persistentFuture.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.PersistentFutureTask> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFuture.role$$persistentFutureTask;
        }
        
    };
    
    private final static class PersistentFuturePersistentFutureTask {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture>(role$$persistentFuture, "PersistentFuturePersistentFutureTask", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getRelationPersistentFuturePersistentFutureTask() {
        return PersistentFuturePersistentFutureTask.relation;
    }
    
    // Slots
    private OwnedVBox<java.io.Serializable> task;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.scheduler.future.PersistentFuture> persistentFuture;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        task = OwnedVBox.makeNew(this, "task", allocateOnly, false);
        if (!allocateOnly) this.task.put(null);
        persistentFuture = OwnedVBox.makeNew(this, "persistentFuture", allocateOnly, true);
        if (!allocateOnly) this.persistentFuture.put(null);
        
    }
    
    // Constructors
    protected  PersistentFutureTask_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.io.Serializable getTask() {
        return this.task.get();
    }
    
    public void setTask(java.io.Serializable task) {
        this.task.put(task);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.future.PersistentFuture getPersistentFuture() {
        return this.persistentFuture.get();
    }
    
    public void setPersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        getRelationPersistentFuturePersistentFutureTask().add((org.fenixedu.bennu.scheduler.future.PersistentFutureTask)this, persistentFuture);
    }
    
    
}
