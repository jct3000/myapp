package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class FileSupport_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> role$$defaultStorage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>() {
        public org.fenixedu.bennu.io.domain.FileStorage getValue(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).defaultStorage.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileSupport o1, org.fenixedu.bennu.io.domain.FileStorage o2) {
            ((FileSupport_Base)o1).defaultStorage.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$fileSupportAsDefault;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> role$$fileStorage = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileStorage> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>) ((FileSupport_Base) o1).fileStorage;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return ((FileSupport_Base)o1).bennu.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileSupport o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((FileSupport_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>) ((FileSupport_Base) o1).configuration;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorageConfiguration.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> role$$file = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.GenericFile> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>) ((FileSupport_Base) o1).file;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.GenericFile.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> role$$fileRawData = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.FileRawData> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>) ((FileSupport_Base) o1).fileRawData;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileRawData,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileRawData.role$$fileSupport;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> role$$delete = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.LocalFileToDelete> getSet(org.fenixedu.bennu.io.domain.FileSupport o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>) ((FileSupport_Base) o1).delete;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.LocalFileToDelete,org.fenixedu.bennu.io.domain.FileSupport> getInverseRole() {
            return org.fenixedu.bennu.io.domain.LocalFileToDelete.role$$fileSupport;
        }
        
    };
    
    private final static class DefaultFileStorage {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>(role$$defaultStorage, "DefaultFileStorage", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationDefaultFileStorage() {
        return DefaultFileStorage.relation;
    }
    
    private final static class FileStorages {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>(role$$fileStorage, "FileStorages", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationFileStorages() {
        return FileStorages.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileStorage> keyFunction$$fileStorage = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileStorage>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.FileStorage value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BennuFileSupport {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "BennuFileSupport", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuFileSupport() {
        return BennuFileSupport.relation;
    }
    
    private final static class FileStorageConfigurations {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>(role$$configuration, "FileStorageConfigurations", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurations() {
        return FileStorageConfigurations.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileStorageConfiguration> keyFunction$$configuration = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileStorageConfiguration>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.FileStorageConfiguration value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class GenericFiles {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>(role$$file, "GenericFiles", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getRelationGenericFiles() {
        return GenericFiles.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.GenericFile> keyFunction$$file = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.GenericFile>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.GenericFile value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class FileRawDatas {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>(role$$fileRawData, "FileRawDatas", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getRelationFileRawDatas() {
        return FileRawDatas.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileRawData> keyFunction$$fileRawData = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.FileRawData>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.FileRawData value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class LocalFilesToDelete {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>(role$$delete, "LocalFilesToDelete", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getRelationLocalFilesToDelete() {
        return LocalFilesToDelete.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.LocalFileToDelete> keyFunction$$delete = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.LocalFileToDelete>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.LocalFileToDelete value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileStorage> defaultStorage;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorage>> internal$fileStorage$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> fileStorage;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration>> internal$configuration$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> configuration;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile>> internal$file$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> file;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileRawData>> internal$fileRawData$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> fileRawData;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.LocalFileToDelete>> internal$delete$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> delete;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        defaultStorage = OwnedVBox.makeNew(this, "defaultStorage", allocateOnly, true);
        if (!allocateOnly) this.defaultStorage.put(null);
        internal$fileStorage$collectionBox = OwnedVBox.makeNew(this, "internal$fileStorage$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileStorage> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileStorage>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorage> get() { return internal$getFileStorage$collection(); }
            };
            fileStorage = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationFileStorages(), mapGetter, keyFunction$$fileStorage);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorage> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorage>();
            this.internal$fileStorage$collectionBox.put(internalMap);
            fileStorage = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationFileStorages(), internalMap, keyFunction$$fileStorage);
        }
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        internal$configuration$collectionBox = OwnedVBox.makeNew(this, "internal$configuration$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileStorageConfiguration> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileStorageConfiguration>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration> get() { return internal$getConfiguration$collection(); }
            };
            configuration = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationFileStorageConfigurations(), mapGetter, keyFunction$$configuration);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration>();
            this.internal$configuration$collectionBox.put(internalMap);
            configuration = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationFileStorageConfigurations(), internalMap, keyFunction$$configuration);
        }
        internal$file$collectionBox = OwnedVBox.makeNew(this, "internal$file$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.GenericFile> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.GenericFile>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile> get() { return internal$getFile$collection(); }
            };
            file = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationGenericFiles(), mapGetter, keyFunction$$file);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile>();
            this.internal$file$collectionBox.put(internalMap);
            file = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationGenericFiles(), internalMap, keyFunction$$file);
        }
        internal$fileRawData$collectionBox = OwnedVBox.makeNew(this, "internal$fileRawData$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileRawData> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.FileRawData>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileRawData> get() { return internal$getFileRawData$collection(); }
            };
            fileRawData = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationFileRawDatas(), mapGetter, keyFunction$$fileRawData);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileRawData> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileRawData>();
            this.internal$fileRawData$collectionBox.put(internalMap);
            fileRawData = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationFileRawDatas(), internalMap, keyFunction$$fileRawData);
        }
        internal$delete$collectionBox = OwnedVBox.makeNew(this, "internal$delete$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.LocalFileToDelete> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.LocalFileToDelete>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.LocalFileToDelete> get() { return internal$getDelete$collection(); }
            };
            delete = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationLocalFilesToDelete(), mapGetter, keyFunction$$delete);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.LocalFileToDelete> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.LocalFileToDelete>();
            this.internal$delete$collectionBox.put(internalMap);
            delete = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete>((org.fenixedu.bennu.io.domain.FileSupport)this, getRelationLocalFilesToDelete(), internalMap, keyFunction$$delete);
        }
        
    }
    
    // Constructors
    protected  FileSupport_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.FileStorage getDefaultStorage() {
        return this.defaultStorage.get();
    }
    
    public void setDefaultStorage(org.fenixedu.bennu.io.domain.FileStorage defaultStorage) {
        getRelationDefaultFileStorage().add((org.fenixedu.bennu.io.domain.FileSupport)this, defaultStorage);
    }
    
    protected void addFileStorage(org.fenixedu.bennu.io.domain.FileStorage fileStorage) {
        getRelationFileStorages().add((org.fenixedu.bennu.io.domain.FileSupport)this, fileStorage);
    }
    
    protected void removeFileStorage(org.fenixedu.bennu.io.domain.FileStorage fileStorage) {
        getRelationFileStorages().remove((org.fenixedu.bennu.io.domain.FileSupport)this, fileStorage);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorage> internal$getFileStorage$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorage>)this.internal$fileStorage$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorage> getFileStorageSet() {
        return this.fileStorage;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationBennuFileSupport().add((org.fenixedu.bennu.io.domain.FileSupport)this, bennu);
    }
    
    protected void addConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurations().add((org.fenixedu.bennu.io.domain.FileSupport)this, configuration);
    }
    
    protected void removeConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        getRelationFileStorageConfigurations().remove((org.fenixedu.bennu.io.domain.FileSupport)this, configuration);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration> internal$getConfiguration$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileStorageConfiguration>)this.internal$configuration$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getConfigurationSet() {
        return this.configuration;
    }
    
    protected void addFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationGenericFiles().add((org.fenixedu.bennu.io.domain.FileSupport)this, file);
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        getRelationGenericFiles().remove((org.fenixedu.bennu.io.domain.FileSupport)this, file);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile> internal$getFile$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GenericFile>)this.internal$file$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.GenericFile> getFileSet() {
        return this.file;
    }
    
    protected void addFileRawData(org.fenixedu.bennu.io.domain.FileRawData fileRawData) {
        getRelationFileRawDatas().add((org.fenixedu.bennu.io.domain.FileSupport)this, fileRawData);
    }
    
    protected void removeFileRawData(org.fenixedu.bennu.io.domain.FileRawData fileRawData) {
        getRelationFileRawDatas().remove((org.fenixedu.bennu.io.domain.FileSupport)this, fileRawData);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileRawData> internal$getFileRawData$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.FileRawData>)this.internal$fileRawData$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.FileRawData> getFileRawDataSet() {
        return this.fileRawData;
    }
    
    protected void addDelete(org.fenixedu.bennu.io.domain.LocalFileToDelete delete) {
        getRelationLocalFilesToDelete().add((org.fenixedu.bennu.io.domain.FileSupport)this, delete);
    }
    
    protected void removeDelete(org.fenixedu.bennu.io.domain.LocalFileToDelete delete) {
        getRelationLocalFilesToDelete().remove((org.fenixedu.bennu.io.domain.FileSupport)this, delete);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.LocalFileToDelete> internal$getDelete$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.LocalFileToDelete>)this.internal$delete$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.LocalFileToDelete> getDeleteSet() {
        return this.delete;
    }
    
    
}
