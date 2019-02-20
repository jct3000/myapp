package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainInnerNode_Base extends pt.ist.fenixframework.adt.bplustree.InnerNode {
    // Static Slots
    
    // Slots
    private OwnedVBox<java.util.TreeMap<Comparable,AbstractNode>> subNodesByOid;
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        subNodesByOid = OwnedVBox.makeNew(this, "subNodesByOid", allocateOnly, false);
        if (!allocateOnly) this.subNodesByOid.put(null);
        
    }
    
    // Constructors
    protected  DomainInnerNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.util.TreeMap<Comparable,AbstractNode> getSubNodesByOid() {
        return this.subNodesByOid.get();
    }
    
    public void setSubNodesByOid(java.util.TreeMap<Comparable,AbstractNode> subNodesByOid) {
        this.subNodesByOid.put(subNodesByOid);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
