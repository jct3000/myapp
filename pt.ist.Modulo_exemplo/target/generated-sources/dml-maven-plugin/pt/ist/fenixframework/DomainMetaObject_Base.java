package pt.ist.fenixframework;


@SuppressWarnings("all")
public abstract class DomainMetaObject_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependentDomainMetaObjectOwnDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainMetaClass> getRelationDomainMetaObjectsDomainMetaClass() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependedDomainMetaObjectsDependingDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.DomainMetaObject,pt.ist.fenixframework.DomainObject> getRelationDomainMetaObjectAbstractDomainObject() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainMetaObject_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public void addOwnDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord ownDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeOwnDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord ownDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getOwnDependenceRecordSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.DomainMetaClass getDomainMetaClass() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainMetaClass(pt.ist.fenixframework.DomainMetaClass domainMetaClass) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addDependingDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord dependingDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeDependingDependenceRecord(pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord dependingDependenceRecord) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getDependingDependenceRecordSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.DomainObject getDomainObject() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainObject(pt.ist.fenixframework.DomainObject domainObject) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
