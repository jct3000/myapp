package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PortalConfiguration_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> role$$menu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>() {
        @Override
        public org.fenixedu.bennu.portal.domain.MenuContainer getValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1) {
            return ((PortalConfiguration_Base.DO_State)o1.get$obj$state(false)).menu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1, org.fenixedu.bennu.portal.domain.MenuContainer o2) {
            ((PortalConfiguration_Base.DO_State)o1.get$obj$state(true)).menu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuContainer.role$$configuration;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> role$$subRoot = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuContainer> getSet(org.fenixedu.bennu.portal.domain.PortalConfiguration o1) {
            return ((PortalConfiguration_Base)o1).get$rl$subRoot();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.PortalConfiguration> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuContainer.role$$configurationFromSubRoot;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.core.domain.Bennu> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1) {
            return ((PortalConfiguration_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.PortalConfiguration o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((PortalConfiguration_Base.DO_State)o1.get$obj$state(true)).root = o2;
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
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.PortalConfiguration> getRelationBennuPortalConfiguration() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationBennuPortalConfiguration();
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.portal.domain.PortalConfiguration,org.fenixedu.bennu.portal.domain.MenuContainer> get$rl$subRoot() {
        return get$$relationList("subRoot", getRelationApplicationSubRoots().getInverseRelation());
        
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
    protected  PortalConfiguration_Base() {
        super();
    }
    
    // Getters and Setters
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationTitle() {
        return ((DO_State)this.get$obj$state(false)).applicationTitle;
    }
    
    public void setApplicationTitle(org.fenixedu.commons.i18n.LocalizedString applicationTitle) {
        ((DO_State)this.get$obj$state(true)).applicationTitle = applicationTitle;
    }
    
    private java.lang.String get$applicationTitle() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).applicationTitle;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$applicationTitle(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).applicationTitle = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getHtmlTitle() {
        return ((DO_State)this.get$obj$state(false)).htmlTitle;
    }
    
    public void setHtmlTitle(org.fenixedu.commons.i18n.LocalizedString htmlTitle) {
        ((DO_State)this.get$obj$state(true)).htmlTitle = htmlTitle;
    }
    
    private java.lang.String get$htmlTitle() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).htmlTitle;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$htmlTitle(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).htmlTitle = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationSubTitle() {
        return ((DO_State)this.get$obj$state(false)).applicationSubTitle;
    }
    
    public void setApplicationSubTitle(org.fenixedu.commons.i18n.LocalizedString applicationSubTitle) {
        ((DO_State)this.get$obj$state(true)).applicationSubTitle = applicationSubTitle;
    }
    
    private java.lang.String get$applicationSubTitle() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).applicationSubTitle;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$applicationSubTitle(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).applicationSubTitle = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getApplicationCopyright() {
        return ((DO_State)this.get$obj$state(false)).applicationCopyright;
    }
    
    public void setApplicationCopyright(org.fenixedu.commons.i18n.LocalizedString applicationCopyright) {
        ((DO_State)this.get$obj$state(true)).applicationCopyright = applicationCopyright;
    }
    
    private java.lang.String get$applicationCopyright() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).applicationCopyright;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$applicationCopyright(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).applicationCopyright = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    public java.lang.String getTheme() {
        return ((DO_State)this.get$obj$state(false)).theme;
    }
    
    public void setTheme(java.lang.String theme) {
        ((DO_State)this.get$obj$state(true)).theme = theme;
    }
    
    private java.lang.String get$theme() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).theme;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$theme(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).theme = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getSupportEmailAddress() {
        return ((DO_State)this.get$obj$state(false)).supportEmailAddress;
    }
    
    public void setSupportEmailAddress(java.lang.String supportEmailAddress) {
        ((DO_State)this.get$obj$state(true)).supportEmailAddress = supportEmailAddress;
    }
    
    private java.lang.String get$supportEmailAddress() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).supportEmailAddress;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$supportEmailAddress(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).supportEmailAddress = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getSystemEmailAddress() {
        return ((DO_State)this.get$obj$state(false)).systemEmailAddress;
    }
    
    public void setSystemEmailAddress(java.lang.String systemEmailAddress) {
        ((DO_State)this.get$obj$state(true)).systemEmailAddress = systemEmailAddress;
    }
    
    private java.lang.String get$systemEmailAddress() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).systemEmailAddress;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$systemEmailAddress(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).systemEmailAddress = (java.lang.String)((value == null) ? null : value);
    }
    
    public byte[] getLogo() {
        return ((DO_State)this.get$obj$state(false)).logo;
    }
    
    public void setLogo(byte[] logo) {
        ((DO_State)this.get$obj$state(true)).logo = logo;
    }
    
    private java.lang.Object get$logo() {
        byte[] value = ((DO_State)this.get$obj$state(false)).logo;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForbytearray(value);
    }
    
    private final void set$logo(byte[] value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).logo = (byte[])((value == null) ? null : value);
    }
    
    protected java.lang.String getLogoChecksum() {
        return ((DO_State)this.get$obj$state(false)).logoChecksum;
    }
    
    protected void setLogoChecksum(java.lang.String logoChecksum) {
        ((DO_State)this.get$obj$state(true)).logoChecksum = logoChecksum;
    }
    
    private java.lang.String get$logoChecksum() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).logoChecksum;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$logoChecksum(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).logoChecksum = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getLogoType() {
        return ((DO_State)this.get$obj$state(false)).logoType;
    }
    
    public void setLogoType(java.lang.String logoType) {
        ((DO_State)this.get$obj$state(true)).logoType = logoType;
    }
    
    private java.lang.String get$logoType() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).logoType;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$logoType(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).logoType = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getLogoLinkUrl() {
        return ((DO_State)this.get$obj$state(false)).logoLinkUrl;
    }
    
    public void setLogoLinkUrl(java.lang.String logoLinkUrl) {
        ((DO_State)this.get$obj$state(true)).logoLinkUrl = logoLinkUrl;
    }
    
    private java.lang.String get$logoLinkUrl() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).logoLinkUrl;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$logoLinkUrl(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).logoLinkUrl = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getLogoTooltip() {
        return ((DO_State)this.get$obj$state(false)).logoTooltip;
    }
    
    public void setLogoTooltip(java.lang.String logoTooltip) {
        ((DO_State)this.get$obj$state(true)).logoTooltip = logoTooltip;
    }
    
    private java.lang.String get$logoTooltip() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).logoTooltip;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$logoTooltip(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).logoTooltip = (java.lang.String)((value == null) ? null : value);
    }
    
    public byte[] getFavicon() {
        return ((DO_State)this.get$obj$state(false)).favicon;
    }
    
    public void setFavicon(byte[] favicon) {
        ((DO_State)this.get$obj$state(true)).favicon = favicon;
    }
    
    private java.lang.Object get$favicon() {
        byte[] value = ((DO_State)this.get$obj$state(false)).favicon;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForbytearray(value);
    }
    
    private final void set$favicon(byte[] value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).favicon = (byte[])((value == null) ? null : value);
    }
    
    public java.lang.String getFaviconType() {
        return ((DO_State)this.get$obj$state(false)).faviconType;
    }
    
    public void setFaviconType(java.lang.String faviconType) {
        ((DO_State)this.get$obj$state(true)).faviconType = faviconType;
    }
    
    private java.lang.String get$faviconType() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).faviconType;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$faviconType(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).faviconType = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getDocumentationBaseUrl() {
        return ((DO_State)this.get$obj$state(false)).documentationBaseUrl;
    }
    
    public void setDocumentationBaseUrl(java.lang.String documentationBaseUrl) {
        ((DO_State)this.get$obj$state(true)).documentationBaseUrl = documentationBaseUrl;
    }
    
    private java.lang.String get$documentationBaseUrl() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).documentationBaseUrl;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$documentationBaseUrl(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).documentationBaseUrl = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.portal.domain.MenuContainer getMenu() {
        return ((DO_State)this.get$obj$state(false)).menu;
    }
    
    protected void setMenu(org.fenixedu.bennu.portal.domain.MenuContainer menu) {
        getRelationApplicationMenu().add(menu, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    private java.lang.Long get$oidMenu() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).menu;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfMenu() {
        if (getMenu() == null) return false;
        return true;
    }
    
    protected void addSubRoot(org.fenixedu.bennu.portal.domain.MenuContainer subRoot) {
        getRelationApplicationSubRoots().add(subRoot, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    protected void removeSubRoot(org.fenixedu.bennu.portal.domain.MenuContainer subRoot) {
        getRelationApplicationSubRoots().remove(subRoot, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuContainer> getSubRootSet() {
        return get$rl$subRoot();
    }
    
    public void set$subRoot(OJBFunctionalSetWrapper subRoot) {
        get$rl$subRoot().setFromOJB(this, "subRoot", subRoot);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuContainer> getSubRoot() {
        return getSubRootSet();
    }
    
    @Deprecated
    public int getSubRootCount() {
        return getSubRootSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        getRelationBennuPortalConfiguration().add(root, (org.fenixedu.bennu.portal.domain.PortalConfiguration)this);
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
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.menu != null) handleAttemptToDeleteConnectedObject("Menu");
        if (get$rl$subRoot().size() > 0) handleAttemptToDeleteConnectedObject("SubRoot");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$applicationTitle(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "APPLICATION_TITLE"), state);
        set$htmlTitle(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "HTML_TITLE"), state);
        set$applicationSubTitle(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "APPLICATION_SUB_TITLE"), state);
        set$applicationCopyright(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "APPLICATION_COPYRIGHT"), state);
        set$theme(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "THEME"), state);
        set$supportEmailAddress(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "SUPPORT_EMAIL_ADDRESS"), state);
        set$systemEmailAddress(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "SYSTEM_EMAIL_ADDRESS"), state);
        set$logo(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readbytearray(rs, "LOGO"), state);
        set$logoChecksum(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "LOGO_CHECKSUM"), state);
        set$logoType(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "LOGO_TYPE"), state);
        set$logoLinkUrl(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "LOGO_LINK_URL"), state);
        set$logoTooltip(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "LOGO_TOOLTIP"), state);
        set$favicon(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readbytearray(rs, "FAVICON"), state);
        set$faviconType(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FAVICON_TYPE"), state);
        set$documentationBaseUrl(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "DOCUMENTATION_BASE_URL"), state);
        castedState.menu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_MENU");
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "applicationTitle", getApplicationTitle());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "htmlTitle", getHtmlTitle());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "applicationSubTitle", getApplicationSubTitle());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "applicationCopyright", getApplicationCopyright());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "theme", getTheme());
        return true;
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("subRoot")) return getRelationApplicationSubRoots().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("subRoot", getRelationApplicationSubRoots().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.fenixedu.commons.i18n.LocalizedString applicationTitle;
        private org.fenixedu.commons.i18n.LocalizedString htmlTitle;
        private org.fenixedu.commons.i18n.LocalizedString applicationSubTitle;
        private org.fenixedu.commons.i18n.LocalizedString applicationCopyright;
        private java.lang.String theme;
        private java.lang.String supportEmailAddress;
        private java.lang.String systemEmailAddress;
        private byte[] logo;
        private java.lang.String logoChecksum;
        private java.lang.String logoType;
        private java.lang.String logoLinkUrl;
        private java.lang.String logoTooltip;
        private byte[] favicon;
        private java.lang.String faviconType;
        private java.lang.String documentationBaseUrl;
        private org.fenixedu.bennu.portal.domain.MenuContainer menu;
        private org.fenixedu.bennu.core.domain.Bennu root;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.applicationTitle = this.applicationTitle;
            newCasted.htmlTitle = this.htmlTitle;
            newCasted.applicationSubTitle = this.applicationSubTitle;
            newCasted.applicationCopyright = this.applicationCopyright;
            newCasted.theme = this.theme;
            newCasted.supportEmailAddress = this.supportEmailAddress;
            newCasted.systemEmailAddress = this.systemEmailAddress;
            newCasted.logo = this.logo;
            newCasted.logoChecksum = this.logoChecksum;
            newCasted.logoType = this.logoType;
            newCasted.logoLinkUrl = this.logoLinkUrl;
            newCasted.logoTooltip = this.logoTooltip;
            newCasted.favicon = this.favicon;
            newCasted.faviconType = this.faviconType;
            newCasted.documentationBaseUrl = this.documentationBaseUrl;
            newCasted.menu = this.menu;
            newCasted.root = this.root;
            
        }
        
    }
    
}
