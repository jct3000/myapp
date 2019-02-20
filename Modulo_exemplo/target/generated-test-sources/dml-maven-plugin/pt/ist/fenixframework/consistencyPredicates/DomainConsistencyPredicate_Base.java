package pt.ist.fenixframework.consistencyPredicates;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainConsistencyPredicate_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> role$$inconsistentDependenceRecord = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getSet(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>) ((DomainConsistencyPredicate_Base) o1).inconsistentDependenceRecord;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.role$$inconsistentPredicate;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.DomainMetaClass> role$$domainMetaClass = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.DomainMetaClass>() {
        public pt.ist.fenixframework.DomainMetaClass getValue(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate o1) {
            return ((DomainConsistencyPredicate_Base)o1).domainMetaClass.get();
        }
        public void setValue(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate o1, pt.ist.fenixframework.DomainMetaClass o2) {
            ((DomainConsistencyPredicate_Base)o1).domainMetaClass.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getInverseRole() {
            return pt.ist.fenixframework.DomainMetaClass.role$$declaredConsistencyPredicate;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> role$$domainDependenceRecord = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getSet(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>) ((DomainConsistencyPredicate_Base) o1).domainDependenceRecord;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.role$$domainConsistencyPredicate;
        }
        
    };
    
    private final static class DomainConsistencyPredicateInconsistentDependenceRecords {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>(role$$inconsistentDependenceRecord, "DomainConsistencyPredicateInconsistentDependenceRecords", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getRelationDomainConsistencyPredicateInconsistentDependenceRecords() {
        return DomainConsistencyPredicateInconsistentDependenceRecords.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> keyFunction$$inconsistentDependenceRecord = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() { public Comparable<?> getKey(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainMetaClassDeclaredConsistencyPredicates() {
        return pt.ist.fenixframework.DomainMetaClass.getRelationDomainMetaClassDeclaredConsistencyPredicates();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainConsistencyPredicateDomainDependenceRecords() {
        return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.getRelationDomainConsistencyPredicateDomainDependenceRecords();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> keyFunction$$domainDependenceRecord = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() { public Comparable<?> getKey(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    private OwnedVBox<java.lang.reflect.Method> predicate;
    private OwnedVBox<java.lang.Boolean> initialized;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>> internal$inconsistentDependenceRecord$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> inconsistentDependenceRecord;
    private OwnedVBox<pt.ist.fenixframework.DomainMetaClass> domainMetaClass;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>> internal$domainDependenceRecord$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> domainDependenceRecord;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        predicate = OwnedVBox.makeNew(this, "predicate", allocateOnly, false);
        if (!allocateOnly) this.predicate.put(null);
        initialized = OwnedVBox.makeNew(this, "initialized", allocateOnly, false);
        if (!allocateOnly) this.initialized.put(null);
        internal$inconsistentDependenceRecord$collectionBox = OwnedVBox.makeNew(this, "internal$inconsistentDependenceRecord$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> get() { return internal$getInconsistentDependenceRecord$collection(); }
            };
            inconsistentDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this, getRelationDomainConsistencyPredicateInconsistentDependenceRecords(), mapGetter, keyFunction$$inconsistentDependenceRecord);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>();
            this.internal$inconsistentDependenceRecord$collectionBox.put(internalMap);
            inconsistentDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this, getRelationDomainConsistencyPredicateInconsistentDependenceRecords(), internalMap, keyFunction$$inconsistentDependenceRecord);
        }
        domainMetaClass = OwnedVBox.makeNew(this, "domainMetaClass", allocateOnly, true);
        if (!allocateOnly) this.domainMetaClass.put(null);
        internal$domainDependenceRecord$collectionBox = OwnedVBox.makeNew(this, "internal$domainDependenceRecord$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> get() { return internal$getDomainDependenceRecord$collection(); }
            };
            domainDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this, getRelationDomainConsistencyPredicateDomainDependenceRecords().getInverseRelation(), mapGetter, keyFunction$$domainDependenceRecord);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>();
            this.internal$domainDependenceRecord$collectionBox.put(internalMap);
            domainDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this, getRelationDomainConsistencyPredicateDomainDependenceRecords().getInverseRelation(), internalMap, keyFunction$$domainDependenceRecord);
        }
        
    }
    
    // Constructors
    protected  DomainConsistencyPredicate_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.reflect.Method getPredicate() {
        return this.predicate.get();
    }
    
    public void setPredicate(java.lang.reflect.Method predicate) {
        this.predicate.put(predicate);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.Boolean getInitialized() {
        return this.initialized.get();
    }
    
    public void setInitialized(java.lang.Boolean initialized) {
        this.initialized.put(initialized);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public void addInconsistentDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord inconsistentDependenceRecord) {
        getRelationDomainConsistencyPredicateInconsistentDependenceRecords().add((pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this, inconsistentDependenceRecord);
    }
    
    public void removeInconsistentDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord inconsistentDependenceRecord) {
        getRelationDomainConsistencyPredicateInconsistentDependenceRecords().remove((pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this, inconsistentDependenceRecord);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internal$getInconsistentDependenceRecord$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>)this.internal$inconsistentDependenceRecord$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getInconsistentDependenceRecordSet() {
        return this.inconsistentDependenceRecord;
    }
    
    public pt.ist.fenixframework.DomainMetaClass getDomainMetaClass() {
        return this.domainMetaClass.get();
    }
    
    public void setDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        getRelationDomainMetaClassDeclaredConsistencyPredicates().add(domainMetaClass, (pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this);
    }
    
    public void addDomainDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord domainDependenceRecord) {
        getRelationDomainConsistencyPredicateDomainDependenceRecords().add(domainDependenceRecord, (pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this);
    }
    
    public void removeDomainDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord domainDependenceRecord) {
        getRelationDomainConsistencyPredicateDomainDependenceRecords().remove(domainDependenceRecord, (pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internal$getDomainDependenceRecord$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>)this.internal$domainDependenceRecord$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getDomainDependenceRecordSet() {
        return this.domainDependenceRecord;
    }
    
    
}
