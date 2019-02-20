package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class FileStorage_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupportAsDefault = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return ((FileStorage_Base.DO_State)o1.get$obj$state(false)).fileSupportAsDefault;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileStorage o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileStorage_Base.DO_State)o1.get$obj$state(true)).fileSupportAsDefault = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$defaultStorage;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return ((FileStorage_Base.DO_State)o1.get$obj$state(false)).fileSupport;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileStorage o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileStorage_Base.DO_State)o1.get$obj$state(true)).fileSupport = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$fileStorage;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> role$$file = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.GenericFile> getSet(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return ((FileStorage_Base)o1).get$rl$file();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.GenericFile.role$$storage;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getSet(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return ((FileStorage_Base)o1).get$rl$configuration();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorageConfiguration.role$$storage;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationDefaultFileStorage() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationDefaultFileStorage();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationFileStorages() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationFileStorages();
    }
    
    private final static class FileStorageFile {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>(role$$file, "FileStorageFile");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getRelationFileStorageFile() {
        return FileStorageFile.relation;
    }
    
    static {
        FileStorageFile.relation.setRelationName("org.fenixedu.bennu.io.domain.FileStorage.FileStorageFile");
    }
    
    private final static class FileStorageConfigurationFileStorage {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>(role$$configuration, "FileStorageConfigurationFileStorage");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurationFileStorage() {
        return FileStorageConfigurationFileStorage.relation;
    }
    
    static {
        FileStorageConfigurationFileStorage.relation.setRelationName("org.fenixedu.bennu.io.domain.FileStorage.FileStorageConfigurationFileStorage");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> get$rl$file() {
        return get$$relationList("file", getRelationFileStorageFile());
        
    }
    private RelationList<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> get$rl$configuration() {
        return get$$relationList("configuration", getRelationFileStorageConfigurationFileStorage());
        
    }
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  FileStorage_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getName() {
        return ((DO_State)this.get$obj$state(false)).name;
    }
    
    protected void setName(java.lang.String name) {
        ((DO_State)this.get$obj$state(true)).name = name;
    }
    
    private java.lang.String get$name() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).name;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$name(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).name = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupportAsDefault() {
        return ((DO_State)this.get$obj$state(false)).fileSupportAsDefault;
    }
    
    protected void setFileSupportAsDefault(org.fenixedu.bennu.io.domain.FileSupport fileSupportAsDefault) {
        getRelationDefaultFileStorage().add(fileSupportAsDefault, (org.fenixedu.bennu.io.domain.FileStorage)this);
    }
    
    private java.lang.Long get$oidFileSupportAsDefault() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).fileSupportAsDefault;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return ((DO_State)this.get$obj$state(false)).fileSupport;
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationFileStorages().add(fileSupport, (org.fenixedu.bennu.io.domain.FileStorage)this);
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
    
    protected void addFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationFileStorageFile().add((org.fenixedu.bennu.io.domain.FileStorage)this, file);
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationFileStorageFile().remove((org.fenixedu.bennu.io.domain.FileStorage)this, file);
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.GenericFile> getFileSet() {
        return get$rl$file();
    }
    
    public void set$file(OJBFunctionalSetWrapper file) {
        get$rl$file().setFromOJB(this, "file", file);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.io.domain.GenericFile> getFile() {
        return getFileSet();
    }
    
    @Deprecated
    public int getFileCount() {
        return getFileSet().size();
    }
    
    protected void addConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurationFileStorage().add((org.fenixedu.bennu.io.domain.FileStorage)this, configuration);
    }
    
    protected void removeConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurationFileStorage().remove((org.fenixedu.bennu.io.domain.FileStorage)this, configuration);
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getConfigurationSet() {
        return get$rl$configuration();
    }
    
    public void set$configuration(OJBFunctionalSetWrapper configuration) {
        get$rl$configuration().setFromOJB(this, "configuration", configuration);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getConfiguration() {
        return getConfigurationSet();
    }
    
    @Deprecated
    public int getConfigurationCount() {
        return getConfigurationSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.fileSupportAsDefault != null) handleAttemptToDeleteConnectedObject("FileSupportAsDefault");
        if (castedState.fileSupport != null) handleAttemptToDeleteConnectedObject("FileSupport");
        if (get$rl$file().size() > 0) handleAttemptToDeleteConnectedObject("File");
        if (get$rl$configuration().size() > 0) handleAttemptToDeleteConnectedObject("Configuration");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        castedState.fileSupportAsDefault = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FILE_SUPPORT_AS_DEFAULT");
        castedState.fileSupport = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FILE_SUPPORT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("file")) return getRelationFileStorageFile();
        if (attrName.equals("configuration")) return getRelationFileStorageConfigurationFileStorage();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("file", getRelationFileStorageFile());
        get$$relationList("configuration", getRelationFileStorageConfigurationFileStorage());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String name;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupportAsDefault;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupport;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.fileSupportAsDefault = this.fileSupportAsDefault;
            newCasted.fileSupport = this.fileSupport;
            
        }
        
    }
    
}
