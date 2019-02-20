package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class FileStorageConfiguration_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurations() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurationFileStorage() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  FileStorageConfiguration_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getFileType() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFileType(java.lang.String fileType) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.io.domain.FileStorage getStorage() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setStorage(org.fenixedu.bennu.io.domain.FileStorage storage) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
