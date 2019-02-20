package pt.ist.fenixframework.backend.jvstm.pstm;


@SuppressWarnings("all")
public abstract class FenixFrameworkData_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.backend.jvstm.pstm.FenixFrameworkData,pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getRelationFenixDataHasTransactionStatistics() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  FenixFrameworkData_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addFFTxStatsEntry(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry FFTxStatsEntry) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeFFTxStatsEntry(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry FFTxStatsEntry) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatisticsEntry> getFFTxStatsEntrySet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
