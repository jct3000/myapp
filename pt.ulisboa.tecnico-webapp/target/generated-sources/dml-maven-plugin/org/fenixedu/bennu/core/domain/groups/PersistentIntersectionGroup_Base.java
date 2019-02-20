package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentIntersectionGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$children = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup o1) {
            return ((PersistentIntersectionGroup_Base)o1).get$rl$children();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$intersections;
        }
        
    };
    
    private final static class IntersectionGroupComposition {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$children, "IntersectionGroupComposition");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationIntersectionGroupComposition() {
        return IntersectionGroupComposition.relation;
    }
    
    static {
        IntersectionGroupComposition.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup.IntersectionGroupComposition");
        IntersectionGroupComposition.relation.addListener(new pt.ist.fenixframework.dml.runtime.RelationAdapter<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
            @Override
            public void beforeAdd(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup arg0, org.fenixedu.bennu.core.domain.groups.PersistentGroup arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.addRelationTuple("IntersectionGroupComposition", arg1, "intersections", arg0, "children");
            }
            @Override
            public void beforeRemove(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup arg0, org.fenixedu.bennu.core.domain.groups.PersistentGroup arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.removeRelationTuple("IntersectionGroupComposition", arg1, "intersections", arg0, "children");
            }
            
        }
        );
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> get$rl$children() {
        return get$$relationList("children", getRelationIntersectionGroupComposition());
        
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
    protected  PersistentIntersectionGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addChildren(org.fenixedu.bennu.core.domain.groups.PersistentGroup children) {
        getRelationIntersectionGroupComposition().add((org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup)this, children);
    }
    
    protected void removeChildren(org.fenixedu.bennu.core.domain.groups.PersistentGroup children) {
        getRelationIntersectionGroupComposition().remove((org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup)this, children);
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
        if (attrName.equals("children")) return getRelationIntersectionGroupComposition();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("children", getRelationIntersectionGroupComposition());
        
    }
    protected static class DO_State extends org.fenixedu.bennu.core.domain.groups.PersistentGroup.DO_State {
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            
        }
        
    }
    
}
