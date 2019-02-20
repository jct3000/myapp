package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class Avatar_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Avatar,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Avatar,org.fenixedu.bennu.core.domain.UserProfile>() {
        @Override
        public org.fenixedu.bennu.core.domain.UserProfile getValue(org.fenixedu.bennu.core.domain.Avatar o1) {
            return ((Avatar_Base.DO_State)o1.get$obj$state(false)).profile;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.Avatar o1, org.fenixedu.bennu.core.domain.UserProfile o2) {
            ((Avatar_Base.DO_State)o1.get$obj$state(true)).profile = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$localAvatar;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getRelationUserProfileAvatar() {
        return org.fenixedu.bennu.core.domain.UserProfile.getRelationUserProfileAvatar();
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
    protected  Avatar_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected byte[] getData() {
        return ((DO_State)this.get$obj$state(false)).data;
    }
    
    protected void setData(byte[] data) {
        ((DO_State)this.get$obj$state(true)).data = data;
    }
    
    private java.lang.Object get$data() {
        byte[] value = ((DO_State)this.get$obj$state(false)).data;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForbytearray(value);
    }
    
    private final void set$data(byte[] value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).data = (byte[])((value == null) ? null : value);
    }
    
    protected java.lang.String getMimeType() {
        return ((DO_State)this.get$obj$state(false)).mimeType;
    }
    
    protected void setMimeType(java.lang.String mimeType) {
        ((DO_State)this.get$obj$state(true)).mimeType = mimeType;
    }
    
    private java.lang.String get$mimeType() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).mimeType;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$mimeType(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).mimeType = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.UserProfile getProfile() {
        return ((DO_State)this.get$obj$state(false)).profile;
    }
    
    protected void setProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileAvatar().add(profile, (org.fenixedu.bennu.core.domain.Avatar)this);
    }
    
    private java.lang.Long get$oidProfile() {
        pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject value = (pt.ist.fenixframework.backend.jvstmojb.pstm.AbstractDomainObject) ((DO_State)this.get$obj$state(false)).profile;
        return (value == null) ? null : value.getOid();
    }
    
    
    protected void checkDisconnected() {
        DO_State castedState = (DO_State)this.get$obj$state(false);
        if (castedState.profile != null) handleAttemptToDeleteConnectedObject("Profile");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$data(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readbytearray(rs, "DATA"), state);
        set$mimeType(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "MIME_TYPE"), state);
        castedState.profile = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_PROFILE");
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
        private byte[] data;
        private java.lang.String mimeType;
        private org.fenixedu.bennu.core.domain.UserProfile profile;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.data = this.data;
            newCasted.mimeType = this.mimeType;
            newCasted.profile = this.profile;
            
        }
        
    }
    
}
