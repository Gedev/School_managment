package technobel.gedev.school_managment.models.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Validated
public class UserForm {

    @Length(min = 4, max = 20)
    @NotBlank
    private String username;

    @Length(min = 8)
    @NotBlank
    private String password;

    @NotEmpty
    private List<String> roles;
}
