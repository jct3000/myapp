package pt.ist.fenixframework.adt.bplustree;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class AbstractNodeArray_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.InnerNodeArray> role$$parent = new pt.ist.fenixframework.dml.runtime.RoleOne<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.InnerNodeArray>() {
        public pt.ist.fenixframework.adt.bplustree.InnerNodeArray getValue(pt.ist.fenixframework.adt.bplustree.AbstractNodeArray o1) {
            return ((AbstractNodeArray_Base)o1).parent.get();
        }
        public void setValue(pt.ist.fenixframework.adt.bplustree.AbstractNodeArray o1, pt.ist.fenixframework.adt.bplustree.InnerNodeArray o2) {
            ((AbstractNodeArray_Base)o1).parent.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.adt.bplustree.InnerNodeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.adt.bplustree.InnerNodeArray,pt.ist.fenixframework.adt.bplustree.AbstractNodeArray>(this);
        }
        
    };
    
    private final static class NodeArrayHasParent {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.InnerNodeArray> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.InnerNodeArray>(role$$parent, "NodeArrayHasParent", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.adt.bplustree.AbstractNodeArray,pt.ist.fenixframework.adt.bplustree.InnerNodeArray> getRelationNodeArrayHasParent() {
        return NodeArrayHasParent.relation;
    }
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.InnerNodeArray> parent;
    
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
    protected  AbstractNodeArray_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.adt.bplustree.InnerNodeArray getParent() {
        return this.parent.get();
    }
    
    public void setParent(pt.ist.fenixframework.adt.bplustree.InnerNodeArray parent) {
        getRelationNodeArrayHasParent().add((pt.ist.fenixframework.adt.bplustree.AbstractNodeArray)this, parent);
    }
    
    
}
