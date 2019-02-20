package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class BPlusTree_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.BPlusTree,pt.ist.fenixframework.adt.bplustree.AbstractNode> role$$root = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.BPlusTree,pt.ist.fenixframework.adt.bplustree.AbstractNode>() {
        public pt.ist.fenixframework.adt.bplustree.AbstractNode getValue(pt.ist.fenixframework.adt.bplustree.BPlusTree o1) {
            return ((BPlusTree_Base)o1).root.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.BPlusTree o1, pt.ist.fenixframework.adt.bplustree.AbstractNode o2) {
            ((BPlusTree_Base)o1).root.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.BPlusTree> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.BPlusTree>(this);
        }
        
    };
    
    private final static class AdtBPlusTreeHasRootNode {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTree,pt.ist.fenixframework.adt.bplustree.AbstractNode> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTree,pt.ist.fenixframework.adt.bplustree.AbstractNode>(role$$root, "AdtBPlusTreeHasRootNode", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.BPlusTree,pt.ist.fenixframework.adt.bplustree.AbstractNode> getRelationAdtBPlusTreeHasRootNode() {
        return AdtBPlusTreeHasRootNode.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.AbstractNode> root;
    
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
    protected  BPlusTree_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.AbstractNode getRoot() {
        return this.root.get();
    }
    
    public void setRoot(pt.ist.fenixframework.adt.bplustree.AbstractNode root) {
        getRelationAdtBPlusTreeHasRootNode().add((pt.ist.fenixframework.adt.bplustree.BPlusTree)this, root);
    }
    
    
}
