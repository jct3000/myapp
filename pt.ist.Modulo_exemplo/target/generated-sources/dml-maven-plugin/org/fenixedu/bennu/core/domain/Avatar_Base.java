package org.fenixedu.bennu.core.domain;


@SuppressWarnings("all")
public abstract class Avatar_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getRelationUserProfileAvatar() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  Avatar_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected byte[] getData() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setData(byte[] data) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected java.lang.String getMimeType() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setMimeType(java.lang.String mimeType) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.UserProfile getProfile() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
