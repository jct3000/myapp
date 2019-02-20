package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class PersistentGroupStrategy_Base extends org.fenixedu.bennu.core.domain.groups.GroupConstant {
    // Static Slots
    
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
    protected  PersistentGroupStrategy_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected org.fenixedu.bennu.core.groups.GroupStrategy getStrategy() {
        return ((DO_State)this.get$obj$state(false)).strategy;
    }
    
    protected void setStrategy(org.fenixedu.bennu.core.groups.GroupStrategy strategy) {
        ((DO_State)this.get$obj$state(true)).strategy = strategy;
    }
    
    private java.lang.String get$strategy() {
        org.fenixedu.bennu.core.groups.GroupStrategy value = ((DO_State)this.get$obj$state(false)).strategy;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(ValueTypeSerializer.serialize$GroupStrategyValueType(value));
    }
    
    private final void set$strategy(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).strategy = (org.fenixedu.bennu.core.groups.GroupStrategy)((value == null) ? null : ValueTypeSerializer.deSerialize$GroupStrategyValueType(value));
    }
    
    // Role Methods
    
    
    protected void checkDisconnected() {
        super.checkDisconnected();
        DO_State castedState = (DO_State)this.get$obj$state(false);
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        super.readStateFromResultSet(rs, state);
        DO_State castedState = (DO_State)state;
        set$strategy(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "STRATEGY"), state);
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
    protected static class DO_State extends org.fenixedu.bennu.core.domain.groups.GroupConstant.DO_State {
        private org.fenixedu.bennu.core.groups.GroupStrategy strategy;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.strategy = this.strategy;
            
        }
        
    }
    
}
