package org.fenixedu.bennu.core.domain;


@SuppressWarnings("all")
public abstract class Bennu_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuFileSupport() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemUsers() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemProfiles() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroups() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationPersistentGroups() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getRelationDomainRootBennu() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuNameIndexes() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationFutureSystemBennu() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuSupportConfiguration() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getRelationGroupConstantRoot() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationBennuPortalConfiguration() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationSchedulerSystemSchedulerSystem() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  Bennu_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected com.google.gson.JsonElement getPropertyData() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setPropertyData(com.google.gson.JsonElement propertyData) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addUser(org.fenixedu.bennu.core.domain.User user) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeUser(org.fenixedu.bennu.core.domain.User user) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.User> getUserSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfileSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addDynamic(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamic) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeDynamic(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamic) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getGroupSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected pt.ist.fenixframework.DomainRoot getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setRoot(pt.ist.fenixframework.DomainRoot root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndexSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getFutureSystem() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addSupportConfiguration(org.fenixedu.bennu.portal.domain.SupportConfiguration supportConfiguration) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeSupportConfiguration(org.fenixedu.bennu.portal.domain.SupportConfiguration supportConfiguration) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.SupportConfiguration> getSupportConfigurationSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addGroupConstant(org.fenixedu.bennu.core.domain.groups.GroupConstant groupConstant) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeGroupConstant(org.fenixedu.bennu.core.domain.groups.GroupConstant groupConstant) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.GroupConstant> getGroupConstantSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.portal.domain.PortalConfiguration getConfiguration() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setConfiguration(org.fenixedu.bennu.portal.domain.PortalConfiguration configuration) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
