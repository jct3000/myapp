package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class AbstractNode_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.InnerNode> role$$parent = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.InnerNode>() {
        public pt.ist.fenixframework.adt.bplustree.InnerNode getValue(pt.ist.fenixframework.adt.bplustree.AbstractNode o1) {
            return ((AbstractNode_Base)o1).parent.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.AbstractNode o1, pt.ist.fenixframework.adt.bplustree.InnerNode o2) {
            ((AbstractNode_Base)o1).parent.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.InnerNode,pt.ist.fenixframework.adt.bplustree.AbstractNode> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.bplustree.InnerNode,pt.ist.fenixframework.adt.bplustree.AbstractNode>(this);
        }
        
    };
    
    private final static class AdtNodeHasParent {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.InnerNode> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.InnerNode>(role$$parent, "AdtNodeHasParent", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNode,pt.ist.fenixframework.adt.bplustree.InnerNode> getRelationAdtNodeHasParent() {
        return AdtNodeHasParent.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.InnerNode> parent;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        parent = OwnedVBox.makeNew(this, "parent", allocateOnly, true);
        if (!allocateOnly) this.parent.put(null);
        
    }
    
    // Constructors
    protected  AbstractNode_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.InnerNode getParent() {
        return this.parent.get();
    }
    
    public void setParent(pt.ist.fenixframework.adt.bplustree.InnerNode parent) {
        getRelationAdtNodeHasParent().add((pt.ist.fenixframework.adt.bplustree.AbstractNode)this, parent);
    }
    
    
}
