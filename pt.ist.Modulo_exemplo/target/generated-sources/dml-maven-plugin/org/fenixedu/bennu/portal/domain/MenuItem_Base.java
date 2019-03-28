package org.fenixedu.bennu.portal.domain;


@SuppressWarnings("all")
public abstract class MenuItem_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationMenuItemGroup() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemSupport() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemComposition() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  MenuItem_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.Integer getOrd() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setOrd(java.lang.Integer ord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getTitle() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTitle(org.fenixedu.commons.i18n.LocalizedString title) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getDescription() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDescription(org.fenixedu.commons.i18n.LocalizedString description) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getPath() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setPath(java.lang.String path) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getFullPath() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFullPath(java.lang.String fullPath) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.Boolean getVisible() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setVisible(java.lang.Boolean visible) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getLayout() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setLayout(java.lang.String layout) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getIcon() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setIcon(java.lang.String icon) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getFaqUrl() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFaqUrl(java.lang.String faqUrl) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.portal.domain.SupportConfiguration getSupport() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSupport(org.fenixedu.bennu.portal.domain.SupportConfiguration support) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.portal.domain.MenuContainer getParent() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setParent(org.fenixedu.bennu.portal.domain.MenuContainer parent) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
