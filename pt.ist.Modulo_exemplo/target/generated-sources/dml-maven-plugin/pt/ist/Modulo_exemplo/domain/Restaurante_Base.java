package pt.ist.Modulo_exemplo.domain;


@SuppressWarnings("all")
public abstract class Restaurante_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.Modulo_exemplo.domain.Restaurante,pt.ist.Modulo_exemplo.domain.Checkin> getRelationRestauranteTemCheckin() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.Modulo_exemplo.domain.Restaurante,pt.ist.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemRestaurantes() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  Restaurante_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getName() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setName(java.lang.String name) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getEmail() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setEmail(java.lang.String email) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getAdress() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setAdress(java.lang.String adress) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public boolean getPersonal_tag() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPersonal_tag(boolean personal_tag) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public void addCheckin(pt.ist.Modulo_exemplo.domain.Checkin checkin) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeCheckin(pt.ist.Modulo_exemplo.domain.Checkin checkin) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.Modulo_exemplo.domain.Checkin> getCheckinSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.Modulo_exemplo.domain.Modulo1 getModulo1() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setModulo1(pt.ist.Modulo_exemplo.domain.Modulo1 modulo1) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
