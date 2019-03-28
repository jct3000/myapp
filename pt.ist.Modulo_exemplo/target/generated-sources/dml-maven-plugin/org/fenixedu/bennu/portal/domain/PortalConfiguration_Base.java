package org.fenixedu.bennu.portal.domain;


@SuppressWarnings("all")
public abstract class PortalConfiguration_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationMenu() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationSubRoots() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationBennuPortalConfiguration() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PortalConfiguration_Base() {
        super();
    }
    
    // Getters and Setters
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationTitle() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setApplicationTitle(org.fenixedu.commons.i18n.LocalizedString applicationTitle) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getHtmlTitle() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setHtmlTitle(org.fenixedu.commons.i18n.LocalizedString htmlTitle) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationSubTitle() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setApplicationSubTitle(org.fenixedu.commons.i18n.LocalizedString applicationSubTitle) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationCopyright() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setApplicationCopyright(org.fenixedu.commons.i18n.LocalizedString applicationCopyright) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getTheme() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTheme(java.lang.String theme) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getSupportEmailAddress() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSupportEmailAddress(java.lang.String supportEmailAddress) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getSystemEmailAddress() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSystemEmailAddress(java.lang.String systemEmailAddress) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public byte[] getLogo() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setLogo(byte[] logo) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getLogoChecksum() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setLogoChecksum(java.lang.String logoChecksum) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getLogoType() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setLogoType(java.lang.String logoType) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getLogoLinkUrl() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setLogoLinkUrl(java.lang.String logoLinkUrl) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getLogoTooltip() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setLogoTooltip(java.lang.String logoTooltip) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public byte[] getFavicon() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFavicon(byte[] favicon) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getFaviconType() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setFaviconType(java.lang.String faviconType) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getDocumentationBaseUrl() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDocumentationBaseUrl(java.lang.String documentationBaseUrl) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.portal.domain.MenuContainer getMenu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setMenu(org.fenixedu.bennu.portal.domain.MenuContainer menu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addSubRoot(org.fenixedu.bennu.portal.domain.MenuContainer subRoot) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeSubRoot(org.fenixedu.bennu.portal.domain.MenuContainer subRoot) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.portal.domain.MenuContainer> getSubRootSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
