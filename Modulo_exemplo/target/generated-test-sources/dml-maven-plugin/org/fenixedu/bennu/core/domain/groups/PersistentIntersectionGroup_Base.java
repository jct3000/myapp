package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentIntersectionGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$children = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>) ((PersistentIntersectionGroup_Base) o1).children;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$intersections;
        }
        
    };
    
    private final static class IntersectionGroupComposition {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$children, "IntersectionGroupComposition", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationIntersectionGroupComposition() {
        return IntersectionGroupComposition.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentGroup> keyFunction$$children = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>> internal$children$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> children;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$children$collectionBox = OwnedVBox.makeNew(this, "internal$children$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> get() { return internal$getChildren$collection(); }
            };
            children = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>((org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup)this, getRelationIntersectionGroupComposition(), mapGetter, keyFunction$$children);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>();
            this.internal$children$collectionBox.put(internalMap);
            children = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>((org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup)this, getRelationIntersectionGroupComposition(), internalMap, keyFunction$$children);
        }
        
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
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> internal$getChildren$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>)this.internal$children$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getChildrenSet() {
        return this.children;
    }
    
    
}
