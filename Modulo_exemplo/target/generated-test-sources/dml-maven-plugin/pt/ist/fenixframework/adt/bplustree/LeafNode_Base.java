package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class LeafNode_Base extends pt.ist.fenixframework.adt.bplustree.AbstractNode {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> role$$previous = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode>() {
        public pt.ist.fenixframework.adt.bplustree.LeafNode getValue(pt.ist.fenixframework.adt.bplustree.LeafNode o1) {
            return ((LeafNode_Base)o1).previous.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.LeafNode o1, pt.ist.fenixframework.adt.bplustree.LeafNode o2) {
            ((LeafNode_Base)o1).previous.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> getInverseRole() {
            return pt.ist.fenixframework.adt.bplustree.LeafNode.role$$next;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> role$$next = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode>() {
        public pt.ist.fenixframework.adt.bplustree.LeafNode getValue(pt.ist.fenixframework.adt.bplustree.LeafNode o1) {
            return ((LeafNode_Base)o1).next.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.LeafNode o1, pt.ist.fenixframework.adt.bplustree.LeafNode o2) {
            ((LeafNode_Base)o1).next.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> getInverseRole() {
            return pt.ist.fenixframework.adt.bplustree.LeafNode.role$$previous;
        }
        
    };
    
    
    private final static class AdtLeafNodeHasSibling {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode>(role$$next, "AdtLeafNodeHasSibling", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNode,pt.ist.fenixframework.adt.bplustree.LeafNode> getRelationAdtLeafNodeHasSibling() {
        return AdtLeafNodeHasSibling.relation;
    }
    
    // Slots
    private OwnedVBox<java.util.TreeMap<Comparable,? extends java.io.Serializable>> entries;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.LeafNode> previous;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.LeafNode> next;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        entries = OwnedVBox.makeNew(this, "entries", allocateOnly, false);
        if (!allocateOnly) this.entries.put(null);
        previous = OwnedVBox.makeNew(this, "previous", allocateOnly, true);
        if (!allocateOnly) this.previous.put(null);
        next = OwnedVBox.makeNew(this, "next", allocateOnly, true);
        if (!allocateOnly) this.next.put(null);
        
    }
    
    // Constructors
    protected  LeafNode_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.util.TreeMap<Comparable,? extends java.io.Serializable> getEntries() {
        return this.entries.get();
    }
    
    public void setEntries(java.util.TreeMap<Comparable,? extends java.io.Serializable> entries) {
        this.entries.put(entries);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.LeafNode getPrevious() {
        return this.previous.get();
    }
    
    public void setPrevious(pt.ist.fenixframework.adt.bplustree.LeafNode previous) {
        getRelationAdtLeafNodeHasSibling().add(previous, (pt.ist.fenixframework.adt.bplustree.LeafNode)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.LeafNode getNext() {
        return this.next.get();
    }
    
    public void setNext(pt.ist.fenixframework.adt.bplustree.LeafNode next) {
        getRelationAdtLeafNodeHasSibling().add((pt.ist.fenixframework.adt.bplustree.LeafNode)this, next);
    }
    
    
}
