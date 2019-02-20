package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class FileStorageConfiguration_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1) {
            return ((FileStorageConfiguration_Base.DO_State)o1.get$obj$state(false)).fileSupport;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileStorageConfiguration_Base.DO_State)o1.get$obj$state(true)).fileSupport = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$configuration;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileStorage> role$$storage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileStorage>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileStorage getValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1) {
            return ((FileStorageConfiguration_Base.DO_State)o1.get$obj$state(false)).storage;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1, org.fenixedu.bennu.io.domain.FileStorage o2) {
            ((FileStorageConfiguration_Base.DO_State)o1.get$obj$state(true)).storage = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$configuration;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurations() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationFileStorageConfigurations();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurationFileStorage() {
        return org.fenixedu.bennu.io.domain.FileStorage.getRelationFileStorageConfigurationFileStorage();
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
    protected  FileStorageConfiguration_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getFileType() {
        return ((DO_State)this.get$obj$state(false)).fileType;
    }
    
    protected void setFileType(java.lang.String fileType) {
        ((DO_State)this.get$obj$state(true)).fileType = fileType;
    }
    
    private java.lang.String get$fileType() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).fileType;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$fileType(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).fileType = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return ((DO_State)this.get$obj$state(false)).fileSupport;
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationFileStorageConfigurations().add(fileSupport, (org.fenixedu.bennu.io.domain.FileStorageConfiguration)this);
    }
    
    private java.lang.Long get$oidFileSupport() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).fileSupport;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfFileSupport() {
        if (getFileSupport() == null) return false;
        return true;
    }
    
    public org.fenixedu.bennu.io.domain.FileStorage getStorage() {
        return ((DO_State)this.get$obj$state(false)).storage;
    }
    
    public void setStorage(org.fenixedu.bennu.io.domain.FileStorage storage) {
        getRelationFileStorageConfigurationFileStorage().add(storage, (org.fenixedu.bennu.io.domain.FileStorageConfiguration)this);
    }
    
    private java.lang.Long get$oidStorage() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).storage;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfStorage() {
        if (getStorage() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.fileSupport != null) handleAttemptToDeleteConnectedObject("FileSupport");
        if (castedState.storage != null) handleAttemptToDeleteConnectedObject("Storage");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$fileType(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FILE_TYPE"), state);
        castedState.fileSupport = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FILE_SUPPORT");
        castedState.storage = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_STORAGE");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "fileType", getFileType());
        return true;
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
        private java.lang.String fileType;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupport;
        private org.fenixedu.bennu.io.domain.FileStorage storage;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.fileType = this.fileType;
            newCasted.fileSupport = this.fileSupport;
            newCasted.storage = this.storage;
            
        }
        
    }
    
}
