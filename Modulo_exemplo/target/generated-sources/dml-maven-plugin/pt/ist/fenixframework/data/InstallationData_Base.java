package pt.ist.fenixframework.data;


@SuppressWarnings("all")
public abstract class InstallationData_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getRelationDomainRootHasInstallationData() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  InstallationData_Base() {
        super();
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.data.ModuleData getModuleData() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setModuleData(pt.ist.fenixframework.data.ModuleData moduleData) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainRoot getDomainRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainRoot(pt.ist.fenixframework.DomainRoot domainRoot) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
