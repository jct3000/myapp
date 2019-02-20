package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class PersistentUserGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getRelationUserGroupMembers() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentUserGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addMember(org.fenixedu.bennu.core.domain.User member) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeMember(org.fenixedu.bennu.core.domain.User member) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.User> getMemberSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
