package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Bennu_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base.DO_State)o1.get$obj$state(false)).fileSupport;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((Bennu_Base.DO_State)o1.get$obj$state(true)).fileSupport = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User> role$$user = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.User> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$user();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.UserProfile> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$profile();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$dynamic = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$dynamic();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$rootForDynamicGroup;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$group();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,pt.ist.fenixframework.DomainRoot>() {
        @Override
        public pt.ist.fenixframework.DomainRoot getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, pt.ist.fenixframework.DomainRoot o2) {
            ((Bennu_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex> role$$nameIndex = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.NameIndex> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$nameIndex();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.NameIndex.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.future.FutureSystem> role$$futureSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.future.FutureSystem>() {
        @Override
        public org.fenixedu.bennu.scheduler.future.FutureSystem getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base.DO_State)o1.get$obj$state(false)).futureSystem;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.scheduler.future.FutureSystem o2) {
            ((Bennu_Base.DO_State)o1.get$obj$state(true)).futureSystem = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.FutureSystem.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration> role$$supportConfiguration = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.SupportConfiguration> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$supportConfiguration();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.SupportConfiguration.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> role$$groupConstant = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.GroupConstant> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).get$rl$groupConstant();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.GroupConstant,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.GroupConstant.role$$rootForGroupConstant;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration>() {
        @Override
        public org.fenixedu.bennu.portal.domain.PortalConfiguration getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base.DO_State)o1.get$obj$state(false)).configuration;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.portal.domain.PortalConfiguration o2) {
            ((Bennu_Base.DO_State)o1.get$obj$state(true)).configuration = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.PortalConfiguration.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> role$$schedulerSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>() {
        @Override
        public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base.DO_State)o1.get$obj$state(false)).schedulerSystem;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.scheduler.domain.SchedulerSystem o2) {
            ((Bennu_Base.DO_State)o1.get$obj$state(true)).schedulerSystem = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.role$$bennu;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuFileSupport() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationBennuFileSupport();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemUsers() {
        return org.fenixedu.bennu.core.domain.User.getRelationSystemUsers();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemProfiles() {
        return org.fenixedu.bennu.core.domain.UserProfile.getRelationSystemProfiles();
    }
    
    private final static class PersistentDynamicGroups {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$dynamic, "PersistentDynamicGroups");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroups() {
        return PersistentDynamicGroups.relation;
    }
    
    static {
        PersistentDynamicGroups.relation.setRelationName("org.fenixedu.bennu.core.domain.Bennu.PersistentDynamicGroups");
    }
    
    private final static class PersistentGroups {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$group, "PersistentGroups");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationPersistentGroups() {
        return PersistentGroups.relation;
    }
    
    static {
        PersistentGroups.relation.setRelationName("org.fenixedu.bennu.core.domain.Bennu.PersistentGroups");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getRelationDomainRootBennu() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootBennu();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuNameIndexes() {
        return org.fenixedu.bennu.core.domain.NameIndex.getRelationBennuNameIndexes();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationFutureSystemBennu() {
        return org.fenixedu.bennu.scheduler.future.FutureSystem.getRelationFutureSystemBennu();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuSupportConfiguration() {
        return org.fenixedu.bennu.portal.domain.SupportConfiguration.getRelationBennuSupportConfiguration();
    }
    
    private final static class GroupConstantRoot {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>(role$$groupConstant, "GroupConstantRoot");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getRelationGroupConstantRoot() {
        return GroupConstantRoot.relation;
    }
    
    static {
        GroupConstantRoot.relation.setRelationName("org.fenixedu.bennu.core.domain.Bennu.GroupConstantRoot");
    }
    
    private final static class BennuPortalConfiguration {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration>(role$$configuration, "BennuPortalConfiguration");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationBennuPortalConfiguration() {
        return BennuPortalConfiguration.relation;
    }
    
    static {
        BennuPortalConfiguration.relation.setRelationName("org.fenixedu.bennu.core.domain.Bennu.BennuPortalConfiguration");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationSchedulerSystemSchedulerSystem() {
        return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.getRelationSchedulerSystemSchedulerSystem();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User> get$rl$user() {
        return get$$relationList("user", getRelationSystemUsers().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile> get$rl$profile() {
        return get$$relationList("profile", getRelationSystemProfiles().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> get$rl$dynamic() {
        return get$$relationList("dynamic", getRelationPersistentDynamicGroups());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> get$rl$group() {
        return get$$relationList("group", getRelationPersistentGroups());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex> get$rl$nameIndex() {
        return get$$relationList("nameIndex", getRelationBennuNameIndexes().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration> get$rl$supportConfiguration() {
        return get$$relationList("supportConfiguration", getRelationBennuSupportConfiguration().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> get$rl$groupConstant() {
        return get$$relationList("groupConstant", getRelationGroupConstantRoot());
        
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
    protected  Bennu_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected com.google.gson.JsonElement getPropertyData() {
        return ((DO_State)this.get$obj$state(false)).propertyData;
    }
    
    protected void setPropertyData(com.google.gson.JsonElement propertyData) {
        ((DO_State)this.get$obj$state(true)).propertyData = propertyData;
    }
    
    private java.lang.String get$propertyData() {
        com.google.gson.JsonElement value = ((DO_State)this.get$obj$state(false)).propertyData;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(value);
    }
    
    private final void set$propertyData(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).propertyData = (com.google.gson.JsonElement)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return ((DO_State)this.get$obj$state(false)).fileSupport;
    }
    
    public void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationBennuFileSupport().add(fileSupport, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    private java.lang.Long get$oidFileSupport() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).fileSupport;
        return (value == null) ? null : value.getOid();
    }
    
    protected void addUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationSystemUsers().add(user, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void removeUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationSystemUsers().remove(user, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.User> getUserSet() {
        return get$rl$user();
    }
    
    public void set$user(OJBFunctionalSetWrapper user) {
        get$rl$user().setFromOJB(this, "user", user);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.User> getUser() {
        return getUserSet();
    }
    
    @Deprecated
    public int getUserCount() {
        return getUserSet().size();
    }
    
    protected void addProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationSystemProfiles().add(profile, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void removeProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationSystemProfiles().remove(profile, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfileSet() {
        return get$rl$profile();
    }
    
    public void set$profile(OJBFunctionalSetWrapper profile) {
        get$rl$profile().setFromOJB(this, "profile", profile);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfile() {
        return getProfileSet();
    }
    
    @Deprecated
    public int getProfileCount() {
        return getProfileSet().size();
    }
    
    protected void addDynamic(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamic) {
        getRelationPersistentDynamicGroups().add((org.fenixedu.bennu.core.domain.Bennu)this, dynamic);
    }
    
    protected void removeDynamic(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamic) {
        getRelationPersistentDynamicGroups().remove((org.fenixedu.bennu.core.domain.Bennu)this, dynamic);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicSet() {
        return get$rl$dynamic();
    }
    
    public void set$dynamic(OJBFunctionalSetWrapper dynamic) {
        get$rl$dynamic().setFromOJB(this, "dynamic", dynamic);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamic() {
        return getDynamicSet();
    }
    
    @Deprecated
    public int getDynamicCount() {
        return getDynamicSet().size();
    }
    
    protected void addGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationPersistentGroups().add((org.fenixedu.bennu.core.domain.Bennu)this, group);
    }
    
    protected void removeGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationPersistentGroups().remove((org.fenixedu.bennu.core.domain.Bennu)this, group);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getGroupSet() {
        return get$rl$group();
    }
    
    public void set$group(OJBFunctionalSetWrapper group) {
        get$rl$group().setFromOJB(this, "group", group);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getGroup() {
        return getGroupSet();
    }
    
    @Deprecated
    public int getGroupCount() {
        return getGroupSet().size();
    }
    
    protected pt.ist.fenixframework.DomainRoot getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    protected void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootBennu().add(root, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    private java.lang.Long get$oidRoot() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).root;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfRoot() {
        if (getRoot() == null) return false;
        return true;
    }
    
    protected void addNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationBennuNameIndexes().add(nameIndex, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void removeNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationBennuNameIndexes().remove(nameIndex, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndexSet() {
        return get$rl$nameIndex();
    }
    
    public void set$nameIndex(OJBFunctionalSetWrapper nameIndex) {
        get$rl$nameIndex().setFromOJB(this, "nameIndex", nameIndex);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndex() {
        return getNameIndexSet();
    }
    
    @Deprecated
    public int getNameIndexCount() {
        return getNameIndexSet().size();
    }
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getFutureSystem() {
        return ((DO_State)this.get$obj$state(false)).futureSystem;
    }
    
    public void setFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem) {
        getRelationFutureSystemBennu().add(futureSystem, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    private java.lang.Long get$oidFutureSystem() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).futureSystem;
        return (value == null) ? null : value.getOid();
    }
    
    public void addSupportConfiguration(org.fenixedu.bennu.portal.domain.SupportConfiguration supportConfiguration) {
        getRelationBennuSupportConfiguration().add(supportConfiguration, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public void removeSupportConfiguration(org.fenixedu.bennu.portal.domain.SupportConfiguration supportConfiguration) {
        getRelationBennuSupportConfiguration().remove(supportConfiguration, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.SupportConfiguration> getSupportConfigurationSet() {
        return get$rl$supportConfiguration();
    }
    
    public void set$supportConfiguration(OJBFunctionalSetWrapper supportConfiguration) {
        get$rl$supportConfiguration().setFromOJB(this, "supportConfiguration", supportConfiguration);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.portal.domain.SupportConfiguration> getSupportConfiguration() {
        return getSupportConfigurationSet();
    }
    
    @Deprecated
    public int getSupportConfigurationCount() {
        return getSupportConfigurationSet().size();
    }
    
    protected void addGroupConstant(org.fenixedu.bennu.core.domain.groups.GroupConstant groupConstant) {
        getRelationGroupConstantRoot().add((org.fenixedu.bennu.core.domain.Bennu)this, groupConstant);
    }
    
    protected void removeGroupConstant(org.fenixedu.bennu.core.domain.groups.GroupConstant groupConstant) {
        getRelationGroupConstantRoot().remove((org.fenixedu.bennu.core.domain.Bennu)this, groupConstant);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.GroupConstant> getGroupConstantSet() {
        return get$rl$groupConstant();
    }
    
    public void set$groupConstant(OJBFunctionalSetWrapper groupConstant) {
        get$rl$groupConstant().setFromOJB(this, "groupConstant", groupConstant);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.GroupConstant> getGroupConstant() {
        return getGroupConstantSet();
    }
    
    @Deprecated
    public int getGroupConstantCount() {
        return getGroupConstantSet().size();
    }
    
    public org.fenixedu.bennu.portal.domain.PortalConfiguration getConfiguration() {
        return ((DO_State)this.get$obj$state(false)).configuration;
    }
    
    public void setConfiguration(org.fenixedu.bennu.portal.domain.PortalConfiguration configuration) {
        getRelationBennuPortalConfiguration().add((org.fenixedu.bennu.core.domain.Bennu)this, configuration);
    }
    
    private java.lang.Long get$oidConfiguration() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).configuration;
        return (value == null) ? null : value.getOid();
    }
    
    public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        return ((DO_State)this.get$obj$state(false)).schedulerSystem;
    }
    
    public void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        getRelationSchedulerSystemSchedulerSystem().add(schedulerSystem, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    private java.lang.Long get$oidSchedulerSystem() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).schedulerSystem;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.fileSupport != null) handleAttemptToDeleteConnectedObject("FileSupport");
        if (get$rl$user().size() > 0) handleAttemptToDeleteConnectedObject("User");
        if (get$rl$profile().size() > 0) handleAttemptToDeleteConnectedObject("Profile");
        if (get$rl$dynamic().size() > 0) handleAttemptToDeleteConnectedObject("Dynamic");
        if (get$rl$group().size() > 0) handleAttemptToDeleteConnectedObject("Group");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        if (get$rl$nameIndex().size() > 0) handleAttemptToDeleteConnectedObject("NameIndex");
        if (castedState.futureSystem != null) handleAttemptToDeleteConnectedObject("FutureSystem");
        if (get$rl$supportConfiguration().size() > 0) handleAttemptToDeleteConnectedObject("SupportConfiguration");
        if (get$rl$groupConstant().size() > 0) handleAttemptToDeleteConnectedObject("GroupConstant");
        if (castedState.configuration != null) handleAttemptToDeleteConnectedObject("Configuration");
        if (castedState.schedulerSystem != null) handleAttemptToDeleteConnectedObject("SchedulerSystem");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$propertyData(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "PROPERTY_DATA"), state);
        castedState.fileSupport = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FILE_SUPPORT");
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
        castedState.futureSystem = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FUTURE_SYSTEM");
        castedState.configuration = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_CONFIGURATION");
        castedState.schedulerSystem = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_SCHEDULER_SYSTEM");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("user")) return getRelationSystemUsers().getInverseRelation();
        if (attrName.equals("profile")) return getRelationSystemProfiles().getInverseRelation();
        if (attrName.equals("dynamic")) return getRelationPersistentDynamicGroups();
        if (attrName.equals("group")) return getRelationPersistentGroups();
        if (attrName.equals("nameIndex")) return getRelationBennuNameIndexes().getInverseRelation();
        if (attrName.equals("supportConfiguration")) return getRelationBennuSupportConfiguration().getInverseRelation();
        if (attrName.equals("groupConstant")) return getRelationGroupConstantRoot();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("user", getRelationSystemUsers().getInverseRelation());
        get$$relationList("profile", getRelationSystemProfiles().getInverseRelation());
        get$$relationList("dynamic", getRelationPersistentDynamicGroups());
        get$$relationList("group", getRelationPersistentGroups());
        get$$relationList("nameIndex", getRelationBennuNameIndexes().getInverseRelation());
        get$$relationList("supportConfiguration", getRelationBennuSupportConfiguration().getInverseRelation());
        get$$relationList("groupConstant", getRelationGroupConstantRoot());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private com.google.gson.JsonElement propertyData;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupport;
        private pt.ist.fenixframework.DomainRoot root;
        private org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem;
        private org.fenixedu.bennu.portal.domain.PortalConfiguration configuration;
        private org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.propertyData = this.propertyData;
            newCasted.fileSupport = this.fileSupport;
            newCasted.root = this.root;
            newCasted.futureSystem = this.futureSystem;
            newCasted.configuration = this.configuration;
            newCasted.schedulerSystem = this.schedulerSystem;
            
        }
        
    }
    
}
