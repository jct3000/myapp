package org.fenixedu.bennu.core.domain;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.fenixframework.backend.jvstm.pstm.VBox;
import pt.ist.fenixframework.backend.jvstm.pstm.OwnedVBox;

@SuppressWarnings("all")
public abstract class Avatar_Base extends pt.ist.fenixframework.backend.jvstm.InMemDomainObject {
    // Static Slots
    public final static pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Avatar,org.fenixedu.bennu.core.domain.UserProfile> role$$profile = new pt.ist.fenixframework.dml.runtime.RoleOne<org.fenixedu.bennu.core.domain.Avatar,org.fenixedu.bennu.core.domain.UserProfile>() {
        public org.fenixedu.bennu.core.domain.UserProfile getValue(org.fenixedu.bennu.core.domain.Avatar o1) {
            return ((Avatar_Base)o1).profile.get();
        }
        public void setValue(org.fenixedu.bennu.core.domain.Avatar o1, org.fenixedu.bennu.core.domain.UserProfile o2) {
            ((Avatar_Base)o1).profile.put(o2);
        }
        public pt.ist.fenixframework.dml.runtime.Role<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getInverseRole() {
            return org.fenixedu.bennu.core.domain.UserProfile.role$$localAvatar;
        }
        
    };
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<org.fenixedu.bennu.core.domain.UserProfile,org.fenixedu.bennu.core.domain.Avatar> getRelationUserProfileAvatar() {
        return org.fenixedu.bennu.core.domain.UserProfile.getRelationUserProfileAvatar();
    }
    
    // Slots
    private OwnedVBox<byte[]> data;
    private OwnedVBox<java.lang.String> mimeType;
    // Role Slots
    private OwnedVBox<org.fenixedu.bennu.core.domain.UserProfile> profile;
    
    // Init Instance
    
    private void initInstance() {
        init$Instance(true);
    }
    
    @Override
    protected void init$Instance(boolean allocateOnly) {
        super.init$Instance(allocateOnly);
        data = OwnedVBox.makeNew(this, "data", allocateOnly, false);
        if (!allocateOnly) this.data.put(null);
        mimeType = OwnedVBox.makeNew(this, "mimeType", allocateOnly, false);
        if (!allocateOnly) this.mimeType.put(null);
        profile = OwnedVBox.makeNew(this, "profile", allocateOnly, true);
        if (!allocateOnly) this.profile.put(null);
        
    }
    
    // Constructors
    protected  Avatar_Base() {
        super();
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addNewObject(this);
    }
    
    // Getters and Setters
    
    protected byte[] getData() {
        return this.data.get();
    }
    
    protected void setData(byte[] data) {
        this.data.put(data);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    protected java.lang.String getMimeType() {
        return this.mimeType.get();
    }
    
    protected void setMimeType(java.lang.String mimeType) {
        this.mimeType.put(mimeType);
        ((pt.ist.fenixframework.txintrospector.TxStats)pt.ist.fenixframework.FenixFramework.getTransaction().getTxIntrospector()).addModifiedObject(this);
    }
    
    // Role Methods
    
    protected org.fenixedu.bennu.core.domain.UserProfile getProfile() {
        return this.profile.get();
    }
    
    protected void setProfile(org.fenixedu.bennu.core.domain.UserProfile profile) {
        getRelationUserProfileAvatar().add(profile, (org.fenixedu.bennu.core.domain.Avatar)this);
    }
    
    
}
