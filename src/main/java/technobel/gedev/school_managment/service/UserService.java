package technobel.gedev.school_managment.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import technobel.gedev.school_managment.models.dto.UserDTO;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<UserDTO> getAll();
}
