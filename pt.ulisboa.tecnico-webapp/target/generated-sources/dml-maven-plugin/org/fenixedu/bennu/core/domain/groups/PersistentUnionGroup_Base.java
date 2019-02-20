package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentUnionGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$children = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup o1) {
            return ((PersistentUnionGroup_Base)o1).get$rl$children();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$unions;
        }
        
    };
    
    private final static class UnionGroupComposition {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$children, "UnionGroupComposition");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationUnionGroupComposition() {
        return UnionGroupComposition.relation;
    }
    
    static {
        UnionGroupComposition.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup.UnionGroupComposition");
        UnionGroupComposition.relation.addListener(new pt.ist.fenixframework.dml.runtime.RelationAdapter<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
            @Override
            public void beforeAdd(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup arg0, org.fenixedu.bennu.core.domain.groups.PersistentGroup arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.addRelationTuple("UnionGroupComposition", arg1, "unions", arg0, "children");
            }
            @Override
            public void beforeRemove(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup arg0, org.fenixedu.bennu.core.domain.groups.PersistentGroup arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.removeRelationTuple("UnionGroupComposition", arg1, "unions", arg0, "children");
            }
            
        }
        );
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> get$rl$children() {
        return get$$relationList("children", getRelationUnionGroupComposition());
        
    }
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  PersistentUnionGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addChildren(org.fenixedu.bennu.core.domain.groups.PersistentGroup children) {
        getRelationUnionGroupComposition().add((org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup)this, children);
    }
    
    protected void removeChildren(org.fenixedu.bennu.core.domain.groups.PersistentGroup children) {
        getRelationUnionGroupComposition().remove((org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup)this, children);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getChildrenSet() {
        return get$rl$children();
    }
    
    public void set$children(OJBFunctionalSetWrapper children) {
        get$rl$children().setFromOJB(this, "children", children);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getChildren() {
        return getChildrenSet();
    }
    
    @Deprecated
    public int getChildrenCount() {
        return getChildrenSet().size();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfChildren() {
        if (get$rl$children().size() < 1) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$children().size() > 0) handleAttemptToDeleteConnectedObject("Children");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("children")) return getRelationUnionGroupComposition();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("children", getRelationUnionGroupComposition());
        
    }
    protected static class DO_State extends org.fenixedu.bennu.core.domain.groups.PersistentGroup.DO_State {
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            
        }
        
    }
    
}
