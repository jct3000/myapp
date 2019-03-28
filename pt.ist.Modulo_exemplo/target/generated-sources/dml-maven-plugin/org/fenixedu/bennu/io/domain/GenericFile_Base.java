package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class GenericFile_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getRelationFileStorageFile() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getRelationGenericFiles() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  GenericFile_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.Long getSize() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setSize(java.lang.Long size) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.joda.time.DateTime getCreationDate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setCreationDate(org.joda.time.DateTime creationDate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getFilename() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFilename(java.lang.String filename) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getDisplayName() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDisplayName(java.lang.String displayName) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getContentType() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setContentType(java.lang.String contentType) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getContentKey() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setContentKey(java.lang.String contentKey) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getChecksum() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setChecksum(java.lang.String checksum) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getChecksumAlgorithm() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setChecksumAlgorithm(java.lang.String checksumAlgorithm) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileStorage getStorage() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setStorage(org.fenixedu.bennu.io.domain.FileStorage storage) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
