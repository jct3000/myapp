package pt.ulisboa.tecnico.Modulo_exemplo.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class Modulo1_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ist.fenixframework.DomainRoot>() {
        public pt.ist.fenixframework.DomainRoot getValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 o1) {
            return ((Modulo1_Base)o1).root.get();
        }
        public void setValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 o1, pt.ist.fenixframework.DomainRoot o2) {
            ((Modulo1_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$modulo1;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> role$$restaurante = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> getSet(pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>) ((Modulo1_Base) o1).restaurante;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante.role$$modulo1;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> role$$pessoa = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> getSet(pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>) ((Modulo1_Base) o1).pessoa;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa.role$$modulo1;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationBennuTemModulo1() {
        return pt.ist.fenixframework.DomainRoot.getRelationBennuTemModulo1();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemRestaurantes() {
        return pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante.getRelationModulo1TemRestaurantes();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> keyFunction$$restaurante = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>() { public Comparable<?> getKey(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemPessoas() {
        return pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa.getRelationModulo1TemPessoas();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> keyFunction$$pessoa = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>() { public Comparable<?> getKey(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.DomainRoot> root;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>> internal$restaurante$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> restaurante;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>> internal$pessoa$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> pessoa;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        root = OwnedVBox.makeNew(this, "root", allocateOnly, true);
        if (!allocateOnly) this.root.put(null);
        internal$restaurante$collectionBox = OwnedVBox.makeNew(this, "internal$restaurante$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> get() { return internal$getRestaurante$collection(); }
            };
            restaurante = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>((pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this, getRelationModulo1TemRestaurantes().getInverseRelation(), mapGetter, keyFunction$$restaurante);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>();
            this.internal$restaurante$collectionBox.put(internalMap);
            restaurante = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>((pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this, getRelationModulo1TemRestaurantes().getInverseRelation(), internalMap, keyFunction$$restaurante);
        }
        internal$pessoa$collectionBox = OwnedVBox.makeNew(this, "internal$pessoa$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> get() { return internal$getPessoa$collection(); }
            };
            pessoa = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>((pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this, getRelationModulo1TemPessoas().getInverseRelation(), mapGetter, keyFunction$$pessoa);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>();
            this.internal$pessoa$collectionBox.put(internalMap);
            pessoa = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>((pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this, getRelationModulo1TemPessoas().getInverseRelation(), internalMap, keyFunction$$pessoa);
        }
        
    }
    
    // Constructors
    protected  Modulo1_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        return this.root.get();
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationBennuTemModulo1().add(root, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this);
    }
    
    public void addRestaurante(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante restaurante) {
        getRelationModulo1TemRestaurantes().add(restaurante, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this);
    }
    
    public void removeRestaurante(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante restaurante) {
        getRelationModulo1TemRestaurantes().remove(restaurante, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> internal$getRestaurante$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>)this.internal$restaurante$collectionBox.get();
    }
    
    public java.util.Set<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> getRestauranteSet() {
        return this.restaurante;
    }
    
    public void addPessoa(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa pessoa) {
        getRelationModulo1TemPessoas().add(pessoa, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this);
    }
    
    public void removePessoa(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa pessoa) {
        getRelationModulo1TemPessoas().remove(pessoa, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> internal$getPessoa$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>)this.internal$pessoa$collectionBox.get();
    }
    
    public java.util.Set<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> getPessoaSet() {
        return this.pessoa;
    }
    
    
}
