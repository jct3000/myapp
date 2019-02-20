package pt.ist.fenixframework;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainBPlusTreeJVSTM_Base extends pt.ist.fenixframework.adt.bplustree.DomainBPlusTree {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainBPlusTreeJVSTM,pt.ist.fenixframework.DomainBPlusTreeData> role$$treeData = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainBPlusTreeJVSTM,pt.ist.fenixframework.DomainBPlusTreeData>() {
        public pt.ist.fenixframework.DomainBPlusTreeData getValue(pt.ist.fenixframework.DomainBPlusTreeJVSTM o1) {
            return ((DomainBPlusTreeJVSTM_Base)o1).treeData.get();
        }
        public void setValue(pt.ist.fenixframework.DomainBPlusTreeJVSTM o1, pt.ist.fenixframework.DomainBPlusTreeData o2) {
            ((DomainBPlusTreeJVSTM_Base)o1).treeData.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> getInverseRole() {
            return pt.ist.fenixframework.DomainBPlusTreeData.role$$tree;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> getRelationDomainBPlusTreeJVSTMData() {
        return pt.ist.fenixframework.DomainBPlusTreeData.getRelationDomainBPlusTreeJVSTMData();
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.DomainBPlusTreeData> treeData;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        treeData = OwnedVBox.makeNew(this, "treeData", allocateOnly, true);
        if (!allocateOnly) this.treeData.put(null);
        
    }
    
    // Constructors
    protected  DomainBPlusTreeJVSTM_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainBPlusTreeData getTreeData() {
        return this.treeData.get();
    }
    
    public void setTreeData(pt.ist.fenixframework.DomainBPlusTreeData treeData) {
        getRelationDomainBPlusTreeJVSTMData().add(treeData, (pt.ist.fenixframework.DomainBPlusTreeJVSTM)this);
    }
    
    
}
