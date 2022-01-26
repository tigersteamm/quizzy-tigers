package uz.jl.entity.variant;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Variant extends GenericCollection {
    String body;
    boolean correct;
    boolean selected;

    @Builder(builderMethodName = "childBuilder")
    public Variant(ObjectId id, boolean deleted, String body, boolean correct, boolean selected) {
        super(id, deleted);
        this.body = body;
        this.correct = correct;
        this.selected = selected;
    }
}
