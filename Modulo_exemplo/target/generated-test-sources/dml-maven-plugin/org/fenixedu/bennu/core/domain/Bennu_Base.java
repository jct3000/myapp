package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class Bennu_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.io.domain.FileSupport>() {
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).fileSupport.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((Bennu_Base)o1).fileSupport.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User> role$$user = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.User> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User>) ((Bennu_Base) o1).user;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.UserProfile> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile>) ((Bennu_Base) o1).profile;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$dynamic = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>) ((Bennu_Base) o1).dynamic;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$rootForDynamicGroup;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>) ((Bennu_Base) o1).group;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,pt.ist.fenixframework.DomainRoot> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,pt.ist.fenixframework.DomainRoot>() {
        public pt.ist.fenixframework.DomainRoot getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).root.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, pt.ist.fenixframework.DomainRoot o2) {
            ((Bennu_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return pt.ist.fenixframework.DomainRoot.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex> role$$nameIndex = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.NameIndex> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex>) ((Bennu_Base) o1).nameIndex;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.NameIndex.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.future.FutureSystem> role$$futureSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.future.FutureSystem>() {
        public org.fenixedu.bennu.scheduler.future.FutureSystem getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).futureSystem.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.scheduler.future.FutureSystem o2) {
            ((Bennu_Base)o1).futureSystem.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.FutureSystem.role$$bennu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration> role$$supportConfiguration = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.SupportConfiguration> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration>) ((Bennu_Base) o1).supportConfiguration;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.SupportConfiguration.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> role$$groupConstant = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.groups.GroupConstant> getSet(org.fenixedu.bennu.core.domain.Bennu o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>) ((Bennu_Base) o1).groupConstant;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.GroupConstant,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.GroupConstant.role$$rootForGroupConstant;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration>() {
        public org.fenixedu.bennu.portal.domain.PortalConfiguration getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).configuration.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.portal.domain.PortalConfiguration o2) {
            ((Bennu_Base)o1).configuration.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.core.domain.Bennu> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.PortalConfiguration.role$$root;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.domain.SchedulerSystem> role$$schedulerSystem = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.domain.SchedulerSystem>() {
        public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getValue(org.fenixedu.bennu.core.domain.Bennu o1) {
            return ((Bennu_Base)o1).schedulerSystem.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.Bennu o1, org.fenixedu.bennu.scheduler.domain.SchedulerSystem o2) {
            ((Bennu_Base)o1).schedulerSystem.put(o2);
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
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.User> keyFunction$$user = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.User>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.User value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemProfiles() {
        return org.fenixedu.bennu.core.domain.UserProfile.getRelationSystemProfiles();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.UserProfile> keyFunction$$profile = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.UserProfile>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.UserProfile value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class PersistentDynamicGroups {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$dynamic, "PersistentDynamicGroups", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroups() {
        return PersistentDynamicGroups.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> keyFunction$$dynamic = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class PersistentGroups {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$group, "PersistentGroups", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationPersistentGroups() {
        return PersistentGroups.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentGroup> keyFunction$$group = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.PersistentGroup value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainRoot,org.fenixedu.bennu.core.domain.Bennu> getRelationDomainRootBennu() {
        return pt.ist.fenixframework.DomainRoot.getRelationDomainRootBennu();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuNameIndexes() {
        return org.fenixedu.bennu.core.domain.NameIndex.getRelationBennuNameIndexes();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.NameIndex> keyFunction$$nameIndex = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.NameIndex>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.NameIndex value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationFutureSystemBennu() {
        return org.fenixedu.bennu.scheduler.future.FutureSystem.getRelationFutureSystemBennu();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuSupportConfiguration() {
        return org.fenixedu.bennu.portal.domain.SupportConfiguration.getRelationBennuSupportConfiguration();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.SupportConfiguration> keyFunction$$supportConfiguration = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.SupportConfiguration>() { public Comparable<?> getKey(org.fenixedu.bennu.portal.domain.SupportConfiguration value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class GroupConstantRoot {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>(role$$groupConstant, "GroupConstantRoot", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getRelationGroupConstantRoot() {
        return GroupConstantRoot.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.GroupConstant> keyFunction$$groupConstant = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.core.domain.groups.GroupConstant>() { public Comparable<?> getKey(org.fenixedu.bennu.core.domain.groups.GroupConstant value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BennuPortalConfiguration {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration>(role$$configuration, "BennuPortalConfiguration", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationBennuPortalConfiguration() {
        return BennuPortalConfiguration.relation;
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.domain.SchedulerSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationSchedulerSystemSchedulerSystem() {
        return org.fenixedu.bennu.scheduler.domain.SchedulerSystem.getRelationSchedulerSystemSchedulerSystem();
    }
    
    // Slots
    private OwnedVBox<com.google.gson.JsonElement> propertyData;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.io.domain.FileSupport> fileSupport;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User>> internal$user$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User> user;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile>> internal$profile$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile> profile;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>> internal$dynamic$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> dynamic;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>> internal$group$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup> group;
    private OwnedVBox<pt.ist.fenixframework.DomainRoot> root;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex>> internal$nameIndex$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex> nameIndex;
    private OwnedVBox<org.fenixedu.bennu.scheduler.future.FutureSystem> futureSystem;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.SupportConfiguration>> internal$supportConfiguration$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration> supportConfiguration;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.GroupConstant>> internal$groupConstant$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> groupConstant;
    private OwnedVBox<org.fenixedu.bennu.portal.domain.PortalConfiguration> configuration;
    private OwnedVBox<org.fenixedu.bennu.scheduler.domain.SchedulerSystem> schedulerSystem;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        propertyData = OwnedVBox.makeNew(this, "propertyData", allocateOnly, false);
        if (!allocateOnly) this.propertyData.put(null);
        fileSupport = OwnedVBox.makeNew(this, "fileSupport", allocateOnly, true);
        if (!allocateOnly) this.fileSupport.put(null);
        internal$user$collectionBox = OwnedVBox.makeNew(this, "internal$user$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.User> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.User>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User> get() { return internal$getUser$collection(); }
            };
            user = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationSystemUsers().getInverseRelation(), mapGetter, keyFunction$$user);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User>();
            this.internal$user$collectionBox.put(internalMap);
            user = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.User>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationSystemUsers().getInverseRelation(), internalMap, keyFunction$$user);
        }
        internal$profile$collectionBox = OwnedVBox.makeNew(this, "internal$profile$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.UserProfile> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.UserProfile>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile> get() { return internal$getProfile$collection(); }
            };
            profile = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationSystemProfiles().getInverseRelation(), mapGetter, keyFunction$$profile);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile>();
            this.internal$profile$collectionBox.put(internalMap);
            profile = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.UserProfile>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationSystemProfiles().getInverseRelation(), internalMap, keyFunction$$profile);
        }
        internal$dynamic$collectionBox = OwnedVBox.makeNew(this, "internal$dynamic$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> get() { return internal$getDynamic$collection(); }
            };
            dynamic = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationPersistentDynamicGroups(), mapGetter, keyFunction$$dynamic);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>();
            this.internal$dynamic$collectionBox.put(internalMap);
            dynamic = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationPersistentDynamicGroups(), internalMap, keyFunction$$dynamic);
        }
        internal$group$collectionBox = OwnedVBox.makeNew(this, "internal$group$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentGroup> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> get() { return internal$getGroup$collection(); }
            };
            group = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationPersistentGroups(), mapGetter, keyFunction$$group);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>();
            this.internal$group$collectionBox.put(internalMap);
            group = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentGroup>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationPersistentGroups(), internalMap, keyFunction$$group);
        }
        root = OwnedVBox.makeNew(this, "root", allocateOnly, true);
        if (!allocateOnly) this.root.put(null);
        internal$nameIndex$collectionBox = OwnedVBox.makeNew(this, "internal$nameIndex$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.NameIndex> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.NameIndex>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex> get() { return internal$getNameIndex$collection(); }
            };
            nameIndex = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationBennuNameIndexes().getInverseRelation(), mapGetter, keyFunction$$nameIndex);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex>();
            this.internal$nameIndex$collectionBox.put(internalMap);
            nameIndex = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationBennuNameIndexes().getInverseRelation(), internalMap, keyFunction$$nameIndex);
        }
        futureSystem = OwnedVBox.makeNew(this, "futureSystem", allocateOnly, true);
        if (!allocateOnly) this.futureSystem.put(null);
        internal$supportConfiguration$collectionBox = OwnedVBox.makeNew(this, "internal$supportConfiguration$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.SupportConfiguration> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.SupportConfiguration>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.SupportConfiguration> get() { return internal$getSupportConfiguration$collection(); }
            };
            supportConfiguration = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationBennuSupportConfiguration().getInverseRelation(), mapGetter, keyFunction$$supportConfiguration);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.SupportConfiguration> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.SupportConfiguration>();
            this.internal$supportConfiguration$collectionBox.put(internalMap);
            supportConfiguration = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationBennuSupportConfiguration().getInverseRelation(), internalMap, keyFunction$$supportConfiguration);
        }
        internal$groupConstant$collectionBox = OwnedVBox.makeNew(this, "internal$groupConstant$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.GroupConstant> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.core.domain.groups.GroupConstant>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.GroupConstant> get() { return internal$getGroupConstant$collection(); }
            };
            groupConstant = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationGroupConstantRoot(), mapGetter, keyFunction$$groupConstant);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.GroupConstant> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.GroupConstant>();
            this.internal$groupConstant$collectionBox.put(internalMap);
            groupConstant = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant>((org.fenixedu.bennu.core.domain.Bennu)this, getRelationGroupConstantRoot(), internalMap, keyFunction$$groupConstant);
        }
        configuration = OwnedVBox.makeNew(this, "configuration", allocateOnly, true);
        if (!allocateOnly) this.configuration.put(null);
        schedulerSystem = OwnedVBox.makeNew(this, "schedulerSystem", allocateOnly, true);
        if (!allocateOnly) this.schedulerSystem.put(null);
        
    }
    
    // Constructors
    protected  Bennu_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected com.google.gson.JsonElement getPropertyData() {
        return this.propertyData.get();
    }
    
    protected void setPropertyData(com.google.gson.JsonElement propertyData) {
        this.propertyData.put(propertyData);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return this.fileSupport.get();
    }
    
    public void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationBennuFileSupport().add(fileSupport, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void addUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationSystemUsers().add(user, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void removeUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationSystemUsers().remove(user, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User> internal$getUser$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.User>)this.internal$user$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.User> getUserSet() {
        return this.user;
    }
    
    protected void addProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationSystemProfiles().add(profile, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void removeProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationSystemProfiles().remove(profile, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile> internal$getProfile$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.UserProfile>)this.internal$profile$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfileSet() {
        return this.profile;
    }
    
    protected void addDynamic(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamic) {
        getRelationPersistentDynamicGroups().add((org.fenixedu.bennu.core.domain.Bennu)this, dynamic);
    }
    
    protected void removeDynamic(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup dynamic) {
        getRelationPersistentDynamicGroups().remove((org.fenixedu.bennu.core.domain.Bennu)this, dynamic);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> internal$getDynamic$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>)this.internal$dynamic$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getDynamicSet() {
        return this.dynamic;
    }
    
    protected void addGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationPersistentGroups().add((org.fenixedu.bennu.core.domain.Bennu)this, group);
    }
    
    protected void removeGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationPersistentGroups().remove((org.fenixedu.bennu.core.domain.Bennu)this, group);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup> internal$getGroup$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.PersistentGroup>)this.internal$group$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentGroup> getGroupSet() {
        return this.group;
    }
    
    protected pt.ist.fenixframework.DomainRoot getRoot() {
        return this.root.get();
    }
    
    protected void setRoot(pt.ist.fenixframework.DomainRoot root) {
        getRelationDomainRootBennu().add(root, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void addNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationBennuNameIndexes().add(nameIndex, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    protected void removeNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        getRelationBennuNameIndexes().remove(nameIndex, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex> internal$getNameIndex$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.NameIndex>)this.internal$nameIndex$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndexSet() {
        return this.nameIndex;
    }
    
    public org.fenixedu.bennu.scheduler.future.FutureSystem getFutureSystem() {
        return this.futureSystem.get();
    }
    
    public void setFutureSystem(org.fenixedu.bennu.scheduler.future.FutureSystem futureSystem) {
        getRelationFutureSystemBennu().add(futureSystem, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public void addSupportConfiguration(org.fenixedu.bennu.portal.domain.SupportConfiguration supportConfiguration) {
        getRelationBennuSupportConfiguration().add(supportConfiguration, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public void removeSupportConfiguration(org.fenixedu.bennu.portal.domain.SupportConfiguration supportConfiguration) {
        getRelationBennuSupportConfiguration().remove(supportConfiguration, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.SupportConfiguration> internal$getSupportConfiguration$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.SupportConfiguration>)this.internal$supportConfiguration$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.SupportConfiguration> getSupportConfigurationSet() {
        return this.supportConfiguration;
    }
    
    protected void addGroupConstant(org.fenixedu.bennu.core.domain.groups.GroupConstant groupConstant) {
        getRelationGroupConstantRoot().add((org.fenixedu.bennu.core.domain.Bennu)this, groupConstant);
    }
    
    protected void removeGroupConstant(org.fenixedu.bennu.core.domain.groups.GroupConstant groupConstant) {
        getRelationGroupConstantRoot().remove((org.fenixedu.bennu.core.domain.Bennu)this, groupConstant);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.GroupConstant> internal$getGroupConstant$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.core.domain.groups.GroupConstant>)this.internal$groupConstant$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.groups.GroupConstant> getGroupConstantSet() {
        return this.groupConstant;
    }
    
    public org.fenixedu.bennu.portal.domain.PortalConfiguration getConfiguration() {
        return this.configuration.get();
    }
    
    public void setConfiguration(org.fenixedu.bennu.portal.domain.PortalConfiguration configuration) {
        getRelationBennuPortalConfiguration().add((org.fenixedu.bennu.core.domain.Bennu)this, configuration);
    }
    
    public org.fenixedu.bennu.scheduler.domain.SchedulerSystem getSchedulerSystem() {
        return this.schedulerSystem.get();
    }
    
    public void setSchedulerSystem(org.fenixedu.bennu.scheduler.domain.SchedulerSystem schedulerSystem) {
        getRelationSchedulerSystemSchedulerSystem().add(schedulerSystem, (org.fenixedu.bennu.core.domain.Bennu)this);
    }
    
    
}
