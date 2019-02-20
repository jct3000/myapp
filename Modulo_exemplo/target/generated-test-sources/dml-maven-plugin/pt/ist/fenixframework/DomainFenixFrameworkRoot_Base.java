package pt.ist.fenixframework;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainFenixFrameworkRoot_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass> role$$domainMetaClass = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.DomainMetaClass> getSet(pt.ist.fenixframework.DomainFenixFrameworkRoot o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass>) ((DomainFenixFrameworkRoot_Base) o1).domainMetaClass;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot> getInverseRole() {
            return pt.ist.fenixframework.DomainMetaClass.role$$domainFenixFrameworkRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainRoot> role$$domainRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainRoot>() {
        public pt.ist.fenixframework.DomainRoot getValue(pt.ist.fenixframework.DomainFenixFrameworkRoot o1) {
            return ((DomainFenixFrameworkRoot_Base)o1).domainRoot.get();
        }
        public void setValue(pt.ist.fenixframework.DomainFenixFrameworkRoot o1, pt.ist.fenixframework.DomainRoot o2) {
            ((DomainFenixFrameworkRoot_Base)o1).domainRoot.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$domainFenixFrameworkRoot;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainFenixFrameworkRootDomainMetaClasses() {
        return pt.ist.fenixframework.DomainMetaClass.getRelationDomainFenixFrameworkRootDomainMetaClasses();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.DomainMetaClass> keyFunction$$domainMetaClass = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.DomainMetaClass>() { public Comparable<?> getKey(pt.ist.fenixframework.DomainMetaClass value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainRootDomainFenixFrameworkRoot() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootDomainFenixFrameworkRoot();
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass>> internal$domainMetaClass$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass> domainMetaClass;
    private OwnedVBox<pt.ist.fenixframework.DomainRoot> domainRoot;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$domainMetaClass$collectionBox = OwnedVBox.makeNew(this, "internal$domainMetaClass$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.DomainMetaClass> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.DomainMetaClass>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass> get() { return internal$getDomainMetaClass$collection(); }
            };
            domainMetaClass = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass>((pt.ist.fenixframework.DomainFenixFrameworkRoot)this, getRelationDomainFenixFrameworkRootDomainMetaClasses().getInverseRelation(), mapGetter, keyFunction$$domainMetaClass);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass>();
            this.internal$domainMetaClass$collectionBox.put(internalMap);
            domainMetaClass = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainMetaClass>((pt.ist.fenixframework.DomainFenixFrameworkRoot)this, getRelationDomainFenixFrameworkRootDomainMetaClasses().getInverseRelation(), internalMap, keyFunction$$domainMetaClass);
        }
        domainRoot = OwnedVBox.makeNew(this, "domainRoot", allocateOnly, true);
        if (!allocateOnly) this.domainRoot.put(null);
        
    }
    
    // Constructors
    protected  DomainFenixFrameworkRoot_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        getRelationDomainFenixFrameworkRootDomainMetaClasses().add(domainMetaClass, (pt.ist.fenixframework.DomainFenixFrameworkRoot)this);
    }
    
    public void removeDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        getRelationDomainFenixFrameworkRootDomainMetaClasses().remove(domainMetaClass, (pt.ist.fenixframework.DomainFenixFrameworkRoot)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass> internal$getDomainMetaClass$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.DomainMetaClass>)this.internal$domainMetaClass$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.DomainMetaClass> getDomainMetaClassSet() {
        return this.domainMetaClass;
    }
    
    public pt.ist.fenixframework.DomainRoot getDomainRoot() {
        return this.domainRoot.get();
    }
    
    public void setDomainRoot(pt.ist.fenixframework.DomainRoot domainRoot) {
        getRelationDomainRootDomainFenixFrameworkRoot().add(domainRoot, (pt.ist.fenixframework.DomainFenixFrameworkRoot)this);
    }
    
    
}
