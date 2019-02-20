package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class NameIndex_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.UserProfile> getSet(org.fenixedu.bennu.core.domain.NameIndex o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile>) ((NameIndex_Base) o1).profile;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$nameIndex;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.NameIndex o1) {
            return ((NameIndex_Base)o1).bennu.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.NameIndex o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((NameIndex_Base)o1).bennu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$nameIndex;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getRelationUserProfileNameIndexes() {
        return org.fenixedu.bennu.core.domain.UserProfile.getRelationUserProfileNameIndexes();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.UserProfile> keyFunction$$profile = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.UserProfile>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.UserProfile value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BennuNameIndexes {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "BennuNameIndexes", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuNameIndexes() {
        return BennuNameIndexes.relation;
    }
    
    // Slots
    private OwnedVBox<java.lang.String> keyword;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile>> internal$profile$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile> profile;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> bennu;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        keyword = OwnedVBox.makeNew(this, "keyword", allocateOnly, false);
        if (!allocateOnly) this.keyword.put(null);
        internal$profile$collectionBox = OwnedVBox.makeNew(this, "internal$profile$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.UserProfile> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.UserProfile>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile> get() { return internal$getProfile$collection(); }
            };
            profile = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile>((org.fenixedu.bennu.core.domain.NameIndex)this, getRelationUserProfileNameIndexes().getInverseRelation(), mapGetter, keyFunction$$profile);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile>();
            this.internal$profile$collectionBox.put(internalMap);
            profile = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile>((org.fenixedu.bennu.core.domain.NameIndex)this, getRelationUserProfileNameIndexes().getInverseRelation(), internalMap, keyFunction$$profile);
        }
        bennu = OwnedVBox.makeNew(this, "bennu", allocateOnly, true);
        if (!allocateOnly) this.bennu.put(null);
        
    }
    
    // Constructors
    protected  NameIndex_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected java.lang.String getKeyword() {
        return this.keyword.get();
    }
    
    protected void setKeyword(java.lang.String keyword) {
        this.keyword.put(keyword);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public void addProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileNameIndexes().add(profile, (org.fenixedu.bennu.core.domain.NameIndex)this);
    }
    
    public void removeProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileNameIndexes().remove(profile, (org.fenixedu.bennu.core.domain.NameIndex)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile> internal$getProfile$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile>)this.internal$profile$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfileSet() {
        return this.profile;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return this.bennu.get();
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationBennuNameIndexes().add((org.fenixedu.bennu.core.domain.NameIndex)this, bennu);
    }
    
    
}
