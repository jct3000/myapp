package pt.ist.fenixframework;


@SuppressWarnings("all")
public abstract class DomainBPlusTreeJVSTM_Base extends pt.ist.fenixframework.adt.bplustree.DomainBPlusTree {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> getRelationDomainBPlusTreeJVSTMData() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainBPlusTreeJVSTM_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainBPlusTreeData getTreeData() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setTreeData(pt.ist.fenixframework.DomainBPlusTreeData treeData) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
