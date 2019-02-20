package pt.ist.fenixframework.adt.linkedlist;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class LinkedList_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> role$$head = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode>() {
        public pt.ist.fenixframework.adt.linkedlist.ListNode getValue(pt.ist.fenixframework.adt.linkedlist.LinkedList o1) {
            return ((LinkedList_Base)o1).head.get();
        }
        public void setValue(pt.ist.fenixframework.adt.linkedlist.LinkedList o1, pt.ist.fenixframework.adt.linkedlist.ListNode o2) {
            ((LinkedList_Base)o1).head.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.LinkedList> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.LinkedList>(this);
        }
        
    };
    
    private final static class LinkedListHasHeadNode {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode>(role$$head, "LinkedListHasHeadNode", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> getRelationLinkedListHasHeadNode() {
        return LinkedListHasHeadNode.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.linkedlist.ListNode> head;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        head = OwnedVBox.makeNew(this, "head", allocateOnly, true);
        if (!allocateOnly) this.head.put(null);
        
    }
    
    // Constructors
    protected  LinkedList_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.linkedlist.ListNode getHead() {
        return this.head.get();
    }
    
    public void setHead(pt.ist.fenixframework.adt.linkedlist.ListNode head) {
        getRelationLinkedListHasHeadNode().add((pt.ist.fenixframework.adt.linkedlist.LinkedList)this, head);
    }
    
    
}
