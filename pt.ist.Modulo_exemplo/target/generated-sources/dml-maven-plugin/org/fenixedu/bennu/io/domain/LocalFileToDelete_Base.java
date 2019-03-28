package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class LocalFileToDelete_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getRelationLocalFilesToDelete() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  LocalFileToDelete_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getFilePath() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFilePath(java.lang.String filePath) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
