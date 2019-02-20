package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class InnerNode_Base extends pt.ist.fenixframework.adt.bplustree.AbstractNode {
    // Static Slots
    
    // Slots
    private OwnedVBox<java.util.TreeMap<Comparable,AbstractNode>> subNodes;
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
    protected  InnerNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.util.TreeMap<Comparable,AbstractNode> getSubNodes() {
        return this.subNodes.get();
    }
    
    public void setSubNodes(java.util.TreeMap<Comparable,AbstractNode> subNodes) {
        this.subNodes.put(subNodes);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
