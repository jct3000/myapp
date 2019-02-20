package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class LocalFileSystemStorage_Base extends org.fenixedu.bennu.io.domain.FileStorage {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileSystemStorage,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> role$$schedulerSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.LocalFileSystemStorage,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>() {
        public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getValue(org.fenixedu.bennu.io.domain.LocalFileSystemStorage o1) {
            return ((LocalFileSystemStorage_Base)o1).schedulerSystem.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.LocalFileSystemStorage o1, org.fenixedu.bennu.scheduler.domain.SchedulerSystem o2) {
            ((LocalFileSystemStorage_Base)o1).schedulerSystem.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.role$$loggingStorage;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getRelationSchedulerSystemLocalFileSystemStorage() {
        return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.getRelationSchedulerSystemLocalFileSystemStorage();
    }
    
    // Slots
    private OwnedVBox<java.lang.String> path;
    private OwnedVBox<java.lang.Integer> treeDirectoriesNameLength;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.scheduler.domain.SchedulerSystem> schedulerSystem;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        path = OwnedVBox.makeNew(this, "path", allocateOnly, false);
        if (!allocateOnly) this.path.put(null);
        treeDirectoriesNameLength = OwnedVBox.makeNew(this, "treeDirectoriesNameLength", allocateOnly, false);
        if (!allocateOnly) this.treeDirectoriesNameLength.put(null);
        schedulerSystem = OwnedVBox.makeNew(this, "schedulerSystem", allocateOnly, true);
        if (!allocateOnly) this.schedulerSystem.put(null);
        
    }
    
    // Constructors
    protected  LocalFileSystemStorage_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getPath() {
        return this.path.get();
    }
    
    protected void setPath(java.lang.String path) {
        this.path.put(path);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.Integer getTreeDirectoriesNameLength() {
        return this.treeDirectoriesNameLength.get();
    }
    
    protected void setTreeDirectoriesNameLength(java.lang.Integer treeDirectoriesNameLength) {
        this.treeDirectoriesNameLength.put(treeDirectoriesNameLength);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        return this.schedulerSystem.get();
    }
    
    public void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        getRelationSchedulerSystemLocalFileSystemStorage().add(schedulerSystem, (org.fenixedu.bennu.io.domain.LocalFileSystemStorage)this);
    }
    
    
}
