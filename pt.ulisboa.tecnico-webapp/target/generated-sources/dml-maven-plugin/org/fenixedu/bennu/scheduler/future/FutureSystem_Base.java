package org.fenixedu.bennu.scheduler.future;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class FutureSystem_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> role$$persistentFuture = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.scheduler.future.PersistentFuture> getSet(org.fenixedu.bennu.scheduler.future.FutureSystem o1) {
            return ((FutureSystem_Base)o1).get$rl$persistentFuture();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFuture.role$$futureSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> role$$incompletePersistentFuture = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.scheduler.future.PersistentFuture> getSet(org.fenixedu.bennu.scheduler.future.FutureSystem o1) {
            return ((FutureSystem_Base)o1).get$rl$incompletePersistentFuture();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getInverseRole() {
            return org.fenixedu.bennu.scheduler.future.PersistentFuture.role$$incompleteFutureSystem;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.scheduler.future.FutureSystem o1) {
            return ((FutureSystem_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.scheduler.future.FutureSystem o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((FutureSystem_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.scheduler.future.FutureSystem> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$futureSystem;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemPersistentFuture() {
        return org.fenixedu.bennu.scheduler.future.PersistentFuture.getRelationFutureSystemPersistentFuture();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.PersistentFuture,org.fenixedu.bennu.scheduler.future.FutureSystem> getRelationFutureSystemIncompletePersistentFuture() {
        return org.fenixedu.bennu.scheduler.future.PersistentFuture.getRelationFutureSystemIncompletePersistentFuture();
    }
    
    private final static class FutureSystemBennu {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "FutureSystemBennu");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.core.domain.Bennu> getRelationFutureSystemBennu() {
        return FutureSystemBennu.relation;
    }
    
    static {
        FutureSystemBennu.relation.setRelationName("org.fenixedu.bennu.scheduler.future.FutureSystem.FutureSystemBennu");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> get$rl$persistentFuture() {
        return get$$relationList("persistentFuture", getRelationFutureSystemPersistentFuture().getInverseRelation());
        
    }
    private RelationList<org.fenixedu.bennu.scheduler.future.FutureSystem,org.fenixedu.bennu.scheduler.future.PersistentFuture> get$rl$incompletePersistentFuture() {
        return get$$relationList("incompletePersistentFuture", getRelationFutureSystemIncompletePersistentFuture().getInverseRelation());
        
    }
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  FutureSystem_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addPersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        getRelationFutureSystemPersistentFuture().add(persistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public void removePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture persistentFuture) {
        getRelationFutureSystemPersistentFuture().remove(persistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getPersistentFutureSet() {
        return get$rl$persistentFuture();
    }
    
    public void set$persistentFuture(OJBFunctionalSetWrapper persistentFuture) {
        get$rl$persistentFuture().setFromOJB(this, "persistentFuture", persistentFuture);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getPersistentFuture() {
        return getPersistentFutureSet();
    }
    
    @Deprecated
    public int getPersistentFutureCount() {
        return getPersistentFutureSet().size();
    }
    
    public void addIncompletePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture incompletePersistentFuture) {
        getRelationFutureSystemIncompletePersistentFuture().add(incompletePersistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public void removeIncompletePersistentFuture(org.fenixedu.bennu.scheduler.future.PersistentFuture incompletePersistentFuture) {
        getRelationFutureSystemIncompletePersistentFuture().remove(incompletePersistentFuture, (org.fenixedu.bennu.scheduler.future.FutureSystem)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getIncompletePersistentFutureSet() {
        return get$rl$incompletePersistentFuture();
    }
    
    public void set$incompletePersistentFuture(OJBFunctionalSetWrapper incompletePersistentFuture) {
        get$rl$incompletePersistentFuture().setFromOJB(this, "incompletePersistentFuture", incompletePersistentFuture);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.scheduler.future.PersistentFuture> getIncompletePersistentFuture() {
        return getIncompletePersistentFutureSet();
    }
    
    @Deprecated
    public int getIncompletePersistentFutureCount() {
        return getIncompletePersistentFutureSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationFutureSystemBennu().add((org.fenixedu.bennu.scheduler.future.FutureSystem)this, bennu);
    }
    
    private java.lang.Long get$oidBennu() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).bennu;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfBennu() {
        if (getBennu() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$persistentFuture().size() > 0) handleAttemptToDeleteConnectedObject("PersistentFuture");
        if (get$rl$incompletePersistentFuture().size() > 0) handleAttemptToDeleteConnectedObject("IncompletePersistentFuture");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("persistentFuture")) return getRelationFutureSystemPersistentFuture().getInverseRelation();
        if (attrName.equals("incompletePersistentFuture")) return getRelationFutureSystemIncompletePersistentFuture().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("persistentFuture", getRelationFutureSystemPersistentFuture().getInverseRelation());
        get$$relationList("incompletePersistentFuture", getRelationFutureSystemIncompletePersistentFuture().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.bennu = this.bennu;
            
        }
        
    }
    
}
