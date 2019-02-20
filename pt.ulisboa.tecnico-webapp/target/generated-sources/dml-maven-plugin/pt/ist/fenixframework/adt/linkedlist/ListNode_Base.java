package pt.ist.fenixframework.adt.linkedlist;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class ListNode_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> role$$next = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode>() {
        @Override
        public pt.ist.fenixframework.adt.linkedlist.ListNode getValue(pt.ist.fenixframework.adt.linkedlist.ListNode o1) {
            return ((ListNode_Base.DO_State)o1.get$obj$state(false)).next;
        }
        @Override
        public void setValue(pt.ist.fenixframework.adt.linkedlist.ListNode o1, pt.ist.fenixframework.adt.linkedlist.ListNode o2) {
            ((ListNode_Base.DO_State)o1.get$obj$state(true)).next = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode>(this);
        }
        
    };
    
    private final static class ListNodeHasNext {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode>(role$$next, "ListNodeHasNext");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> getRelationListNodeHasNext() {
        return ListNodeHasNext.relation;
    }
    
    static {
        ListNodeHasNext.relation.setRelationName("pt.ist.fenixframework.adt.linkedlist.ListNode.ListNodeHasNext");
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
    protected  ListNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.adt.linkedlist.KeyValue getKeyValue() {
        return ((DO_State)this.get$obj$state(false)).keyValue;
    }
    
    public void setKeyValue(pt.ist.fenixframework.adt.linkedlist.KeyValue keyValue) {
        ((DO_State)this.get$obj$state(true)).keyValue = keyValue;
    }
    
    private java.lang.Object get$keyValue() {
        pt.ist.fenixframework.adt.linkedlist.KeyValue value = ((DO_State)this.get$obj$state(false)).keyValue;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForSerializable(ValueTypeSerializer.serialize$NodeKeyVal(value));
    }
    
    private final void set$keyValue(java.io.Serializable value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).keyValue = (pt.ist.fenixframework.adt.linkedlist.KeyValue)((value == null) ? null : ValueTypeSerializer.deSerialize$NodeKeyVal(value));
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.linkedlist.ListNode getNext() {
        return ((DO_State)this.get$obj$state(false)).next;
    }
    
    public void setNext(pt.ist.fenixframework.adt.linkedlist.ListNode next) {
        getRelationListNodeHasNext().add((pt.ist.fenixframework.adt.linkedlist.ListNode)this, next);
    }
    
    private java.lang.Long get$oidNext() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).next;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.next != null) handleAttemptToDeleteConnectedObject("Next");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$keyValue(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readSerializable(rs, "KEY_VALUE"), state);
        castedState.next = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_NEXT");
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
        private pt.ist.fenixframework.adt.linkedlist.KeyValue keyValue;
        private pt.ist.fenixframework.adt.linkedlist.ListNode next;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.keyValue = this.keyValue;
            newCasted.next = this.next;
            
        }
        
    }
    
}
