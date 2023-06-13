package br.com.michael.userapi.service;

import br.com.michael.userapi.model.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
