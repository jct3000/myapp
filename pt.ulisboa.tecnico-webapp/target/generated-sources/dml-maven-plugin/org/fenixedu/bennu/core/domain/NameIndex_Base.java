package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.backend.jvstmojb.pstm.RelationList;
import pt.ist.fenixframework.backend.jvstmojb.ojb.OJBFunctionalSetWrapper;
import pt.ist.fenixframework.ValueTypeSerializer;


@SuppressWarnings("all")
public abstract class NameIndex_Base extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleMany<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile>() {
        public pt.ist.fenixframework.dml.runtime.RelationBaseSet<org.fenixedu.bennu.core.domain.UserProfile> getSet(org.fenixedu.bennu.core.domain.NameIndex o1) {
            return ((NameIndex_Base)o1).get$rl$profile();
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$nameIndex;
        }
        
    };
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> role$$bennu = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu>() {
        @Override
        public org.fenixedu.bennu.core.domain.Bennu getValue(org.fenixedu.bennu.core.domain.NameIndex o1) {
            return ((NameIndex_Base.DO_State)o1.get$obj$state(false)).bennu;
        }
        @Override
        public void setValue(org.fenixedu.bennu.core.domain.NameIndex o1, org.fenixedu.bennu.core.domain.Bennu o2) {
            ((NameIndex_Base.DO_State)o1.get$obj$state(true)).bennu = o2;
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.Bennu,org.fenixedu.bennu.core.domain.NameIndex> getInverseRole() {
            return org.fenixedu.bennu.core.domain.Bennu.role$$nameIndex;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getRelationUserProfileNameIndexes() {
        return org.fenixedu.bennu.core.domain.UserProfile.getRelationUserProfileNameIndexes();
    }
    
    private final static class BennuNameIndexes {
        private static final pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> relation = new pt.ist.fenixframework.backend.jvstmojb.pstm.LoggingRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu>(role$$bennu, "BennuNameIndexes");
    }
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuNameIndexes() {
        return BennuNameIndexes.relation;
    }
    
    static {
        BennuNameIndexes.relation.setRelationName("org.fenixedu.bennu.core.domain.NameIndex.BennuNameIndexes");
    }
    
    // Slots
    
    // Role Slots
    private RelationList<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.UserProfile> get$rl$profile() {
        return get$$relationList("profile", getRelationUserProfileNameIndexes().getInverseRelation());
        
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
    protected  NameIndex_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getKeyword() {
        return ((DO_State)this.get$obj$state(false)).keyword;
    }
    
    protected void setKeyword(java.lang.String keyword) {
        ((DO_State)this.get$obj$state(true)).keyword = keyword;
    }
    
    private java.lang.String get$keyword() {
        java.lang.String value = ((DO_State)this.get$obj$state(false)).keyword;
        return (value == null) ? null : pt.ist.fenixframework.backend.jvstmojb.repository.ToSqlConverter.getValueForString(value);
    }
    
    private final void set$keyword(java.lang.String value, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  obj$state) {
        ((DO_State)obj$state).keyword = (java.lang.String)((value == null) ? null : value);
    }
    
    // Role Methods
    
    public void addProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileNameIndexes().add(profile, (org.fenixedu.bennu.core.domain.NameIndex)this);
    }
    
    public void removeProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileNameIndexes().remove(profile, (org.fenixedu.bennu.core.domain.NameIndex)this);
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfileSet() {
        return get$rl$profile();
    }
    
    public void set$profile(OJBFunctionalSetWrapper profile) {
        get$rl$profile().setFromOJB(this, "profile", profile);
    }
    
    @Deprecated
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfile() {
        return getProfileSet();
    }
    
    @Deprecated
    public int getProfileCount() {
        return getProfileSet().size();
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        return ((DO_State)this.get$obj$state(false)).bennu;
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        getRelationBennuNameIndexes().add((org.fenixedu.bennu.core.domain.NameIndex)this, bennu);
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
        if (get$rl$profile().size() > 0) handleAttemptToDeleteConnectedObject("Profile");
        if (castedState.bennu != null) handleAttemptToDeleteConnectedObject("Bennu");
        
    }
    
    protected void readStateFromResultSet(java.sql.ResultSet rs, pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  state) throws java.sql.SQLException {
        DO_State castedState = (DO_State)state;
        set$keyword(pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readString(rs, "KEYWORD"), state);
        castedState.bennu = pt.ist.fenixframework.backend.jvstmojb.repository.ResultSetReader.readDomainObject(rs, "OID_BENNU");
    }
    protected pt.ist.fenixframework.dml.runtime.Relation get$$relationFor(String attrName) {
        if (attrName.equals("profile")) return getRelationUserProfileNameIndexes().getInverseRelation();
        return super.get$$relationFor(attrName);
        
    }
    protected pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  make$newState() {
        return new DO_State();
        
    }
    protected void create$allLists() {
        super.create$allLists();
        get$$relationList("profile", getRelationUserProfileNameIndexes().getInverseRelation());
        
    }
    protected static class DO_State extends pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State {
        private java.lang.String keyword;
        private org.fenixedu.bennu.core.domain.Bennu bennu;
        protected void copyTo(pt.ist.fenixframework.backend.jvstmojb.pstm.OneBoxDomainObject.DO_State  newState) {
            super.copyTo(newState);
            DO_State newCasted = (DO_State)newState;
            newCasted.keyword = this.keyword;
            newCasted.bennu = this.bennu;
            
        }
        
    }
    
}
