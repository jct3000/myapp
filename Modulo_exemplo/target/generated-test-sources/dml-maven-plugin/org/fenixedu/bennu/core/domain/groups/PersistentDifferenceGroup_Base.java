package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentDifferenceGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$rest = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>) ((PersistentDifferenceGroup_Base) o1).rest;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$differenceAtRest;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$first = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup o1) {
            return ((PersistentDifferenceGroup_Base)o1).first.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((PersistentDifferenceGroup_Base)o1).first.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$differenceAtFirst;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupRest() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationDifferenceGroupRest();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentGroup> keyFunction$$rest = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupFirst() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationDifferenceGroupFirst();
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>> internal$rest$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> rest;
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentGroup> first;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$rest$collectionBox = OwnedVBox.makeNew(this, "internal$rest$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> get() { return internal$getRest$collection(); }
            };
            rest = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>((org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup)this, getRelationDifferenceGroupRest().getInverseRelation(), mapGetter, keyFunction$$rest);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>();
            this.internal$rest$collectionBox.put(internalMap);
            rest = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>((org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup)this, getRelationDifferenceGroupRest().getInverseRelation(), internalMap, keyFunction$$rest);
        }
        first = OwnedVBox.makeNew(this, "first", allocateOnly, true);
        if (!allocateOnly) this.first.put(null);
        
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
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> internal$getRest$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>)this.internal$rest$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRestSet() {
        return this.rest;
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getFirst() {
        return this.first.get();
    }
    
    protected void setFirst(org.fenixedu.bennu.core.domain.groups.PersistentGroup first) {
        getRelationDifferenceGroupFirst().add(first, (org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup)this);
    }
    
    
}
