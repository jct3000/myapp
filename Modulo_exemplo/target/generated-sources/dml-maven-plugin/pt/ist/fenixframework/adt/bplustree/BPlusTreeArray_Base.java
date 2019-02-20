package pt.ist.fenixframework.adt.bplustree;


@SuppressWarnings("all")
public abstract class BPlusTreeArray_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTreeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray> getRelationBPlusTreeArrayHasRootNode() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  BPlusTreeArray_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.AbstractNodeArray getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setRoot(pt.ist.fenixframework.adt.bplustree.AbstractNodeArray root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
