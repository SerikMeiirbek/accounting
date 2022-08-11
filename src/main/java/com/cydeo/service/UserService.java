package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> findAllUsers();

    UserDTO registerAUser(UserDTO userDTO);

    UserDTO findById(Long id);

    void update(UserDTO userDTO);

    void deleteById(Long id);

}


