package pt.ist.fenixframework.adt.bplustree;


@SuppressWarnings("all")
public abstract class LeafNodeArray_Base extends pt.ist.fenixframework.adt.bplustree.AbstractNodeArray {
    // Static Slots
    
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> getRelationLeafNodeArrayHasSibling() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  LeafNodeArray_Base() {
        super();
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.adt.bplustree.DoubleArray<java.io.Serializable> getEntries() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setEntries(pt.ist.fenixframework.adt.bplustree.DoubleArray<java.io.Serializable> entries) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.LeafNodeArray getPrevious() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPrevious(pt.ist.fenixframework.adt.bplustree.LeafNodeArray previous) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.adt.bplustree.LeafNodeArray getNext() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setNext(pt.ist.fenixframework.adt.bplustree.LeafNodeArray next) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
