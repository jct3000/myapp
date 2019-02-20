package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class GroupConstant_Base extends org.fenixedu.bennu.core.domain.groups.PersistentGroup {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.GroupConstant,org.fenixedu.bennu.core.domain.Bennu> role$$rootForGroupConstant = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.groups.GroupConstant,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.groups.GroupConstant o1) {
            return ((GroupConstant_Base.DO_State)o1.get$obj$state(false)).rootForGroupConstant;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.groups.GroupConstant o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((GroupConstant_Base.DO_State)o1.get$obj$state(true)).rootForGroupConstant = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$groupConstant;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.groups.GroupConstant> getRelationGroupConstantRoot() {
        return org.fenixedu.bennu.core.domain.Bennu.getRelationGroupConstantRoot();
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
    protected  GroupConstant_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.Bennu getRootForGroupConstant() {
        return ((DO_State)this.get$obj$state(false)).rootForGroupConstant;
    }
    
    protected void setRootForGroupConstant(org.fenixedu.bennu.core.domain.Bennu rootForGroupConstant) {
        getRelationGroupConstantRoot().add(rootForGroupConstant, (org.fenixedu.bennu.core.domain.groups.GroupConstant)this);
    }
    
    private java.lang.Long get$oidRootForGroupConstant() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).rootForGroupConstant;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfRootForGroupConstant() {
        if (getRootForGroupConstant() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.rootForGroupConstant != null) handleAttemptToDeleteConnectedObject("RootForGroupConstant");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        castedState.rootForGroupConstant = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_ROOT_FOR_GROUP_CONSTANT");
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
        private org.fenixedu.bennu.core.domain.Bennu rootForGroupConstant;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.rootForGroupConstant = this.rootForGroupConstant;
            
        }
        
    }
    
}
