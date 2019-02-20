package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class FileRawData_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileRawData,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.FileRawData,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.FileRawData o1) {
            return ((FileRawData_Base)o1).fileSupport.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.FileRawData o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((FileRawData_Base)o1).fileSupport.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$fileRawData;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.FileRawData> getRelationFileRawDatas() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationFileRawDatas();
    }
    
    // Slots
    private OwnedVBox<java.lang.String> contentKey;
    private OwnedVBox<byte[]> content;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupport;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        contentKey = OwnedVBox.makeNew(this, "contentKey", allocateOnly, false);
        if (!allocateOnly) this.contentKey.put(null);
        content = OwnedVBox.makeNew(this, "content", allocateOnly, false);
        if (!allocateOnly) this.content.put(null);
        fileSupport = OwnedVBox.makeNew(this, "fileSupport", allocateOnly, true);
        if (!allocateOnly) this.fileSupport.put(null);
        
    }
    
    // Constructors
    protected  FileRawData_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getContentKey() {
        return this.contentKey.get();
    }
    
    protected void setContentKey(java.lang.String contentKey) {
        this.contentKey.put(contentKey);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected byte[] getContent() {
        return this.content.get();
    }
    
    protected void setContent(byte[] content) {
        this.content.put(content);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return this.fileSupport.get();
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationFileRawDatas().add(fileSupport, (org.fenixedu.bennu.io.domain.FileRawData)this);
    }
    
    
}
