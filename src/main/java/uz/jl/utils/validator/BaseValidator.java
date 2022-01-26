package uz.jl.utils.validator;

import uz.jl.dto.GenericBaseDto;
import uz.jl.dto.GenericDto;
import uz.jl.entity.GenericCollection;
import uz.jl.utils.BaseUtils;

import java.io.Serializable;

/**
 * @param <M>  -> Collection
 * @param <CD> -> Create DTO
 * @param <UD> -> Update DTO
 * @param <K>  -> Identity KEY
 */
public abstract class BaseValidator<M extends GenericCollection,
        CD extends GenericBaseDto,
        UD extends GenericDto,
        K extends Serializable> extends
        AbstractValidator<K> {

    protected BaseValidator(BaseUtils utils) {
        super(utils);
    }

    protected abstract void validOnCreate(CD dto) throws IllegalArgumentException;

    protected abstract void validOnUpdate(UD dto) throws IllegalArgumentException;

}
