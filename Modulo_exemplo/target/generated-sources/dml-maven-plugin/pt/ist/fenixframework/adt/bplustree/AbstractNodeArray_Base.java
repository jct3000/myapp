package pt.ist.fenixframework.adt.bplustree;


@SuppressWarnings("all")
public abstract class AbstractNodeArray_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.InnerNodeArray> getRelationNodeArrayHasParent() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  AbstractNodeArray_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.InnerNodeArray getParent() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setParent(pt.ist.fenixframework.adt.bplustree.InnerNodeArray parent) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
