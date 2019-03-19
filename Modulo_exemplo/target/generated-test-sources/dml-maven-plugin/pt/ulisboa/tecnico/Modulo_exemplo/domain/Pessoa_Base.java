package pt.ulisboa.tecnico.Modulo_exemplo.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class Pessoa_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> role$$checkin = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>() {
        public pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin getValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa o1) {
            return ((Pessoa_Base)o1).checkin.get();
        }
        public void setValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa o1, pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin o2) {
            ((Pessoa_Base)o1).checkin.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin.role$$pessoa;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> role$$modulo1 = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1>() {
        public pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 getValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa o1) {
            return ((Pessoa_Base)o1).modulo1.get();
        }
        public void setValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa o1, pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 o2) {
            ((Pessoa_Base)o1).modulo1.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1.role$$pessoa;
        }
        
    };
    
    private final static class PessoaFazCheckin {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin>(role$$checkin, "PessoaFazCheckin", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getRelationPessoaFazCheckin() {
        return PessoaFazCheckin.relation;
    }
    
    private final static class Modulo1TemPessoas {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1>(role$$modulo1, "Modulo1TemPessoas", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemPessoas() {
        return Modulo1TemPessoas.relation;
    }
    
    // Slots
    private OwnedVBox<java.lang.String> name;
    private OwnedVBox<Integer> age;
    private OwnedVBox<java.lang.String> email;
    private OwnedVBox<java.lang.String> adress;
    private OwnedVBox<Boolean> personal_tag;
    // Role Slots
    private OwnedVBox<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> checkin;
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
        age = OwnedVBox.makeNew(this, "age", allocateOnly, false);
        if (!allocateOnly) this.age.put(0);
        email = OwnedVBox.makeNew(this, "email", allocateOnly, false);
        if (!allocateOnly) this.email.put(null);
        adress = OwnedVBox.makeNew(this, "adress", allocateOnly, false);
        if (!allocateOnly) this.adress.put(null);
        personal_tag = OwnedVBox.makeNew(this, "personal_tag", allocateOnly, false);
        if (!allocateOnly) this.personal_tag.put(false);
        checkin = OwnedVBox.makeNew(this, "checkin", allocateOnly, true);
        if (!allocateOnly) this.checkin.put(null);
        modulo1 = OwnedVBox.makeNew(this, "modulo1", allocateOnly, true);
        if (!allocateOnly) this.modulo1.put(null);
        
    }
    
    // Constructors
    protected  Pessoa_Base() {
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
    
    public int getAge() {
        return this.age.get();
    }
    
    public void setAge(int age) {
        this.age.put(age);
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
    
    public pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin getCheckin() {
        return this.checkin.get();
    }
    
    public void setCheckin(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin checkin) {
        getRelationPessoaFazCheckin().add((pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa)this, checkin);
    }
    
    public pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 getModulo1() {
        return this.modulo1.get();
    }
    
    public void setModulo1(pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1 modulo1) {
        getRelationModulo1TemPessoas().add((pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa)this, modulo1);
    }
    
    
}
