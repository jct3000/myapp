package pt.ist.fenixframework.consistencyPredicates;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PublicConsistencyPredicate_Base extends pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> role$$publicConsistencyPredicateOverriding = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> getSet(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>) ((PublicConsistencyPredicate_Base) o1).publicConsistencyPredicateOverriding;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate.role$$publicConsistencyPredicateOverridden;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> role$$publicConsistencyPredicateOverridden = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>() {
        public pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate getValue(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate o1) {
            return ((PublicConsistencyPredicate_Base)o1).publicConsistencyPredicateOverridden.get();
        }
        public void setValue(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate o1, pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate o2) {
            ((PublicConsistencyPredicate_Base)o1).publicConsistencyPredicateOverridden.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate.role$$publicConsistencyPredicateOverriding;
        }
        
    };
    
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> keyFunction$$publicConsistencyPredicateOverriding = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>() { public Comparable<?> getKey(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class PublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>(role$$publicConsistencyPredicateOverridden, "PublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> getRelationPublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding() {
        return PublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>> internal$publicConsistencyPredicateOverriding$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> publicConsistencyPredicateOverriding;
    private OwnedVBox<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> publicConsistencyPredicateOverridden;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$publicConsistencyPredicateOverriding$collectionBox = OwnedVBox.makeNew(this, "internal$publicConsistencyPredicateOverriding$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> get() { return internal$getPublicConsistencyPredicateOverriding$collection(); }
            };
            publicConsistencyPredicateOverriding = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>((pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate)this, getRelationPublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding().getInverseRelation(), mapGetter, keyFunction$$publicConsistencyPredicateOverriding);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>();
            this.internal$publicConsistencyPredicateOverriding$collectionBox.put(internalMap);
            publicConsistencyPredicateOverriding = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>((pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate)this, getRelationPublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding().getInverseRelation(), internalMap, keyFunction$$publicConsistencyPredicateOverriding);
        }
        publicConsistencyPredicateOverridden = OwnedVBox.makeNew(this, "publicConsistencyPredicateOverridden", allocateOnly, true);
        if (!allocateOnly) this.publicConsistencyPredicateOverridden.put(null);
        
    }
    
    // Constructors
    protected  PublicConsistencyPredicate_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addPublicConsistencyPredicateOverriding(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate publicConsistencyPredicateOverriding) {
        getRelationPublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding().add(publicConsistencyPredicateOverriding, (pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate)this);
    }
    
    public void removePublicConsistencyPredicateOverriding(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate publicConsistencyPredicateOverriding) {
        getRelationPublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding().remove(publicConsistencyPredicateOverriding, (pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> internal$getPublicConsistencyPredicateOverriding$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate>)this.internal$publicConsistencyPredicateOverriding$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate> getPublicConsistencyPredicateOverridingSet() {
        return this.publicConsistencyPredicateOverriding;
    }
    
    public pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate getPublicConsistencyPredicateOverridden() {
        return this.publicConsistencyPredicateOverridden.get();
    }
    
    public void setPublicConsistencyPredicateOverridden(pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate publicConsistencyPredicateOverridden) {
        getRelationPublicConsistencyPredicateOverriddenPublicConsistencyPredicatesOverriding().add((pt.ist.fenixframework.consistencyPredicates.PublicConsistencyPredicate)this, publicConsistencyPredicateOverridden);
    }
    
    
}
