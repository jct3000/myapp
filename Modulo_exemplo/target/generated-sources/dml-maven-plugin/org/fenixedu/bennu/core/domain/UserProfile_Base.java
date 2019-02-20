package org.fenixedu.bennu.core.domain;


@SuppressWarnings("all")
public abstract class UserProfile_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getRelationUserProfileAvatar() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Bennu> getRelationSystemProfiles() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getRelationUserProfileNameIndexes() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.User,org.fenixedu.bennu.core.domain.UserProfile> getRelationUserProfileUser() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  UserProfile_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getDisplayName() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setDisplayName(java.lang.String displayName) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getGivenNames() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setGivenNames(java.lang.String givenNames) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getFamilyNames() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setFamilyNames(java.lang.String familyNames) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getAvatarUrl() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setAvatarUrl(java.lang.String avatarUrl) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.lang.String getEmail() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setEmail(java.lang.String email) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Locale getPreferredLocale() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setPreferredLocale(java.util.Locale preferredLocale) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.Avatar getLocalAvatar() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setLocalAvatar(org.fenixedu.bennu.core.domain.Avatar localAvatar) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void addNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void removeNameIndex(org.fenixedu.bennu.core.domain.NameIndex nameIndex) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.util.Set<org.fenixedu.bennu.core.domain.NameIndex> getNameIndexSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.User getUser() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setUser(org.fenixedu.bennu.core.domain.User user) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
