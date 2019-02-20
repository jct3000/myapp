package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class LocalFileToDelete_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileToDelete,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileToDelete,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.LocalFileToDelete o1) {
            return ((LocalFileToDelete_Base)o1).fileSupport.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.LocalFileToDelete o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((LocalFileToDelete_Base)o1).fileSupport.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$delete;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.LocalFileToDelete> getRelationLocalFilesToDelete() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationLocalFilesToDelete();
    }
    
    // Slots
    private OwnedVBox<java.lang.String> filePath;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupport;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        filePath = OwnedVBox.makeNew(this, "filePath", allocateOnly, false);
        if (!allocateOnly) this.filePath.put(null);
        fileSupport = OwnedVBox.makeNew(this, "fileSupport", allocateOnly, true);
        if (!allocateOnly) this.fileSupport.put(null);
        
    }
    
    // Constructors
    protected  LocalFileToDelete_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getFilePath() {
        return this.filePath.get();
    }
    
    protected void setFilePath(java.lang.String filePath) {
        this.filePath.put(filePath);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return this.fileSupport.get();
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationLocalFilesToDelete().add(fileSupport, (org.fenixedu.bennu.io.domain.LocalFileToDelete)this);
    }
    
    
}
