package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentGroup_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> role$$differenceAtRest = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>) ((PersistentGroup_Base) o1).differenceAtRest;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup.role$$rest;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> role$$differenceAtFirst = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>) ((PersistentGroup_Base) o1).differenceAtFirst;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup.role$$first;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> role$$unions = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>) ((PersistentGroup_Base) o1).unions;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup.role$$children;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$dynamicGroup = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>) ((PersistentGroup_Base) o1).dynamicGroup;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.Bennu> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).root.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((PersistentGroup_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem> role$$menuItem = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuItem> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem>) ((PersistentGroup_Base) o1).menuItem;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuItem.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> role$$file = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.GroupBasedFile> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>) ((PersistentGroup_Base) o1).file;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.GroupBasedFile,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.io.domain.GroupBasedFile.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> role$$intersections = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>) ((PersistentGroup_Base) o1).intersections;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup.role$$children;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup> role$$negation = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).negation.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup o2) {
            ((PersistentGroup_Base)o1).negation.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup.role$$negated;
        }
        
    };
    
    private final static class DifferenceGroupRest {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>(role$$differenceAtRest, "DifferenceGroupRest", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupRest() {
        return DifferenceGroupRest.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> keyFunction$$differenceAtRest = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class DifferenceGroupFirst {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>(role$$differenceAtFirst, "DifferenceGroupFirst", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupFirst() {
        return DifferenceGroupFirst.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> keyFunction$$differenceAtFirst = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationUnionGroupComposition() {
        return org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup.getRelationUnionGroupComposition();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> keyFunction$$unions = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class PersistentDynamicGroupWrapper {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$dynamicGroup, "PersistentDynamicGroupWrapper", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupWrapper() {
        return PersistentDynamicGroupWrapper.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> keyFunction$$dynamicGroup = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationPersistentGroups() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationPersistentGroups();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationMenuItemGroup() {
        return org.fenixedu.bennu.portal.domain.MenuItem.getRelationMenuItemGroup();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuItem> keyFunction$$menuItem = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuItem>() { public Comparable<?> getKey(org.fenixedu.bennu.portal.domain.MenuItem value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class GroupBasedFilesGroup {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>(role$$file, "GroupBasedFilesGroup", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getRelationGroupBasedFilesGroup() {
        return GroupBasedFilesGroup.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.GroupBasedFile> keyFunction$$file = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.io.domain.GroupBasedFile>() { public Comparable<?> getKey(org.fenixedu.bennu.io.domain.GroupBasedFile value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationIntersectionGroupComposition() {
        return org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup.getRelationIntersectionGroupComposition();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> keyFunction$$intersections = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationGroupNegationGroup() {
        return org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup.getRelationGroupNegationGroup();
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>> internal$differenceAtRest$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> differenceAtRest;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>> internal$differenceAtFirst$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> differenceAtFirst;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>> internal$unions$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> unions;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>> internal$dynamicGroup$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> dynamicGroup;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> root;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>> internal$menuItem$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem> menuItem;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GroupBasedFile>> internal$file$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> file;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>> internal$intersections$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> intersections;
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup> negation;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$differenceAtRest$collectionBox = OwnedVBox.makeNew(this, "internal$differenceAtRest$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> get() { return internal$getDifferenceAtRest$collection(); }
            };
            differenceAtRest = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationDifferenceGroupRest(), mapGetter, keyFunction$$differenceAtRest);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>();
            this.internal$differenceAtRest$collectionBox.put(internalMap);
            differenceAtRest = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationDifferenceGroupRest(), internalMap, keyFunction$$differenceAtRest);
        }
        internal$differenceAtFirst$collectionBox = OwnedVBox.makeNew(this, "internal$differenceAtFirst$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> get() { return internal$getDifferenceAtFirst$collection(); }
            };
            differenceAtFirst = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationDifferenceGroupFirst(), mapGetter, keyFunction$$differenceAtFirst);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>();
            this.internal$differenceAtFirst$collectionBox.put(internalMap);
            differenceAtFirst = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationDifferenceGroupFirst(), internalMap, keyFunction$$differenceAtFirst);
        }
        internal$unions$collectionBox = OwnedVBox.makeNew(this, "internal$unions$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> get() { return internal$getUnions$collection(); }
            };
            unions = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationUnionGroupComposition().getInverseRelation(), mapGetter, keyFunction$$unions);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>();
            this.internal$unions$collectionBox.put(internalMap);
            unions = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationUnionGroupComposition().getInverseRelation(), internalMap, keyFunction$$unions);
        }
        internal$dynamicGroup$collectionBox = OwnedVBox.makeNew(this, "internal$dynamicGroup$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> get() { return internal$getDynamicGroup$collection(); }
            };
            dynamicGroup = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationPersistentDynamicGroupWrapper(), mapGetter, keyFunction$$dynamicGroup);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>();
            this.internal$dynamicGroup$collectionBox.put(internalMap);
            dynamicGroup = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationPersistentDynamicGroupWrapper(), internalMap, keyFunction$$dynamicGroup);
        }
        root = OwnedVBox.makeNew(this, "root", allocateOnly, true);
        if (!allocateOnly) this.root.put(null);
        internal$menuItem$collectionBox = OwnedVBox.makeNew(this, "internal$menuItem$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuItem> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuItem>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> get() { return internal$getMenuItem$collection(); }
            };
            menuItem = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationMenuItemGroup().getInverseRelation(), mapGetter, keyFunction$$menuItem);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>();
            this.internal$menuItem$collectionBox.put(internalMap);
            menuItem = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationMenuItemGroup().getInverseRelation(), internalMap, keyFunction$$menuItem);
        }
        internal$file$collectionBox = OwnedVBox.makeNew(this, "internal$file$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.GroupBasedFile> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.io.domain.GroupBasedFile>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GroupBasedFile> get() { return internal$getFile$collection(); }
            };
            file = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationGroupBasedFilesGroup(), mapGetter, keyFunction$$file);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GroupBasedFile> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GroupBasedFile>();
            this.internal$file$collectionBox.put(internalMap);
            file = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationGroupBasedFilesGroup(), internalMap, keyFunction$$file);
        }
        internal$intersections$collectionBox = OwnedVBox.makeNew(this, "internal$intersections$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> get() { return internal$getIntersections$collection(); }
            };
            intersections = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationIntersectionGroupComposition().getInverseRelation(), mapGetter, keyFunction$$intersections);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>();
            this.internal$intersections$collectionBox.put(internalMap);
            intersections = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, getRelationIntersectionGroupComposition().getInverseRelation(), internalMap, keyFunction$$intersections);
        }
        negation = OwnedVBox.makeNew(this, "negation", allocateOnly, true);
        if (!allocateOnly) this.negation.put(null);
        
    }
    
    // Constructors
    protected  PersistentGroup_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addDifferenceAtRest(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtRest) {
        getRelationDifferenceGroupRest().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtRest);
    }
    
    protected void removeDifferenceAtRest(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtRest) {
        getRelationDifferenceGroupRest().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtRest);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> internal$getDifferenceAtRest$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>)this.internal$differenceAtRest$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtRestSet() {
        return this.differenceAtRest;
    }
    
    protected void addDifferenceAtFirst(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtFirst) {
        getRelationDifferenceGroupFirst().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtFirst);
    }
    
    protected void removeDifferenceAtFirst(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtFirst) {
        getRelationDifferenceGroupFirst().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtFirst);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> internal$getDifferenceAtFirst$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>)this.internal$differenceAtFirst$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtFirstSet() {
        return this.differenceAtFirst;
    }
    
    protected void addUnions(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup unions) {
        getRelationUnionGroupComposition().add(unions, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void removeUnions(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup unions) {
        getRelationUnionGroupComposition().remove(unions, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> internal$getUnions$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>)this.internal$unions$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getUnionsSet() {
        return this.unions;
    }
    
    protected void addDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamicGroup) {
        getRelationPersistentDynamicGroupWrapper().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, dynamicGroup);
    }
    
    protected void removeDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamicGroup) {
        getRelationPersistentDynamicGroupWrapper().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, dynamicGroup);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> internal$getDynamicGroup$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>)this.internal$dynamicGroup$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicGroupSet() {
        return this.dynamicGroup;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        return this.root.get();
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        getRelationPersistentGroups().add(root, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void addMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemGroup().add(menuItem, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void removeMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemGroup().remove(menuItem, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> internal$getMenuItem$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>)this.internal$menuItem$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItemSet() {
        return this.menuItem;
    }
    
    protected void addFile(org.fenixedu.bennu.io.domain.GroupBasedFile file) {
        getRelationGroupBasedFilesGroup().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, file);
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GroupBasedFile file) {
        getRelationGroupBasedFilesGroup().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, file);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GroupBasedFile> internal$getFile$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.io.domain.GroupBasedFile>)this.internal$file$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.GroupBasedFile> getFileSet() {
        return this.file;
    }
    
    protected void addIntersections(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup intersections) {
        getRelationIntersectionGroupComposition().add(intersections, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void removeIntersections(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup intersections) {
        getRelationIntersectionGroupComposition().remove(intersections, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> internal$getIntersections$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>)this.internal$intersections$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getIntersectionsSet() {
        return this.intersections;
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup getNegation() {
        return this.negation.get();
    }
    
    protected void setNegation(org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup negation) {
        getRelationGroupNegationGroup().add(negation, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    
}
