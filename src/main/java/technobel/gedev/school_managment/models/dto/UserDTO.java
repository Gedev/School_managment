package technobel.gedev.school_managment.models.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDTO{
    private long id;
    private String username;

    private List<String> roles;
}