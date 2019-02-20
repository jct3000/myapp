package org.fenixedu.bennu.portal.domain;


@SuppressWarnings("all")
public abstract class SupportConfiguration_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemSupport() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuSupportConfiguration() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  SupportConfiguration_Base() {
        super();
    }
    
    // Getters and Setters
    
    public org.fenixedu.commons.i18n.LocalizedString getTitle() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTitle(org.fenixedu.commons.i18n.LocalizedString title) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getEmailAddress() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setEmailAddress(java.lang.String emailAddress) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public void addMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItemSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
