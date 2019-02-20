package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class PersistentDifferenceGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupRest() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupFirst() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentDifferenceGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addRest(org.fenixedu.bennu.core.domain.groups.PersistentGroup rest) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeRest(org.fenixedu.bennu.core.domain.groups.PersistentGroup rest) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRestSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getFirst() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFirst(org.fenixedu.bennu.core.domain.groups.PersistentGroup first) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
