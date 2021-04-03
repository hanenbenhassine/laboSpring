package com.Project.laboSpring.presentation;

import com.Project.laboSpring.dto.UserDTO;
import com.Project.laboSpring.entities.User;
import com.Project.laboSpring.exception.ElementAlreadyExistsException;
import com.Project.laboSpring.exception.ElementNotFoundException;
import com.Project.laboSpring.services.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<List<UserDTO>>getAllUsers(){
       return ResponseEntity.ok(userService.getAll()) ;
    }
//    @PostMapping
//    @Transactional
//    public ResponseEntity<Boolean>insertUser(@Valid @RequestBody User user){
//        return this.userService.insert(user)?ResponseEntity.ok(true):
//                ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(false);
//    }
    @PostMapping
    @Transactional
    public ResponseEntity<Boolean>insertUser(@Valid @RequestBody User user)throws ElementAlreadyExistsException, ElementNotFoundException {
        this.userService.insert(user);
        return ResponseEntity.ok(true);
    }
}
