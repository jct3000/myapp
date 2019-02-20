package pt.ist.fenixframework;


@SuppressWarnings("all")
public abstract class DomainBPlusTreeData_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> getRelationDomainBPlusTreeJVSTMData() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainBPlusTreeData_Base() {
        super();
    }
    
    // Getters and Setters
    
    public int getSize() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setSize(int size) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainBPlusTreeJVSTM getTree() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTree(pt.ist.fenixframework.DomainBPlusTreeJVSTM tree) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
