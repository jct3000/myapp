package pt.ist.fenixframework.backend.jvstm.pstm;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class FenixFrameworkData_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> role$$FFTxStatsEntry = new pt.ist.fenixframework.dml.runtime.RoleMany<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getSet(pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData o1) {
            return (pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>) ((FenixFrameworkData_Base) o1).FFTxStatsEntry;
        }
        public pt.ist.fenixframework.dml.runtime.Role<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData> getInverseRole() {
            return new pt.ist.fenixframework.dml.runtime.RoleEmpty<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry,pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData>(this);
        }
        
    };
    
    private final static class FenixDataHasTransactionStatistics {
        private static final pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> relation = new pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>(role$$FFTxStatsEntry, "FenixDataHasTransactionStatistics", pt.ist.fenixframework.txintrospector.TxStats.STATS_LISTENER);
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getRelationFenixDataHasTransactionStatistics() {
        return FenixDataHasTransactionStatistics.relation;
    }
    private static pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> keyFunction$$FFTxStatsEntry = new pt.ist.fenixframework.dml.runtime.KeyFunction<Comparable<?>,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>() { public Comparable<?> getKey(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry value) { return value.getOid(); } public boolean allowMultipleKeys() {return false; }};
    
    // Slots
    
    // Role Slots
    private OwnedVBox<pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>> internal$FFTxStatsEntry$collectionBox;
    private pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> FFTxStatsEntry;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        internal$FFTxStatsEntry$collectionBox = OwnedVBox.makeNew(this, "internal$FFTxStatsEntry$collectionBox", allocateOnly, true);
        if (allocateOnly) {
            final pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> mapGetter = new pt.ist.fenixframework.dml.runtime.DomainBasedMap.Getter<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>() {
                public final pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> get() { return internal$getFFTxStatsEntry$collection(); }
            };
            FFTxStatsEntry = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>((pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData)this, getRelationFenixDataHasTransactionStatistics(), mapGetter, keyFunction$$FFTxStatsEntry);
        } else {
            pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> internalMap = new pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>();
            this.internal$FFTxStatsEntry$collectionBox.put(internalMap);
            FFTxStatsEntry = new pt.ist.fenixframework.dml.runtime.RelationAwareSet<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>((pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData)this, getRelationFenixDataHasTransactionStatistics(), internalMap, keyFunction$$FFTxStatsEntry);
        }
        
    }
    
    // Constructors
    protected  FenixFrameworkData_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addFFTxStatsEntry(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry FFTxStatsEntry) {
        getRelationFenixDataHasTransactionStatistics().add((pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData)this, FFTxStatsEntry);
    }
    
    public void removeFFTxStatsEntry(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry FFTxStatsEntry) {
        getRelationFenixDataHasTransactionStatistics().remove((pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData)this, FFTxStatsEntry);
    }
    
    public pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> internal$getFFTxStatsEntry$collection() {
        return (pt.ist.fenixframework.adt.bplustree.BPlusTree<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry>)this.internal$FFTxStatsEntry$collectionBox.get();
    }
    
    public java.util.Set<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getFFTxStatsEntrySet() {
        return this.FFTxStatsEntry;
    }
    
    
}
