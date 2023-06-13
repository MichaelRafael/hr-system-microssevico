package br.com.michael.userapi.controller.impl;

import br.com.michael.userapi.model.User;
import br.com.michael.userapi.service.UserService;
import br.com.michael.userapi.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserControllerImpl implements UserService {

    private final UserServiceImpl userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(userService.findById(id)).getBody();
    }

    @GetMapping
    public List<User> findAll() {
        return ResponseEntity.ok().body(userService.findAll()).getBody();
    }
}
