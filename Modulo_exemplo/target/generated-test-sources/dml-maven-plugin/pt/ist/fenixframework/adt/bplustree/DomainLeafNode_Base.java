package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class DomainLeafNode_Base extends pt.ist.fenixframework.adt.bplustree.LeafNode {
    // Static Slots
    
    // Slots
    private OwnedVBox<java.util.TreeMap<Comparable,pt.ist.fenixframework.core.AbstractDomainObject>> domainEntries;
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        domainEntries = OwnedVBox.makeNew(this, "domainEntries", allocateOnly, false);
        if (!allocateOnly) this.domainEntries.put(null);
        
    }
    
    // Constructors
    protected  DomainLeafNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.util.TreeMap<Comparable,pt.ist.fenixframework.core.AbstractDomainObject> getDomainEntries() {
        return this.domainEntries.get();
    }
    
    public void setDomainEntries(java.util.TreeMap<Comparable,pt.ist.fenixframework.core.AbstractDomainObject> domainEntries) {
        this.domainEntries.put(domainEntries);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
