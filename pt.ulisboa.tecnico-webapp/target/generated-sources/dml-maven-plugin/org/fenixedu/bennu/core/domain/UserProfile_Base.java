package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class UserProfile_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> role$$localAvatar = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar>() {
        @Override
        public org.fenixedu.bennu.core.domain.Avatar getValue(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base.DO_State)o1.get$obj$state(false)).localAvatar;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.UserProfile o1, org.fenixedu.bennu.core.domain.Avatar o2) {
            ((UserProfile_Base.DO_State)o1.get$obj$state(true)).localAvatar = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Avatar,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Avatar.role$$profile;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.UserProfile o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((UserProfile_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$profile;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> role$$nameIndex = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.NameIndex> getSet(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base)o1).get$rl$nameIndex();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.NameIndex.role$$profile;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.User> role$$user = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.User>() {
        @Override
        public org.fenixedu.bennu.core.domain.User getValue(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base.DO_State)o1.get$obj$state(false)).user;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.UserProfile o1, org.fenixedu.bennu.core.domain.User o2) {
            ((UserProfile_Base.DO_State)o1.get$obj$state(true)).user = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$profile;
        }
        
    };
    
    private final static class UserProfileAvatar {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar>(role$$localAvatar, "UserProfileAvatar");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getRelationUserProfileAvatar() {
        return UserProfileAvatar.relation;
    }
    
    static {
        UserProfileAvatar.relation.setRelationName("org.fenixedu.bennu.core.domain.UserProfile.UserProfileAvatar");
    }
    
    private final static class SystemProfiles {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "SystemProfiles");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemProfiles() {
        return SystemProfiles.relation;
    }
    
    static {
        SystemProfiles.relation.setRelationName("org.fenixedu.bennu.core.domain.UserProfile.SystemProfiles");
    }
    
    private final static class UserProfileNameIndexes {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>(role$$nameIndex, "UserProfileNameIndexes");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getRelationUserProfileNameIndexes() {
        return UserProfileNameIndexes.relation;
    }
    
    static {
        UserProfileNameIndexes.relation.setRelationName("org.fenixedu.bennu.core.domain.UserProfile.UserProfileNameIndexes");
        UserProfileNameIndexes.relation.addListener(new pt.ist.fenixframework.dml.runtime.RelationAdapter<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>() {
            @Override
            public void beforeAdd(org.fenixedu.bennu.core.domain.UserProfile arg0, org.fenixedu.bennu.core.domain.NameIndex arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.addRelationTuple("UserProfileNameIndexes", arg1, "profile", arg0, "nameIndex");
            }
            @Override
            public void beforeRemove(org.fenixedu.bennu.core.domain.UserProfile arg0, org.fenixedu.bennu.core.domain.NameIndex arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.removeRelationTuple("UserProfileNameIndexes", arg1, "profile", arg0, "nameIndex");
            }
            
        }
        );
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getRelationUserProfileUser() {
        return org.fenixedu.bennu.core.domain.User.getRelationUserProfileUser();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> get$rl$nameIndex() {
        return get$$relationList("nameIndex", getRelationUserProfileNameIndexes());
        
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
    protected  UserProfile_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getDisplayName() {
        return ((DO_State)this.get$obj$state(false)).displayName;
    }
    
    protected void setDisplayName(java.lang.String displayName) {
        ((DO_State)this.get$obj$state(true)).displayName = displayName;
    }
    
    private java.lang.String get$displayName() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).displayName;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$displayName(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).displayName = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getGivenNames() {
        return ((DO_State)this.get$obj$state(false)).givenNames;
    }
    
    protected void setGivenNames(java.lang.String givenNames) {
        ((DO_State)this.get$obj$state(true)).givenNames = givenNames;
    }
    
    private java.lang.String get$givenNames() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).givenNames;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$givenNames(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).givenNames = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getFamilyNames() {
        return ((DO_State)this.get$obj$state(false)).familyNames;
    }
    
    protected void setFamilyNames(java.lang.String familyNames) {
        ((DO_State)this.get$obj$state(true)).familyNames = familyNames;
    }
    
    private java.lang.String get$familyNames() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).familyNames;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$familyNames(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).familyNames = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getAvatarUrl() {
        return ((DO_State)this.get$obj$state(false)).avatarUrl;
    }
    
    public void setAvatarUrl(java.lang.String avatarUrl) {
        ((DO_State)this.get$obj$state(true)).avatarUrl = avatarUrl;
    }
    
    private java.lang.String get$avatarUrl() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).avatarUrl;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$avatarUrl(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).avatarUrl = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getEmail() {
        return ((DO_State)this.get$obj$state(false)).email;
    }
    
    public void setEmail(java.lang.String email) {
        ((DO_State)this.get$obj$state(true)).email = email;
    }
    
    private java.lang.String get$email() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).email;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$email(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).email = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.util.Locale getPreferredLocale() {
        return ((DO_State)this.get$obj$state(false)).preferredLocale;
    }
    
    public void setPreferredLocale(java.util.Locale preferredLocale) {
        ((DO_State)this.get$obj$state(true)).preferredLocale = preferredLocale;
    }
    
    private java.lang.String get$preferredLocale() {
        java.util.Locale value = ((DO_State)this.get$obj$state(false)).preferredLocale;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(ValueTypeSerializer.serialize$Locale(value));
    }
    
    private final void set$preferredLocale(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).preferredLocale = (java.util.Locale)((value == null) ? null : ValueTypeSerializer.deSerialize$Locale(value));
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.Avatar getLocalAvatar() {
        return ((DO_State)this.get$obj$state(false)).localAvatar;
    }
    
    protected void setLocalAvatar(org.fenixedu.bennu.core.domain.Avatar localAvatar) {
        getRelationUserProfileAvatar().add((org.fenixedu.bennu.core.domain.UserProfile)this, localAvatar);
    }
    
    private java.lang.Long get$oidLocalAvatar() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).localAvatar;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationSystemProfiles().add((org.fenixedu.bennu.core.domain.UserProfile)this, bennu);
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
    
    protected void addNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationUserProfileNameIndexes().add((org.fenixedu.bennu.core.domain.UserProfile)this, nameIndex);
    }
    
    protected void removeNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationUserProfileNameIndexes().remove((org.fenixedu.bennu.core.domain.UserProfile)this, nameIndex);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndexSet() {
        return get$rl$nameIndex();
    }
    
    public void set$nameIndex(OJBFunctionalSetWrapper nameIndex) {
        get$rl$nameIndex().setFromOJB(this, "nameIndex", nameIndex);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndex() {
        return getNameIndexSet();
    }
    
    @Deprecated
    public int getNameIndexCount() {
        return getNameIndexSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.User getUser() {
        return ((DO_State)this.get$obj$state(false)).user;
    }
    
    protected void setUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationUserProfileUser().add(user, (org.fenixedu.bennu.core.domain.UserProfile)this);
    }
    
    private java.lang.Long get$oidUser() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).user;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.localAvatar != null) handleAttemptToDeleteConnectedObject("LocalAvatar");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        if (get$rl$nameIndex().size() > 0) handleAttemptToDeleteConnectedObject("NameIndex");
        if (castedState.user != null) handleAttemptToDeleteConnectedObject("User");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$displayName(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "DISPLAY_NAME"), state);
        set$givenNames(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "GIVEN_NAMES"), state);
        set$familyNames(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FAMILY_NAMES"), state);
        set$avatarUrl(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "AVATAR_URL"), state);
        set$email(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "EMAIL"), state);
        set$preferredLocale(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PREFERRED_LOCALE"), state);
        castedState.localAvatar = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_LOCAL_AVATAR");
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
        castedState.user = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_USER");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "givenNames", getGivenNames());
        return true;
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("nameIndex")) return getRelationUserProfileNameIndexes();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("nameIndex", getRelationUserProfileNameIndexes());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String displayName;
        private java.lang.String givenNames;
        private java.lang.String familyNames;
        private java.lang.String avatarUrl;
        private java.lang.String email;
        private java.util.Locale preferredLocale;
        private org.fenixedu.bennu.core.domain.Avatar localAvatar;
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        private org.fenixedu.bennu.core.domain.User user;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.displayName = this.displayName;
            newCasted.givenNames = this.givenNames;
            newCasted.familyNames = this.familyNames;
            newCasted.avatarUrl = this.avatarUrl;
            newCasted.email = this.email;
            newCasted.preferredLocale = this.preferredLocale;
            newCasted.localAvatar = this.localAvatar;
            newCasted.bennu = this.bennu;
            newCasted.user = this.user;
            
        }
        
    }
    
}
