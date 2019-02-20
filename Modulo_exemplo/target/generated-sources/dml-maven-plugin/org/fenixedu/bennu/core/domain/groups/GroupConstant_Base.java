package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class GroupConstant_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getRelationGroupConstantRoot() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  GroupConstant_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.Bennu getRootForGroupConstant() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setRootForGroupConstant(org.fenixedu.bennu.core.domain.Bennu rootForGroupConstant) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
