package com.cydeo.repository;

import com.cydeo.dto.UserDTO;
import com.cydeo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
