package org.fenixedu.bennu.scheduler.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class SchedulerSystem_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> role$$loggingStorage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage>() {
        public org.fenixedu.bennu.io.domain.LocalFileSystemStorage getValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1) {
            return ((SchedulerSystem_Base)o1).loggingStorage.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1, org.fenixedu.bennu.io.domain.LocalFileSystemStorage o2) {
            ((SchedulerSystem_Base)o1).loggingStorage.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.LocalFileSystemStorage,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getInverseRole() {
            return org.fenixedu.bennu.io.domain.LocalFileSystemStorage.role$$schedulerSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule> role$$taskSchedule = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.scheduler.domain.TaskSchedule> getSet(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule>) ((SchedulerSystem_Base) o1).taskSchedule;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.TaskSchedule.role$$schedulerSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1) {
            return ((SchedulerSystem_Base)o1).bennu.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.domain.SchedulerSystem o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((SchedulerSystem_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$schedulerSystem;
        }
        
    };
    
    private final static class SchedulerSystemLocalFileSystemStorage {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage>(role$$loggingStorage, "SchedulerSystemLocalFileSystemStorage", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getRelationSchedulerSystemLocalFileSystemStorage() {
        return SchedulerSystemLocalFileSystemStorage.relation;
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.TaskSchedule,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> getRelationTaskTaskSchedule() {
        return org.fenixedu.bennu.scheduler.domain.TaskSchedule.getRelationTaskTaskSchedule();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.scheduler.domain.TaskSchedule> keyFunction$$taskSchedule = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.scheduler.domain.TaskSchedule>() { public Comparable<?> getKey(org.fenixedu.bennu.scheduler.domain.TaskSchedule value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class SchedulerSystemSchedulerSystem {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "SchedulerSystemSchedulerSystem", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationSchedulerSystemSchedulerSystem() {
        return SchedulerSystemSchedulerSystem.relation;
    }
    
    // Slots
    private OwnedVBox<org.joda.time.DateTime> lease;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.LocalFileSystemStorage> loggingStorage;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.domain.TaskSchedule>> internal$taskSchedule$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule> taskSchedule;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        lease = OwnedVBox.makeNew(this, "lease", allocateOnly, false);
        if (!allocateOnly) this.lease.put(null);
        loggingStorage = OwnedVBox.makeNew(this, "loggingStorage", allocateOnly, true);
        if (!allocateOnly) this.loggingStorage.put(null);
        internal$taskSchedule$collectionBox = OwnedVBox.makeNew(this, "internal$taskSchedule$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.scheduler.domain.TaskSchedule> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.scheduler.domain.TaskSchedule>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.domain.TaskSchedule> get() { return internal$getTaskSchedule$collection(); }
            };
            taskSchedule = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule>((org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this, getRelationTaskTaskSchedule().getInverseRelation(), mapGetter, keyFunction$$taskSchedule);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.domain.TaskSchedule> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.domain.TaskSchedule>();
            this.internal$taskSchedule$collectionBox.put(internalMap);
            taskSchedule = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.scheduler.domain.TaskSchedule>((org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this, getRelationTaskTaskSchedule().getInverseRelation(), internalMap, keyFunction$$taskSchedule);
        }
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        
    }
    
    // Constructors
    protected  SchedulerSystem_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected org.joda.time.DateTime getLease() {
        return this.lease.get();
    }
    
    protected void setLease(org.joda.time.DateTime lease) {
        this.lease.put(lease);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.LocalFileSystemStorage getLoggingStorage() {
        return this.loggingStorage.get();
    }
    
    public void setLoggingStorage(org.fenixedu.bennu.io.domain.LocalFileSystemStorage loggingStorage) {
        getRelationSchedulerSystemLocalFileSystemStorage().add((org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this, loggingStorage);
    }
    
    protected void addTaskSchedule(org.fenixedu.bennu.scheduler.domain.TaskSchedule taskSchedule) {
        getRelationTaskTaskSchedule().add(taskSchedule, (org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this);
    }
    
    protected void removeTaskSchedule(org.fenixedu.bennu.scheduler.domain.TaskSchedule taskSchedule) {
        getRelationTaskTaskSchedule().remove(taskSchedule, (org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.domain.TaskSchedule> internal$getTaskSchedule$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.domain.TaskSchedule>)this.internal$taskSchedule$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.domain.TaskSchedule> getTaskScheduleSet() {
        return this.taskSchedule;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationSchedulerSystemSchedulerSystem().add((org.fenixedu.bennu.scheduler.domain.SchedulerSystem)this, bennu);
    }
    
    
}
