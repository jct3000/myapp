package pt.ist.fenixframework.consistencyPredicates;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainDependenceRecord_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> role$$inconsistentPredicate = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>() {
        public pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate getValue(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1) {
            return ((DomainDependenceRecord_Base)o1).inconsistentPredicate.get();
        }
        public void setValue(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1, pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate o2) {
            ((DomainDependenceRecord_Base)o1).inconsistentPredicate.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate.role$$inconsistentDependenceRecord;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> role$$dependentDomainMetaObject = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>() {
        public pt.ist.fenixframework.DomainMetaObject getValue(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1) {
            return ((DomainDependenceRecord_Base)o1).dependentDomainMetaObject.get();
        }
        public void setValue(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1, pt.ist.fenixframework.DomainMetaObject o2) {
            ((DomainDependenceRecord_Base)o1).dependentDomainMetaObject.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getInverseRole() {
            return pt.ist.fenixframework.DomainMetaObject.role$$ownDependenceRecord;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> role$$domainConsistencyPredicate = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>() {
        public pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate getValue(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1) {
            return ((DomainDependenceRecord_Base)o1).domainConsistencyPredicate.get();
        }
        public void setValue(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1, pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate o2) {
            ((DomainDependenceRecord_Base)o1).domainConsistencyPredicate.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate.role$$domainDependenceRecord;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> role$$dependedDomainMetaObject = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.DomainMetaObject> getSet(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>) ((DomainDependenceRecord_Base) o1).dependedDomainMetaObject;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getInverseRole() {
            return pt.ist.fenixframework.DomainMetaObject.role$$dependingDependenceRecord;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getRelationDomainConsistencyPredicateInconsistentDependenceRecords() {
        return pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate.getRelationDomainConsistencyPredicateInconsistentDependenceRecords();
    }
    
    private final static class DependentDomainMetaObjectOwnDependenceRecords {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>(role$$dependentDomainMetaObject, "DependentDomainMetaObjectOwnDependenceRecords", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependentDomainMetaObjectOwnDependenceRecords() {
        return DependentDomainMetaObjectOwnDependenceRecords.relation;
    }
    
    private final static class DomainConsistencyPredicateDomainDependenceRecords {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>(role$$domainConsistencyPredicate, "DomainConsistencyPredicateDomainDependenceRecords", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainConsistencyPredicateDomainDependenceRecords() {
        return DomainConsistencyPredicateDomainDependenceRecords.relation;
    }
    
    private final static class DependedDomainMetaObjectsDependingDependenceRecords {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>(role$$dependedDomainMetaObject, "DependedDomainMetaObjectsDependingDependenceRecords", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependedDomainMetaObjectsDependingDependenceRecords() {
        return DependedDomainMetaObjectsDependingDependenceRecords.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.DomainMetaObject> keyFunction$$dependedDomainMetaObject = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.DomainMetaObject>() { public Comparable<?> getKey(pt.ist.fenixframework.DomainMetaObject value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> inconsistentPredicate;
    private OwnedVBox<pt.ist.fenixframework.DomainMetaObject> dependentDomainMetaObject;
    private OwnedVBox<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> domainConsistencyPredicate;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaObject>> internal$dependedDomainMetaObject$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> dependedDomainMetaObject;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        inconsistentPredicate = OwnedVBox.makeNew(this, "inconsistentPredicate", allocateOnly, true);
        if (!allocateOnly) this.inconsistentPredicate.put(null);
        dependentDomainMetaObject = OwnedVBox.makeNew(this, "dependentDomainMetaObject", allocateOnly, true);
        if (!allocateOnly) this.dependentDomainMetaObject.put(null);
        domainConsistencyPredicate = OwnedVBox.makeNew(this, "domainConsistencyPredicate", allocateOnly, true);
        if (!allocateOnly) this.domainConsistencyPredicate.put(null);
        internal$dependedDomainMetaObject$collectionBox = OwnedVBox.makeNew(this, "internal$dependedDomainMetaObject$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.DomainMetaObject> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.DomainMetaObject>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaObject> get() { return internal$getDependedDomainMetaObject$collection(); }
            };
            dependedDomainMetaObject = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>((pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this, getRelationDependedDomainMetaObjectsDependingDependenceRecords(), mapGetter, keyFunction$$dependedDomainMetaObject);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaObject> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaObject>();
            this.internal$dependedDomainMetaObject$collectionBox.put(internalMap);
            dependedDomainMetaObject = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject>((pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this, getRelationDependedDomainMetaObjectsDependingDependenceRecords(), internalMap, keyFunction$$dependedDomainMetaObject);
        }
        
    }
    
    // Constructors
    protected  DomainDependenceRecord_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate getInconsistentPredicate() {
        return this.inconsistentPredicate.get();
    }
    
    public void setInconsistentPredicate(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate inconsistentPredicate) {
        getRelationDomainConsistencyPredicateInconsistentDependenceRecords().add(inconsistentPredicate, (pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this);
    }
    
    public pt.ist.fenixframework.DomainMetaObject getDependentDomainMetaObject() {
        return this.dependentDomainMetaObject.get();
    }
    
    public void setDependentDomainMetaObject(pt.ist.fenixframework.DomainMetaObject dependentDomainMetaObject) {
        getRelationDependentDomainMetaObjectOwnDependenceRecords().add((pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this, dependentDomainMetaObject);
    }
    
    public pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate getDomainConsistencyPredicate() {
        return this.domainConsistencyPredicate.get();
    }
    
    public void setDomainConsistencyPredicate(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate domainConsistencyPredicate) {
        getRelationDomainConsistencyPredicateDomainDependenceRecords().add((pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this, domainConsistencyPredicate);
    }
    
    public void addDependedDomainMetaObject(pt.ist.fenixframework.DomainMetaObject dependedDomainMetaObject) {
        getRelationDependedDomainMetaObjectsDependingDependenceRecords().add((pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this, dependedDomainMetaObject);
    }
    
    public void removeDependedDomainMetaObject(pt.ist.fenixframework.DomainMetaObject dependedDomainMetaObject) {
        getRelationDependedDomainMetaObjectsDependingDependenceRecords().remove((pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord)this, dependedDomainMetaObject);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaObject> internal$getDependedDomainMetaObject$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaObject>)this.internal$dependedDomainMetaObject$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.DomainMetaObject> getDependedDomainMetaObjectSet() {
        return this.dependedDomainMetaObject;
    }
    
    
}
