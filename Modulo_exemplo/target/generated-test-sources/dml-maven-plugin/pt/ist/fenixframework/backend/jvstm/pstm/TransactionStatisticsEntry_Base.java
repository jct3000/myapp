package pt.ist.fenixframework.backend.jvstm.pstm;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class TransactionStatisticsEntry_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    
    // Slots
    private OwnedVBox<java.lang.String> server;
    private OwnedVBox<Integer> numReport;
    private OwnedVBox<Long> numReads;
    private OwnedVBox<Long> numWrites;
    private OwnedVBox<Long> numAborts;
    private OwnedVBox<Long> numConflicts;
    private OwnedVBox<Long> secondsBetweenReports;
    private OwnedVBox<org.joda.time.DateTime> when;
    private OwnedVBox<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats> readOnlyReads;
    private OwnedVBox<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats> readWriteReads;
    private OwnedVBox<pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats> readWriteWrites;
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        server = OwnedVBox.makeNew(this, "server", allocateOnly, false);
        if (!allocateOnly) this.server.put(null);
        numReport = OwnedVBox.makeNew(this, "numReport", allocateOnly, false);
        if (!allocateOnly) this.numReport.put(0);
        numReads = OwnedVBox.makeNew(this, "numReads", allocateOnly, false);
        if (!allocateOnly) this.numReads.put(0L);
        numWrites = OwnedVBox.makeNew(this, "numWrites", allocateOnly, false);
        if (!allocateOnly) this.numWrites.put(0L);
        numAborts = OwnedVBox.makeNew(this, "numAborts", allocateOnly, false);
        if (!allocateOnly) this.numAborts.put(0L);
        numConflicts = OwnedVBox.makeNew(this, "numConflicts", allocateOnly, false);
        if (!allocateOnly) this.numConflicts.put(0L);
        secondsBetweenReports = OwnedVBox.makeNew(this, "secondsBetweenReports", allocateOnly, false);
        if (!allocateOnly) this.secondsBetweenReports.put(0L);
        when = OwnedVBox.makeNew(this, "when", allocateOnly, false);
        if (!allocateOnly) this.when.put(null);
        readOnlyReads = OwnedVBox.makeNew(this, "readOnlyReads", allocateOnly, false);
        if (!allocateOnly) this.readOnlyReads.put(null);
        readWriteReads = OwnedVBox.makeNew(this, "readWriteReads", allocateOnly, false);
        if (!allocateOnly) this.readWriteReads.put(null);
        readWriteWrites = OwnedVBox.makeNew(this, "readWriteWrites", allocateOnly, false);
        if (!allocateOnly) this.readWriteWrites.put(null);
        
    }
    
    // Constructors
    protected  TransactionStatisticsEntry_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    public java.lang.String getServer() {
        return this.server.get();
    }
    
    public void setServer(java.lang.String server) {
        this.server.put(server);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public int getNumReport() {
        return this.numReport.get();
    }
    
    public void setNumReport(int numReport) {
        this.numReport.put(numReport);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public long getNumReads() {
        return this.numReads.get();
    }
    
    public void setNumReads(long numReads) {
        this.numReads.put(numReads);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public long getNumWrites() {
        return this.numWrites.get();
    }
    
    public void setNumWrites(long numWrites) {
        this.numWrites.put(numWrites);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public long getNumAborts() {
        return this.numAborts.get();
    }
    
    public void setNumAborts(long numAborts) {
        this.numAborts.put(numAborts);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public long getNumConflicts() {
        return this.numConflicts.get();
    }
    
    public void setNumConflicts(long numConflicts) {
        this.numConflicts.put(numConflicts);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public long getSecondsBetweenReports() {
        return this.secondsBetweenReports.get();
    }
    
    public void setSecondsBetweenReports(long secondsBetweenReports) {
        this.secondsBetweenReports.put(secondsBetweenReports);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public org.joda.time.DateTime getWhen() {
        return this.when.get();
    }
    
    public void setWhen(org.joda.time.DateTime when) {
        this.when.put(when);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats getReadOnlyReads() {
        return this.readOnlyReads.get();
    }
    
    public void setReadOnlyReads(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readOnlyReads) {
        this.readOnlyReads.put(readOnlyReads);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats getReadWriteReads() {
        return this.readWriteReads.get();
    }
    
    public void setReadWriteReads(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readWriteReads) {
        this.readWriteReads.put(readWriteReads);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats getReadWriteWrites() {
        return this.readWriteWrites.get();
    }
    
    public void setReadWriteWrites(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readWriteWrites) {
        this.readWriteWrites.put(readWriteWrites);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    
}
