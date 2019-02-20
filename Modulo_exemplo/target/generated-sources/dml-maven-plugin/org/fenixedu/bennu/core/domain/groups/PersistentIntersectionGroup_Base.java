package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class PersistentIntersectionGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationIntersectionGroupComposition() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentIntersectionGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addChildren(org.fenixedu.bennu.core.domain.groups.PersistentGroup children) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeChildren(org.fenixedu.bennu.core.domain.groups.PersistentGroup children) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getChildrenSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
