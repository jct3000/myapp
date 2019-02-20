package org.fenixedu.bennu.io.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class GenericFile_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileStorage> role$$storage = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileStorage>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileStorage getValue(org.fenixedu.bennu.io.domain.GenericFile o1) {
            return ((GenericFile_Base.DO_State)o1.get$obj$state(false)).storage;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.GenericFile o1, org.fenixedu.bennu.io.domain.FileStorage o2) {
            ((GenericFile_Base.DO_State)o1.get$obj$state(true)).storage = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileStorage.role$$file;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileSupport> role$$fileSupport = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.io.domain.GenericFile,org.fenixedu.bennu.io.domain.FileSupport>() {
        @Override
        public org.fenixedu.bennu.io.domain.FileSupport getValue(org.fenixedu.bennu.io.domain.GenericFile o1) {
            return ((GenericFile_Base.DO_State)o1.get$obj$state(false)).fileSupport;
        }
        @Override
        public void setValue(org.fenixedu.bennu.io.domain.GenericFile o1, org.fenixedu.bennu.io.domain.FileSupport o2) {
            ((GenericFile_Base.DO_State)o1.get$obj$state(true)).fileSupport = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getInverseRole() {
            return org.fenixedu.bennu.io.domain.FileSupport.role$$file;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileStorage,org.fenixedu.bennu.io.domain.GenericFile> getRelationFileStorageFile() {
        return org.fenixedu.bennu.io.domain.FileStorage.getRelationFileStorageFile();
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.io.domain.FileSupport,org.fenixedu.bennu.io.domain.GenericFile> getRelationGenericFiles() {
        return org.fenixedu.bennu.io.domain.FileSupport.getRelationGenericFiles();
    }
    
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
    protected  GenericFile_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.Long getSize() {
        return ((DO_State)this.get$obj$state(false)).size;
    }
    
    protected void setSize(java.lang.Long size) {
        ((DO_State)this.get$obj$state(true)).size = size;
    }
    
    private java.lang.Long get$size() {
        java.lang.Long value = ((DO_State)this.get$obj$state(false)).size;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForLong(value);
    }
    
    private final void set$size(java.lang.Long value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).size = (java.lang.Long)((value == null) ? null : value);
    }
    
    protected org.joda.time.DateTime getCreationDate() {
        return ((DO_State)this.get$obj$state(false)).creationDate;
    }
    
    protected void setCreationDate(org.joda.time.DateTime creationDate) {
        ((DO_State)this.get$obj$state(true)).creationDate = creationDate;
    }
    
    private java.sql.Timestamp get$creationDate() {
        org.joda.time.DateTime value = ((DO_State)this.get$obj$state(false)).creationDate;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForDateTime(value);
    }
    
    private final void set$creationDate(org.joda.time.DateTime value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).creationDate = (org.joda.time.DateTime)((value == null) ? null : value);
    }
    
    public java.lang.String getFilename() {
        return ((DO_State)this.get$obj$state(false)).filename;
    }
    
    public void setFilename(java.lang.String filename) {
        ((DO_State)this.get$obj$state(true)).filename = filename;
    }
    
    private java.lang.String get$filename() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).filename;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$filename(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).filename = (java.lang.String)((value == null) ? null : value);
    }
    
    public java.lang.String getDisplayName() {
        return ((DO_State)this.get$obj$state(false)).displayName;
    }
    
    public void setDisplayName(java.lang.String displayName) {
        ((DO_State)this.get$obj$state(true)).displayName = displayName;
    }
    
    private java.lang.String get$displayName() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).displayName;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$displayName(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).displayName = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getContentType() {
        return ((DO_State)this.get$obj$state(false)).contentType;
    }
    
    protected void setContentType(java.lang.String contentType) {
        ((DO_State)this.get$obj$state(true)).contentType = contentType;
    }
    
    private java.lang.String get$contentType() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).contentType;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$contentType(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).contentType = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getContentKey() {
        return ((DO_State)this.get$obj$state(false)).contentKey;
    }
    
    protected void setContentKey(java.lang.String contentKey) {
        ((DO_State)this.get$obj$state(true)).contentKey = contentKey;
    }
    
    private java.lang.String get$contentKey() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).contentKey;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$contentKey(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).contentKey = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getChecksum() {
        return ((DO_State)this.get$obj$state(false)).checksum;
    }
    
    protected void setChecksum(java.lang.String checksum) {
        ((DO_State)this.get$obj$state(true)).checksum = checksum;
    }
    
    private java.lang.String get$checksum() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).checksum;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$checksum(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).checksum = (java.lang.String)((value == null) ? null : value);
    }
    
    protected java.lang.String getChecksumAlgorithm() {
        return ((DO_State)this.get$obj$state(false)).checksumAlgorithm;
    }
    
    protected void setChecksumAlgorithm(java.lang.String checksumAlgorithm) {
        ((DO_State)this.get$obj$state(true)).checksumAlgorithm = checksumAlgorithm;
    }
    
    private java.lang.String get$checksumAlgorithm() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).checksumAlgorithm;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$checksumAlgorithm(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).checksumAlgorithm = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.io.domain.FileStorage getStorage() {
        return ((DO_State)this.get$obj$state(false)).storage;
    }
    
    protected void setStorage(org.fenixedu.bennu.io.domain.FileStorage storage) {
        getRelationFileStorageFile().add(storage, (org.fenixedu.bennu.io.domain.GenericFile)this);
    }
    
    private java.lang.Long get$oidStorage() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).storage;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfStorage() {
        if (getStorage() == null) return false;
        return true;
    }
    
    protected org.fenixedu.bennu.io.domain.FileSupport getFileSupport() {
        return ((DO_State)this.get$obj$state(false)).fileSupport;
    }
    
    protected void setFileSupport(org.fenixedu.bennu.io.domain.FileSupport fileSupport) {
        getRelationGenericFiles().add(fileSupport, (org.fenixedu.bennu.io.domain.GenericFile)this);
    }
    
    private java.lang.Long get$oidFileSupport() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).fileSupport;
        return (value == null) ? null : value.getOid();
    }
    
    @pt.ist.fenixframework.consistencyPredicates.ConsistencyPredicate
    public final boolean checkMultiplicityOfFileSupport() {
        if (getFileSupport() == null) return false;
        return true;
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.storage != null) handleAttemptToDeleteConnectedObject("Storage");
        if (castedState.fileSupport != null) handleAttemptToDeleteConnectedObject("FileSupport");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$size(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readLong(rs, "SIZE"), state);
        set$creationDate(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDateTime(rs, "CREATION_DATE"), state);
        set$filename(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "FILENAME"), state);
        set$displayName(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "DISPLAY_NAME"), state);
        set$contentType(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CONTENT_TYPE"), state);
        set$contentKey(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CONTENT_KEY"), state);
        set$checksum(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CHECKSUM"), state);
        set$checksumAlgorithm(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "CHECKSUM_ALGORITHM"), state);
        castedState.storage = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_STORAGE");
        castedState.fileSupport = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_FILE_SUPPORT");
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
        private java.lang.Long size;
        private org.joda.time.DateTime creationDate;
        private java.lang.String filename;
        private java.lang.String displayName;
        private java.lang.String contentType;
        private java.lang.String contentKey;
        private java.lang.String checksum;
        private java.lang.String checksumAlgorithm;
        private org.fenixedu.bennu.io.domain.FileStorage storage;
        private org.fenixedu.bennu.io.domain.FileSupport fileSupport;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.size = this.size;
            newCasted.creationDate = this.creationDate;
            newCasted.filename = this.filename;
            newCasted.displayName = this.displayName;
            newCasted.contentType = this.contentType;
            newCasted.contentKey = this.contentKey;
            newCasted.checksum = this.checksum;
            newCasted.checksumAlgorithm = this.checksumAlgorithm;
            newCasted.storage = this.storage;
            newCasted.fileSupport = this.fileSupport;
            
        }
        
    }
    
}
