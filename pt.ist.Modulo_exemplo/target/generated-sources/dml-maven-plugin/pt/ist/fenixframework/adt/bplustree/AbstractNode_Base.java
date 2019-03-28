package pt.ist.fenixframework.adt.bplustree;


@SuppressWarnings("all")
public abstract class AbstractNode_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.InnerNode> getRelationAdtNodeHasParent() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  AbstractNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.InnerNode getParent() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setParent(pt.ist.fenixframework.adt.bplustree.InnerNode parent) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
