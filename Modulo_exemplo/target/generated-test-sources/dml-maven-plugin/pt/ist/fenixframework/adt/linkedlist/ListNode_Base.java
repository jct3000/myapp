package pt.ist.fenixframework.adt.linkedlist;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class ListNode_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> role$$next = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode>() {
        public pt.ist.fenixframework.adt.linkedlist.ListNode getValue(pt.ist.fenixframework.adt.linkedlist.ListNode o1) {
            return ((ListNode_Base)o1).next.get();
        }
        public void setValue(pt.ist.fenixframework.adt.linkedlist.ListNode o1, pt.ist.fenixframework.adt.linkedlist.ListNode o2) {
            ((ListNode_Base)o1).next.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode>(this);
        }
        
    };
    
    private final static class ListNodeHasNext {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode>(role$$next, "ListNodeHasNext", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> getRelationListNodeHasNext() {
        return ListNodeHasNext.relation;
    }
    
    // Slots
    private OwnedVBox<pt.ist.fenixframework.adt.linkedlist.KeyValue> keyValue;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.linkedlist.ListNode> next;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        keyValue = OwnedVBox.makeNew(this, "keyValue", allocateOnly, false);
        if (!allocateOnly) this.keyValue.put(null);
        next = OwnedVBox.makeNew(this, "next", allocateOnly, true);
        if (!allocateOnly) this.next.put(null);
        
    }
    
    // Constructors
    protected  ListNode_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.adt.linkedlist.KeyValue getKeyValue() {
        return this.keyValue.get();
    }
    
    public void setKeyValue(pt.ist.fenixframework.adt.linkedlist.KeyValue keyValue) {
        this.keyValue.put(keyValue);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.linkedlist.ListNode getNext() {
        return this.next.get();
    }
    
    public void setNext(pt.ist.fenixframework.adt.linkedlist.ListNode next) {
        getRelationListNodeHasNext().add((pt.ist.fenixframework.adt.linkedlist.ListNode)this, next);
    }
    
    
}
