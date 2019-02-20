package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentGroup_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> role$$differenceAtRest = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$differenceAtRest();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup.role$$rest;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> role$$differenceAtFirst = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$differenceAtFirst();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup.role$$first;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> role$$unions = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$unions();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup.role$$children;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$dynamicGroup = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$dynamicGroup();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.Bennu> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((PersistentGroup_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem> role$$menuItem = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuItem> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$menuItem();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuItem.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> role$$file = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.io.domain.GroupBasedFile> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$file();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.GroupBasedFile,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.io.domain.GroupBasedFile.role$$group;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> role$$intersections = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getSet(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base)o1).get$rl$intersections();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup.role$$children;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup> role$$negation = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1) {
            return ((PersistentGroup_Base.DO_State)o1.get$obj$state(false)).negation;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup o2) {
            ((PersistentGroup_Base.DO_State)o1.get$obj$state(true)).negation = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup.role$$negated;
        }
        
    };
    
    private final static class DifferenceGroupRest {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>(role$$differenceAtRest, "DifferenceGroupRest");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupRest() {
        return DifferenceGroupRest.relation;
    }
    
    static {
        DifferenceGroupRest.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentGroup.DifferenceGroupRest");
        DifferenceGroupRest.relation.addListener(new pt.ist.fenixframework.dml.runtime.RelationAdapter<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>() {
            @Override
            public void beforeAdd(org.fenixedu.bennu.core.domain.groups.PersistentGroup arg0, org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.addRelationTuple("DifferenceGroupRest", arg1, "rest", arg0, "differenceAtRest");
            }
            @Override
            public void beforeRemove(org.fenixedu.bennu.core.domain.groups.PersistentGroup arg0, org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup arg1) {
                pt.ist.fenixframework.backend.jvstmojb.pstm.TransactionSupport.removeRelationTuple("DifferenceGroupRest", arg1, "rest", arg0, "differenceAtRest");
            }
            
        }
        );
    }
    
    private final static class DifferenceGroupFirst {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup>(role$$differenceAtFirst, "DifferenceGroupFirst");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupFirst() {
        return DifferenceGroupFirst.relation;
    }
    
    static {
        DifferenceGroupFirst.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentGroup.DifferenceGroupFirst");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationUnionGroupComposition() {
        return org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup.getRelationUnionGroupComposition();
    }
    
    private final static class PersistentDynamicGroupWrapper {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$dynamicGroup, "PersistentDynamicGroupWrapper");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupWrapper() {
        return PersistentDynamicGroupWrapper.relation;
    }
    
    static {
        PersistentDynamicGroupWrapper.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentGroup.PersistentDynamicGroupWrapper");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationPersistentGroups() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationPersistentGroups();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationMenuItemGroup() {
        return org.fenixedu.bennu.portal.domain.MenuItem.getRelationMenuItemGroup();
    }
    
    private final static class GroupBasedFilesGroup {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile>(role$$file, "GroupBasedFilesGroup");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getRelationGroupBasedFilesGroup() {
        return GroupBasedFilesGroup.relation;
    }
    
    static {
        GroupBasedFilesGroup.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentGroup.GroupBasedFilesGroup");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationIntersectionGroupComposition() {
        return org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup.getRelationIntersectionGroupComposition();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationGroupNegationGroup() {
        return org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup.getRelationGroupNegationGroup();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> get$rl$differenceAtRest() {
        return get$$relationList("differenceAtRest", getRelationDifferenceGroupRest());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> get$rl$differenceAtFirst() {
        return get$$relationList("differenceAtFirst", getRelationDifferenceGroupFirst());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> get$rl$unions() {
        return get$$relationList("unions", getRelationUnionGroupComposition().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> get$rl$dynamicGroup() {
        return get$$relationList("dynamicGroup", getRelationPersistentDynamicGroupWrapper());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem> get$rl$menuItem() {
        return get$$relationList("menuItem", getRelationMenuItemGroup().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> get$rl$file() {
        return get$$relationList("file", getRelationGroupBasedFilesGroup());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> get$rl$intersections() {
        return get$$relationList("intersections", getRelationIntersectionGroupComposition().getInverseRelation());
        
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
    protected  PersistentGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addDifferenceAtRest(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtRest) {
        getRelationDifferenceGroupRest().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtRest);
    }
    
    protected void removeDifferenceAtRest(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtRest) {
        getRelationDifferenceGroupRest().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtRest);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtRestSet() {
        return get$rl$differenceAtRest();
    }
    
    public void set$differenceAtRest(OJBFunctionalSetWrapper differenceAtRest) {
        get$rl$differenceAtRest().setFromOJB(this, "differenceAtRest", differenceAtRest);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtRest() {
        return getDifferenceAtRestSet();
    }
    
    @Deprecated
    public int getDifferenceAtRestCount() {
        return getDifferenceAtRestSet().size();
    }
    
    protected void addDifferenceAtFirst(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtFirst) {
        getRelationDifferenceGroupFirst().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtFirst);
    }
    
    protected void removeDifferenceAtFirst(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtFirst) {
        getRelationDifferenceGroupFirst().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, differenceAtFirst);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtFirstSet() {
        return get$rl$differenceAtFirst();
    }
    
    public void set$differenceAtFirst(OJBFunctionalSetWrapper differenceAtFirst) {
        get$rl$differenceAtFirst().setFromOJB(this, "differenceAtFirst", differenceAtFirst);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtFirst() {
        return getDifferenceAtFirstSet();
    }
    
    @Deprecated
    public int getDifferenceAtFirstCount() {
        return getDifferenceAtFirstSet().size();
    }
    
    protected void addUnions(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup unions) {
        getRelationUnionGroupComposition().add(unions, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void removeUnions(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup unions) {
        getRelationUnionGroupComposition().remove(unions, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getUnionsSet() {
        return get$rl$unions();
    }
    
    public void set$unions(OJBFunctionalSetWrapper unions) {
        get$rl$unions().setFromOJB(this, "unions", unions);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getUnions() {
        return getUnionsSet();
    }
    
    @Deprecated
    public int getUnionsCount() {
        return getUnionsSet().size();
    }
    
    protected void addDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamicGroup) {
        getRelationPersistentDynamicGroupWrapper().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, dynamicGroup);
    }
    
    protected void removeDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamicGroup) {
        getRelationPersistentDynamicGroupWrapper().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, dynamicGroup);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicGroupSet() {
        return get$rl$dynamicGroup();
    }
    
    public void set$dynamicGroup(OJBFunctionalSetWrapper dynamicGroup) {
        get$rl$dynamicGroup().setFromOJB(this, "dynamicGroup", dynamicGroup);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicGroup() {
        return getDynamicGroupSet();
    }
    
    @Deprecated
    public int getDynamicGroupCount() {
        return getDynamicGroupSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        getRelationPersistentGroups().add(root, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    private java.lang.Long get$oidRoot() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).root;
        return (value == null) ? null : value.getOid();
    }
    
    protected void addMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemGroup().add(menuItem, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void removeMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemGroup().remove(menuItem, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItemSet() {
        return get$rl$menuItem();
    }
    
    public void set$menuItem(OJBFunctionalSetWrapper menuItem) {
        get$rl$menuItem().setFromOJB(this, "menuItem", menuItem);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItem() {
        return getMenuItemSet();
    }
    
    @Deprecated
    public int getMenuItemCount() {
        return getMenuItemSet().size();
    }
    
    protected void addFile(org.fenixedu.bennu.io.domain.GroupBasedFile file) {
        getRelationGroupBasedFilesGroup().add((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, file);
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GroupBasedFile file) {
        getRelationGroupBasedFilesGroup().remove((org.fenixedu.bennu.core.domain.groups.PersistentGroup)this, file);
    }
    
    public java.util.Set<org.fenixedu.bennu.io.domain.GroupBasedFile> getFileSet() {
        return get$rl$file();
    }
    
    public void set$file(OJBFunctionalSetWrapper file) {
        get$rl$file().setFromOJB(this, "file", file);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.io.domain.GroupBasedFile> getFile() {
        return getFileSet();
    }
    
    @Deprecated
    public int getFileCount() {
        return getFileSet().size();
    }
    
    protected void addIntersections(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup intersections) {
        getRelationIntersectionGroupComposition().add(intersections, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    protected void removeIntersections(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup intersections) {
        getRelationIntersectionGroupComposition().remove(intersections, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getIntersectionsSet() {
        return get$rl$intersections();
    }
    
    public void set$intersections(OJBFunctionalSetWrapper intersections) {
        get$rl$intersections().setFromOJB(this, "intersections", intersections);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getIntersections() {
        return getIntersectionsSet();
    }
    
    @Deprecated
    public int getIntersectionsCount() {
        return getIntersectionsSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup getNegation() {
        return ((DO_State)this.get$obj$state(false)).negation;
    }
    
    protected void setNegation(org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup negation) {
        getRelationGroupNegationGroup().add(negation, (org.fenixedu.bennu.core.domain.groups.PersistentGroup)this);
    }
    
    private java.lang.Long get$oidNegation() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).negation;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$differenceAtRest().size() > 0) handleAttemptToDeleteConnectedObject("DifferenceAtRest");
        if (get$rl$differenceAtFirst().size() > 0) handleAttemptToDeleteConnectedObject("DifferenceAtFirst");
        if (get$rl$unions().size() > 0) handleAttemptToDeleteConnectedObject("Unions");
        if (get$rl$dynamicGroup().size() > 0) handleAttemptToDeleteConnectedObject("DynamicGroup");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        if (get$rl$menuItem().size() > 0) handleAttemptToDeleteConnectedObject("MenuItem");
        if (get$rl$file().size() > 0) handleAttemptToDeleteConnectedObject("File");
        if (get$rl$intersections().size() > 0) handleAttemptToDeleteConnectedObject("Intersections");
        if (castedState.negation != null) handleAttemptToDeleteConnectedObject("Negation");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
        castedState.negation = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_NEGATION");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("differenceAtRest")) return getRelationDifferenceGroupRest();
        if (attrName.equals("differenceAtFirst")) return getRelationDifferenceGroupFirst();
        if (attrName.equals("unions")) return getRelationUnionGroupComposition().getInverseRelation();
        if (attrName.equals("dynamicGroup")) return getRelationPersistentDynamicGroupWrapper();
        if (attrName.equals("menuItem")) return getRelationMenuItemGroup().getInverseRelation();
        if (attrName.equals("file")) return getRelationGroupBasedFilesGroup();
        if (attrName.equals("intersections")) return getRelationIntersectionGroupComposition().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("differenceAtRest", getRelationDifferenceGroupRest());
        get$$relationList("differenceAtFirst", getRelationDifferenceGroupFirst());
        get$$relationList("unions", getRelationUnionGroupComposition().getInverseRelation());
        get$$relationList("dynamicGroup", getRelationPersistentDynamicGroupWrapper());
        get$$relationList("menuItem", getRelationMenuItemGroup().getInverseRelation());
        get$$relationList("file", getRelationGroupBasedFilesGroup());
        get$$relationList("intersections", getRelationIntersectionGroupComposition().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.fenixedu.bennu.core.domain.Bennu root;
        private org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup negation;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.root = this.root;
            newCasted.negation = this.negation;
            
        }
        
    }
    
}
