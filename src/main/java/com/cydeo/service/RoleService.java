package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> findAllRoles();

    RoleDTO createARole(RoleDTO roleDTO);

    RoleDTO findById(Long id);

    void update(RoleDTO roleDTO);

    void deleteById(Long id);
}
