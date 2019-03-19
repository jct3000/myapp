package pt.ulisboa.tecnico.Modulo_exemplo.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class Restaurante_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> role$$checkin = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getSet(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>) ((Restaurante_Base) o1).checkin;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin.role$$restaurante;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> role$$modulo1 = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1>() {
        public pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 getValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante o1) {
            return ((Restaurante_Base)o1).modulo1.get();
        }
        public void setValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante o1, pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 o2) {
            ((Restaurante_Base)o1).modulo1.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1.role$$restaurante;
        }
        
    };
    
    private final static class RestauranteTemCheckin {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>(role$$checkin, "RestauranteTemCheckin", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getRelationRestauranteTemCheckin() {
        return RestauranteTemCheckin.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> keyFunction$$checkin = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>() { public Comparable<?> getKey(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class Modulo1TemRestaurantes {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1>(role$$modulo1, "Modulo1TemRestaurantes", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemRestaurantes() {
        return Modulo1TemRestaurantes.relation;
    }
    
    // Slots
    private OwnedVBox<java.lang.String> name;
    private OwnedVBox<java.lang.String> email;
    private OwnedVBox<java.lang.String> adress;
    private OwnedVBox<Boolean> personal_tag;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>> internal$checkin$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> checkin;
    private OwnedVBox<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> modulo1;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        name = OwnedVBox.makeNew(this, "name", allocateOnly, false);
        if (!allocateOnly) this.name.put(null);
        email = OwnedVBox.makeNew(this, "email", allocateOnly, false);
        if (!allocateOnly) this.email.put(null);
        adress = OwnedVBox.makeNew(this, "adress", allocateOnly, false);
        if (!allocateOnly) this.adress.put(null);
        personal_tag = OwnedVBox.makeNew(this, "personal_tag", allocateOnly, false);
        if (!allocateOnly) this.personal_tag.put(false);
        internal$checkin$collectionBox = OwnedVBox.makeNew(this, "internal$checkin$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> get() { return internal$getCheckin$collection(); }
            };
            checkin = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>((pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante)this, getRelationRestauranteTemCheckin(), mapGetter, keyFunction$$checkin);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>();
            this.internal$checkin$collectionBox.put(internalMap);
            checkin = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>((pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante)this, getRelationRestauranteTemCheckin(), internalMap, keyFunction$$checkin);
        }
        modulo1 = OwnedVBox.makeNew(this, "modulo1", allocateOnly, true);
        if (!allocateOnly) this.modulo1.put(null);
        
    }
    
    // Constructors
    protected  Restaurante_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.String getName() {
        return this.name.get();
    }
    
    public void setName(java.lang.String name) {
        this.name.put(name);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getEmail() {
        return this.email.get();
    }
    
    public void setEmail(java.lang.String email) {
        this.email.put(email);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getAdress() {
        return this.adress.get();
    }
    
    public void setAdress(java.lang.String adress) {
        this.adress.put(adress);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public boolean getPersonal_tag() {
        return this.personal_tag.get();
    }
    
    public void setPersonal_tag(boolean personal_tag) {
        this.personal_tag.put(personal_tag);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public void addCheckin(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin checkin) {
        getRelationRestauranteTemCheckin().add((pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante)this, checkin);
    }
    
    public void removeCheckin(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin checkin) {
        getRelationRestauranteTemCheckin().remove((pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante)this, checkin);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> internal$getCheckin$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>)this.internal$checkin$collectionBox.get();
    }
    
    public java.util.Set<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getCheckinSet() {
        return this.checkin;
    }
    
    public pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 getModulo1() {
        return this.modulo1.get();
    }
    
    public void setModulo1(pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 modulo1) {
        getRelationModulo1TemRestaurantes().add((pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante)this, modulo1);
    }
    
    
}
