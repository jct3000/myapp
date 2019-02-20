package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class UserLoginPeriod_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserLoginPeriod,org.fenixedu.bennu.core.domain.User> role$$user = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.UserLoginPeriod,org.fenixedu.bennu.core.domain.User>() {
        @Override
        public org.fenixedu.bennu.core.domain.User getValue(org.fenixedu.bennu.core.domain.UserLoginPeriod o1) {
            return ((UserLoginPeriod_Base.DO_State)o1.get$obj$state(false)).user;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.UserLoginPeriod o1, org.fenixedu.bennu.core.domain.User o2) {
            ((UserLoginPeriod_Base.DO_State)o1.get$obj$state(true)).user = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getInverseRole() {
            return org.fenixedu.bennu.core.domain.User.role$$loginValidity;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getRelationUserLoginPeriods() {
        return org.fenixedu.bennu.core.domain.User.getRelationUserLoginPeriods();
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
    protected  UserLoginPeriod_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected org.joda.time.LocalDate getBeginDate() {
        return ((DO_State)this.get$obj$state(false)).beginDate;
    }
    
    protected void setBeginDate(org.joda.time.LocalDate beginDate) {
        ((DO_State)this.get$obj$state(true)).beginDate = beginDate;
    }
    
    private java.lang.String get$beginDate() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).beginDate;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$beginDate(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).beginDate = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    protected org.joda.time.LocalDate getEndDate() {
        return ((DO_State)this.get$obj$state(false)).endDate;
    }
    
    protected void setEndDate(org.joda.time.LocalDate endDate) {
        ((DO_State)this.get$obj$state(true)).endDate = endDate;
    }
    
    private java.lang.String get$endDate() {
        org.joda.time.LocalDate value = ((DO_State)this.get$obj$state(false)).endDate;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLocalDate(value);
    }
    
    private final void set$endDate(org.joda.time.LocalDate value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).endDate = (org.joda.time.LocalDate)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.User getUser() {
        return ((DO_State)this.get$obj$state(false)).user;
    }
    
    protected void setUser(org.fenixedu.bennu.core.domain.User user) {
        getRelationUserLoginPeriods().add(user, (org.fenixedu.bennu.core.domain.UserLoginPeriod)this);
    }
    
    private java.lang.Long get$oidUser() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).user;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfUser() {
        if (getUser() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.user != null) handleAttemptToDeleteConnectedObject("User");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$beginDate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "BEGIN_DATE"), state);
        set$endDate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLocalDate(rs, "END_DATE"), state);
        castedState.user = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_USER");
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    private boolean checkRequiredSlots() {
        pt.ist.fenixframework.backend.jvstmojb.dml.runtime.ConsistencyChecks.checkRequired(this, "beginDate", getBeginDate());
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
        private org.joda.time.LocalDate beginDate;
        private org.joda.time.LocalDate endDate;
        private org.fenixedu.bennu.core.domain.User user;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.beginDate = this.beginDate;
            newCasted.endDate = this.endDate;
            newCasted.user = this.user;
            
        }
        
    }
    
}
