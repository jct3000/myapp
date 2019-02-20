package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class GroupBasedFile_Base extends org.fenixedu.bennu.io.domain.GenericFile {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GroupBasedFile,org.fenixedu.bennu.core.domain.groups.PersistentGroup> role$$group = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GroupBasedFile,org.fenixedu.bennu.core.domain.groups.PersistentGroup>() {
        @Override
        public org.fenixedu.bennu.core.domain.groups.PersistentGroup getValue(org.fenixedu.bennu.io.domain.GroupBasedFile o1) {
            return ((GroupBasedFile_Base.DO_State)o1.get$obj$state(false)).group;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.GroupBasedFile o1, org.fenixedu.bennu.core.domain.groups.PersistentGroup o2) {
            ((GroupBasedFile_Base.DO_State)o1.get$obj$state(true)).group = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getInverseRole() {
            return org.fenixedu.bennu.core.domain.groups.PersistentGroup.role$$file;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentGroup,org.fenixedu.bennu.io.domain.GroupBasedFile> getRelationGroupBasedFilesGroup() {
        return org.fenixedu.bennu.core.domain.groups.PersistentGroup.getRelationGroupBasedFilesGroup();
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
    protected  GroupBasedFile_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.groups.PersistentGroup getGroup() {
        return ((DO_State)this.get$obj$state(false)).group;
    }
    
    protected void setGroup(org.fenixedu.bennu.core.domain.groups.PersistentGroup group) {
        getRelationGroupBasedFilesGroup().add(group, (org.fenixedu.bennu.io.domain.GroupBasedFile)this);
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
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.group != null) handleAttemptToDeleteConnectedObject("Group");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        castedState.group = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_GROUP");
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
    protected static class DO_State extends org.fenixedu.bennu.io.domain.GenericFile.DO_State {
        private org.fenixedu.bennu.core.domain.groups.PersistentGroup group;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.group = this.group;
            
        }
        
    }
    
}
