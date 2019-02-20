package org.fenixedu.bennu.portal.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class SupportConfiguration_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> role$$menuItem = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.portal.domain.MenuItem> getSet(org.fenixedu.bennu.portal.domain.SupportConfiguration o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>) ((SupportConfiguration_Base) o1).menuItem;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.portal.domain.MenuItem,org.fenixedu.bennu.portal.domain.SupportConfiguration> getInverseRole() {
            return org.fenixedu.bennu.portal.domain.MenuItem.role$$support;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.portal.domain.SupportConfiguration o1) {
            return ((SupportConfiguration_Base)o1).root.get();
        }
        public void setValue(org.fenixedu.bennu.portal.domain.SupportConfiguration o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((SupportConfiguration_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.portal.domain.SupportConfiguration> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$supportConfiguration;
        }
        
    };
    
    private final static class MenuItemSupport {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>(role$$menuItem, "MenuItemSupport", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> getRelationMenuItemSupport() {
        return MenuItemSupport.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuItem> keyFunction$$menuItem = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,org.fenixedu.bennu.portal.domain.MenuItem>() { public Comparable<?> getKey(org.fenixedu.bennu.portal.domain.MenuItem value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    private final static class BennuSupportConfiguration {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu>(role$$root, "BennuSupportConfiguration", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuSupportConfiguration() {
        return BennuSupportConfiguration.relation;
    }
    
    // Slots
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> title;
    private OwnedVBox<java.lang.String> emailAddress;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>> internal$menuItem$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem> menuItem;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> root;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        title = OwnedVBox.makeNew(this, "title", allocateOnly, false);
        if (!allocateOnly) this.title.put(null);
        emailAddress = OwnedVBox.makeNew(this, "emailAddress", allocateOnly, false);
        if (!allocateOnly) this.emailAddress.put(null);
        internal$menuItem$collectionBox = OwnedVBox.makeNew(this, "internal$menuItem$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuItem> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<org.fenixedu.bennu.portal.domain.MenuItem>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> get() { return internal$getMenuItem$collection(); }
            };
            menuItem = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, getRelationMenuItemSupport(), mapGetter, keyFunction$$menuItem);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>();
            this.internal$menuItem$collectionBox.put(internalMap);
            menuItem = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<org.fenixedu.bennu.portal.domain.SupportConfiguration,org.fenixedu.bennu.portal.domain.MenuItem>((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, getRelationMenuItemSupport(), internalMap, keyFunction$$menuItem);
        }
        root = OwnedVBox.makeNew(this, "root", allocateOnly, true);
        if (!allocateOnly) this.root.put(null);
        
    }
    
    // Constructors
    protected  SupportConfiguration_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public org.fenixedu.commons.i18n.LocalizedString getTitle() {
        return this.title.get();
    }
    
    public void setTitle(org.fenixedu.commons.i18n.LocalizedString title) {
        this.title.put(title);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public java.lang.String getEmailAddress() {
        return this.emailAddress.get();
    }
    
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress.put(emailAddress);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public void addMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemSupport().add((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, menuItem);
    }
    
    public void removeMenuItem(org.fenixedu.bennu.portal.domain.MenuItem menuItem) {
        getRelationMenuItemSupport().remove((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, menuItem);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem> internal$getMenuItem$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<org.fenixedu.bennu.portal.domain.MenuItem>)this.internal$menuItem$collectionBox.get();
    }
    
    public java.util.Set<org.fenixedu.bennu.portal.domain.MenuItem> getMenuItemSet() {
        return this.menuItem;
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRoot() {
        return this.root.get();
    }
    
    protected void setRoot(org.fenixedu.bennu.core.domain.Bennu root) {
        getRelationBennuSupportConfiguration().add((org.fenixedu.bennu.portal.domain.SupportConfiguration)this, root);
    }
    
    
}
