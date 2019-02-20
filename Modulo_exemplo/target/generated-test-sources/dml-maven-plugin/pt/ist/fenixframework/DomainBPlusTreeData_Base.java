package pt.ist.fenixframework;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainBPlusTreeData_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> role$$tree = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM>() {
        public pt.ist.fenixframework.DomainBPlusTreeJVSTM getValue(pt.ist.fenixframework.DomainBPlusTreeData o1) {
            return ((DomainBPlusTreeData_Base)o1).tree.get();
        }
        public void setValue(pt.ist.fenixframework.DomainBPlusTreeData o1, pt.ist.fenixframework.DomainBPlusTreeJVSTM o2) {
            ((DomainBPlusTreeData_Base)o1).tree.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.DomainBPlusTreeJVSTM,pt.ist.fenixframework.DomainBPlusTreeData> getInverseRole() {
            return pt.ist.fenixframework.DomainBPlusTreeJVSTM.role$$treeData;
        }
        
    };
    
    private final static class DomainBPlusTreeJVSTMData {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM>(role$$tree, "DomainBPlusTreeJVSTMData", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainBPlusTreeData,pt.ist.fenixframework.DomainBPlusTreeJVSTM> getRelationDomainBPlusTreeJVSTMData() {
        return DomainBPlusTreeJVSTMData.relation;
    }
    
    // Slots
    private OwnedVBox<Integer> size;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.DomainBPlusTreeJVSTM> tree;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        size = OwnedVBox.makeNew(this, "size", allocateOnly, false);
        if (!allocateOnly) this.size.put(0);
        tree = OwnedVBox.makeNew(this, "tree", allocateOnly, true);
        if (!allocateOnly) this.tree.put(null);
        
    }
    
    // Constructors
    protected  DomainBPlusTreeData_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public int getSize() {
        return this.size.get();
    }
    
    public void setSize(int size) {
        this.size.put(size);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.DomainBPlusTreeJVSTM getTree() {
        return this.tree.get();
    }
    
    public void setTree(pt.ist.fenixframework.DomainBPlusTreeJVSTM tree) {
        getRelationDomainBPlusTreeJVSTMData().add((pt.ist.fenixframework.DomainBPlusTreeData)this, tree);
    }
    
    
}
