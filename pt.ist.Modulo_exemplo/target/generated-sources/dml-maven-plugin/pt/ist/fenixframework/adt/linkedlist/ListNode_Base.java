package pt.ist.fenixframework.adt.linkedlist;


@SuppressWarnings("all")
public abstract class ListNode_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.linkedlist.ListNode,pt.ist.fenixframework.adt.linkedlist.ListNode> getRelationListNodeHasNext() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  ListNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.adt.linkedlist.KeyValue getKeyValue() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setKeyValue(pt.ist.fenixframework.adt.linkedlist.KeyValue keyValue) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.linkedlist.ListNode getNext() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setNext(pt.ist.fenixframework.adt.linkedlist.ListNode next) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
