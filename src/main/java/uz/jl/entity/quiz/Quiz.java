package uz.jl.entity.quiz;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;
import uz.jl.entity.question.Question;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Quiz extends GenericCollection {
    String name;
    List<Question> questions;
    boolean completed;

    @Builder(builderMethodName = "childBuilder")
    public Quiz(ObjectId id, boolean deleted, String name, List<Question> questions, boolean completed) {
        super(id, deleted);
        this.name = name;
        this.questions = questions;
        this.completed = completed;
    }
}
