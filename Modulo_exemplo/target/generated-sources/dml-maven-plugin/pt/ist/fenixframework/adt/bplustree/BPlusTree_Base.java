package pt.ist.fenixframework.adt.bplustree;


@SuppressWarnings("all")
public abstract class BPlusTree_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTree,pt.ist.fenixframework.adt.bplustree.AbstractNode> getRelationAdtBPlusTreeHasRootNode() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  BPlusTree_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.AbstractNode getRoot() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setRoot(pt.ist.fenixframework.adt.bplustree.AbstractNode root) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
