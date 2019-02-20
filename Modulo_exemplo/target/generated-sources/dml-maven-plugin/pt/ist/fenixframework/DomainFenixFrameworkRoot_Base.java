package pt.ist.fenixframework;


@SuppressWarnings("all")
public abstract class DomainFenixFrameworkRoot_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaClass,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainFenixFrameworkRootDomainMetaClasses() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainRootDomainFenixFrameworkRoot() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainFenixFrameworkRoot_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.DomainMetaClass> getDomainMetaClassSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.DomainRoot getDomainRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainRoot(pt.ist.fenixframework.DomainRoot domainRoot) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
