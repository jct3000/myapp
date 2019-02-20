package org.fenixedu.bennu.core.domain.groups;


@SuppressWarnings("all")
public abstract class PersistentDynamicGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupCreator() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroups() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupWrapper() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationDynamicGroupHistoric() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  PersistentDynamicGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getName() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setName(java.lang.String name) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.joda.time.DateTime getCreated() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setCreated(org.joda.time.DateTime created) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getCustomPresentationName() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setCustomPresentationName(org.fenixedu.commons.i18n.LocalizedString customPresentationName) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.User getCreator() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setCreator(org.fenixedu.bennu.core.domain.User creator) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRootForDynamicGroup() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setRootForDynamicGroup(org.fenixedu.bennu.core.domain.Bennu rootForDynamicGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getPrevious() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setPrevious(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup previous) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getNext() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setNext(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup next) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
