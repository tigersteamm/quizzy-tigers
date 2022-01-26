package uz.jl.dao;

import uz.jl.criteria.GenericCriteria;
import uz.jl.entity.GenericCollection;

/**
 * THIS IS A BASE ABSTRACT CLASS THAT PROVIDES CONNECTION WITH MONGO DB
 *
 * @param <C> -> Criteria
 * @param <M> -> Collection
 */
public abstract class GenericDao<C extends GenericCriteria,
        M extends GenericCollection> {

}
