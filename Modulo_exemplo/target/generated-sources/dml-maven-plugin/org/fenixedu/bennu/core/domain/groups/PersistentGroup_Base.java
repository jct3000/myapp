package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class PersistentGroup_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupRest() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getRelationDifferenceGroupFirst() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationUnionGroupComposition() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupWrapper() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationPersistentGroups() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationMenuItemGroup() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getRelationGroupBasedFilesGroup() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationIntersectionGroupComposition() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationGroupNegationGroup() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected void addDifferenceAtRest(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtRest) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeDifferenceAtRest(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtRest) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtRestSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addDifferenceAtFirst(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtFirst) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeDifferenceAtFirst(org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup differenceAtFirst) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDifferenceGroup> getDifferenceAtFirstSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addUnions(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup unions) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeUnions(org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup unions) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUnionGroup> getUnionsSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamicGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamicGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicGroupSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItemSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addFile(org.fenixedu.bennu.io.domain.GroupBasedFile file) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeFile(org.fenixedu.bennu.io.domain.GroupBasedFile file) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.io.domain.GroupBasedFile> getFileSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addIntersections(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup intersections) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeIntersections(org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup intersections) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentIntersectionGroup> getIntersectionsSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup getNegation() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setNegation(org.fenixedu.bennu.core.domain.groups.PersistentNegationGroup negation) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
