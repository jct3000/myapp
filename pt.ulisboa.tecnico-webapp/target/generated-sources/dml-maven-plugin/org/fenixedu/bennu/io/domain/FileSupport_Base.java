package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class FileSupport_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> role$$defaultStorage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileStorage getValue(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base.DO_State)o1.get$obj$state(false)).defaultStorage;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileSupport o1, org.fenixedu.bennu.io.domain.FileStorage o2) {
            ((FileSupport_Base.DO_State)o1.get$obj$state(true)).defaultStorage = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$fileSupportAsDefault;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> role$$fileStorage = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileStorage> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).get$rl$fileStorage();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.FileSupport o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((FileSupport_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).get$rl$configuration();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorageConfiguration.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> role$$file = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.GenericFile> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).get$rl$file();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.GenericFile.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> role$$fileRawData = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileRawData> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).get$rl$fileRawData();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileRawData,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileRawData.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> role$$delete = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.LocalFileToDelete> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).get$rl$delete();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.LocalFileToDelete,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.LocalFileToDelete.role$$fileSupport;
        }
        
    };
    
    private final static class DefaultFileStorage {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>(role$$defaultStorage, "DefaultFileStorage");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationDefaultFileStorage() {
        return DefaultFileStorage.relation;
    }
    
    static {
        DefaultFileStorage.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.DefaultFileStorage");
    }
    
    private final static class FileStorages {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>(role$$fileStorage, "FileStorages");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationFileStorages() {
        return FileStorages.relation;
    }
    
    static {
        FileStorages.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.FileStorages");
    }
    
    private final static class BennuFileSupport {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "BennuFileSupport");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuFileSupport() {
        return BennuFileSupport.relation;
    }
    
    static {
        BennuFileSupport.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.BennuFileSupport");
    }
    
    private final static class FileStorageConfigurations {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>(role$$configuration, "FileStorageConfigurations");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurations() {
        return FileStorageConfigurations.relation;
    }
    
    static {
        FileStorageConfigurations.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.FileStorageConfigurations");
    }
    
    private final static class GenericFiles {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>(role$$file, "GenericFiles");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getRelationGenericFiles() {
        return GenericFiles.relation;
    }
    
    static {
        GenericFiles.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.GenericFiles");
    }
    
    private final static class FileRawDatas {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>(role$$fileRawData, "FileRawDatas");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getRelationFileRawDatas() {
        return FileRawDatas.relation;
    }
    
    static {
        FileRawDatas.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.FileRawDatas");
    }
    
    private final static class LocalFilesToDelete {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>(role$$delete, "LocalFilesToDelete");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getRelationLocalFilesToDelete() {
        return LocalFilesToDelete.relation;
    }
    
    static {
        LocalFilesToDelete.relation.setRelationName("org.fenixedu.bennu.io.domain.FileSupport.LocalFilesToDelete");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> get$rl$fileStorage() {
        return get$$relationList("fileStorage", getRelationFileStorages());
        
    }
    private RelationList<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> get$rl$configuration() {
        return get$$relationList("configuration", getRelationFileStorageConfigurations());
        
    }
    private RelationList<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> get$rl$file() {
        return get$$relationList("file", getRelationGenericFiles());
        
    }
    private RelationList<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> get$rl$fileRawData() {
        return get$$relationList("fileRawData", getRelationFileRawDatas());
        
    }
    private RelationList<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> get$rl$delete() {
        return get$$relationList("delete", getRelationLocalFilesToDelete());
        
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
    protected  FileSupport_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.FileStorage getDefaultStorage() {
        return ((DO_State)this.get$obj$state(false)).defaultStorage;
    }
    
    public void setDefaultStorage(org.fenixedu.bennu.io.domain.FileStorage defaultStorage) {
        getRelationDefaultFileStorage().add((org.fenixedu.bennu.io.domain.FileSupport)this, defaultStorage);
    }
    
    private java.lang.Long get$oidDefaultStorage() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).defaultStorage;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfDefaultStorage() {
        if (getDefaultStorage() == null) return false;
        return true;
    }
    
    protected void addFileStorage(org.fenixedu.bennu.io.domain.FileStorage fileStorage) {
        getRelationFileStorages().add((org.fenixedu.bennu.io.domain.FileSupport)this, fileStorage);
    }
    
    protected void removeFileStorage(org.fenixedu.bennu.io.domain.FileStorage fileStorage) {
        getRelationFileStorages().remove((org.fenixedu.bennu.io.domain.FileSupport)this, fileStorage);
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorage> getFileStorageSet() {
        return get$rl$fileStorage();
    }
    
    public void set$fileStorage(OJBFunctionalSetWrapper fileStorage) {
        get$rl$fileStorage().setFromOJB(this, "fileStorage", fileStorage);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorage> getFileStorage() {
        return getFileStorageSet();
    }
    
    @Deprecated
    public int getFileStorageCount() {
        return getFileStorageSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationBennuFileSupport().add((org.fenixedu.bennu.io.domain.FileSupport)this, bennu);
    }
    
    private java.lang.Long get$oidBennu() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bennu;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBennu() {
        if (getBennu() == null) return false;
        return true;
    }
    
    protected void addConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurations().add((org.fenixedu.bennu.io.domain.FileSupport)this, configuration);
    }
    
    protected void removeConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurations().remove((org.fenixedu.bennu.io.domain.FileSupport)this, configuration);
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
    
    protected void addFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationGenericFiles().add((org.fenixedu.bennu.io.domain.FileSupport)this, file);
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationGenericFiles().remove((org.fenixedu.bennu.io.domain.FileSupport)this, file);
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
    
    protected void addFileRawData(org.fenixedu.bennu.io.domain.FileRawData fileRawData) {
        getRelationFileRawDatas().add((org.fenixedu.bennu.io.domain.FileSupport)this, fileRawData);
    }
    
    protected void removeFileRawData(org.fenixedu.bennu.io.domain.FileRawData fileRawData) {
        getRelationFileRawDatas().remove((org.fenixedu.bennu.io.domain.FileSupport)this, fileRawData);
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileRawData> getFileRawDataSet() {
        return get$rl$fileRawData();
    }
    
    public void set$fileRawData(OJBFunctionalSetWrapper fileRawData) {
        get$rl$fileRawData().setFromOJB(this, "fileRawData", fileRawData);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.io.domain.FileRawData> getFileRawData() {
        return getFileRawDataSet();
    }
    
    @Deprecated
    public int getFileRawDataCount() {
        return getFileRawDataSet().size();
    }
    
    protected void addDelete(org.fenixedu.bennu.io.domain.LocalFileToDelete delete) {
        getRelationLocalFilesToDelete().add((org.fenixedu.bennu.io.domain.FileSupport)this, delete);
    }
    
    protected void removeDelete(org.fenixedu.bennu.io.domain.LocalFileToDelete delete) {
        getRelationLocalFilesToDelete().remove((org.fenixedu.bennu.io.domain.FileSupport)this, delete);
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.LocalFileToDelete> getDeleteSet() {
        return get$rl$delete();
    }
    
    public void set$delete(OJBFunctionalSetWrapper delete) {
        get$rl$delete().setFromOJB(this, "delete", delete);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.io.domain.LocalFileToDelete> getDelete() {
        return getDeleteSet();
    }
    
    @Deprecated
    public int getDeleteCount() {
        return getDeleteSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.defaultStorage != null) handleAttemptToDeleteConnectedObject("DefaultStorage");
        if (get$rl$fileStorage().size() > 0) handleAttemptToDeleteConnectedObject("FileStorage");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        if (get$rl$configuration().size() > 0) handleAttemptToDeleteConnectedObject("Configuration");
        if (get$rl$file().size() > 0) handleAttemptToDeleteConnectedObject("File");
        if (get$rl$fileRawData().size() > 0) handleAttemptToDeleteConnectedObject("FileRawData");
        if (get$rl$delete().size() > 0) handleAttemptToDeleteConnectedObject("Delete");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.defaultStorage = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_DEFAULT_STORAGE");
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("fileStorage")) return getRelationFileStorages();
        if (attrName.equals("configuration")) return getRelationFileStorageConfigurations();
        if (attrName.equals("file")) return getRelationGenericFiles();
        if (attrName.equals("fileRawData")) return getRelationFileRawDatas();
        if (attrName.equals("delete")) return getRelationLocalFilesToDelete();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("fileStorage", getRelationFileStorages());
        get$$relationList("configuration", getRelationFileStorageConfigurations());
        get$$relationList("file", getRelationGenericFiles());
        get$$relationList("fileRawData", getRelationFileRawDatas());
        get$$relationList("delete", getRelationLocalFilesToDelete());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.fenixedu.bennu.io.domain.FileStorage defaultStorage;
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.defaultStorage = this.defaultStorage;
            newCasted.bennu = this.bennu;
            
        }
        
    }
    
}
