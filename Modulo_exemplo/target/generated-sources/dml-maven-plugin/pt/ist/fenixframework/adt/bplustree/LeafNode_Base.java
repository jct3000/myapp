package pt.ist.fenixframework.adt.bplustree;


@SuppressWarnings("all")
public abstract class LeafNode_Base extends pt.ist.fenixframework.adt.bplustree.AbstractNode {
    // Static Slots
    
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> getRelationAdtLeafNodeHasSibling() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  LeafNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.util.TreeMap<Comparable,? extends java.io.Serializable> getEntries() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setEntries(java.util.TreeMap<Comparable,? extends java.io.Serializable> entries) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.LeafNode getPrevious() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPrevious(pt.ist.fenixframework.adt.bplustree.LeafNode previous) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.adt.bplustree.LeafNode getNext() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setNext(pt.ist.fenixframework.adt.bplustree.LeafNode next) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
