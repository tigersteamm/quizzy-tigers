package uz.jl.entity.question;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;
import uz.jl.entity.variant.Variant;
import uz.jl.enums.Language;
import uz.jl.enums.Level;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Question extends GenericCollection {
    String subject;
    Level level;
    Language language;
    String body;
    List<Variant> variants;
    ObjectId createdBy;

    @Builder(builderMethodName = "childBuilder")
    public Question(ObjectId id, boolean deleted, String subject, Level level, Language language, String body, List<Variant> variants, ObjectId createdBy) {
        super(id, deleted);
        this.subject = subject;
        this.level = level;
        this.language = language;
        this.body = body;
        this.variants = variants;
        this.createdBy = createdBy;
    }
}
