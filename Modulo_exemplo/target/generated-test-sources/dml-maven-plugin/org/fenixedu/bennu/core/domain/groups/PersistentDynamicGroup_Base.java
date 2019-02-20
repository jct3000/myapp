package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentDynamicGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.User> role$$creator = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.User>() {
        public org.fenixedu.bennu.core.domain.User getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base)o1).creator.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.User o2) {
            ((PersistentDynamicGroup_Base)o1).creator.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$createdDynamicGroup;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.Bennu> role$$rootForDynamicGroup = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.Bennu>() {
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base)o1).rootForDynamicGroup.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((PersistentDynamicGroup_Base)o1).rootForDynamicGroup.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$dynamic;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base)o1).group.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((PersistentDynamicGroup_Base)o1).group.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$dynamicGroup;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$previous = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base)o1).previous.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o2) {
            ((PersistentDynamicGroup_Base)o1).previous.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$next;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$next = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        public org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base)o1).next.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o2) {
            ((PersistentDynamicGroup_Base)o1).next.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$previous;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupCreator() {
        return org.fenixedu.bennu.core.domain.User.getRelationPersistentDynamicGroupCreator();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroups() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationPersistentDynamicGroups();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupWrapper() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationPersistentDynamicGroupWrapper();
    }
    
    
    private final static class DynamicGroupHistoric {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$next, "DynamicGroupHistoric", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationDynamicGroupHistoric() {
        return DynamicGroupHistoric.relation;
    }
    
    // Slots
    private OwnedVBox<java.lang.String> name;
    private OwnedVBox<org.joda.time.DateTime> created;
    private OwnedVBox<org.fenixedu.commons.i18n.LocalizedString> customPresentationName;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.User> creator;
    private OwnedVBox<org.fenixedu.bennu.core.domain.Bennu> rootForDynamicGroup;
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentGroup> group;
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> previous;
    private OwnedVBox<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> next;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        name = OwnedVBox.makeNew(this, "name", allocateOnly, false);
        if (!allocateOnly) this.name.put(null);
        created = OwnedVBox.makeNew(this, "created", allocateOnly, false);
        if (!allocateOnly) this.created.put(null);
        customPresentationName = OwnedVBox.makeNew(this, "customPresentationName", allocateOnly, false);
        if (!allocateOnly) this.customPresentationName.put(null);
        creator = OwnedVBox.makeNew(this, "creator", allocateOnly, true);
        if (!allocateOnly) this.creator.put(null);
        rootForDynamicGroup = OwnedVBox.makeNew(this, "rootForDynamicGroup", allocateOnly, true);
        if (!allocateOnly) this.rootForDynamicGroup.put(null);
        group = OwnedVBox.makeNew(this, "group", allocateOnly, true);
        if (!allocateOnly) this.group.put(null);
        previous = OwnedVBox.makeNew(this, "previous", allocateOnly, true);
        if (!allocateOnly) this.previous.put(null);
        next = OwnedVBox.makeNew(this, "next", allocateOnly, true);
        if (!allocateOnly) this.next.put(null);
        
    }
    
    // Constructors
    protected  PersistentDynamicGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getName() {
        return this.name.get();
    }
    
    protected void setName(java.lang.String name) {
        this.name.put(name);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected org.joda.time.DateTime getCreated() {
        return this.created.get();
    }
    
    protected void setCreated(org.joda.time.DateTime created) {
        this.created.put(created);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getCustomPresentationName() {
        return this.customPresentationName.get();
    }
    
    public void setCustomPresentationName(org.fenixedu.commons.i18n.LocalizedString customPresentationName) {
        this.customPresentationName.put(customPresentationName);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.User getCreator() {
        return this.creator.get();
    }
    
    protected void setCreator(org.fenixedu.bennu.core.domain.User creator) {
        getRelationPersistentDynamicGroupCreator().add(creator, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRootForDynamicGroup() {
        return this.rootForDynamicGroup.get();
    }
    
    protected void setRootForDynamicGroup(org.fenixedu.bennu.core.domain.Bennu rootForDynamicGroup) {
        getRelationPersistentDynamicGroups().add(rootForDynamicGroup, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        return this.group.get();
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationPersistentDynamicGroupWrapper().add(group, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getPrevious() {
        return this.previous.get();
    }
    
    protected void setPrevious(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup previous) {
        getRelationDynamicGroupHistoric().add(previous, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getNext() {
        return this.next.get();
    }
    
    protected void setNext(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup next) {
        getRelationDynamicGroupHistoric().add((org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this, next);
    }
    
    
}
