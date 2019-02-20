package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class GroupConstant_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.GroupConstant,org.fenixedu.bennu.core.domain.Bennu> role$$rootForGroupConstant = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.GroupConstant,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.groups.GroupConstant o1) {
            return ((GroupConstant_Base)o1).rootForGroupConstant.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.GroupConstant o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((GroupConstant_Base)o1).rootForGroupConstant.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$groupConstant;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getRelationGroupConstantRoot() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationGroupConstantRoot();
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> rootForGroupConstant;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        rootForGroupConstant = OwnedVBox.makeNew(this, "rootForGroupConstant", allocateOnly, true);
        if (!allocateOnly) this.rootForGroupConstant.put(null);
        
    }
    
    // Constructors
    protected  GroupConstant_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.Bennu getRootForGroupConstant() {
        return this.rootForGroupConstant.get();
    }
    
    protected void setRootForGroupConstant(org.fenixedu.bennu.core.domain.Bennu rootForGroupConstant) {
        getRelationGroupConstantRoot().add(rootForGroupConstant, (org.fenixedu.bennu.core.domain.groups.GroupConstant)this);
    }
    
    
}
