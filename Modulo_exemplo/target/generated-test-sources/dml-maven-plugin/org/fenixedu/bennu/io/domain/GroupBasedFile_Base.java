package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class GroupBasedFile_Base extends org.fenixedu.bennu.io.domain.GenericFile {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GroupBasedFile,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GroupBasedFile,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.io.domain.GroupBasedFile o1) {
            return ((GroupBasedFile_Base)o1).group.get();
        }
        public void setValue(org.fenixedu.bennu.io.domain.GroupBasedFile o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((GroupBasedFile_Base)o1).group.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$file;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getRelationGroupBasedFilesGroup() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationGroupBasedFilesGroup();
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentGroup> group;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        group = OwnedVBox.makeNew(this, "group", allocateOnly, true);
        if (!allocateOnly) this.group.put(null);
        
    }
    
    // Constructors
    protected  GroupBasedFile_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        return this.group.get();
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationGroupBasedFilesGroup().add(group, (org.fenixedu.bennu.io.domain.GroupBasedFile)this);
    }
    
    
}
