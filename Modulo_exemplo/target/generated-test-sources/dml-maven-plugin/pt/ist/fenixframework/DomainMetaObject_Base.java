package pt.ist.fenixframework;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainMetaObject_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> role$$ownDependenceRecord = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getSet(pt.ist.fenixframework.DomainMetaObject o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>) ((DomainMetaObject_Base) o1).ownDependenceRecord;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.role$$dependentDomainMetaObject;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainMetaClass> role$$domainMetaClass = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainMetaClass>() {
        public pt.ist.fenixframework.DomainMetaClass getValue(pt.ist.fenixframework.DomainMetaObject o1) {
            return ((DomainMetaObject_Base)o1).domainMetaClass.get();
        }
        public void setValue(pt.ist.fenixframework.DomainMetaObject o1, pt.ist.fenixframework.DomainMetaClass o2) {
            ((DomainMetaObject_Base)o1).domainMetaClass.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaObject> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaObject>(this);
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> role$$dependingDependenceRecord = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getSet(pt.ist.fenixframework.DomainMetaObject o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>) ((DomainMetaObject_Base) o1).dependingDependenceRecord;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.role$$dependedDomainMetaObject;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainObject> role$$domainObject = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainObject>() {
        public pt.ist.fenixframework.DomainObject getValue(pt.ist.fenixframework.DomainMetaObject o1) {
            return ((DomainMetaObject_Base)o1).domainObject.get();
        }
        public void setValue(pt.ist.fenixframework.DomainMetaObject o1, pt.ist.fenixframework.DomainObject o2) {
            ((DomainMetaObject_Base)o1).domainObject.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainObject,pt.ist.fenixframework.DomainMetaObject> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.DomainObject,pt.ist.fenixframework.DomainMetaObject>(this);
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependentDomainMetaObjectOwnDependenceRecords() {
        return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.getRelationDependentDomainMetaObjectOwnDependenceRecords();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> keyFunction$$ownDependenceRecord = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() { public Comparable<?> getKey(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class DomainMetaObjectsDomainMetaClass {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainMetaClass> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainMetaClass>(role$$domainMetaClass, "DomainMetaObjectsDomainMetaClass", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainMetaClass> getRelationDomainMetaObjectsDomainMetaClass() {
        return DomainMetaObjectsDomainMetaClass.relation;
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependedDomainMetaObjectsDependingDependenceRecords() {
        return pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord.getRelationDependedDomainMetaObjectsDependingDependenceRecords();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> keyFunction$$dependingDependenceRecord = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() { public Comparable<?> getKey(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class DomainMetaObjectAbstractDomainObject {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainObject> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainObject>(role$$domainObject, "DomainMetaObjectAbstractDomainObject", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainObject> getRelationDomainMetaObjectAbstractDomainObject() {
        return DomainMetaObjectAbstractDomainObject.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>> internal$ownDependenceRecord$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> ownDependenceRecord;
    private OwnedVBox<pt.ist.fenixframework.DomainMetaClass> domainMetaClass;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>> internal$dependingDependenceRecord$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> dependingDependenceRecord;
    private OwnedVBox<pt.ist.fenixframework.DomainObject> domainObject;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$ownDependenceRecord$collectionBox = OwnedVBox.makeNew(this, "internal$ownDependenceRecord$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> get() { return internal$getOwnDependenceRecord$collection(); }
            };
            ownDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.DomainMetaObject)this, getRelationDependentDomainMetaObjectOwnDependenceRecords().getInverseRelation(), mapGetter, keyFunction$$ownDependenceRecord);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>();
            this.internal$ownDependenceRecord$collectionBox.put(internalMap);
            ownDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.DomainMetaObject)this, getRelationDependentDomainMetaObjectOwnDependenceRecords().getInverseRelation(), internalMap, keyFunction$$ownDependenceRecord);
        }
        domainMetaClass = OwnedVBox.makeNew(this, "domainMetaClass", allocateOnly, true);
        if (!allocateOnly) this.domainMetaClass.put(null);
        internal$dependingDependenceRecord$collectionBox = OwnedVBox.makeNew(this, "internal$dependingDependenceRecord$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> get() { return internal$getDependingDependenceRecord$collection(); }
            };
            dependingDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.DomainMetaObject)this, getRelationDependedDomainMetaObjectsDependingDependenceRecords().getInverseRelation(), mapGetter, keyFunction$$dependingDependenceRecord);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>();
            this.internal$dependingDependenceRecord$collectionBox.put(internalMap);
            dependingDependenceRecord = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>((pt.ist.fenixframework.DomainMetaObject)this, getRelationDependedDomainMetaObjectsDependingDependenceRecords().getInverseRelation(), internalMap, keyFunction$$dependingDependenceRecord);
        }
        domainObject = OwnedVBox.makeNew(this, "domainObject", allocateOnly, true);
        if (!allocateOnly) this.domainObject.put(null);
        
    }
    
    // Constructors
    protected  DomainMetaObject_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addOwnDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord ownDependenceRecord) {
        getRelationDependentDomainMetaObjectOwnDependenceRecords().add(ownDependenceRecord, (pt.ist.fenixframework.DomainMetaObject)this);
    }
    
    public void removeOwnDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord ownDependenceRecord) {
        getRelationDependentDomainMetaObjectOwnDependenceRecords().remove(ownDependenceRecord, (pt.ist.fenixframework.DomainMetaObject)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internal$getOwnDependenceRecord$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>)this.internal$ownDependenceRecord$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getOwnDependenceRecordSet() {
        return this.ownDependenceRecord;
    }
    
    public pt.ist.fenixframework.DomainMetaClass getDomainMetaClass() {
        return this.domainMetaClass.get();
    }
    
    public void setDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        getRelationDomainMetaObjectsDomainMetaClass().add((pt.ist.fenixframework.DomainMetaObject)this, domainMetaClass);
    }
    
    public void addDependingDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord dependingDependenceRecord) {
        getRelationDependedDomainMetaObjectsDependingDependenceRecords().add(dependingDependenceRecord, (pt.ist.fenixframework.DomainMetaObject)this);
    }
    
    public void removeDependingDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord dependingDependenceRecord) {
        getRelationDependedDomainMetaObjectsDependingDependenceRecords().remove(dependingDependenceRecord, (pt.ist.fenixframework.DomainMetaObject)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> internal$getDependingDependenceRecord$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord>)this.internal$dependingDependenceRecord$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getDependingDependenceRecordSet() {
        return this.dependingDependenceRecord;
    }
    
    public pt.ist.fenixframework.DomainObject getDomainObject() {
        return this.domainObject.get();
    }
    
    public void setDomainObject(pt.ist.fenixframework.DomainObject domainObject) {
        getRelationDomainMetaObjectAbstractDomainObject().add((pt.ist.fenixframework.DomainMetaObject)this, domainObject);
    }
    
    
}
