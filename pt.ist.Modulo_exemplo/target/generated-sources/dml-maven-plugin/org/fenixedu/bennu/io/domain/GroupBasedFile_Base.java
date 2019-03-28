package org.fenixedu.bennu.io.domain;


@SuppressWarnings("all")
public abstract class GroupBasedFile_Base extends org.fenixedu.bennu.io.domain.GenericFile {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getRelationGroupBasedFilesGroup() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  GroupBasedFile_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
