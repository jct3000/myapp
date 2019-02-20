package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PortalConfiguration_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> role$$menu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>() {
        public org.fenixedu.bennu.portal.domain.MenuContainer getValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1) {
            return ((PortalConfiguration_Base)o1).menu.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1, org.fenixedu.bennu.portal.domain.MenuContainer o2) {
            ((PortalConfiguration_Base)o1).menu.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuContainer.role$$configuration;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> role$$subRoot = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuContainer> getSet(org.fenixedu.bennu.portal.domain.PortalConfiguration o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>) ((PortalConfiguration_Base) o1).subRoot;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuContainer.role$$configurationFromSubRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.core.domain.Bennu> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1) {
            return ((PortalConfiguration_Base)o1).root.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((PortalConfiguration_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$configuration;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationMenu() {
        return org.fenixedu.bennu.portal.domain.MenuContainer.getRelationApplicationMenu();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationApplicationSubRoots() {
        return org.fenixedu.bennu.portal.domain.MenuContainer.getRelationApplicationSubRoots();
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuContainer> keyFunction$$subRoot = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuContainer>() { public Comparable<?> getKey(org.fenixedu.bennu.portal.domain.MenuContainer value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationBennuPortalConfiguration() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationBennuPortalConfiguration();
    }
    
    // Slots
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> applicationTitle;
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> htmlTitle;
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> applicationSubTitle;
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> applicationCopyright;
    private OwnedVBox<java.lang.String> theme;
    private OwnedVBox<java.lang.String> supportEmailAddress;
    private OwnedVBox<java.lang.String> systemEmailAddress;
    private OwnedVBox<byte[]> logo;
    private OwnedVBox<java.lang.String> logoChecksum;
    private OwnedVBox<java.lang.String> logoType;
    private OwnedVBox<java.lang.String> logoLinkUrl;
    private OwnedVBox<java.lang.String> logoTooltip;
    private OwnedVBox<byte[]> favicon;
    private OwnedVBox<java.lang.String> faviconType;
    private OwnedVBox<java.lang.String> documentationBaseUrl;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.portal.domain.MenuContainer> menu;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuContainer>> internal$subRoot$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> subRoot;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> root;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        applicationTitle = OwnedVBox.makeNew(this, "applicationTitle", allocateOnly, false);
        if (!allocateOnly) this.applicationTitle.put(null);
        htmlTitle = OwnedVBox.makeNew(this, "htmlTitle", allocateOnly, false);
        if (!allocateOnly) this.htmlTitle.put(null);
        applicationSubTitle = OwnedVBox.makeNew(this, "applicationSubTitle", allocateOnly, false);
        if (!allocateOnly) this.applicationSubTitle.put(null);
        applicationCopyright = OwnedVBox.makeNew(this, "applicationCopyright", allocateOnly, false);
        if (!allocateOnly) this.applicationCopyright.put(null);
        theme = OwnedVBox.makeNew(this, "theme", allocateOnly, false);
        if (!allocateOnly) this.theme.put(null);
        supportEmailAddress = OwnedVBox.makeNew(this, "supportEmailAddress", allocateOnly, false);
        if (!allocateOnly) this.supportEmailAddress.put(null);
        systemEmailAddress = OwnedVBox.makeNew(this, "systemEmailAddress", allocateOnly, false);
        if (!allocateOnly) this.systemEmailAddress.put(null);
        logo = OwnedVBox.makeNew(this, "logo", allocateOnly, false);
        if (!allocateOnly) this.logo.put(null);
        logoChecksum = OwnedVBox.makeNew(this, "logoChecksum", allocateOnly, false);
        if (!allocateOnly) this.logoChecksum.put(null);
        logoType = OwnedVBox.makeNew(this, "logoType", allocateOnly, false);
        if (!allocateOnly) this.logoType.put(null);
        logoLinkUrl = OwnedVBox.makeNew(this, "logoLinkUrl", allocateOnly, false);
        if (!allocateOnly) this.logoLinkUrl.put(null);
        logoTooltip = OwnedVBox.makeNew(this, "logoTooltip", allocateOnly, false);
        if (!allocateOnly) this.logoTooltip.put(null);
        favicon = OwnedVBox.makeNew(this, "favicon", allocateOnly, false);
        if (!allocateOnly) this.favicon.put(null);
        faviconType = OwnedVBox.makeNew(this, "faviconType", allocateOnly, false);
        if (!allocateOnly) this.faviconType.put(null);
        documentationBaseUrl = OwnedVBox.makeNew(this, "documentationBaseUrl", allocateOnly, false);
        if (!allocateOnly) this.documentationBaseUrl.put(null);
        menu = OwnedVBox.makeNew(this, "menu", allocateOnly, true);
        if (!allocateOnly) this.menu.put(null);
        internal$subRoot$collectionBox = OwnedVBox.makeNew(this, "internal$subRoot$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuContainer> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuContainer>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuContainer> get() { return internal$getSubRoot$collection(); }
            };
            subRoot = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>((org.fenixedu.bennu.portal.domain.PortalConfiguration)this, getRelationApplicationSubRoots().getInverseRelation(), mapGetter, keyFunction$$subRoot);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuContainer> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuContainer>();
            this.internal$subRoot$collectionBox.put(internalMap);
            subRoot = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>((org.fenixedu.bennu.portal.domain.PortalConfiguration)this, getRelationApplicationSubRoots().getInverseRelation(), internalMap, keyFunction$$subRoot);
        }
        root = OwnedVBox.makeNew(this, "root", allocateOnly, true);
        if (!allocateOnly) this.root.put(null);
        
    }
    
    // Constructors
    protected  PortalConfiguration_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationTitle() {
        return this.applicationTitle.get();
    }
    
    public void setApplicationTitle(org.fenixedu.commons.i18n.LocalizedString applicationTitle) {
        this.applicationTitle.put(applicationTitle);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getHtmlTitle() {
        return this.htmlTitle.get();
    }
    
    public void setHtmlTitle(org.fenixedu.commons.i18n.LocalizedString htmlTitle) {
        this.htmlTitle.put(htmlTitle);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationSubTitle() {
        return this.applicationSubTitle.get();
    }
    
    public void setApplicationSubTitle(org.fenixedu.commons.i18n.LocalizedString applicationSubTitle) {
        this.applicationSubTitle.put(applicationSubTitle);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationCopyright() {
        return this.applicationCopyright.get();
    }
    
    public void setApplicationCopyright(org.fenixedu.commons.i18n.LocalizedString applicationCopyright) {
        this.applicationCopyright.put(applicationCopyright);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getTheme() {
        return this.theme.get();
    }
    
    public void setTheme(java.lang.String theme) {
        this.theme.put(theme);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getSupportEmailAddress() {
        return this.supportEmailAddress.get();
    }
    
    public void setSupportEmailAddress(java.lang.String supportEmailAddress) {
        this.supportEmailAddress.put(supportEmailAddress);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getSystemEmailAddress() {
        return this.systemEmailAddress.get();
    }
    
    public void setSystemEmailAddress(java.lang.String systemEmailAddress) {
        this.systemEmailAddress.put(systemEmailAddress);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public byte[] getLogo() {
        return this.logo.get();
    }
    
    public void setLogo(byte[] logo) {
        this.logo.put(logo);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getLogoChecksum() {
        return this.logoChecksum.get();
    }
    
    protected void setLogoChecksum(java.lang.String logoChecksum) {
        this.logoChecksum.put(logoChecksum);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getLogoType() {
        return this.logoType.get();
    }
    
    public void setLogoType(java.lang.String logoType) {
        this.logoType.put(logoType);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getLogoLinkUrl() {
        return this.logoLinkUrl.get();
    }
    
    public void setLogoLinkUrl(java.lang.String logoLinkUrl) {
        this.logoLinkUrl.put(logoLinkUrl);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getLogoTooltip() {
        return this.logoTooltip.get();
    }
    
    public void setLogoTooltip(java.lang.String logoTooltip) {
        this.logoTooltip.put(logoTooltip);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public byte[] getFavicon() {
        return this.favicon.get();
    }
    
    public void setFavicon(byte[] favicon) {
        this.favicon.put(favicon);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getFaviconType() {
        return this.faviconType.get();
    }
    
    public void setFaviconType(java.lang.String faviconType) {
        this.faviconType.put(faviconType);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getDocumentationBaseUrl() {
        return this.documentationBaseUrl.get();
    }
    
    public void setDocumentationBaseUrl(java.lang.String documentationBaseUrl) {
        this.documentationBaseUrl.put(documentationBaseUrl);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.portal.domain.MenuContainer getMenu() {
        return this.menu.get();
    }
    
    protected void setMenu(org.fenixedu.bennu.portal.domain.MenuContainer menu) {
        getRelationApplicationMenu().add(menu, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    protected void addSubRoot(org.fenixedu.bennu.portal.domain.MenuContainer subRoot) {
        getRelationApplicationSubRoots().add(subRoot, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    protected void removeSubRoot(org.fenixedu.bennu.portal.domain.MenuContainer subRoot) {
        getRelationApplicationSubRoots().remove(subRoot, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuContainer> internal$getSubRoot$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuContainer>)this.internal$subRoot$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuContainer> getSubRootSet() {
        return this.subRoot;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        return this.root.get();
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        getRelationBennuPortalConfiguration().add(root, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    
}
