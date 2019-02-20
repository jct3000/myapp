package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class MenuItem_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.portal.domain.MenuItem o1) {
            return ((MenuItem_Base.DO_State)o1.get$obj$state(false)).group;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.MenuItem o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((MenuItem_Base.DO_State)o1.get$obj$state(true)).group = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$menuItem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.SupportConfiguration> role$$support = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.SupportConfiguration>() {
        @Override
        public org.fenixedu.bennu.portal.domain.SupportConfiguration getValue(org.fenixedu.bennu.portal.domain.MenuItem o1) {
            return ((MenuItem_Base.DO_State)o1.get$obj$state(false)).support;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.MenuItem o1, org.fenixedu.bennu.portal.domain.SupportConfiguration o2) {
            ((MenuItem_Base.DO_State)o1.get$obj$state(true)).support = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.SupportConfiguration.role$$menuItem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.MenuContainer> role$$parent = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.MenuContainer>() {
        @Override
        public org.fenixedu.bennu.portal.domain.MenuContainer getValue(org.fenixedu.bennu.portal.domain.MenuItem o1) {
            return ((MenuItem_Base.DO_State)o1.get$obj$state(false)).parent;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.MenuItem o1, org.fenixedu.bennu.portal.domain.MenuContainer o2) {
            ((MenuItem_Base.DO_State)o1.get$obj$state(true)).parent = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuContainer.role$$child;
        }
        
    };
    
    private final static class MenuItemGroup {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$group, "MenuItemGroup");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationMenuItemGroup() {
        return MenuItemGroup.relation;
    }
    
    static {
        MenuItemGroup.relation.setRelationName("org.fenixedu.bennu.portal.domain.MenuItem.MenuItemGroup");
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemSupport() {
        return org.fenixedu.bennu.portal.domain.SupportConfiguration.getRelationMenuItemSupport();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemComposition() {
        return org.fenixedu.bennu.portal.domain.MenuContainer.getRelationMenuItemComposition();
    }
    
    // Slots
    
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  MenuItem_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.Integer getOrd() {
        return ((DO_State)this.get$obj$state(false)).ord;
    }
    
    public void setOrd(java.lang.Integer ord) {
        ((DO_State)this.get$obj$state(true)).ord = ord;
    }
    
    private java.lang.Integer get$ord() {
        java.lang.Integer value = ((DO_State)this.get$obj$state(false)).ord;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForInteger(value);
    }
    
    private final void set$ord(java.lang.Integer value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).ord = (java.lang.Integer)((value == null) ? null : value);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getTitle() {
        return ((DO_State)this.get$obj$state(false)).title;
    }
    
    public void setTitle(org.fenixedu.commons.i18n.LocalizedString title) {
        ((DO_State)this.get$obj$state(true)).title = title;
    }
    
    private java.lang.String get$title() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).title;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$title(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).title = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getDescription() {
        return ((DO_State)this.get$obj$state(false)).description;
    }
    
    public void setDescription(org.fenixedu.commons.i18n.LocalizedString description) {
        ((DO_State)this.get$obj$state(true)).description = description;
    }
    
    private java.lang.String get$description() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).description;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$description(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).description = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    protected java.lang.String getPath() {
        return ((DO_State)this.get$obj$state(false)).path;
    }
    
    protected void setPath(java.lang.String path) {
        ((DO_State)this.get$obj$state(true)).path = path;
    }
    
    private java.lang.String get$path() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).path;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$path(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).path = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getFullPath() {
        return ((DO_State)this.get$obj$state(false)).fullPath;
    }
    
    protected void setFullPath(java.lang.String fullPath) {
        ((DO_State)this.get$obj$state(true)).fullPath = fullPath;
    }
    
    private java.lang.String get$fullPath() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).fullPath;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$fullPath(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).fullPath = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.Boolean getVisible() {
        return ((DO_State)this.get$obj$state(false)).visible;
    }
    
    public void setVisible(java.lang.Boolean visible) {
        ((DO_State)this.get$obj$state(true)).visible = visible;
    }
    
    private java.lang.Boolean get$visible() {
        java.lang.Boolean value = ((DO_State)this.get$obj$state(false)).visible;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForBoolean(value);
    }
    
    private final void set$visible(java.lang.Boolean value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).visible = (java.lang.Boolean)((value == null) ? null : value);
    }
    
    public java.lang.String getLayout() {
        return ((DO_State)this.get$obj$state(false)).layout;
    }
    
    public void setLayout(java.lang.String layout) {
        ((DO_State)this.get$obj$state(true)).layout = layout;
    }
    
    private java.lang.String get$layout() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).layout;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$layout(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).layout = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getIcon() {
        return ((DO_State)this.get$obj$state(false)).icon;
    }
    
    public void setIcon(java.lang.String icon) {
        ((DO_State)this.get$obj$state(true)).icon = icon;
    }
    
    private java.lang.String get$icon() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).icon;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$icon(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).icon = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getFaqUrl() {
        return ((DO_State)this.get$obj$state(false)).faqUrl;
    }
    
    public void setFaqUrl(java.lang.String faqUrl) {
        ((DO_State)this.get$obj$state(true)).faqUrl = faqUrl;
    }
    
    private java.lang.String get$faqUrl() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).faqUrl;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$faqUrl(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).faqUrl = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        return ((DO_State)this.get$obj$state(false)).group;
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationMenuItemGroup().add((org.fenixedu.bennu.portal.domain.MenuItem)this, group);
    }
    
    private java.lang.Long get$oidGroup() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).group;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfGroup() {
        if (getGroup() == null) return false;
        return true;
    }
    
    public org.fenixedu.bennu.portal.domain.SupportConfiguration getSupport() {
        return ((DO_State)this.get$obj$state(false)).support;
    }
    
    public void setSupport(org.fenixedu.bennu.portal.domain.SupportConfiguration support) {
        getRelationMenuItemSupport().add(support, (org.fenixedu.bennu.portal.domain.MenuItem)this);
    }
    
    private java.lang.Long get$oidSupport() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).support;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.portal.domain.MenuContainer getParent() {
        return ((DO_State)this.get$obj$state(false)).parent;
    }
    
    protected void setParent(org.fenixedu.bennu.portal.domain.MenuContainer parent) {
        getRelationMenuItemComposition().add(parent, (org.fenixedu.bennu.portal.domain.MenuItem)this);
    }
    
    private java.lang.Long get$oidParent() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).parent;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.group != null) handleAttemptToDeleteConnectedObject("Group");
        if (castedState.support != null) handleAttemptToDeleteConnectedObject("Support");
        if (castedState.parent != null) handleAttemptToDeleteConnectedObject("Parent");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$ord(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readInteger(rs, "ORD"), state);
        set$title(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "TITLE"), state);
        set$description(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "DESCRIPTION"), state);
        set$path(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "PATH"), state);
        set$fullPath(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FULL_PATH"), state);
        set$visible(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readBoolean(rs, "VISIBLE"), state);
        set$layout(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "LAYOUT"), state);
        set$icon(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "ICON"), state);
        set$faqUrl(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FAQ_URL"), state);
        castedState.group = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_GROUP");
        castedState.support = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_SUPPORT");
        castedState.parent = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PARENT");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "ord", getOrd());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "title", getTitle());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "description", getDescription());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "path", getPath());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "fullPath", getFullPath());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "visible", getVisible());
        return true;
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.Integer ord;
        private org.fenixedu.commons.i18n.LocalizedString title;
        private org.fenixedu.commons.i18n.LocalizedString description;
        private java.lang.String path;
        private java.lang.String fullPath;
        private java.lang.Boolean visible;
        private java.lang.String layout;
        private java.lang.String icon;
        private java.lang.String faqUrl;
        private org.fenixedu.bennu.core.domain.groups.PersistentGroup group;
        private org.fenixedu.bennu.portal.domain.SupportConfiguration support;
        private org.fenixedu.bennu.portal.domain.MenuContainer parent;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.ord = this.ord;
            newCasted.title = this.title;
            newCasted.description = this.description;
            newCasted.path = this.path;
            newCasted.fullPath = this.fullPath;
            newCasted.visible = this.visible;
            newCasted.layout = this.layout;
            newCasted.icon = this.icon;
            newCasted.faqUrl = this.faqUrl;
            newCasted.group = this.group;
            newCasted.support = this.support;
            newCasted.parent = this.parent;
            
        }
        
    }
    
}
