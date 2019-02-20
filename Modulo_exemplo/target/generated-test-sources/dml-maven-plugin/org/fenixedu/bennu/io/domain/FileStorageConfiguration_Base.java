package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class FileStorageConfiguration_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1) {
            return ((FileStorageConfiguration_Base)o1).fileSupport.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileStorageConfiguration_Base)o1).fileSupport.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$configuration;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileStorage> role$$storage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileStorageConfiguration,org.fenixedu.bennu.io.domain.FileStorage>() {
        public org.fenixedu.bennu.io.domain.FileStorage getValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1) {
            return ((FileStorageConfiguration_Base)o1).storage.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileStorageConfiguration o1, org.fenixedu.bennu.io.domain.FileStorage o2) {
            ((FileStorageConfiguration_Base)o1).storage.put(o2);
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
    private OwnedVBox<java.lang.String> fileType;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupport;
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileStorage> storage;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        fileType = OwnedVBox.makeNew(this, "fileType", allocateOnly, false);
        if (!allocateOnly) this.fileType.put(null);
        fileSupport = OwnedVBox.makeNew(this, "fileSupport", allocateOnly, true);
        if (!allocateOnly) this.fileSupport.put(null);
        storage = OwnedVBox.makeNew(this, "storage", allocateOnly, true);
        if (!allocateOnly) this.storage.put(null);
        
    }
    
    // Constructors
    protected  FileStorageConfiguration_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getFileType() {
        return this.fileType.get();
    }
    
    protected void setFileType(java.lang.String fileType) {
        this.fileType.put(fileType);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return this.fileSupport.get();
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationFileStorageConfigurations().add(fileSupport, (org.fenixedu.bennu.io.domain.FileStorageConfiguration)this);
    }
    
    public org.fenixedu.bennu.io.domain.FileStorage getStorage() {
        return this.storage.get();
    }
    
    public void setStorage(org.fenixedu.bennu.io.domain.FileStorage storage) {
        getRelationFileStorageConfigurationFileStorage().add(storage, (org.fenixedu.bennu.io.domain.FileStorageConfiguration)this);
    }
    
    
}
