package pt.ist.fenixframework;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class DomainRoot_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData> role$$installationData = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.data.InstallationData>() {
        @Override
        public pt.ist.fenixframework.data.InstallationData getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base.DO_State)o1.get$obj$state(false)).installationData;
        }
        @Override
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.data.InstallationData o2) {
            ((DomainRoot_Base.DO_State)o1.get$obj$state(true)).installationData = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ist.fenixframework.data.InstallationData.role$$domainRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(pt.ist.fenixframework.DomainRoot o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((DomainRoot_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> role$$domainFenixFrameworkRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot>() {
        @Override
        public pt.ist.fenixframework.DomainFenixFrameworkRoot getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base.DO_State)o1.get$obj$state(false)).domainFenixFrameworkRoot;
        }
        @Override
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.DomainFenixFrameworkRoot o2) {
            ((DomainRoot_Base.DO_State)o1.get$obj$state(true)).domainFenixFrameworkRoot = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainFenixFrameworkRoot,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return pt.ist.fenixframework.DomainFenixFrameworkRoot.role$$domainRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> role$$fenixFrameworkData = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData>() {
        @Override
        public pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData getValue(pt.ist.fenixframework.DomainRoot o1) {
            return ((DomainRoot_Base.DO_State)o1.get$obj$state(false)).fenixFrameworkData;
        }
        @Override
        public void setValue(pt.ist.fenixframework.DomainRoot o1, pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData o2) {
            ((DomainRoot_Base.DO_State)o1.get$obj$state(true)).fenixFrameworkData = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.DomainRoot> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.DomainRoot>(this);
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.data.InstallationData,pt.ist.fenixframework.DomainRoot> getRelationDomainRootHasInstallationData() {
        return pt.ist.fenixframework.data.InstallationData.getRelationDomainRootHasInstallationData();
    }
    
    private final static class DomainRootBennu {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "DomainRootBennu");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getRelationDomainRootBennu() {
        return DomainRootBennu.relation;
    }
    
    static {
        DomainRootBennu.relation.setRelationName("pt.ist.fenixframework.DomainRoot.DomainRootBennu");
    }
    
    private final static class DomainRootDomainFenixFrameworkRoot {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot>(role$$domainFenixFrameworkRoot, "DomainRootDomainFenixFrameworkRoot");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.DomainFenixFrameworkRoot> getRelationDomainRootDomainFenixFrameworkRoot() {
        return DomainRootDomainFenixFrameworkRoot.relation;
    }
    
    static {
        DomainRootDomainFenixFrameworkRoot.relation.setRelationName("pt.ist.fenixframework.DomainRoot.DomainRootDomainFenixFrameworkRoot");
    }
    
    private final static class DomainRootHasFenixFrameworkData {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData>(role$$fenixFrameworkData, "DomainRootHasFenixFrameworkData");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> getRelationDomainRootHasFenixFrameworkData() {
        return DomainRootHasFenixFrameworkData.relation;
    }
    
    static {
        DomainRootHasFenixFrameworkData.relation.setRelationName("pt.ist.fenixframework.DomainRoot.DomainRootHasFenixFrameworkData");
    }
    
    // Slots
    
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  DomainRoot_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.data.InstallationData getInstallationData() {
        return ((DO_State)this.get$obj$state(false)).installationData;
    }
    
    public void setInstallationData(pt.ist.fenixframework.data.InstallationData installationData) {
        getRelationDomainRootHasInstallationData().add(installationData, (pt.ist.fenixframework.DomainRoot)this);
    }
    
    private java.lang.Long get$oidInstallationData() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).installationData;
        return (value == null) ? null : value.getOid();
    }
    
    public org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    public void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationDomainRootBennu().add((pt.ist.fenixframework.DomainRoot)this, bennu);
    }
    
    private java.lang.Long get$oidBennu() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bennu;
        return (value == null) ? null : value.getOid();
    }
    
    public pt.ist.fenixframework.DomainFenixFrameworkRoot getDomainFenixFrameworkRoot() {
        return ((DO_State)this.get$obj$state(false)).domainFenixFrameworkRoot;
    }
    
    public void setDomainFenixFrameworkRoot(pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot) {
        getRelationDomainRootDomainFenixFrameworkRoot().add((pt.ist.fenixframework.DomainRoot)this, domainFenixFrameworkRoot);
    }
    
    private java.lang.Long get$oidDomainFenixFrameworkRoot() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).domainFenixFrameworkRoot;
        return (value == null) ? null : value.getOid();
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData getFenixFrameworkData() {
        return ((DO_State)this.get$obj$state(false)).fenixFrameworkData;
    }
    
    public void setFenixFrameworkData(pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData fenixFrameworkData) {
        getRelationDomainRootHasFenixFrameworkData().add((pt.ist.fenixframework.DomainRoot)this, fenixFrameworkData);
    }
    
    private java.lang.Long get$oidFenixFrameworkData() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).fenixFrameworkData;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.installationData != null) handleAttemptToDeleteConnectedObject("InstallationData");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        if (castedState.domainFenixFrameworkRoot != null) handleAttemptToDeleteConnectedObject("DomainFenixFrameworkRoot");
        if (castedState.fenixFrameworkData != null) handleAttemptToDeleteConnectedObject("FenixFrameworkData");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.installationData = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_INSTALLATION_DATA");
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
        castedState.domainFenixFrameworkRoot = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_DOMAIN_FENIX_FRAMEWORK_ROOT");
        castedState.fenixFrameworkData = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FENIX_FRAMEWORK_DATA");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private pt.ist.fenixframework.data.InstallationData installationData;
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        private pt.ist.fenixframework.DomainFenixFrameworkRoot domainFenixFrameworkRoot;
        private pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData fenixFrameworkData;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.installationData = this.installationData;
            newCasted.bennu = this.bennu;
            newCasted.domainFenixFrameworkRoot = this.domainFenixFrameworkRoot;
            newCasted.fenixFrameworkData = this.fenixFrameworkData;
            
        }
        
    }
    
}
