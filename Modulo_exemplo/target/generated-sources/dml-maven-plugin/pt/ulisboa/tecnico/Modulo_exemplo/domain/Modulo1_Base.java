package pt.ulisboa.tecnico.Modulo_exemplo.domain;


@SuppressWarnings("all")
public abstract class Modulo1_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationBennuTemModulo1() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemRestaurantes() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa,pt.ulisboa.tecnico.Modulo_exemplo.domain.Modulo1> getRelationModulo1TemPessoas() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  Modulo1_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainRoot getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setRoot(pt.ist.fenixframework.DomainRoot root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addRestaurante(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante restaurante) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeRestaurante(pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante restaurante) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ulisboa.tecnico.Modulo_exemplo.domain.Restaurante> getRestauranteSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addPessoa(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa pessoa) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removePessoa(pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa pessoa) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ulisboa.tecnico.Modulo_exemplo.domain.Pessoa> getPessoaSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
