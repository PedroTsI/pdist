package br.edu.ifpb.progdist.controller;

import br.edu.ifpb.progdist.model.User;
import br.edu.ifpb.progdist.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService = new UserService();

    @GetMapping()
    public List<User> getUser(){
        return this.userService.getUser();
    }

    @GetMapping("/{code}")
    public User getUserByCode(@PathVariable int code){
        return this.userService.getUserByCode(code);
    }

    @PostMapping(path = "/register", consumes = "application/json", produces = "application/json")
    public Integer insertUser(@RequestBody User newUser){
        this.userService.insertUser(newUser);
        return newUser.getCode();
    }
}
