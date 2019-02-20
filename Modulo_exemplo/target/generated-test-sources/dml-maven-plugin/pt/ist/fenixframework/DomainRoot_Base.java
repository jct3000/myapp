package pt.ist.fenixframework;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainRoot_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData> role$$installationData = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData>() {
        public pt.ist.fenixframework.data.InstallationData getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base)o1).installationData.get();
        }
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.data.InstallationData o2) {
            ((DomainRoot_Base)o1).installationData.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ist.fenixframework.data.InstallationData.role$$domainRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base)o1).bennu.get();
        }
        public void setValue(pt.ist.fenixframework.DomainRoot o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((DomainRoot_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> role$$domainFenixFrameworkRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot>() {
        public pt.ist.fenixframework.DomainFenixFrameworkRoot getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base)o1).domainFenixFrameworkRoot.get();
        }
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.DomainFenixFrameworkRoot o2) {
            ((DomainRoot_Base)o1).domainFenixFrameworkRoot.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ist.fenixframework.DomainFenixFrameworkRoot.role$$domainRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> role$$fenixFrameworkData = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData>() {
        public pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base)o1).fenixFrameworkData.get();
        }
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData o2) {
            ((DomainRoot_Base)o1).fenixFrameworkData.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.DomainRoot>(this);
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getRelationDomainRootHasInstallationData() {
        return pt.ist.fenixframework.data.InstallationData.getRelationDomainRootHasInstallationData();
    }
    
    private final static class DomainRootBennu {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "DomainRootBennu", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getRelationDomainRootBennu() {
        return DomainRootBennu.relation;
    }
    
    private final static class DomainRootDomainFenixFrameworkRoot {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot>(role$$domainFenixFrameworkRoot, "DomainRootDomainFenixFrameworkRoot", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainRootDomainFenixFrameworkRoot() {
        return DomainRootDomainFenixFrameworkRoot.relation;
    }
    
    private final static class DomainRootHasFenixFrameworkData {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData>(role$$fenixFrameworkData, "DomainRootHasFenixFrameworkData", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> getRelationDomainRootHasFenixFrameworkData() {
        return DomainRootHasFenixFrameworkData.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.data.InstallationData> installationData;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    private OwnedVBox<pt.ist.fenixframework.DomainFenixFrameworkRoot> domainFenixFrameworkRoot;
    private OwnedVBox<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> fenixFrameworkData;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        installationData = OwnedVBox.makeNew(this, "installationData", allocateOnly, true);
        if (!allocateOnly) this.installationData.put(null);
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        domainFenixFrameworkRoot = OwnedVBox.makeNew(this, "domainFenixFrameworkRoot", allocateOnly, true);
        if (!allocateOnly) this.domainFenixFrameworkRoot.put(null);
        fenixFrameworkData = OwnedVBox.makeNew(this, "fenixFrameworkData", allocateOnly, true);
        if (!allocateOnly) this.fenixFrameworkData.put(null);
        
    }
    
    // Constructors
    protected  DomainRoot_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.data.InstallationData getInstallationData() {
        return this.installationData.get();
    }
    
    public void setInstallationData(pt.ist.fenixframework.data.InstallationData installationData) {
        getRelationDomainRootHasInstallationData().add(installationData, (pt.ist.fenixframework.DomainRoot)this);
    }
    
    public org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    public void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationDomainRootBennu().add((pt.ist.fenixframework.DomainRoot)this, bennu);
    }
    
    public pt.ist.fenixframework.DomainFenixFrameworkRoot getDomainFenixFrameworkRoot() {
        return this.domainFenixFrameworkRoot.get();
    }
    
    public void setDomainFenixFrameworkRoot(pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot) {
        getRelationDomainRootDomainFenixFrameworkRoot().add((pt.ist.fenixframework.DomainRoot)this, domainFenixFrameworkRoot);
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData getFenixFrameworkData() {
        return this.fenixFrameworkData.get();
    }
    
    public void setFenixFrameworkData(pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData fenixFrameworkData) {
        getRelationDomainRootHasFenixFrameworkData().add((pt.ist.fenixframework.DomainRoot)this, fenixFrameworkData);
    }
    
    
}
