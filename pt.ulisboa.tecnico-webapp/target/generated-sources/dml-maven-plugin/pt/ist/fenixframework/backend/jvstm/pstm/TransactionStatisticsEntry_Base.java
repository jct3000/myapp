package pt.ist.fenixframework.backend.jvstm.pstm;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class TransactionStatisticsEntry_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    
    // Slots
    
    // Role Slots
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        
    }
    
    // Constructors
    protected  TransactionStatisticsEntry_Base() {
        super();
    }
    
    // Getters and Setters
    
    public java.lang.String getServer() {
        return ((DO_State)this.get$obj$state(false)).server;
    }
    
    public void setServer(java.lang.String server) {
        ((DO_State)this.get$obj$state(true)).server = server;
    }
    
    private java.lang.String get$server() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).server;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$server(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).server = (java.lang.String)((value == null) ? null : value);
    }
    
    public int getNumReport() {
        return ((DO_State)this.get$obj$state(false)).numReport;
    }
    
    public void setNumReport(int numReport) {
        ((DO_State)this.get$obj$state(true)).numReport = numReport;
    }
    
    private int get$numReport() {
        int value = ((DO_State)this.get$obj$state(false)).numReport;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForint(value);
    }
    
    private final void set$numReport(int value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numReport = (int)(value);
    }
    
    public long getNumReads() {
        return ((DO_State)this.get$obj$state(false)).numReads;
    }
    
    public void setNumReads(long numReads) {
        ((DO_State)this.get$obj$state(true)).numReads = numReads;
    }
    
    private long get$numReads() {
        long value = ((DO_State)this.get$obj$state(false)).numReads;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForlong(value);
    }
    
    private final void set$numReads(long value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numReads = (long)(value);
    }
    
    public long getNumWrites() {
        return ((DO_State)this.get$obj$state(false)).numWrites;
    }
    
    public void setNumWrites(long numWrites) {
        ((DO_State)this.get$obj$state(true)).numWrites = numWrites;
    }
    
    private long get$numWrites() {
        long value = ((DO_State)this.get$obj$state(false)).numWrites;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForlong(value);
    }
    
    private final void set$numWrites(long value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numWrites = (long)(value);
    }
    
    public long getNumAborts() {
        return ((DO_State)this.get$obj$state(false)).numAborts;
    }
    
    public void setNumAborts(long numAborts) {
        ((DO_State)this.get$obj$state(true)).numAborts = numAborts;
    }
    
    private long get$numAborts() {
        long value = ((DO_State)this.get$obj$state(false)).numAborts;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForlong(value);
    }
    
    private final void set$numAborts(long value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numAborts = (long)(value);
    }
    
    public long getNumConflicts() {
        return ((DO_State)this.get$obj$state(false)).numConflicts;
    }
    
    public void setNumConflicts(long numConflicts) {
        ((DO_State)this.get$obj$state(true)).numConflicts = numConflicts;
    }
    
    private long get$numConflicts() {
        long value = ((DO_State)this.get$obj$state(false)).numConflicts;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForlong(value);
    }
    
    private final void set$numConflicts(long value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).numConflicts = (long)(value);
    }
    
    public long getSecondsBetweenReports() {
        return ((DO_State)this.get$obj$state(false)).secondsBetweenReports;
    }
    
    public void setSecondsBetweenReports(long secondsBetweenReports) {
        ((DO_State)this.get$obj$state(true)).secondsBetweenReports = secondsBetweenReports;
    }
    
    private long get$secondsBetweenReports() {
        long value = ((DO_State)this.get$obj$state(false)).secondsBetweenReports;
        return pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForlong(value);
    }
    
    private final void set$secondsBetweenReports(long value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).secondsBetweenReports = (long)(value);
    }
    
    public org.joda.time.DateTime getWhen() {
        return ((DO_State)this.get$obj$state(false)).when;
    }
    
    public void setWhen(org.joda.time.DateTime when) {
        ((DO_State)this.get$obj$state(true)).when = when;
    }
    
    private java.sql.Timestamp get$when() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).when;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$when(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).when = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats getReadOnlyReads() {
        return ((DO_State)this.get$obj$state(false)).readOnlyReads;
    }
    
    public void setReadOnlyReads(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readOnlyReads) {
        ((DO_State)this.get$obj$state(true)).readOnlyReads = readOnlyReads;
    }
    
    private java.lang.String get$readOnlyReads() {
        pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats value = ((DO_State)this.get$obj$state(false)).readOnlyReads;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(ValueTypeSerializer.serialize$CounterStats(value));
    }
    
    private final void set$readOnlyReads(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).readOnlyReads = (pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats)((value == null) ? null : ValueTypeSerializer.deSerialize$CounterStats(value));
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats getReadWriteReads() {
        return ((DO_State)this.get$obj$state(false)).readWriteReads;
    }
    
    public void setReadWriteReads(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readWriteReads) {
        ((DO_State)this.get$obj$state(true)).readWriteReads = readWriteReads;
    }
    
    private java.lang.String get$readWriteReads() {
        pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats value = ((DO_State)this.get$obj$state(false)).readWriteReads;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(ValueTypeSerializer.serialize$CounterStats(value));
    }
    
    private final void set$readWriteReads(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).readWriteReads = (pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats)((value == null) ? null : ValueTypeSerializer.deSerialize$CounterStats(value));
    }
    
    public pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats getReadWriteWrites() {
        return ((DO_State)this.get$obj$state(false)).readWriteWrites;
    }
    
    public void setReadWriteWrites(pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readWriteWrites) {
        ((DO_State)this.get$obj$state(true)).readWriteWrites = readWriteWrites;
    }
    
    private java.lang.String get$readWriteWrites() {
        pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats value = ((DO_State)this.get$obj$state(false)).readWriteWrites;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(ValueTypeSerializer.serialize$CounterStats(value));
    }
    
    private final void set$readWriteWrites(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).readWriteWrites = (pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats)((value == null) ? null : ValueTypeSerializer.deSerialize$CounterStats(value));
    }
    
    // Role Methods
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$server(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "SERVER"), state);
        set$numReport(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readint(rs, "NUM_REPORT"), state);
        set$numReads(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readlong(rs, "NUM_READS"), state);
        set$numWrites(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readlong(rs, "NUM_WRITES"), state);
        set$numAborts(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readlong(rs, "NUM_ABORTS"), state);
        set$numConflicts(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readlong(rs, "NUM_CONFLICTS"), state);
        set$secondsBetweenReports(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readlong(rs, "SECONDS_BETWEEN_REPORTS"), state);
        set$when(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "WHEN"), state);
        set$readOnlyReads(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "READ_ONLY_READS"), state);
        set$readWriteReads(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "READ_WRITE_READS"), state);
        set$readWriteWrites(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "READ_WRITE_WRITES"), state);
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String server;
        private int numReport;
        private long numReads;
        private long numWrites;
        private long numAborts;
        private long numConflicts;
        private long secondsBetweenReports;
        private org.joda.time.DateTime when;
        private pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readOnlyReads;
        private pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readWriteReads;
        private pt.ist.fenixframework.backend.jvstm.pstm.TransactionStatistics.CounterStats readWriteWrites;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.server = this.server;
            newCasted.numReport = this.numReport;
            newCasted.numReads = this.numReads;
            newCasted.numWrites = this.numWrites;
            newCasted.numAborts = this.numAborts;
            newCasted.numConflicts = this.numConflicts;
            newCasted.secondsBetweenReports = this.secondsBetweenReports;
            newCasted.when = this.when;
            newCasted.readOnlyReads = this.readOnlyReads;
            newCasted.readWriteReads = this.readWriteReads;
            newCasted.readWriteWrites = this.readWriteWrites;
            
        }
        
    }
    
}
