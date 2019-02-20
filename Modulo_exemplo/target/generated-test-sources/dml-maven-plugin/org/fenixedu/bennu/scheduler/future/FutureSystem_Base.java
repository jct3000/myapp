package org.fenixedu.bennu.scheduler.future;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class FutureSystem_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> role$$persistentFuture = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.scheduler.future.PersistentFuture> getSet(org.fenixedu.bennu.scheduler.future.FutureSystem o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>) ((FutureSystem_Base) o1).persistentFuture;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFuture.role$$futureSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> role$$incompletePersistentFuture = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.scheduler.future.PersistentFuture> getSet(org.fenixedu.bennu.scheduler.future.FutureSystem o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>) ((FutureSystem_Base) o1).incompletePersistentFuture;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFuture.role$$incompleteFutureSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.scheduler.future.FutureSystem o1) {
            return ((FutureSystem_Base)o1).bennu.get();
        }
        public void setValue(org.fenixedu.bennu.scheduler.future.FutureSystem o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((FutureSystem_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.future.FutureSystem> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$futureSystem;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemPersistentFuture() {
        return org.fenixedu.bennu.scheduler.future.PersistentFuture.getRelationFutureSystemPersistentFuture();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.scheduler.future.PersistentFuture> keyFunction$$persistentFuture = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.scheduler.future.PersistentFuture>() { public Comparable<?> getKey(org.fenixedu.bennu.scheduler.future.PersistentFuture value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemIncompletePersistentFuture() {
        return org.fenixedu.bennu.scheduler.future.PersistentFuture.getRelationFutureSystemIncompletePersistentFuture();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.scheduler.future.PersistentFuture> keyFunction$$incompletePersistentFuture = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.scheduler.future.PersistentFuture>() { public Comparable<?> getKey(org.fenixedu.bennu.scheduler.future.PersistentFuture value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class FutureSystemBennu {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "FutureSystemBennu", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationFutureSystemBennu() {
        return FutureSystemBennu.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture>> internal$persistentFuture$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> persistentFuture;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture>> internal$incompletePersistentFuture$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> incompletePersistentFuture;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$persistentFuture$collectionBox = OwnedVBox.makeNew(this, "internal$persistentFuture$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.scheduler.future.PersistentFuture> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture> get() { return internal$getPersistentFuture$collection(); }
            };
            persistentFuture = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>((org.fenixedu.bennu.scheduler.future.FutureSystem)this, getRelationFutureSystemPersistentFuture().getInverseRelation(), mapGetter, keyFunction$$persistentFuture);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture>();
            this.internal$persistentFuture$collectionBox.put(internalMap);
            persistentFuture = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>((org.fenixedu.bennu.scheduler.future.FutureSystem)this, getRelationFutureSystemPersistentFuture().getInverseRelation(), internalMap, keyFunction$$persistentFuture);
        }
        internal$incompletePersistentFuture$collectionBox = OwnedVBox.makeNew(this, "internal$incompletePersistentFuture$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.scheduler.future.PersistentFuture> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture> get() { return internal$getIncompletePersistentFuture$collection(); }
            };
            incompletePersistentFuture = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>((org.fenixedu.bennu.scheduler.future.FutureSystem)this, getRelationFutureSystemIncompletePersistentFuture().getInverseRelation(), mapGetter, keyFunction$$incompletePersistentFuture);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture>();
            this.internal$incompletePersistentFuture$collectionBox.put(internalMap);
            incompletePersistentFuture = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>((org.fenixedu.bennu.scheduler.future.FutureSystem)this, getRelationFutureSystemIncompletePersistentFuture().getInverseRelation(), internalMap, keyFunction$$incompletePersistentFuture);
        }
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        
    }
    
    // Constructors
    protected  FutureSystem_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addPersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        getRelationFutureSystemPersistentFuture().add(persistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public void removePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        getRelationFutureSystemPersistentFuture().remove(persistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture> internal$getPersistentFuture$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture>)this.internal$persistentFuture$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getPersistentFutureSet() {
        return this.persistentFuture;
    }
    
    public void addIncompletePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture incompletePersistentFuture) {
        getRelationFutureSystemIncompletePersistentFuture().add(incompletePersistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public void removeIncompletePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture incompletePersistentFuture) {
        getRelationFutureSystemIncompletePersistentFuture().remove(incompletePersistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture> internal$getIncompletePersistentFuture$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.scheduler.future.PersistentFuture>)this.internal$incompletePersistentFuture$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getIncompletePersistentFutureSet() {
        return this.incompletePersistentFuture;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationFutureSystemBennu().add((org.fenixedu.bennu.scheduler.future.FutureSystem)this, bennu);
    }
    
    
}
