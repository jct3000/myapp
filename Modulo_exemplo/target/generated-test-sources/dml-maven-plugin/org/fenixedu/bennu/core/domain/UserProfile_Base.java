package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class UserProfile_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> role$$localAvatar = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar>() {
        public org.fenixedu.bennu.core.domain.Avatar getValue(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base)o1).localAvatar.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.UserProfile o1, org.fenixedu.bennu.core.domain.Avatar o2) {
            ((UserProfile_Base)o1).localAvatar.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Avatar,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Avatar.role$$profile;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base)o1).bennu.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.UserProfile o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((UserProfile_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$profile;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> role$$nameIndex = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.NameIndex> getSet(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>) ((UserProfile_Base) o1).nameIndex;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.NameIndex.role$$profile;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.User> role$$user = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.User>() {
        public org.fenixedu.bennu.core.domain.User getValue(org.fenixedu.bennu.core.domain.UserProfile o1) {
            return ((UserProfile_Base)o1).user.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.UserProfile o1, org.fenixedu.bennu.core.domain.User o2) {
            ((UserProfile_Base)o1).user.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$profile;
        }
        
    };
    
    private final static class UserProfileAvatar {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar>(role$$localAvatar, "UserProfileAvatar", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getRelationUserProfileAvatar() {
        return UserProfileAvatar.relation;
    }
    
    private final static class SystemProfiles {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "SystemProfiles", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemProfiles() {
        return SystemProfiles.relation;
    }
    
    private final static class UserProfileNameIndexes {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>(role$$nameIndex, "UserProfileNameIndexes", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getRelationUserProfileNameIndexes() {
        return UserProfileNameIndexes.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.NameIndex> keyFunction$$nameIndex = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.NameIndex>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.NameIndex value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getRelationUserProfileUser() {
        return org.fenixedu.bennu.core.domain.User.getRelationUserProfileUser();
    }
    
    // Slots
    private OwnedVBox<java.lang.String> displayName;
    private OwnedVBox<java.lang.String> givenNames;
    private OwnedVBox<java.lang.String> familyNames;
    private OwnedVBox<java.lang.String> avatarUrl;
    private OwnedVBox<java.lang.String> email;
    private OwnedVBox<java.util.Locale> preferredLocale;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.Avatar> localAvatar;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex>> internal$nameIndex$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> nameIndex;
    private OwnedVBox<org.fenixedu.bennu.core.domain.User> user;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        displayName = OwnedVBox.makeNew(this, "displayName", allocateOnly, false);
        if (!allocateOnly) this.displayName.put(null);
        givenNames = OwnedVBox.makeNew(this, "givenNames", allocateOnly, false);
        if (!allocateOnly) this.givenNames.put(null);
        familyNames = OwnedVBox.makeNew(this, "familyNames", allocateOnly, false);
        if (!allocateOnly) this.familyNames.put(null);
        avatarUrl = OwnedVBox.makeNew(this, "avatarUrl", allocateOnly, false);
        if (!allocateOnly) this.avatarUrl.put(null);
        email = OwnedVBox.makeNew(this, "email", allocateOnly, false);
        if (!allocateOnly) this.email.put(null);
        preferredLocale = OwnedVBox.makeNew(this, "preferredLocale", allocateOnly, false);
        if (!allocateOnly) this.preferredLocale.put(null);
        localAvatar = OwnedVBox.makeNew(this, "localAvatar", allocateOnly, true);
        if (!allocateOnly) this.localAvatar.put(null);
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        internal$nameIndex$collectionBox = OwnedVBox.makeNew(this, "internal$nameIndex$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.NameIndex> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.NameIndex>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex> get() { return internal$getNameIndex$collection(); }
            };
            nameIndex = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>((org.fenixedu.bennu.core.domain.UserProfile)this, getRelationUserProfileNameIndexes(), mapGetter, keyFunction$$nameIndex);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex>();
            this.internal$nameIndex$collectionBox.put(internalMap);
            nameIndex = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex>((org.fenixedu.bennu.core.domain.UserProfile)this, getRelationUserProfileNameIndexes(), internalMap, keyFunction$$nameIndex);
        }
        user = OwnedVBox.makeNew(this, "user", allocateOnly, true);
        if (!allocateOnly) this.user.put(null);
        
    }
    
    // Constructors
    protected  UserProfile_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getDisplayName() {
        return this.displayName.get();
    }
    
    protected void setDisplayName(java.lang.String displayName) {
        this.displayName.put(displayName);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getGivenNames() {
        return this.givenNames.get();
    }
    
    protected void setGivenNames(java.lang.String givenNames) {
        this.givenNames.put(givenNames);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getFamilyNames() {
        return this.familyNames.get();
    }
    
    protected void setFamilyNames(java.lang.String familyNames) {
        this.familyNames.put(familyNames);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getAvatarUrl() {
        return this.avatarUrl.get();
    }
    
    public void setAvatarUrl(java.lang.String avatarUrl) {
        this.avatarUrl.put(avatarUrl);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getEmail() {
        return this.email.get();
    }
    
    public void setEmail(java.lang.String email) {
        this.email.put(email);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.util.Locale getPreferredLocale() {
        return this.preferredLocale.get();
    }
    
    public void setPreferredLocale(java.util.Locale preferredLocale) {
        this.preferredLocale.put(preferredLocale);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.Avatar getLocalAvatar() {
        return this.localAvatar.get();
    }
    
    protected void setLocalAvatar(org.fenixedu.bennu.core.domain.Avatar localAvatar) {
        getRelationUserProfileAvatar().add((org.fenixedu.bennu.core.domain.UserProfile)this, localAvatar);
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationSystemProfiles().add((org.fenixedu.bennu.core.domain.UserProfile)this, bennu);
    }
    
    protected void addNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationUserProfileNameIndexes().add((org.fenixedu.bennu.core.domain.UserProfile)this, nameIndex);
    }
    
    protected void removeNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationUserProfileNameIndexes().remove((org.fenixedu.bennu.core.domain.UserProfile)this, nameIndex);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex> internal$getNameIndex$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex>)this.internal$nameIndex$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndexSet() {
        return this.nameIndex;
    }
    
    protected org.fenixedu.bennu.core.domain.User getUser() {
        return this.user.get();
    }
    
    protected void setUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationUserProfileUser().add(user, (org.fenixedu.bennu.core.domain.UserProfile)this);
    }
    
    
}
