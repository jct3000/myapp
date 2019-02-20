package org.fenixedu.bennu.core.domain;


@SuppressWarnings("all")
public abstract class NameIndex_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.NameIndex> getRelationUserProfileNameIndexes() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.NameIndex,org.fenixedu.bennu.core.domain.Bennu> getRelationBennuNameIndexes() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  NameIndex_Base() {
        super();
    }
    
    // Getters and Setters
    
    protected java.lang.String getKeyword() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setKeyword(java.lang.String keyword) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    // Role Methods
    
    public void addProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<org.fenixedu.bennu.core.domain.UserProfile> getProfileSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected org.fenixedu.bennu.core.domain.Bennu getBennu() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    protected void setBennu(org.fenixedu.bennu.core.domain.Bennu bennu) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
