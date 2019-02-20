package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class MenuItem_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.portal.domain.MenuItem o1) {
            return ((MenuItem_Base)o1).group.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.MenuItem o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((MenuItem_Base)o1).group.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.portal.domain.MenuItem> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$menuItem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.SupportConfiguration> role$$support = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.SupportConfiguration>() {
        public org.fenixedu.bennu.portal.domain.SupportConfiguration getValue(org.fenixedu.bennu.portal.domain.MenuItem o1) {
            return ((MenuItem_Base)o1).support.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.MenuItem o1, org.fenixedu.bennu.portal.domain.SupportConfiguration o2) {
            ((MenuItem_Base)o1).support.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.SupportConfiguration.role$$menuItem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.MenuContainer> role$$parent = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.MenuContainer>() {
        public org.fenixedu.bennu.portal.domain.MenuContainer getValue(org.fenixedu.bennu.portal.domain.MenuItem o1) {
            return ((MenuItem_Base)o1).parent.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.MenuItem o1, org.fenixedu.bennu.portal.domain.MenuContainer o2) {
            ((MenuItem_Base)o1).parent.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuContainer.role$$child;
        }
        
    };
    
    private final static class MenuItemGroup {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup>(role$$group, "MenuItemGroup", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.core.domain.groups.PersistentGroup> getRelationMenuItemGroup() {
        return MenuItemGroup.relation;
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemSupport() {
        return org.fenixedu.bennu.portal.domain.SupportConfiguration.getRelationMenuItemSupport();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.MenuContainer,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemComposition() {
        return org.fenixedu.bennu.portal.domain.MenuContainer.getRelationMenuItemComposition();
    }
    
    // Slots
    private OwnedVBox<java.lang.Integer> ord;
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> title;
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> description;
    private OwnedVBox<java.lang.String> path;
    private OwnedVBox<java.lang.String> fullPath;
    private OwnedVBox<java.lang.Boolean> visible;
    private OwnedVBox<java.lang.String> layout;
    private OwnedVBox<java.lang.String> icon;
    private OwnedVBox<java.lang.String> faqUrl;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentGroup> group;
    private OwnedVBox<org.fenixedu.bennu.portal.domain.SupportConfiguration> support;
    private OwnedVBox<org.fenixedu.bennu.portal.domain.MenuContainer> parent;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        ord = OwnedVBox.makeNew(this, "ord", allocateOnly, false);
        if (!allocateOnly) this.ord.put(null);
        title = OwnedVBox.makeNew(this, "title", allocateOnly, false);
        if (!allocateOnly) this.title.put(null);
        description = OwnedVBox.makeNew(this, "description", allocateOnly, false);
        if (!allocateOnly) this.description.put(null);
        path = OwnedVBox.makeNew(this, "path", allocateOnly, false);
        if (!allocateOnly) this.path.put(null);
        fullPath = OwnedVBox.makeNew(this, "fullPath", allocateOnly, false);
        if (!allocateOnly) this.fullPath.put(null);
        visible = OwnedVBox.makeNew(this, "visible", allocateOnly, false);
        if (!allocateOnly) this.visible.put(null);
        layout = OwnedVBox.makeNew(this, "layout", allocateOnly, false);
        if (!allocateOnly) this.layout.put(null);
        icon = OwnedVBox.makeNew(this, "icon", allocateOnly, false);
        if (!allocateOnly) this.icon.put(null);
        faqUrl = OwnedVBox.makeNew(this, "faqUrl", allocateOnly, false);
        if (!allocateOnly) this.faqUrl.put(null);
        group = OwnedVBox.makeNew(this, "group", allocateOnly, true);
        if (!allocateOnly) this.group.put(null);
        support = OwnedVBox.makeNew(this, "support", allocateOnly, true);
        if (!allocateOnly) this.support.put(null);
        parent = OwnedVBox.makeNew(this, "parent", allocateOnly, true);
        if (!allocateOnly) this.parent.put(null);
        
    }
    
    // Constructors
    protected  MenuItem_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.Integer getOrd() {
        return this.ord.get();
    }
    
    public void setOrd(java.lang.Integer ord) {
        this.ord.put(ord);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getTitle() {
        return this.title.get();
    }
    
    public void setTitle(org.fenixedu.commons.i18n.LocalizedString title) {
        this.title.put(title);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getDescription() {
        return this.description.get();
    }
    
    public void setDescription(org.fenixedu.commons.i18n.LocalizedString description) {
        this.description.put(description);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getPath() {
        return this.path.get();
    }
    
    protected void setPath(java.lang.String path) {
        this.path.put(path);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getFullPath() {
        return this.fullPath.get();
    }
    
    protected void setFullPath(java.lang.String fullPath) {
        this.fullPath.put(fullPath);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.Boolean getVisible() {
        return this.visible.get();
    }
    
    public void setVisible(java.lang.Boolean visible) {
        this.visible.put(visible);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getLayout() {
        return this.layout.get();
    }
    
    public void setLayout(java.lang.String layout) {
        this.layout.put(layout);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getIcon() {
        return this.icon.get();
    }
    
    public void setIcon(java.lang.String icon) {
        this.icon.put(icon);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getFaqUrl() {
        return this.faqUrl.get();
    }
    
    public void setFaqUrl(java.lang.String faqUrl) {
        this.faqUrl.put(faqUrl);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        return this.group.get();
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationMenuItemGroup().add((org.fenixedu.bennu.portal.domain.MenuItem)this, group);
    }
    
    public org.fenixedu.bennu.portal.domain.SupportConfiguration getSupport() {
        return this.support.get();
    }
    
    public void setSupport(org.fenixedu.bennu.portal.domain.SupportConfiguration support) {
        getRelationMenuItemSupport().add(support, (org.fenixedu.bennu.portal.domain.MenuItem)this);
    }
    
    protected org.fenixedu.bennu.portal.domain.MenuContainer getParent() {
        return this.parent.get();
    }
    
    protected void setParent(org.fenixedu.bennu.portal.domain.MenuContainer parent) {
        getRelationMenuItemComposition().add(parent, (org.fenixedu.bennu.portal.domain.MenuItem)this);
    }
    
    
}
