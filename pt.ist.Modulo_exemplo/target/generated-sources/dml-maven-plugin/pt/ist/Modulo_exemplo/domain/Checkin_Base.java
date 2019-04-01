package pt.ist.Modulo_exemplo.domain;


@SuppressWarnings("all")
public abstract class Checkin_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.Modulo_exemplo.domain.Restaurante,pt.ist.Modulo_exemplo.domain.Checkin> getRelationRestauranteTemCheckin() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.Modulo_exemplo.domain.Pessoa,pt.ist.Modulo_exemplo.domain.Checkin> getRelationPessoaFazCheckin() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  Checkin_Base() {
        super();
    }
    
    // Getters and Setters
    
    public org.joda.time.DateTime getVisithour() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setVisithour(org.joda.time.DateTime visithour) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public int getRate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setRate(int rate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getEvaluation() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setEvaluation(java.lang.String evaluation) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public boolean getPersonal_tag() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPersonal_tag(boolean personal_tag) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public pt.ist.Modulo_exemplo.domain.Restaurante getRestaurante() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setRestaurante(pt.ist.Modulo_exemplo.domain.Restaurante restaurante) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.Modulo_exemplo.domain.Pessoa getPessoa() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPessoa(pt.ist.Modulo_exemplo.domain.Pessoa pessoa) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
