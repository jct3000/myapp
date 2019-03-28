package org.fenixedu.bennu.core.domain;


@SuppressWarnings("all")
public abstract class User_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getRelationPersistentDynamicGroupCreator() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemUsers() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserLoginPeriod> getRelationUserLoginPeriods() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getRelationUserProfileUser() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup,org.fenixedu.bennu.core.domain.User> getRelationUserGroupMembers() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  User_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getUsername() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setUsername(java.lang.String username) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getPassword() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setPassword(java.lang.String password) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getSalt() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setSalt(java.lang.String salt) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.joda.time.DateTime getCreated() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setCreated(org.joda.time.DateTime created) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected void addCreatedDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup createdDynamicGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeCreatedDynamicGroup(org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup createdDynamicGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentDynamicGroup> getCreatedDynamicGroupSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addLoginValidity(org.fenixedu.bennu.core.domain.UserLoginPeriod loginValidity) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeLoginValidity(org.fenixedu.bennu.core.domain.UserLoginPeriod loginValidity) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserLoginPeriod> getLoginValiditySet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public org.fenixedu.bennu.core.domain.UserProfile getProfile() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addUserGroup(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup userGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeUserGroup(org.fenixedu.bennu.core.domain.groups.PersistentUserGroup userGroup) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.groups.PersistentUserGroup> getUserGroupSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
