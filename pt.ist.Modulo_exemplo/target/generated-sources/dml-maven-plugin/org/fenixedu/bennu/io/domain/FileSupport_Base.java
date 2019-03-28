package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class FileSupport_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationDefaultFileStorage() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorage> getRelationFileStorages() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuFileSupport() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileStorageConfiguration> getRelationFileStorageConfigurations() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getRelationGenericFiles() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getRelationFileRawDatas() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getRelationLocalFilesToDelete() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  FileSupport_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.FileStorage getDefaultStorage() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDefaultStorage(org.fenixedu.bennu.io.domain.FileStorage defaultStorage) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addFileStorage(org.fenixedu.bennu.io.domain.FileStorage fileStorage) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeFileStorage(org.fenixedu.bennu.io.domain.FileStorage fileStorage) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.io.domain.FileStorage> getFileStorageSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeConfiguration(org.fenixedu.bennu.io.domain.FileStorageConfiguration configuration) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.io.domain.FileStorageConfiguration> getConfigurationSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GenericFile file) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.io.domain.GenericFile> getFileSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addFileRawData(org.fenixedu.bennu.io.domain.FileRawData fileRawData) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeFileRawData(org.fenixedu.bennu.io.domain.FileRawData fileRawData) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.io.domain.FileRawData> getFileRawDataSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addDelete(org.fenixedu.bennu.io.domain.LocalFileToDelete delete) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeDelete(org.fenixedu.bennu.io.domain.LocalFileToDelete delete) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.io.domain.LocalFileToDelete> getDeleteSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
