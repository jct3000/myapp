package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class InnerNodeArray_Base extends pt.ist.fenixframework.adt.bplustree.AbstractNodeArray {
    // Static Slots
    
    // Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.DoubleArray<AbstractNodeArray>> subNodes;
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        subNodes = OwnedVBox.makeNew(this, "subNodes", allocateOnly, false);
        if (!allocateOnly) this.subNodes.put(null);
        
    }
    
    // Constructors
    protected  InnerNodeArray_Base() {
        super();
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.adt.bplustree.DoubleArray<AbstractNodeArray> getSubNodes() {
        return this.subNodes.get();
    }
    
    public void setSubNodes(pt.ist.fenixframework.adt.bplustree.DoubleArray<AbstractNodeArray> subNodes) {
        this.subNodes.put(subNodes);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
