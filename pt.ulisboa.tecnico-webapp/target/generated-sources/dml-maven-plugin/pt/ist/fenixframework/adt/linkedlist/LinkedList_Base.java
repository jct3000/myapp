package pt.ist.fenixframework.adt.linkedlist;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class LinkedList_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> role$$head = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode>() {
        @Override
        public pt.ist.fenixframework.adt.linkedlist.ListNode getValue(pt.ist.fenixframework.adt.linkedlist.LinkedList o1) {
            return ((LinkedList_Base.DO_State)o1.get$obj$state(false)).head;
        }
        @Override
        public void setValue(pt.ist.fenixframework.adt.linkedlist.LinkedList o1, pt.ist.fenixframework.adt.linkedlist.ListNode o2) {
            ((LinkedList_Base.DO_State)o1.get$obj$state(true)).head = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.LinkedList> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.LinkedList>(this);
        }
        
    };
    
    private final static class LinkedListHasHeadNode {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode>(role$$head, "LinkedListHasHeadNode");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> getRelationLinkedListHasHeadNode() {
        return LinkedListHasHeadNode.relation;
    }
    
    static {
        LinkedListHasHeadNode.relation.setRelationName("pt.ist.fenixframework.adt.linkedlist.LinkedList.LinkedListHasHeadNode");
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
    protected  LinkedList_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.linkedlist.ListNode getHead() {
        return ((DO_State)this.get$obj$state(false)).head;
    }
    
    public void setHead(pt.ist.fenixframework.adt.linkedlist.ListNode head) {
        getRelationLinkedListHasHeadNode().add((pt.ist.fenixframework.adt.linkedlist.LinkedList)this, head);
    }
    
    private java.lang.Long get$oidHead() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).head;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.head != null) handleAttemptToDeleteConnectedObject("Head");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.head = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_HEAD");
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
        private pt.ist.fenixframework.adt.linkedlist.ListNode head;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.head = this.head;
            
        }
        
    }
    
}
