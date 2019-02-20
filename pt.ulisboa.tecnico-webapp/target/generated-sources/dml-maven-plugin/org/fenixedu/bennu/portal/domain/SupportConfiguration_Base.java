package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class SupportConfiguration_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> role$$menuItem = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuItem> getSet(org.fenixedu.bennu.portal.domain.SupportConfiguration o1) {
            return ((SupportConfiguration_Base)o1).get$rl$menuItem();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.SupportConfiguration> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuItem.role$$support;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.portal.domain.SupportConfiguration o1) {
            return ((SupportConfiguration_Base.DO_State)o1.get$obj$state(false)).root;
        }
        @Override
        public void setValue(org.fenixedu.bennu.portal.domain.SupportConfiguration o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((SupportConfiguration_Base.DO_State)o1.get$obj$state(true)).root = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$supportConfiguration;
        }
        
    };
    
    private final static class MenuItemSupport {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>(role$$menuItem, "MenuItemSupport");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemSupport() {
        return MenuItemSupport.relation;
    }
    
    static {
        MenuItemSupport.relation.setRelationName("org.fenixedu.bennu.portal.domain.SupportConfiguration.MenuItemSupport");
    }
    
    private final static class BennuSupportConfiguration {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu>(role$$root, "BennuSupportConfiguration");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuSupportConfiguration() {
        return BennuSupportConfiguration.relation;
    }
    
    static {
        BennuSupportConfiguration.relation.setRelationName("org.fenixedu.bennu.portal.domain.SupportConfiguration.BennuSupportConfiguration");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> get$rl$menuItem() {
        return get$$relationList("menuItem", getRelationMenuItemSupport());
        
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
    protected  SupportConfiguration_Base() {
        super();
    }
    
    // Getters and Setters
    
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
    
    public java.lang.String getEmailAddress() {
        return ((DO_State)this.get$obj$state(false)).emailAddress;
    }
    
    public void setEmailAddress(java.lang.String emailAddress) {
        ((DO_State)this.get$obj$state(true)).emailAddress = emailAddress;
    }
    
    private java.lang.String get$emailAddress() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).emailAddress;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$emailAddress(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).emailAddress = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public void addMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemSupport().add((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, menuItem);
    }
    
    public void removeMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemSupport().remove((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, menuItem);
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItemSet() {
        return get$rl$menuItem();
    }
    
    public void set$menuItem(OJBFunctionalSetWrapper menuItem) {
        get$rl$menuItem().setFromOJB(this, "menuItem", menuItem);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItem() {
        return getMenuItemSet();
    }
    
    @Deprecated
    public int getMenuItemCount() {
        return getMenuItemSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        return ((DO_State)this.get$obj$state(false)).root;
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        getRelationBennuSupportConfiguration().add((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, root);
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
        if (get$rl$menuItem().size() > 0) handleAttemptToDeleteConnectedObject("MenuItem");
        if (castedState.root != null) handleAttemptToDeleteConnectedObject("Root");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$title(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "TITLE"), state);
        set$emailAddress(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "EMAIL_ADDRESS"), state);
        castedState.root = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "title", getTitle());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "emailAddress", getEmailAddress());
        return true;
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("menuItem")) return getRelationMenuItemSupport();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("menuItem", getRelationMenuItemSupport());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.fenixedu.commons.i18n.LocalizedString title;
        private java.lang.String emailAddress;
        private org.fenixedu.bennu.core.domain.Bennu root;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.title = this.title;
            newCasted.emailAddress = this.emailAddress;
            newCasted.root = this.root;
            
        }
        
    }
    
}
