package pt.ulisboa.tecnico.Modulo_exemplo.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class Checkin_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> role$$restaurante = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin,pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante>() {
        public pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante getValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin o1) {
            return ((Checkin_Base)o1).restaurante.get();
        }
        public void setValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin o1, pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante o2) {
            ((Checkin_Base)o1).restaurante.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante.role$$checkin;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> role$$pessoa = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin,pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa>() {
        public pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa getValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin o1) {
            return ((Checkin_Base)o1).pessoa.get();
        }
        public void setValue(pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin o1, pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa o2) {
            ((Checkin_Base)o1).pessoa.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getInverseRole() {
            return pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa.role$$checkin;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getRelationRestauranteTemCheckin() {
        return pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante.getRelationRestauranteTemCheckin();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin> getRelationPessoaFazCheckin() {
        return pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa.getRelationPessoaFazCheckin();
    }
    
    // Slots
    private OwnedVBox<org.joda.time.DateTime> visithour;
    private OwnedVBox<Integer> rate;
    private OwnedVBox<java.lang.String> evaluation;
    private OwnedVBox<Boolean> personal_tag;
    // Role Slots
    private OwnedVBox<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> restaurante;
    private OwnedVBox<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> pessoa;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        visithour = OwnedVBox.makeNew(this, "visithour", allocateOnly, false);
        if (!allocateOnly) this.visithour.put(null);
        rate = OwnedVBox.makeNew(this, "rate", allocateOnly, false);
        if (!allocateOnly) this.rate.put(0);
        evaluation = OwnedVBox.makeNew(this, "evaluation", allocateOnly, false);
        if (!allocateOnly) this.evaluation.put(null);
        personal_tag = OwnedVBox.makeNew(this, "personal_tag", allocateOnly, false);
        if (!allocateOnly) this.personal_tag.put(false);
        restaurante = OwnedVBox.makeNew(this, "restaurante", allocateOnly, true);
        if (!allocateOnly) this.restaurante.put(null);
        pessoa = OwnedVBox.makeNew(this, "pessoa", allocateOnly, true);
        if (!allocateOnly) this.pessoa.put(null);
        
    }
    
    // Constructors
    protected  Checkin_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public org.joda.time.DateTime getVisithour() {
        return this.visithour.get();
    }
    
    public void setVisithour(org.joda.time.DateTime visithour) {
        this.visithour.put(visithour);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public int getRate() {
        return this.rate.get();
    }
    
    public void setRate(int rate) {
        this.rate.put(rate);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getEvaluation() {
        return this.evaluation.get();
    }
    
    public void setEvaluation(java.lang.String evaluation) {
        this.evaluation.put(evaluation);
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
    
    public pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante getRestaurante() {
        return this.restaurante.get();
    }
    
    public void setRestaurante(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante restaurante) {
        getRelationRestauranteTemCheckin().add(restaurante, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin)this);
    }
    
    public pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa getPessoa() {
        return this.pessoa.get();
    }
    
    public void setPessoa(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa pessoa) {
        getRelationPessoaFazCheckin().add(pessoa, (pt.ulisboa.tecnico.Modulo_exemplo.domain.Checkin)this);
    }
    
    
}
