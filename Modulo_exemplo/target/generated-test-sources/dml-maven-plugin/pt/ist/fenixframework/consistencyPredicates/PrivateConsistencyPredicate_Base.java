package pt.ist.fenixframework.consistencyPredicates;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class PrivateConsistencyPredicate_Base extends pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate {
    // Static Slots
    
    // Slots
    
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  PrivateConsistencyPredicate_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    
}
