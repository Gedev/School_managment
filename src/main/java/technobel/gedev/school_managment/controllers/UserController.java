package technobel.gedev.school_managment.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technobel.gedev.school_managment.models.dto.UserDTO;
import technobel.gedev.school_managment.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    public final UserService service;


    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
