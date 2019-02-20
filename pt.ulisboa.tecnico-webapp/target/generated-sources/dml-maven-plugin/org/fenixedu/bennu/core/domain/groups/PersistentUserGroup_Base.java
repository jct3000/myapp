package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentUserGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> role$$member = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.User> getSet(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup o1) {
            return ((PersistentUserGroup_Base)o1).get$rl$member();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$userGroup;
        }
        
    };
    
    private final static class UserGroupMembers {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>(role$$member, "UserGroupMembers");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getRelationUserGroupMembers() {
        return UserGroupMembers.relation;
    }
    
    static {
        UserGroupMembers.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentUserGroup.UserGroupMembers");
        UserGroupMembers.relation.addListener(new pt.ist.fenixframework.dml.runtime.RelationAdapter<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>() {
            @Override
            public void beforeAdd(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup arg0, org.fenixedu.bennu.core.domain.User arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.addRelationTuple("UserGroupMembers", arg1, "userGroup", arg0, "member");
            }
            @Override
            public void beforeRemove(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup arg0, org.fenixedu.bennu.core.domain.User arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.removeRelationTuple("UserGroupMembers", arg1, "userGroup", arg0, "member");
            }
            
        }
        );
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> get$rl$member() {
        return get$$relationList("member", getRelationUserGroupMembers());
        
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
    protected  PersistentUserGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addMember(org.fenixedu.bennu.core.domain.User member) {
        getRelationUserGroupMembers().add((org.fenixedu.bennu.core.domain.groups.PersistentUserGroup)this, member);
    }
    
    protected void removeMember(org.fenixedu.bennu.core.domain.User member) {
        getRelationUserGroupMembers().remove((org.fenixedu.bennu.core.domain.groups.PersistentUserGroup)this, member);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.User> getMemberSet() {
        return get$rl$member();
    }
    
    public void set$member(OJBFunctionalSetWrapper member) {
        get$rl$member().setFromOJB(this, "member", member);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.User> getMember() {
        return getMemberSet();
    }
    
    @Deprecated
    public int getMemberCount() {
        return getMemberSet().size();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfMember() {
        if (get$rl$member().size() < 1) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$member().size() > 0) handleAttemptToDeleteConnectedObject("Member");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("member")) return getRelationUserGroupMembers();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("member", getRelationUserGroupMembers());
        
    }
    protected static class DO_State extends org.fenixedu.bennu.core.domain.groups.PersistentGroup.DO_State {
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            
        }
        
    }
    
}
