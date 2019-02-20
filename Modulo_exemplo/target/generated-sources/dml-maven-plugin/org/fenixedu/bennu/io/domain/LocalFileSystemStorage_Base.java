package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class LocalFileSystemStorage_Base extends org.fenixedu.bennu.io.domain.FileStorage {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.io.domain.LocalFileSystemStorage> getRelationSchedulerSystemLocalFileSystemStorage() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  LocalFileSystemStorage_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getPath() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setPath(java.lang.String path) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.Integer getTreeDirectoriesNameLength() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setTreeDirectoriesNameLength(java.lang.Integer treeDirectoriesNameLength) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
