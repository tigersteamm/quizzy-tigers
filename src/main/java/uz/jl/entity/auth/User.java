package uz.jl.entity.auth;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;
import uz.jl.entity.quiz.Quiz;
import uz.jl.enums.Language;
import uz.jl.enums.UserRole;
import uz.jl.enums.UserStatus;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class User extends GenericCollection {
    private String username;
    private String password;
    private UserRole userRole;
    private UserStatus userStatus;
    private Language language;
    private List<Quiz> quizzes;

    @Builder(builderMethodName = "childBuilder")
    public User(ObjectId id, boolean deleted, String username, String password, UserRole userRole, UserStatus userStatus, Language language, List<Quiz> quizzes) {
        super(id, deleted);
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        this.userStatus = userStatus;
        this.language = language;
        this.quizzes = quizzes;
    }
}
