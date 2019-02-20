package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class BPlusTreeArray_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.BPlusTreeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.BPlusTreeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray>() {
        public pt.ist.fenixframework.adt.bplustree.AbstractNodeArray getValue(pt.ist.fenixframework.adt.bplustree.BPlusTreeArray o1) {
            return ((BPlusTreeArray_Base)o1).root.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.BPlusTreeArray o1, pt.ist.fenixframework.adt.bplustree.AbstractNodeArray o2) {
            ((BPlusTreeArray_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.BPlusTreeArray> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.BPlusTreeArray>(this);
        }
        
    };
    
    private final static class BPlusTreeArrayHasRootNode {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTreeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTreeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray>(role$$root, "BPlusTreeArrayHasRootNode", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTreeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray> getRelationBPlusTreeArrayHasRootNode() {
        return BPlusTreeArrayHasRootNode.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray> root;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        root = OwnedVBox.makeNew(this, "root", allocateOnly, true);
        if (!allocateOnly) this.root.put(null);
        
    }
    
    // Constructors
    protected  BPlusTreeArray_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.AbstractNodeArray getRoot() {
        return this.root.get();
    }
    
    public void setRoot(pt.ist.fenixframework.adt.bplustree.AbstractNodeArray root) {
        getRelationBPlusTreeArrayHasRootNode().add((pt.ist.fenixframework.adt.bplustree.BPlusTreeArray)this, root);
    }
    
    
}
