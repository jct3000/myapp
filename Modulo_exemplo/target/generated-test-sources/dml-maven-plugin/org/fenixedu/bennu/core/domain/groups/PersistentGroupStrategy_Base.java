package org.fenixedu.bennu.core.domain.groups;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PersistentGroupStrategy_Base extends org.fenixedu.bennu.core.domain.groups.GroupConstant {
    // Static Slots
    
    // Slots
    private OwnedVBox<org.fenixedu.bennu.core.groups.GroupStrategy> strategy;
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        strategy = OwnedVBox.makeNew(this, "strategy", allocateOnly, false);
        if (!allocateOnly) this.strategy.put(null);
        
    }
    
    // Constructors
    protected  PersistentGroupStrategy_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected org.fenixedu.bennu.core.groups.GroupStrategy getStrategy() {
        return this.strategy.get();
    }
    
    protected void setStrategy(org.fenixedu.bennu.core.groups.GroupStrategy strategy) {
        this.strategy.put(strategy);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
