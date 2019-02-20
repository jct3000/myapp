package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class User_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$createdDynamicGroup = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getSet(org.fenixedu.bennu.core.domain.User o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>) ((User_Base) o1).createdDynamicGroup;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$creator;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base)o1).bennu.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.User o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((User_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$user;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> role$$loginValidity = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.UserLoginPeriod> getSet(org.fenixedu.bennu.core.domain.User o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>) ((User_Base) o1).loginValidity;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserLoginPeriod,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserLoginPeriod.role$$user;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile>() {
        public org.fenixedu.bennu.core.domain.UserProfile getValue(org.fenixedu.bennu.core.domain.User o1) {
            return ((User_Base)o1).profile.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.User o1, org.fenixedu.bennu.core.domain.UserProfile o2) {
            ((User_Base)o1).profile.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$user;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> role$$userGroup = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getSet(org.fenixedu.bennu.core.domain.User o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>) ((User_Base) o1).userGroup;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentUserGroup.role$$member;
        }
        
    };
    
    private final static class PersistentDynamicGroupCreator {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$createdDynamicGroup, "PersistentDynamicGroupCreator", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupCreator() {
        return PersistentDynamicGroupCreator.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> keyFunction$$createdDynamicGroup = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class SystemUsers {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "SystemUsers", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemUsers() {
        return SystemUsers.relation;
    }
    
    private final static class UserLoginPeriods {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>(role$$loginValidity, "UserLoginPeriods", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getRelationUserLoginPeriods() {
        return UserLoginPeriods.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.UserLoginPeriod> keyFunction$$loginValidity = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.UserLoginPeriod>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.UserLoginPeriod value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class UserProfileUser {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile>(role$$profile, "UserProfileUser", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getRelationUserProfileUser() {
        return UserProfileUser.relation;
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getRelationUserGroupMembers() {
        return org.fenixedu.bennu.core.domain.groups.PersistentUserGroup.getRelationUserGroupMembers();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> keyFunction$$userGroup = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    private OwnedVBox<java.lang.String> username;
    private OwnedVBox<java.lang.String> password;
    private OwnedVBox<java.lang.String> salt;
    private OwnedVBox<org.joda.time.DateTime> created;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>> internal$createdDynamicGroup$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> createdDynamicGroup;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserLoginPeriod>> internal$loginValidity$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> loginValidity;
    private OwnedVBox<org.fenixedu.bennu.core.domain.UserProfile> profile;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>> internal$userGroup$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> userGroup;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        username = OwnedVBox.makeNew(this, "username", allocateOnly, false);
        if (!allocateOnly) this.username.put(null);
        password = OwnedVBox.makeNew(this, "password", allocateOnly, false);
        if (!allocateOnly) this.password.put(null);
        salt = OwnedVBox.makeNew(this, "salt", allocateOnly, false);
        if (!allocateOnly) this.salt.put(null);
        created = OwnedVBox.makeNew(this, "created", allocateOnly, false);
        if (!allocateOnly) this.created.put(null);
        internal$createdDynamicGroup$collectionBox = OwnedVBox.makeNew(this, "internal$createdDynamicGroup$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> get() { return internal$getCreatedDynamicGroup$collection(); }
            };
            createdDynamicGroup = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>((org.fenixedu.bennu.core.domain.User)this, getRelationPersistentDynamicGroupCreator(), mapGetter, keyFunction$$createdDynamicGroup);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>();
            this.internal$createdDynamicGroup$collectionBox.put(internalMap);
            createdDynamicGroup = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>((org.fenixedu.bennu.core.domain.User)this, getRelationPersistentDynamicGroupCreator(), internalMap, keyFunction$$createdDynamicGroup);
        }
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        internal$loginValidity$collectionBox = OwnedVBox.makeNew(this, "internal$loginValidity$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.UserLoginPeriod> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.UserLoginPeriod>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserLoginPeriod> get() { return internal$getLoginValidity$collection(); }
            };
            loginValidity = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>((org.fenixedu.bennu.core.domain.User)this, getRelationUserLoginPeriods(), mapGetter, keyFunction$$loginValidity);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserLoginPeriod> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserLoginPeriod>();
            this.internal$loginValidity$collectionBox.put(internalMap);
            loginValidity = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod>((org.fenixedu.bennu.core.domain.User)this, getRelationUserLoginPeriods(), internalMap, keyFunction$$loginValidity);
        }
        profile = OwnedVBox.makeNew(this, "profile", allocateOnly, true);
        if (!allocateOnly) this.profile.put(null);
        internal$userGroup$collectionBox = OwnedVBox.makeNew(this, "internal$userGroup$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> get() { return internal$getUserGroup$collection(); }
            };
            userGroup = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>((org.fenixedu.bennu.core.domain.User)this, getRelationUserGroupMembers().getInverseRelation(), mapGetter, keyFunction$$userGroup);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>();
            this.internal$userGroup$collectionBox.put(internalMap);
            userGroup = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>((org.fenixedu.bennu.core.domain.User)this, getRelationUserGroupMembers().getInverseRelation(), internalMap, keyFunction$$userGroup);
        }
        
    }
    
    // Constructors
    protected  User_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getUsername() {
        return this.username.get();
    }
    
    protected void setUsername(java.lang.String username) {
        this.username.put(username);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getPassword() {
        return this.password.get();
    }
    
    protected void setPassword(java.lang.String password) {
        this.password.put(password);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getSalt() {
        return this.salt.get();
    }
    
    protected void setSalt(java.lang.String salt) {
        this.salt.put(salt);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected org.joda.time.DateTime getCreated() {
        return this.created.get();
    }
    
    protected void setCreated(org.joda.time.DateTime created) {
        this.created.put(created);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected void addCreatedDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup createdDynamicGroup) {
        getRelationPersistentDynamicGroupCreator().add((org.fenixedu.bennu.core.domain.User)this, createdDynamicGroup);
    }
    
    protected void removeCreatedDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup createdDynamicGroup) {
        getRelationPersistentDynamicGroupCreator().remove((org.fenixedu.bennu.core.domain.User)this, createdDynamicGroup);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> internal$getCreatedDynamicGroup$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>)this.internal$createdDynamicGroup$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getCreatedDynamicGroupSet() {
        return this.createdDynamicGroup;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationSystemUsers().add((org.fenixedu.bennu.core.domain.User)this, bennu);
    }
    
    public void addLoginValidity(org.fenixedu.bennu.core.domain.UserLoginPeriod loginValidity) {
        getRelationUserLoginPeriods().add((org.fenixedu.bennu.core.domain.User)this, loginValidity);
    }
    
    public void removeLoginValidity(org.fenixedu.bennu.core.domain.UserLoginPeriod loginValidity) {
        getRelationUserLoginPeriods().remove((org.fenixedu.bennu.core.domain.User)this, loginValidity);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserLoginPeriod> internal$getLoginValidity$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserLoginPeriod>)this.internal$loginValidity$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserLoginPeriod> getLoginValiditySet() {
        return this.loginValidity;
    }
    
    public org.fenixedu.bennu.core.domain.UserProfile getProfile() {
        return this.profile.get();
    }
    
    public void setProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileUser().add((org.fenixedu.bennu.core.domain.User)this, profile);
    }
    
    protected void addUserGroup(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup userGroup) {
        getRelationUserGroupMembers().add(userGroup, (org.fenixedu.bennu.core.domain.User)this);
    }
    
    protected void removeUserGroup(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup userGroup) {
        getRelationUserGroupMembers().remove(userGroup, (org.fenixedu.bennu.core.domain.User)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> internal$getUserGroup$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup>)this.internal$userGroup$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getUserGroupSet() {
        return this.userGroup;
    }
    
    
}
