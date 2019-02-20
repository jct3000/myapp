package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentDifferenceGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$rest = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup o1) {
            return ((PersistentDifferenceGroup_Base)o1).get$rl$rest();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$differenceAtRest;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$first = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup o1) {
            return ((PersistentDifferenceGroup_Base.DO_State)o1.get$obj$state(false)).first;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((PersistentDifferenceGroup_Base.DO_State)o1.get$obj$state(true)).first = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$differenceAtFirst;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupRest() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationDifferenceGroupRest();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupFirst() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationDifferenceGroupFirst();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> get$rl$rest() {
        return get$$relationList("rest", getRelationDifferenceGroupRest().getInverseRelation());
        
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
    protected  PersistentDifferenceGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addRest(org.fenixedu.bennu.core.domain.groups.PersistentGroup rest) {
        getRelationDifferenceGroupRest().add(rest, (org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup)this);
    }
    
    protected void removeRest(org.fenixedu.bennu.core.domain.groups.PersistentGroup rest) {
        getRelationDifferenceGroupRest().remove(rest, (org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRestSet() {
        return get$rl$rest();
    }
    
    public void set$rest(OJBFunctionalSetWrapper rest) {
        get$rl$rest().setFromOJB(this, "rest", rest);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRest() {
        return getRestSet();
    }
    
    @Deprecated
    public int getRestCount() {
        return getRestSet().size();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfRest() {
        if (get$rl$rest().size() < 1) return false;
        return true;
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getFirst() {
        return ((DO_State)this.get$obj$state(false)).first;
    }
    
    protected void setFirst(org.fenixedu.bennu.core.domain.groups.PersistentGroup first) {
        getRelationDifferenceGroupFirst().add(first, (org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup)this);
    }
    
    private java.lang.Long get$oidFirst() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).first;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfFirst() {
        if (getFirst() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$rest().size() > 0) handleAttemptToDeleteConnectedObject("Rest");
        if (castedState.first != null) handleAttemptToDeleteConnectedObject("First");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        castedState.first = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FIRST");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("rest")) return getRelationDifferenceGroupRest().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("rest", getRelationDifferenceGroupRest().getInverseRelation());
        
    }
    protected static class DO_State extends org.fenixedu.bennu.core.domain.groups.PersistentGroup.DO_State {
        private org.fenixedu.bennu.core.domain.groups.PersistentGroup first;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.first = this.first;
            
        }
        
    }
    
}
