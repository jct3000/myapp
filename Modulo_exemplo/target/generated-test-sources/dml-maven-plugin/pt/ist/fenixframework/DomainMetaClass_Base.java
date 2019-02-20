package pt.ist.fenixframework;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainMetaClass_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> role$$domainMetaSuperclass = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass>() {
        public pt.ist.fenixframework.DomainMetaClass getValue(pt.ist.fenixframework.DomainMetaClass o1) {
            return ((DomainMetaClass_Base)o1).domainMetaSuperclass.get();
        }
        public void setValue(pt.ist.fenixframework.DomainMetaClass o1, pt.ist.fenixframework.DomainMetaClass o2) {
            ((DomainMetaClass_Base)o1).domainMetaSuperclass.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> getInverseRole() {
            return pt.ist.fenixframework.DomainMetaClass.role$$domainMetaSubclass;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> role$$domainMetaSubclass = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.DomainMetaClass> getSet(pt.ist.fenixframework.DomainMetaClass o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass>) ((DomainMetaClass_Base) o1).domainMetaSubclass;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> getInverseRole() {
            return pt.ist.fenixframework.DomainMetaClass.role$$domainMetaSuperclass;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot> role$$domainFenixFrameworkRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot>() {
        public pt.ist.fenixframework.DomainFenixFrameworkRoot getValue(pt.ist.fenixframework.DomainMetaClass o1) {
            return ((DomainMetaClass_Base)o1).domainFenixFrameworkRoot.get();
        }
        public void setValue(pt.ist.fenixframework.DomainMetaClass o1, pt.ist.fenixframework.DomainFenixFrameworkRoot o2) {
            ((DomainMetaClass_Base)o1).domainFenixFrameworkRoot.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass> getInverseRole() {
            return pt.ist.fenixframework.DomainFenixFrameworkRoot.role$$domainMetaClass;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.adt.bplustree.DomainBPlusTree> role$$existingDomainMetaObjects = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.adt.bplustree.DomainBPlusTree>() {
        public pt.ist.fenixframework.adt.bplustree.DomainBPlusTree getValue(pt.ist.fenixframework.DomainMetaClass o1) {
            return ((DomainMetaClass_Base)o1).existingDomainMetaObjects.get();
        }
        public void setValue(pt.ist.fenixframework.DomainMetaClass o1, pt.ist.fenixframework.adt.bplustree.DomainBPlusTree o2) {
            ((DomainMetaClass_Base)o1).existingDomainMetaObjects.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.DomainBPlusTree,pt.ist.fenixframework.DomainMetaClass> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.bplustree.DomainBPlusTree,pt.ist.fenixframework.DomainMetaClass>(this);
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> role$$declaredConsistencyPredicate = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getSet(pt.ist.fenixframework.DomainMetaClass o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>) ((DomainMetaClass_Base) o1).declaredConsistencyPredicate;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.DomainMetaClass> getInverseRole() {
            return pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate.role$$domainMetaClass;
        }
        
    };
    
    
    private final static class DomainMetaSuperclassDomainMetaSubclasses {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass>(role$$domainMetaSubclass, "DomainMetaSuperclassDomainMetaSubclasses", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> getRelationDomainMetaSuperclassDomainMetaSubclasses() {
        return DomainMetaSuperclassDomainMetaSubclasses.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.DomainMetaClass> keyFunction$$domainMetaSubclass = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.DomainMetaClass>() { public Comparable<?> getKey(pt.ist.fenixframework.DomainMetaClass value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class DomainFenixFrameworkRootDomainMetaClasses {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot>(role$$domainFenixFrameworkRoot, "DomainFenixFrameworkRootDomainMetaClasses", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainFenixFrameworkRootDomainMetaClasses() {
        return DomainFenixFrameworkRootDomainMetaClasses.relation;
    }
    
    private final static class DomainMetaClassExistingDomainMetaObjects {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.adt.bplustree.DomainBPlusTree> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.adt.bplustree.DomainBPlusTree>(role$$existingDomainMetaObjects, "DomainMetaClassExistingDomainMetaObjects", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.adt.bplustree.DomainBPlusTree> getRelationDomainMetaClassExistingDomainMetaObjects() {
        return DomainMetaClassExistingDomainMetaObjects.relation;
    }
    
    private final static class DomainMetaClassDeclaredConsistencyPredicates {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>(role$$declaredConsistencyPredicate, "DomainMetaClassDeclaredConsistencyPredicates", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainMetaClassDeclaredConsistencyPredicates() {
        return DomainMetaClassDeclaredConsistencyPredicates.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> keyFunction$$declaredConsistencyPredicate = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>() { public Comparable<?> getKey(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    private OwnedVBox<java.lang.String> domainClassName;
    private OwnedVBox<java.lang.Boolean> initialized;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.DomainMetaClass> domainMetaSuperclass;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass>> internal$domainMetaSubclass$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass> domainMetaSubclass;
    private OwnedVBox<pt.ist.fenixframework.DomainFenixFrameworkRoot> domainFenixFrameworkRoot;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.DomainBPlusTree> existingDomainMetaObjects;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>> internal$declaredConsistencyPredicate$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> declaredConsistencyPredicate;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        domainClassName = OwnedVBox.makeNew(this, "domainClassName", allocateOnly, false);
        if (!allocateOnly) this.domainClassName.put(null);
        initialized = OwnedVBox.makeNew(this, "initialized", allocateOnly, false);
        if (!allocateOnly) this.initialized.put(null);
        domainMetaSuperclass = OwnedVBox.makeNew(this, "domainMetaSuperclass", allocateOnly, true);
        if (!allocateOnly) this.domainMetaSuperclass.put(null);
        internal$domainMetaSubclass$collectionBox = OwnedVBox.makeNew(this, "internal$domainMetaSubclass$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.DomainMetaClass> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.DomainMetaClass>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass> get() { return internal$getDomainMetaSubclass$collection(); }
            };
            domainMetaSubclass = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass>((pt.ist.fenixframework.DomainMetaClass)this, getRelationDomainMetaSuperclassDomainMetaSubclasses(), mapGetter, keyFunction$$domainMetaSubclass);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass>();
            this.internal$domainMetaSubclass$collectionBox.put(internalMap);
            domainMetaSubclass = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainMetaClass>((pt.ist.fenixframework.DomainMetaClass)this, getRelationDomainMetaSuperclassDomainMetaSubclasses(), internalMap, keyFunction$$domainMetaSubclass);
        }
        domainFenixFrameworkRoot = OwnedVBox.makeNew(this, "domainFenixFrameworkRoot", allocateOnly, true);
        if (!allocateOnly) this.domainFenixFrameworkRoot.put(null);
        existingDomainMetaObjects = OwnedVBox.makeNew(this, "existingDomainMetaObjects", allocateOnly, true);
        if (!allocateOnly) this.existingDomainMetaObjects.put(null);
        internal$declaredConsistencyPredicate$collectionBox = OwnedVBox.makeNew(this, "internal$declaredConsistencyPredicate$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> get() { return internal$getDeclaredConsistencyPredicate$collection(); }
            };
            declaredConsistencyPredicate = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>((pt.ist.fenixframework.DomainMetaClass)this, getRelationDomainMetaClassDeclaredConsistencyPredicates(), mapGetter, keyFunction$$declaredConsistencyPredicate);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>();
            this.internal$declaredConsistencyPredicate$collectionBox.put(internalMap);
            declaredConsistencyPredicate = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>((pt.ist.fenixframework.DomainMetaClass)this, getRelationDomainMetaClassDeclaredConsistencyPredicates(), internalMap, keyFunction$$declaredConsistencyPredicate);
        }
        
    }
    
    // Constructors
    protected  DomainMetaClass_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.String getDomainClassName() {
        return this.domainClassName.get();
    }
    
    public void setDomainClassName(java.lang.String domainClassName) {
        this.domainClassName.put(domainClassName);
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
    
    public pt.ist.fenixframework.DomainMetaClass getDomainMetaSuperclass() {
        return this.domainMetaSuperclass.get();
    }
    
    public void setDomainMetaSuperclass(pt.ist.fenixframework.DomainMetaClass domainMetaSuperclass) {
        getRelationDomainMetaSuperclassDomainMetaSubclasses().add(domainMetaSuperclass, (pt.ist.fenixframework.DomainMetaClass)this);
    }
    
    public void addDomainMetaSubclass(pt.ist.fenixframework.DomainMetaClass domainMetaSubclass) {
        getRelationDomainMetaSuperclassDomainMetaSubclasses().add((pt.ist.fenixframework.DomainMetaClass)this, domainMetaSubclass);
    }
    
    public void removeDomainMetaSubclass(pt.ist.fenixframework.DomainMetaClass domainMetaSubclass) {
        getRelationDomainMetaSuperclassDomainMetaSubclasses().remove((pt.ist.fenixframework.DomainMetaClass)this, domainMetaSubclass);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass> internal$getDomainMetaSubclass$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass>)this.internal$domainMetaSubclass$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.DomainMetaClass> getDomainMetaSubclassSet() {
        return this.domainMetaSubclass;
    }
    
    public pt.ist.fenixframework.DomainFenixFrameworkRoot getDomainFenixFrameworkRoot() {
        return this.domainFenixFrameworkRoot.get();
    }
    
    public void setDomainFenixFrameworkRoot(pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot) {
        getRelationDomainFenixFrameworkRootDomainMetaClasses().add((pt.ist.fenixframework.DomainMetaClass)this, domainFenixFrameworkRoot);
    }
    
    public pt.ist.fenixframework.adt.bplustree.DomainBPlusTree getExistingDomainMetaObjects() {
        return this.existingDomainMetaObjects.get();
    }
    
    public void setExistingDomainMetaObjects(pt.ist.fenixframework.adt.bplustree.DomainBPlusTree existingDomainMetaObjects) {
        getRelationDomainMetaClassExistingDomainMetaObjects().add((pt.ist.fenixframework.DomainMetaClass)this, existingDomainMetaObjects);
    }
    
    public void addDeclaredConsistencyPredicate(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate declaredConsistencyPredicate) {
        getRelationDomainMetaClassDeclaredConsistencyPredicates().add((pt.ist.fenixframework.DomainMetaClass)this, declaredConsistencyPredicate);
    }
    
    public void removeDeclaredConsistencyPredicate(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate declaredConsistencyPredicate) {
        getRelationDomainMetaClassDeclaredConsistencyPredicates().remove((pt.ist.fenixframework.DomainMetaClass)this, declaredConsistencyPredicate);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> internal$getDeclaredConsistencyPredicate$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate>)this.internal$declaredConsistencyPredicate$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getDeclaredConsistencyPredicateSet() {
        return this.declaredConsistencyPredicate;
    }
    
    
}
