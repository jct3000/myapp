package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class FileRawData_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getRelationFileRawDatas() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  FileRawData_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getContentKey() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setContentKey(java.lang.String contentKey) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected byte[] getContent() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setContent(byte[] content) {
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
