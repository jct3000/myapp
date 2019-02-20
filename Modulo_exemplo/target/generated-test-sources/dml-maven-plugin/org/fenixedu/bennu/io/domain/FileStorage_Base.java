package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class FileStorage_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupportAsDefault = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return ((FileStorage_Base)o1).fileSupportAsDefault.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileStorage o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileStorage_Base)o1).fileSupportAsDefault.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$defaultStorage;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return ((FileStorage_Base)o1).fileSupport.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileStorage o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileStorage_Base)o1).fileSupport.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$fileStorage;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> role$$file = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.GenericFile> getSet(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>) ((FileStorage_Base) o1).file;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileStorage> getInverseRole() {
            return org.fenixedu.bennu.io.domain.GenericFile.role$$storage;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getSet(org.fenixedu.bennu.io.domain.FileStorage o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>) ((FileStorage_Base) o1).configuration;
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
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>(role$$file, "FileStorageFile", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getRelationFileStorageFile() {
        return FileStorageFile.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.GenericFile> keyFunction$$file = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.GenericFile>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.GenericFile value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class FileStorageConfigurationFileStorage {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>(role$$configuration, "FileStorageConfigurationFileStorage", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurationFileStorage() {
        return FileStorageConfigurationFileStorage.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileStorageConfiguration> keyFunction$$configuration = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileStorageConfiguration>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.FileStorageConfiguration value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    private OwnedVBox<java.lang.String> name;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupportAsDefault;
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupport;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile>> internal$file$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> file;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration>> internal$configuration$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> configuration;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        name = OwnedVBox.makeNew(this, "name", allocateOnly, false);
        if (!allocateOnly) this.name.put(null);
        fileSupportAsDefault = OwnedVBox.makeNew(this, "fileSupportAsDefault", allocateOnly, true);
        if (!allocateOnly) this.fileSupportAsDefault.put(null);
        fileSupport = OwnedVBox.makeNew(this, "fileSupport", allocateOnly, true);
        if (!allocateOnly) this.fileSupport.put(null);
        internal$file$collectionBox = OwnedVBox.makeNew(this, "internal$file$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.GenericFile> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.GenericFile>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile> get() { return internal$getFile$collection(); }
            };
            file = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>((org.fenixedu.bennu.io.domain.FileStorage)this, getRelationFileStorageFile(), mapGetter, keyFunction$$file);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile>();
            this.internal$file$collectionBox.put(internalMap);
            file = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile>((org.fenixedu.bennu.io.domain.FileStorage)this, getRelationFileStorageFile(), internalMap, keyFunction$$file);
        }
        internal$configuration$collectionBox = OwnedVBox.makeNew(this, "internal$configuration$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileStorageConfiguration> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileStorageConfiguration>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration> get() { return internal$getConfiguration$collection(); }
            };
            configuration = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>((org.fenixedu.bennu.io.domain.FileStorage)this, getRelationFileStorageConfigurationFileStorage(), mapGetter, keyFunction$$configuration);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration>();
            this.internal$configuration$collectionBox.put(internalMap);
            configuration = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration>((org.fenixedu.bennu.io.domain.FileStorage)this, getRelationFileStorageConfigurationFileStorage(), internalMap, keyFunction$$configuration);
        }
        
    }
    
    // Constructors
    protected  FileStorage_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getName() {
        return this.name.get();
    }
    
    protected void setName(java.lang.String name) {
        this.name.put(name);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupportAsDefault() {
        return this.fileSupportAsDefault.get();
    }
    
    protected void setFileSupportAsDefault(org.fenixedu.bennu.io.domain.FileSupport fileSupportAsDefault) {
        getRelationDefaultFileStorage().add(fileSupportAsDefault, (org.fenixedu.bennu.io.domain.FileStorage)this);
    }
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return this.fileSupport.get();
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationFileStorages().add(fileSupport, (org.fenixedu.bennu.io.domain.FileStorage)this);
    }
    
    protected void addFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationFileStorageFile().add((org.fenixedu.bennu.io.domain.FileStorage)this, file);
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationFileStorageFile().remove((org.fenixedu.bennu.io.domain.FileStorage)this, file);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile> internal$getFile$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile>)this.internal$file$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.GenericFile> getFileSet() {
        return this.file;
    }
    
    protected void addConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurationFileStorage().add((org.fenixedu.bennu.io.domain.FileStorage)this, configuration);
    }
    
    protected void removeConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurationFileStorage().remove((org.fenixedu.bennu.io.domain.FileStorage)this, configuration);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration> internal$getConfiguration$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration>)this.internal$configuration$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getConfigurationSet() {
        return this.configuration;
    }
    
    
}
