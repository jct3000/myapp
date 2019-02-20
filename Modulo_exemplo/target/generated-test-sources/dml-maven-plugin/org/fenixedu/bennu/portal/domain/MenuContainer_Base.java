package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class MenuContainer_Base extends org.fenixedu.bennu.portal.domain.MenuItem {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>() {
        public org.fenixedu.bennu.portal.domain.PortalConfiguration getValue(org.fenixedu.bennu.portal.domain.MenuContainer o1) {
            return ((MenuContainer_Base)o1).configuration.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.MenuContainer o1, org.fenixedu.bennu.portal.domain.PortalConfiguration o2) {
            ((MenuContainer_Base)o1).configuration.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.PortalConfiguration.role$$menu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> role$$configurationFromSubRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>() {
        public org.fenixedu.bennu.portal.domain.PortalConfiguration getValue(org.fenixedu.bennu.portal.domain.MenuContainer o1) {
            return ((MenuContainer_Base)o1).configurationFromSubRoot.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.MenuContainer o1, org.fenixedu.bennu.portal.domain.PortalConfiguration o2) {
            ((MenuContainer_Base)o1).configurationFromSubRoot.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.PortalConfiguration.role$$subRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> role$$child = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuItem> getSet(org.fenixedu.bennu.portal.domain.MenuContainer o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>) ((MenuContainer_Base) o1).child;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.MenuContainer> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuItem.role$$parent;
        }
        
    };
    
    private final static class ApplicationMenu {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>(role$$configuration, "ApplicationMenu", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationMenu() {
        return ApplicationMenu.relation;
    }
    
    private final static class ApplicationSubRoots {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>(role$$configurationFromSubRoot, "ApplicationSubRoots", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationSubRoots() {
        return ApplicationSubRoots.relation;
    }
    
    private final static class MenuItemComposition {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>(role$$child, "MenuItemComposition", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemComposition() {
        return MenuItemComposition.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuItem> keyFunction$$child = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuItem>() { public Comparable<?> getKey(org.fenixedu.bennu.portal.domain.MenuItem value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.portal.domain.PortalConfiguration> configuration;
    private OwnedVBox<org.fenixedu.bennu.portal.domain.PortalConfiguration> configurationFromSubRoot;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>> internal$child$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> child;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        configuration = OwnedVBox.makeNew(this, "configuration", allocateOnly, true);
        if (!allocateOnly) this.configuration.put(null);
        configurationFromSubRoot = OwnedVBox.makeNew(this, "configurationFromSubRoot", allocateOnly, true);
        if (!allocateOnly) this.configurationFromSubRoot.put(null);
        internal$child$collectionBox = OwnedVBox.makeNew(this, "internal$child$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuItem> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuItem>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> get() { return internal$getChild$collection(); }
            };
            child = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>((org.fenixedu.bennu.portal.domain.MenuContainer)this, getRelationMenuItemComposition(), mapGetter, keyFunction$$child);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>();
            this.internal$child$collectionBox.put(internalMap);
            child = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>((org.fenixedu.bennu.portal.domain.MenuContainer)this, getRelationMenuItemComposition(), internalMap, keyFunction$$child);
        }
        
    }
    
    // Constructors
    protected  MenuContainer_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.portal.domain.PortalConfiguration getConfiguration() {
        return this.configuration.get();
    }
    
    protected void setConfiguration(org.fenixedu.bennu.portal.domain.PortalConfiguration configuration) {
        getRelationApplicationMenu().add((org.fenixedu.bennu.portal.domain.MenuContainer)this, configuration);
    }
    
    protected org.fenixedu.bennu.portal.domain.PortalConfiguration getConfigurationFromSubRoot() {
        return this.configurationFromSubRoot.get();
    }
    
    protected void setConfigurationFromSubRoot(org.fenixedu.bennu.portal.domain.PortalConfiguration configurationFromSubRoot) {
        getRelationApplicationSubRoots().add((org.fenixedu.bennu.portal.domain.MenuContainer)this, configurationFromSubRoot);
    }
    
    protected void addChild(org.fenixedu.bennu.portal.domain.MenuItem child) {
        getRelationMenuItemComposition().add((org.fenixedu.bennu.portal.domain.MenuContainer)this, child);
    }
    
    protected void removeChild(org.fenixedu.bennu.portal.domain.MenuItem child) {
        getRelationMenuItemComposition().remove((org.fenixedu.bennu.portal.domain.MenuContainer)this, child);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> internal$getChild$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>)this.internal$child$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getChildSet() {
        return this.child;
    }
    
    
}
