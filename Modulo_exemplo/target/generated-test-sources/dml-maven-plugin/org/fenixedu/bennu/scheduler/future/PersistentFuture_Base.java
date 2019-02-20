package org.fenixedu.bennu.scheduler.future;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentFuture_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> role$$futureSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>() {
        public org.fenixedu.bennu.scheduler.future.FutureSystem getValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1) {
            return ((PersistentFuture_Base)o1).futureSystem.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1, org.fenixedu.bennu.scheduler.future.FutureSystem o2) {
            ((PersistentFuture_Base)o1).futureSystem.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.FutureSystem.role$$persistentFuture;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> role$$incompleteFutureSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>() {
        public org.fenixedu.bennu.scheduler.future.FutureSystem getValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1) {
            return ((PersistentFuture_Base)o1).incompleteFutureSystem.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1, org.fenixedu.bennu.scheduler.future.FutureSystem o2) {
            ((PersistentFuture_Base)o1).incompleteFutureSystem.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.FutureSystem.role$$incompletePersistentFuture;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.PersistentFutureTask> role$$persistentFutureTask = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.PersistentFutureTask>() {
        public org.fenixedu.bennu.scheduler.future.PersistentFutureTask getValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1) {
            return ((PersistentFuture_Base)o1).persistentFutureTask.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.future.PersistentFuture o1, org.fenixedu.bennu.scheduler.future.PersistentFutureTask o2) {
            ((PersistentFuture_Base)o1).persistentFutureTask.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFutureTask.role$$persistentFuture;
        }
        
    };
    
    private final static class FutureSystemPersistentFuture {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>(role$$futureSystem, "FutureSystemPersistentFuture", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemPersistentFuture() {
        return FutureSystemPersistentFuture.relation;
    }
    
    private final static class FutureSystemIncompletePersistentFuture {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem>(role$$incompleteFutureSystem, "FutureSystemIncompletePersistentFuture", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemIncompletePersistentFuture() {
        return FutureSystemIncompletePersistentFuture.relation;
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFutureTask,org.fenixedu.bennu.scheduler.future.PersistentFuture> getRelationPersistentFuturePersistentFutureTask() {
        return org.fenixedu.bennu.scheduler.future.PersistentFutureTask.getRelationPersistentFuturePersistentFutureTask();
    }
    
    // Slots
    private OwnedVBox<java.lang.String> shortDescription;
    private OwnedVBox<org.fenixedu.bennu.scheduler.future.PersistentFutureState> state;
    private OwnedVBox<org.joda.time.DateTime> created;
    private OwnedVBox<org.joda.time.DateTime> startedExecution;
    private OwnedVBox<org.joda.time.DateTime> finishedExecution;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.scheduler.future.FutureSystem> futureSystem;
    private OwnedVBox<org.fenixedu.bennu.scheduler.future.FutureSystem> incompleteFutureSystem;
    private OwnedVBox<org.fenixedu.bennu.scheduler.future.PersistentFutureTask> persistentFutureTask;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        shortDescription = OwnedVBox.makeNew(this, "shortDescription", allocateOnly, false);
        if (!allocateOnly) this.shortDescription.put(null);
        state = OwnedVBox.makeNew(this, "state", allocateOnly, false);
        if (!allocateOnly) this.state.put(null);
        created = OwnedVBox.makeNew(this, "created", allocateOnly, false);
        if (!allocateOnly) this.created.put(null);
        startedExecution = OwnedVBox.makeNew(this, "startedExecution", allocateOnly, false);
        if (!allocateOnly) this.startedExecution.put(null);
        finishedExecution = OwnedVBox.makeNew(this, "finishedExecution", allocateOnly, false);
        if (!allocateOnly) this.finishedExecution.put(null);
        futureSystem = OwnedVBox.makeNew(this, "futureSystem", allocateOnly, true);
        if (!allocateOnly) this.futureSystem.put(null);
        incompleteFutureSystem = OwnedVBox.makeNew(this, "incompleteFutureSystem", allocateOnly, true);
        if (!allocateOnly) this.incompleteFutureSystem.put(null);
        persistentFutureTask = OwnedVBox.makeNew(this, "persistentFutureTask", allocateOnly, true);
        if (!allocateOnly) this.persistentFutureTask.put(null);
        
    }
    
    // Constructors
    protected  PersistentFuture_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.String getShortDescription() {
        return this.shortDescription.get();
    }
    
    public void setShortDescription(java.lang.String shortDescription) {
        this.shortDescription.put(shortDescription);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.bennu.scheduler.future.PersistentFutureState getState() {
        return this.state.get();
    }
    
    public void setState(org.fenixedu.bennu.scheduler.future.PersistentFutureState state) {
        this.state.put(state);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.joda.time.DateTime getCreated() {
        return this.created.get();
    }
    
    public void setCreated(org.joda.time.DateTime created) {
        this.created.put(created);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.joda.time.DateTime getStartedExecution() {
        return this.startedExecution.get();
    }
    
    public void setStartedExecution(org.joda.time.DateTime startedExecution) {
        this.startedExecution.put(startedExecution);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.joda.time.DateTime getFinishedExecution() {
        return this.finishedExecution.get();
    }
    
    public void setFinishedExecution(org.joda.time.DateTime finishedExecution) {
        this.finishedExecution.put(finishedExecution);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getFutureSystem() {
        return this.futureSystem.get();
    }
    
    public void setFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem) {
        getRelationFutureSystemPersistentFuture().add((org.fenixedu.bennu.scheduler.future.PersistentFuture)this, futureSystem);
    }
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getIncompleteFutureSystem() {
        return this.incompleteFutureSystem.get();
    }
    
    public void setIncompleteFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem incompleteFutureSystem) {
        getRelationFutureSystemIncompletePersistentFuture().add((org.fenixedu.bennu.scheduler.future.PersistentFuture)this, incompleteFutureSystem);
    }
    
    public org.fenixedu.bennu.scheduler.future.PersistentFutureTask getPersistentFutureTask() {
        return this.persistentFutureTask.get();
    }
    
    public void setPersistentFutureTask(org.fenixedu.bennu.scheduler.future.PersistentFutureTask persistentFutureTask) {
        getRelationPersistentFuturePersistentFutureTask().add(persistentFutureTask, (org.fenixedu.bennu.scheduler.future.PersistentFuture)this);
    }
    
    
}
