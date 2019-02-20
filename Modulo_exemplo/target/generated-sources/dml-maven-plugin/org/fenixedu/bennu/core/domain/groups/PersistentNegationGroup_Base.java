package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class PersistentNegationGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationGroupNegationGroup() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentNegationGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getNegated() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setNegated(org.fenixedu.bennu.core.domain.groups.PersistentGroup negated) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
