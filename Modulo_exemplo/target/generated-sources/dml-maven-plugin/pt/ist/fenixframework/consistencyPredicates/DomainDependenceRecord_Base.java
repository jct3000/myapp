package pt.ist.fenixframework.consistencyPredicates;


@SuppressWarnings("all")
public abstract class DomainDependenceRecord_Base extends pt.ist.fenixframework.core.AbstractDomainObject {
    // Static Slots
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate,pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord> getRelationDomainConsistencyPredicateInconsistentDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependentDomainMetaObjectOwnDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate> getRelationDomainConsistencyPredicateDomainDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    public static pt.ist.fenixframework.dml.runtime.DirectRelation<pt.ist.fenixframework.consistencyPredicates.DomainDependenceRecord,pt.ist.fenixframework.DomainMetaObject> getRelationDependedDomainMetaObjectsDependingDependenceRecords() {
        return new pt.ist.fenixframework.dml.runtime.DirectRelation(null, null);
    }
    
    // Constructors
    protected  DomainDependenceRecord_Base() {
        super();
    }
    
    // Getters and Setters
    
    // Role Methods
    
    public pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate getInconsistentPredicate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setInconsistentPredicate(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate inconsistentPredicate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.DomainMetaObject getDependentDomainMetaObject() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDependentDomainMetaObject(pt.ist.fenixframework.DomainMetaObject dependentDomainMetaObject) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate getDomainConsistencyPredicate() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void setDomainConsistencyPredicate(pt.ist.fenixframework.consistencyPredicates.DomainConsistencyPredicate domainConsistencyPredicate) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void addDependedDomainMetaObject(pt.ist.fenixframework.DomainMetaObject dependedDomainMetaObject) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public void removeDependedDomainMetaObject(pt.ist.fenixframework.DomainMetaObject dependedDomainMetaObject) {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    public java.util.Set<pt.ist.fenixframework.DomainMetaObject> getDependedDomainMetaObjectSet() {
        throw new UnsupportedOperationException("Not implemented in default code generator");
    }
    
    
}
