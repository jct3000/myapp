package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class User_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$createdDynamicGroup = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getSet(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base)o1).get$rl$createdDynamicGroup();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$creator;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.User o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((User_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$user;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> role$$loginValidity = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.UserLoginPeriod> getSet(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base)o1).get$rl$loginValidity();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserLoginPeriod,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserLoginPeriod.role$$user;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile>() {
        @Override
        public org.fenixedu.bennu.core.domain.UserProfile getValue(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base.DO_State)o1.get$obj$state(false)).profile;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.User o1, org.fenixedu.bennu.core.domain.UserProfile o2) {
            ((User_Base.DO_State)o1.get$obj$state(true)).profile = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$user;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> role$$userGroup = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getSet(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base)o1).get$rl$userGroup();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentUserGroup.role$$member;
        }
        
    };
    
    private final static class PersistentDynamicGroupCreator {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$createdDynamicGroup, "PersistentDynamicGroupCreator");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupCreator() {
        return PersistentDynamicGroupCreator.relation;
    }
    
    static {
        PersistentDynamicGroupCreator.relation.setRelationName("org.fenixedu.bennu.core.domain.User.PersistentDynamicGroupCreator");
    }
    
    private final static class SystemUsers {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "SystemUsers");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemUsers() {
        return SystemUsers.relation;
    }
    
    static {
        SystemUsers.relation.setRelationName("org.fenixedu.bennu.core.domain.User.SystemUsers");
    }
    
    private final static class UserLoginPeriods {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>(role$$loginValidity, "UserLoginPeriods");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getRelationUserLoginPeriods() {
        return UserLoginPeriods.relation;
    }
    
    static {
        UserLoginPeriods.relation.setRelationName("org.fenixedu.bennu.core.domain.User.UserLoginPeriods");
    }
    
    private final static class UserProfileUser {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile>(role$$profile, "UserProfileUser");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getRelationUserProfileUser() {
        return UserProfileUser.relation;
    }
    
    static {
        UserProfileUser.relation.setRelationName("org.fenixedu.bennu.core.domain.User.UserProfileUser");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getRelationUserGroupMembers() {
        return org.fenixedu.bennu.core.domain.groups.PersistentUserGroup.getRelationUserGroupMembers();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> get$rl$createdDynamicGroup() {
        return get$$relationList("createdDynamicGroup", getRelationPersistentDynamicGroupCreator());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> get$rl$loginValidity() {
        return get$$relationList("loginValidity", getRelationUserLoginPeriods());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> get$rl$userGroup() {
        return get$$relationList("userGroup", getRelationUserGroupMembers().getInverseRelation());
        
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
    protected  User_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getUsername() {
        return ((DO_State)this.get$obj$state(false)).username;
    }
    
    protected void setUsername(java.lang.String username) {
        ((DO_State)this.get$obj$state(true)).username = username;
    }
    
    private java.lang.String get$username() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).username;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$username(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).username = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getPassword() {
        return ((DO_State)this.get$obj$state(false)).password;
    }
    
    protected void setPassword(java.lang.String password) {
        ((DO_State)this.get$obj$state(true)).password = password;
    }
    
    private java.lang.String get$password() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).password;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$password(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).password = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getSalt() {
        return ((DO_State)this.get$obj$state(false)).salt;
    }
    
    protected void setSalt(java.lang.String salt) {
        ((DO_State)this.get$obj$state(true)).salt = salt;
    }
    
    private java.lang.String get$salt() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).salt;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$salt(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).salt = (java.lang.String)((value == null) ? null : value);
    }
    
    protected org.joda.time.DateTime getCreated() {
        return ((DO_State)this.get$obj$state(false)).created;
    }
    
    protected void setCreated(org.joda.time.DateTime created) {
        ((DO_State)this.get$obj$state(true)).created = created;
    }
    
    private java.sql.Timestamp get$created() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).created;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$created(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).created = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected void addCreatedDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup createdDynamicGroup) {
        getRelationPersistentDynamicGroupCreator().add((org.fenixedu.bennu.core.domain.User)this, createdDynamicGroup);
    }
    
    protected void removeCreatedDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup createdDynamicGroup) {
        getRelationPersistentDynamicGroupCreator().remove((org.fenixedu.bennu.core.domain.User)this, createdDynamicGroup);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getCreatedDynamicGroupSet() {
        return get$rl$createdDynamicGroup();
    }
    
    public void set$createdDynamicGroup(OJBFunctionalSetWrapper createdDynamicGroup) {
        get$rl$createdDynamicGroup().setFromOJB(this, "createdDynamicGroup", createdDynamicGroup);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getCreatedDynamicGroup() {
        return getCreatedDynamicGroupSet();
    }
    
    @Deprecated
    public int getCreatedDynamicGroupCount() {
        return getCreatedDynamicGroupSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationSystemUsers().add((org.fenixedu.bennu.core.domain.User)this, bennu);
    }
    
    private java.lang.Long get$oidBennu() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bennu;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBennu() {
        if (getBennu() == null) return false;
        return true;
    }
    
    public void addLoginValidity(org.fenixedu.bennu.core.domain.UserLoginPeriod loginValidity) {
        getRelationUserLoginPeriods().add((org.fenixedu.bennu.core.domain.User)this, loginValidity);
    }
    
    public void removeLoginValidity(org.fenixedu.bennu.core.domain.UserLoginPeriod loginValidity) {
        getRelationUserLoginPeriods().remove((org.fenixedu.bennu.core.domain.User)this, loginValidity);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserLoginPeriod> getLoginValiditySet() {
        return get$rl$loginValidity();
    }
    
    public void set$loginValidity(OJBFunctionalSetWrapper loginValidity) {
        get$rl$loginValidity().setFromOJB(this, "loginValidity", loginValidity);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.UserLoginPeriod> getLoginValidity() {
        return getLoginValiditySet();
    }
    
    @Deprecated
    public int getLoginValidityCount() {
        return getLoginValiditySet().size();
    }
    
    public org.fenixedu.bennu.core.domain.UserProfile getProfile() {
        return ((DO_State)this.get$obj$state(false)).profile;
    }
    
    public void setProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileUser().add((org.fenixedu.bennu.core.domain.User)this, profile);
    }
    
    private java.lang.Long get$oidProfile() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).profile;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfProfile() {
        if (getProfile() == null) return false;
        return true;
    }
    
    protected void addUserGroup(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup userGroup) {
        getRelationUserGroupMembers().add(userGroup, (org.fenixedu.bennu.core.domain.User)this);
    }
    
    protected void removeUserGroup(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup userGroup) {
        getRelationUserGroupMembers().remove(userGroup, (org.fenixedu.bennu.core.domain.User)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getUserGroupSet() {
        return get$rl$userGroup();
    }
    
    public void set$userGroup(OJBFunctionalSetWrapper userGroup) {
        get$rl$userGroup().setFromOJB(this, "userGroup", userGroup);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getUserGroup() {
        return getUserGroupSet();
    }
    
    @Deprecated
    public int getUserGroupCount() {
        return getUserGroupSet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$createdDynamicGroup().size() > 0) handleAttemptToDeleteConnectedObject("CreatedDynamicGroup");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        if (get$rl$loginValidity().size() > 0) handleAttemptToDeleteConnectedObject("LoginValidity");
        if (castedState.profile != null) handleAttemptToDeleteConnectedObject("Profile");
        if (get$rl$userGroup().size() > 0) handleAttemptToDeleteConnectedObject("UserGroup");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$username(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "USERNAME"), state);
        set$password(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PASSWORD"), state);
        set$salt(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "SALT"), state);
        set$created(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "CREATED"), state);
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
        castedState.profile = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PROFILE");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "username", getUsername());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "created", getCreated());
        return true;
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("createdDynamicGroup")) return getRelationPersistentDynamicGroupCreator();
        if (attrName.equals("loginValidity")) return getRelationUserLoginPeriods();
        if (attrName.equals("userGroup")) return getRelationUserGroupMembers().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("createdDynamicGroup", getRelationPersistentDynamicGroupCreator());
        get$$relationList("loginValidity", getRelationUserLoginPeriods());
        get$$relationList("userGroup", getRelationUserGroupMembers().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String username;
        private java.lang.String password;
        private java.lang.String salt;
        private org.joda.time.DateTime created;
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        private org.fenixedu.bennu.core.domain.UserProfile profile;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.username = this.username;
            newCasted.password = this.password;
            newCasted.salt = this.salt;
            newCasted.created = this.created;
            newCasted.bennu = this.bennu;
            newCasted.profile = this.profile;
            
        }
        
    }
    
}
