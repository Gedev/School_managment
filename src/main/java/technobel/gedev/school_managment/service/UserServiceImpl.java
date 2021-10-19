package technobel.gedev.school_managment.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import technobel.gedev.school_managment.models.dto.UserDTO;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }


}
