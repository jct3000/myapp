package pt.ist.fenixframework.backend.jvstm.pstm;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class FenixFrameworkData_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> role$$FFTxStatsEntry = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getSet(pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData o1) {
            return ((FenixFrameworkData_Base)o1).get$rl$FFTxStatsEntry();
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData>(this);
        }
        
    };
    
    private final static class FenixDataHasTransactionStatistics {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>(role$$FFTxStatsEntry, "FenixDataHasTransactionStatistics");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getRelationFenixDataHasTransactionStatistics() {
        return FenixDataHasTransactionStatistics.relation;
    }
    
    static {
        FenixDataHasTransactionStatistics.relation.setRelationName("pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData.FenixDataHasTransactionStatistics");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> get$rl$FFTxStatsEntry() {
        return get$$relationList("FFTxStatsEntry", getRelationFenixDataHasTransactionStatistics());
        
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
    protected  FenixFrameworkData_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addFFTxStatsEntry(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry FFTxStatsEntry) {
        getRelationFenixDataHasTransactionStatistics().add((pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData)this, FFTxStatsEntry);
    }
    
    public void removeFFTxStatsEntry(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry FFTxStatsEntry) {
        getRelationFenixDataHasTransactionStatistics().remove((pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData)this, FFTxStatsEntry);
    }
    
    public java.util.Set<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getFFTxStatsEntrySet() {
        return get$rl$FFTxStatsEntry();
    }
    
    public void set$FFTxStatsEntry(OJBFunctionalSetWrapper FFTxStatsEntry) {
        get$rl$FFTxStatsEntry().setFromOJB(this, "FFTxStatsEntry", FFTxStatsEntry);
    }
    
    @Deprecated
    public java.util.Set<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getFFTxStatsEntry() {
        return getFFTxStatsEntrySet();
    }
    
    @Deprecated
    public int getFFTxStatsEntryCount() {
        return getFFTxStatsEntrySet().size();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (get$rl$FFTxStatsEntry().size() > 0) handleAttemptToDeleteConnectedObject("FFTxStatsEntry");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("FFTxStatsEntry")) return getRelationFenixDataHasTransactionStatistics();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("FFTxStatsEntry", getRelationFenixDataHasTransactionStatistics());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            
        }
        
    }
    
}
