package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentUserGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> role$$member = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.User> getSet(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>) ((PersistentUserGroup_Base) o1).member;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$userGroup;
        }
        
    };
    
    private final static class UserGroupMembers {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>(role$$member, "UserGroupMembers", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getRelationUserGroupMembers() {
        return UserGroupMembers.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.User> keyFunction$$member = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.User>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.User value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User>> internal$member$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> member;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$member$collectionBox = OwnedVBox.makeNew(this, "internal$member$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.User> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.User>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User> get() { return internal$getMember$collection(); }
            };
            member = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>((org.fenixedu.bennu.core.domain.groups.PersistentUserGroup)this, getRelationUserGroupMembers(), mapGetter, keyFunction$$member);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User>();
            this.internal$member$collectionBox.put(internalMap);
            member = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User>((org.fenixedu.bennu.core.domain.groups.PersistentUserGroup)this, getRelationUserGroupMembers(), internalMap, keyFunction$$member);
        }
        
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
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User> internal$getMember$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User>)this.internal$member$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.User> getMemberSet() {
        return this.member;
    }
    
    
}
