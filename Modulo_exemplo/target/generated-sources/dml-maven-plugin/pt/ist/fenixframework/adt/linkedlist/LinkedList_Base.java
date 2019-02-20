package pt.ist.fenixframework.adt.linkedlist;


@SuppressWarnings("all")
public abstract class LinkedList_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.LinkedList,pt.ist.fenixframework.adt.linkedlist.ListNode> getRelationLinkedListHasHeadNode() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  LinkedList_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.linkedlist.ListNode getHead() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setHead(pt.ist.fenixframework.adt.linkedlist.ListNode head) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
