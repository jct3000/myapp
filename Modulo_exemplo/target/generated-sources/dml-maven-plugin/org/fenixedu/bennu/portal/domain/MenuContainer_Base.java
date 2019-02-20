package org.fenixedu.bennu.portal.domain;


@SuppressWarnings("all")
public abstract class MenuContainer_Base extends org.fenixedu.bennu.portal.domain.MenuItem {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationMenu() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationSubRoots() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemComposition() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  MenuContainer_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.portal.domain.PortalConfiguration getConfiguration() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setConfiguration(org.fenixedu.bennu.portal.domain.PortalConfiguration configuration) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.portal.domain.PortalConfiguration getConfigurationFromSubRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setConfigurationFromSubRoot(org.fenixedu.bennu.portal.domain.PortalConfiguration configurationFromSubRoot) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addChild(org.fenixedu.bennu.portal.domain.MenuItem child) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeChild(org.fenixedu.bennu.portal.domain.MenuItem child) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getChildSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
