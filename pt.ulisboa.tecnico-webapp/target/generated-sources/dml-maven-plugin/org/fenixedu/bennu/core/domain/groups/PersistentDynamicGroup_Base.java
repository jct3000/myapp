package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentDynamicGroup_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.User> role$$creator = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.User>() {
        @Override
        public org.fenixedu.bennu.core.domain.User getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(false)).creator;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.User o2) {
            ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(true)).creator = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$createdDynamicGroup;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.Bennu> role$$rootForDynamicGroup = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(false)).rootForDynamicGroup;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(true)).rootForDynamicGroup = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$dynamic;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(false)).group;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(true)).group = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$dynamicGroup;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$previous = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(false)).previous;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o2) {
            ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(true)).previous = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.role$$next;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> role$$next = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1) {
            return ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(false)).next;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o1, org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup o2) {
            ((PersistentDynamicGroup_Base.DO_State)o1.get$obj$state(true)).next = o2;
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
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup>(role$$next, "DynamicGroupHistoric");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationDynamicGroupHistoric() {
        return DynamicGroupHistoric.relation;
    }
    
    static {
        DynamicGroupHistoric.relation.setRelationName("org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup.DynamicGroupHistoric");
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
    protected  PersistentDynamicGroup_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getName() {
        return ((DO_State)this.get$obj$state(false)).name;
    }
    
    protected void setName(java.lang.String name) {
        ((DO_State)this.get$obj$state(true)).name = name;
    }
    
    private java.lang.String get$name() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).name;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$name(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).name = (java.lang.String)((value == null) ? null : value);
    }
    
    protected org.joda.time.DateTime getCreated() {
        return ((DO_State)this.get$obj$state(false)).created;
    }
    
    protected void setCreated(org.joda.time.DateTime created) {
        ((DO_State)this.get$obj$state(true)).created = created;
    }
    
    private java.sql.Timestamp get$created() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).created;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$created(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).created = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    public org.fenixedu.commons.i18n.LocalizedString getCustomPresentationName() {
        return ((DO_State)this.get$obj$state(false)).customPresentationName;
    }
    
    public void setCustomPresentationName(org.fenixedu.commons.i18n.LocalizedString customPresentationName) {
        ((DO_State)this.get$obj$state(true)).customPresentationName = customPresentationName;
    }
    
    private java.lang.String get$customPresentationName() {
        org.fenixedu.commons.i18n.LocalizedString value = ((DO_State)this.get$obj$state(false)).customPresentationName;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForJsonElement(ValueTypeSerializer.serialize$LocalizedString(value));
    }
    
    private final void set$customPresentationName(com.google.gson.JsonElement value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).customPresentationName = (org.fenixedu.commons.i18n.LocalizedString)((value == null) ? null : ValueTypeSerializer.deSerialize$LocalizedString(value));
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.User getCreator() {
        return ((DO_State)this.get$obj$state(false)).creator;
    }
    
    protected void setCreator(org.fenixedu.bennu.core.domain.User creator) {
        getRelationPersistentDynamicGroupCreator().add(creator, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    private java.lang.Long get$oidCreator() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).creator;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getRootForDynamicGroup() {
        return ((DO_State)this.get$obj$state(false)).rootForDynamicGroup;
    }
    
    protected void setRootForDynamicGroup(org.fenixedu.bennu.core.domain.Bennu rootForDynamicGroup) {
        getRelationPersistentDynamicGroups().add(rootForDynamicGroup, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    private java.lang.Long get$oidRootForDynamicGroup() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).rootForDynamicGroup;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        return ((DO_State)this.get$obj$state(false)).group;
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationPersistentDynamicGroupWrapper().add(group, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
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
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getPrevious() {
        return ((DO_State)this.get$obj$state(false)).previous;
    }
    
    protected void setPrevious(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup previous) {
        getRelationDynamicGroupHistoric().add(previous, (org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this);
    }
    
    private java.lang.Long get$oidPrevious() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).previous;
        return (value == null) ? null : value.getOid();
    }
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup getNext() {
        return ((DO_State)this.get$obj$state(false)).next;
    }
    
    protected void setNext(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup next) {
        getRelationDynamicGroupHistoric().add((org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup)this, next);
    }
    
    private java.lang.Long get$oidNext() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).next;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.creator != null) handleAttemptToDeleteConnectedObject("Creator");
        if (castedState.rootForDynamicGroup != null) handleAttemptToDeleteConnectedObject("RootForDynamicGroup");
        if (castedState.group != null) handleAttemptToDeleteConnectedObject("Group");
        if (castedState.previous != null) handleAttemptToDeleteConnectedObject("Previous");
        if (castedState.next != null) handleAttemptToDeleteConnectedObject("Next");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        set$name(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "NAME"), state);
        set$created(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "CREATED"), state);
        set$customPresentationName(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readJsonElement(rs, "CUSTOM_PRESENTATION_NAME"), state);
        castedState.creator = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_CREATOR");
        castedState.rootForDynamicGroup = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT_FOR_DYNAMIC_GROUP");
        castedState.group = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_GROUP");
        castedState.previous = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PREVIOUS");
        castedState.next = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_NEXT");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "name", getName());
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "created", getCreated());
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
    protected static class DO_State extends org.fenixedu.bennu.core.domain.groups.PersistentGroup.DO_State {
        private java.lang.String name;
        private org.joda.time.DateTime created;
        private org.fenixedu.commons.i18n.LocalizedString customPresentationName;
        private org.fenixedu.bennu.core.domain.User creator;
        private org.fenixedu.bennu.core.domain.Bennu rootForDynamicGroup;
        private org.fenixedu.bennu.core.domain.groups.PersistentGroup group;
        private org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup previous;
        private org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup next;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.name = this.name;
            newCasted.created = this.created;
            newCasted.customPresentationName = this.customPresentationName;
            newCasted.creator = this.creator;
            newCasted.rootForDynamicGroup = this.rootForDynamicGroup;
            newCasted.group = this.group;
            newCasted.previous = this.previous;
            newCasted.next = this.next;
            
        }
        
    }
    
}
