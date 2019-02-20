package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class LeafNodeArray_Base extends pt.ist.fenixframework.adt.bplustree.AbstractNodeArray {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> role$$previous = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray>() {
        public pt.ist.fenixframework.adt.bplustree.LeafNodeArray getValue(pt.ist.fenixframework.adt.bplustree.LeafNodeArray o1) {
            return ((LeafNodeArray_Base)o1).previous.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.LeafNodeArray o1, pt.ist.fenixframework.adt.bplustree.LeafNodeArray o2) {
            ((LeafNodeArray_Base)o1).previous.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> getInverseRole() {
            return pt.ist.fenixframework.adt.bplustree.LeafNodeArray.role$$next;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> role$$next = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray>() {
        public pt.ist.fenixframework.adt.bplustree.LeafNodeArray getValue(pt.ist.fenixframework.adt.bplustree.LeafNodeArray o1) {
            return ((LeafNodeArray_Base)o1).next.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.LeafNodeArray o1, pt.ist.fenixframework.adt.bplustree.LeafNodeArray o2) {
            ((LeafNodeArray_Base)o1).next.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> getInverseRole() {
            return pt.ist.fenixframework.adt.bplustree.LeafNodeArray.role$$previous;
        }
        
    };
    
    
    private final static class LeafNodeArrayHasSibling {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray>(role$$next, "LeafNodeArrayHasSibling", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.LeafNodeArray,pt.ist.fenixframework.adt.bplustree.LeafNodeArray> getRelationLeafNodeArrayHasSibling() {
        return LeafNodeArrayHasSibling.relation;
    }
    
    // Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.DoubleArray<java.io.Serializable>> entries;
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.LeafNodeArray> previous;
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.LeafNodeArray> next;
    
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
    protected  LeafNodeArray_Base() {
        super();
    }
    
    // Getters and Setters
    
    public pt.ist.fenixframework.adt.bplustree.DoubleArray<java.io.Serializable> getEntries() {
        return this.entries.get();
    }
    
    public void setEntries(pt.ist.fenixframework.adt.bplustree.DoubleArray<java.io.Serializable> entries) {
        this.entries.put(entries);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.LeafNodeArray getPrevious() {
        return this.previous.get();
    }
    
    public void setPrevious(pt.ist.fenixframework.adt.bplustree.LeafNodeArray previous) {
        getRelationLeafNodeArrayHasSibling().add(previous, (pt.ist.fenixframework.adt.bplustree.LeafNodeArray)this);
    }
    
    public pt.ist.fenixframework.adt.bplustree.LeafNodeArray getNext() {
        return this.next.get();
    }
    
    public void setNext(pt.ist.fenixframework.adt.bplustree.LeafNodeArray next) {
        getRelationLeafNodeArrayHasSibling().add((pt.ist.fenixframework.adt.bplustree.LeafNodeArray)this, next);
    }
    
    
}
