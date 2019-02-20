package pt.ist.fenixframework.data;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class InstallationData_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> role$$domainRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot>() {
        public pt.ist.fenixframework.DomainRoot getValue(pt.ist.fenixframework.data.InstallationData o1) {
            return ((InstallationData_Base)o1).domainRoot.get();
        }
        public void setValue(pt.ist.fenixframework.data.InstallationData o1, pt.ist.fenixframework.DomainRoot o2) {
            ((InstallationData_Base)o1).domainRoot.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$installationData;
        }
        
    };
    
    private final static class DomainRootHasInstallationData {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot>(role$$domainRoot, "DomainRootHasInstallationData", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getRelationDomainRootHasInstallationData() {
        return DomainRootHasInstallationData.relation;
    }
    
    // Slots
    private OwnedVBox<pt.ist.fenixframework.data.ModuleData> moduleData;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.DomainRoot> domainRoot;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        moduleData = OwnedVBox.makeNew(this, "moduleData", allocateOnly, false);
        if (!allocateOnly) this.moduleData.put(null);
        domainRoot = OwnedVBox.makeNew(this, "domainRoot", allocateOnly, true);
        if (!allocateOnly) this.domainRoot.put(null);
        
    }
    
    // Constructors
    protected  InstallationData_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.data.ModuleData getModuleData() {
        return this.moduleData.get();
    }
    
    public void setModuleData(pt.ist.fenixframework.data.ModuleData moduleData) {
        this.moduleData.put(moduleData);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainRoot getDomainRoot() {
        return this.domainRoot.get();
    }
    
    public void setDomainRoot(pt.ist.fenixframework.DomainRoot domainRoot) {
        getRelationDomainRootHasInstallationData().add((pt.ist.fenixframework.data.InstallationData)this, domainRoot);
    }
    
    
}
