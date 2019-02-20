package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentNegationGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$negated = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup o1) {
            return ((PersistentNegationGroup_Base)o1).negated.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((PersistentNegationGroup_Base)o1).negated.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$negation;
        }
        
    };
    
    private final static class GroupNegationGroup {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$negated, "GroupNegationGroup", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationGroupNegationGroup() {
        return GroupNegationGroup.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentGroup> negated;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        negated = OwnedVBox.makeNew(this, "negated", allocateOnly, true);
        if (!allocateOnly) this.negated.put(null);
        
    }
    
    // Constructors
    protected  PersistentNegationGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getNegated() {
        return this.negated.get();
    }
    
    protected void setNegated(org.fenixedu.bennu.core.domain.groups.PersistentGroup negated) {
        getRelationGroupNegationGroup().add((org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup)this, negated);
    }
    
    
}
