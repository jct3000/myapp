package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class MenuContainer_Base extends org.fenixedu.bennu.portal.domain.MenuItem {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> role$$configuration = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>() {
        @Override
        public org.fenixedu.bennu.portal.domain.PortalConfiguration getValue(org.fenixedu.bennu.portal.domain.MenuContainer o1) {
            return ((MenuContainer_Base.DO_State)o1.get$obj$state(false)).configuration;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.MenuContainer o1, org.fenixedu.bennu.portal.domain.PortalConfiguration o2) {
            ((MenuContainer_Base.DO_State)o1.get$obj$state(true)).configuration = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.PortalConfiguration.role$$menu;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> role$$configurationFromSubRoot = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>() {
        @Override
        public org.fenixedu.bennu.portal.domain.PortalConfiguration getValue(org.fenixedu.bennu.portal.domain.MenuContainer o1) {
            return ((MenuContainer_Base.DO_State)o1.get$obj$state(false)).configurationFromSubRoot;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.MenuContainer o1, org.fenixedu.bennu.portal.domain.PortalConfiguration o2) {
            ((MenuContainer_Base.DO_State)o1.get$obj$state(true)).configurationFromSubRoot = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.PortalConfiguration.role$$subRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> role$$child = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuItem> getSet(org.fenixedu.bennu.portal.domain.MenuContainer o1) {
            return ((MenuContainer_Base)o1).get$rl$child();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.MenuContainer> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuItem.role$$parent;
        }
        
    };
    
    private final static class ApplicationMenu {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>(role$$configuration, "ApplicationMenu");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationMenu() {
        return ApplicationMenu.relation;
    }
    
    static {
        ApplicationMenu.relation.setRelationName("org.fenixedu.bennu.portal.domain.MenuContainer.ApplicationMenu");
    }
    
    private final static class ApplicationSubRoots {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration>(role$$configurationFromSubRoot, "ApplicationSubRoots");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationSubRoots() {
        return ApplicationSubRoots.relation;
    }
    
    static {
        ApplicationSubRoots.relation.setRelationName("org.fenixedu.bennu.portal.domain.MenuContainer.ApplicationSubRoots");
    }
    
    private final static class MenuItemComposition {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem>(role$$child, "MenuItemComposition");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemComposition() {
        return MenuItemComposition.relation;
    }
    
    static {
        MenuItemComposition.relation.setRelationName("org.fenixedu.bennu.portal.domain.MenuContainer.MenuItemComposition");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> get$rl$child() {
        return get$$relationList("child", getRelationMenuItemComposition());
        
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
    protected  MenuContainer_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.portal.domain.PortalConfiguration getConfiguration() {
        return ((DO_State)this.get$obj$state(false)).configuration;
    }
    
    protected void setConfiguration(org.fenixedu.bennu.portal.domain.PortalConfiguration configuration) {
        getRelationApplicationMenu().add((org.fenixedu.bennu.portal.domain.MenuContainer)this, configuration);
    }
    
    private java.lang.Long get$oidConfiguration() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).configuration;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.portal.domain.PortalConfiguration getConfigurationFromSubRoot() {
        return ((DO_State)this.get$obj$state(false)).configurationFromSubRoot;
    }
    
    protected void setConfigurationFromSubRoot(org.fenixedu.bennu.portal.domain.PortalConfiguration configurationFromSubRoot) {
        getRelationApplicationSubRoots().add((org.fenixedu.bennu.portal.domain.MenuContainer)this, configurationFromSubRoot);
    }
    
    private java.lang.Long get$oidConfigurationFromSubRoot() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).configurationFromSubRoot;
        return (value == null) ? null : value.getOid();
    }
    
    protected void addChild(org.fenixedu.bennu.portal.domain.MenuItem child) {
        getRelationMenuItemComposition().add((org.fenixedu.bennu.portal.domain.MenuContainer)this, child);
    }
    
    protected void removeChild(org.fenixedu.bennu.portal.domain.MenuItem child) {
        getRelationMenuItemComposition().remove((org.fenixedu.bennu.portal.domain.MenuContainer)this, child);
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getChildSet() {
        return get$rl$child();
    }
    
    public void set$child(OJBFunctionalSetWrapper child) {
        get$rl$child().setFromOJB(this, "child", child);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getChild() {
        return getChildSet();
    }
    
    @Deprecated
    public int getChildCount() {
        return getChildSet().size();
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.configuration != null) handleAttemptToDeleteConnectedObject("Configuration");
        if (castedState.configurationFromSubRoot != null) handleAttemptToDeleteConnectedObject("ConfigurationFromSubRoot");
        if (get$rl$child().size() > 0) handleAttemptToDeleteConnectedObject("Child");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        castedState.configuration = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_CONFIGURATION");
        castedState.configurationFromSubRoot = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_CONFIGURATION_FROM_SUB_ROOT");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("child")) return getRelationMenuItemComposition();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("child", getRelationMenuItemComposition());
        
    }
    protected static class DO_State extends org.fenixedu.bennu.portal.domain.MenuItem.DO_State {
        private org.fenixedu.bennu.portal.domain.PortalConfiguration configuration;
        private org.fenixedu.bennu.portal.domain.PortalConfiguration configurationFromSubRoot;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.configuration = this.configuration;
            newCasted.configurationFromSubRoot = this.configurationFromSubRoot;
            
        }
        
    }
    
}
