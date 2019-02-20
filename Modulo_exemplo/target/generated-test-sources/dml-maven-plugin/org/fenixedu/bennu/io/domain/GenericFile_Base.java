package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class GenericFile_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileStorage> role$$storage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileStorage>() {
        public org.fenixedu.bennu.io.domain.FileStorage getValue(org.fenixedu.bennu.io.domain.GenericFile o1) {
            return ((GenericFile_Base)o1).storage.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.GenericFile o1, org.fenixedu.bennu.io.domain.FileStorage o2) {
            ((GenericFile_Base)o1).storage.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$file;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.GenericFile o1) {
            return ((GenericFile_Base)o1).fileSupport.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.GenericFile o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((GenericFile_Base)o1).fileSupport.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$file;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getRelationFileStorageFile() {
        return org.fenixedu.bennu.io.domain.FileStorage.getRelationFileStorageFile();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getRelationGenericFiles() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationGenericFiles();
    }
    
    // Slots
    private OwnedVBox<java.lang.Long> size;
    private OwnedVBox<org.joda.time.DateTime> creationDate;
    private OwnedVBox<java.lang.String> filename;
    private OwnedVBox<java.lang.String> displayName;
    private OwnedVBox<java.lang.String> contentType;
    private OwnedVBox<java.lang.String> contentKey;
    private OwnedVBox<java.lang.String> checksum;
    private OwnedVBox<java.lang.String> checksumAlgorithm;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileStorage> storage;
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupport;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        size = OwnedVBox.makeNew(this, "size", allocateOnly, false);
        if (!allocateOnly) this.size.put(null);
        creationDate = OwnedVBox.makeNew(this, "creationDate", allocateOnly, false);
        if (!allocateOnly) this.creationDate.put(null);
        filename = OwnedVBox.makeNew(this, "filename", allocateOnly, false);
        if (!allocateOnly) this.filename.put(null);
        displayName = OwnedVBox.makeNew(this, "displayName", allocateOnly, false);
        if (!allocateOnly) this.displayName.put(null);
        contentType = OwnedVBox.makeNew(this, "contentType", allocateOnly, false);
        if (!allocateOnly) this.contentType.put(null);
        contentKey = OwnedVBox.makeNew(this, "contentKey", allocateOnly, false);
        if (!allocateOnly) this.contentKey.put(null);
        checksum = OwnedVBox.makeNew(this, "checksum", allocateOnly, false);
        if (!allocateOnly) this.checksum.put(null);
        checksumAlgorithm = OwnedVBox.makeNew(this, "checksumAlgorithm", allocateOnly, false);
        if (!allocateOnly) this.checksumAlgorithm.put(null);
        storage = OwnedVBox.makeNew(this, "storage", allocateOnly, true);
        if (!allocateOnly) this.storage.put(null);
        fileSupport = OwnedVBox.makeNew(this, "fileSupport", allocateOnly, true);
        if (!allocateOnly) this.fileSupport.put(null);
        
    }
    
    // Constructors
    protected  GenericFile_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.Long getSize() {
        return this.size.get();
    }
    
    protected void setSize(java.lang.Long size) {
        this.size.put(size);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected org.joda.time.DateTime getCreationDate() {
        return this.creationDate.get();
    }
    
    protected void setCreationDate(org.joda.time.DateTime creationDate) {
        this.creationDate.put(creationDate);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getFilename() {
        return this.filename.get();
    }
    
    public void setFilename(java.lang.String filename) {
        this.filename.put(filename);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getDisplayName() {
        return this.displayName.get();
    }
    
    public void setDisplayName(java.lang.String displayName) {
        this.displayName.put(displayName);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getContentType() {
        return this.contentType.get();
    }
    
    protected void setContentType(java.lang.String contentType) {
        this.contentType.put(contentType);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getContentKey() {
        return this.contentKey.get();
    }
    
    protected void setContentKey(java.lang.String contentKey) {
        this.contentKey.put(contentKey);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getChecksum() {
        return this.checksum.get();
    }
    
    protected void setChecksum(java.lang.String checksum) {
        this.checksum.put(checksum);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getChecksumAlgorithm() {
        return this.checksumAlgorithm.get();
    }
    
    protected void setChecksumAlgorithm(java.lang.String checksumAlgorithm) {
        this.checksumAlgorithm.put(checksumAlgorithm);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileStorage getStorage() {
        return this.storage.get();
    }
    
    protected void setStorage(org.fenixedu.bennu.io.domain.FileStorage storage) {
        getRelationFileStorageFile().add(storage, (org.fenixedu.bennu.io.domain.GenericFile)this);
    }
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return this.fileSupport.get();
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationGenericFiles().add(fileSupport, (org.fenixedu.bennu.io.domain.GenericFile)this);
    }
    
    
}
