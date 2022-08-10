package com.cydeo.service.serviceImp;

import com.cydeo.dto.RoleDTO;
import com.cydeo.model.Role;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final MapperUtil mapperUtil;

    public RoleServiceImpl(RoleRepository roleRepository, MapperUtil mapperUtil) {
        this.roleRepository = roleRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<RoleDTO> findAllRoles() {
       List<Role> role = roleRepository.findAll();
      List<RoleDTO> roleDTO = role.stream().map(r -> mapperUtil.convert(r, new RoleDTO())).collect(Collectors.toList());
      return roleDTO;

    }

    @Override
    public RoleDTO createARole(RoleDTO roleDTO) {
        Role  role =  roleRepository.save(mapperUtil.convert(roleDTO, new Role()));
           return mapperUtil.convert(role, new RoleDTO());

    }

    @Override
    public RoleDTO findById(Long id) {
       Role role = roleRepository.findById(id).get();
       return mapperUtil.convert(role, new RoleDTO());
    }

    @Override
    public void update(RoleDTO roleDTO) {
      Role  role =  roleRepository.findById(roleDTO.getId()).get();
      Role  convertedRole = mapperUtil.convert(roleDTO, new Role());
       convertedRole.setId(role.getId());
        roleRepository.save(convertedRole);
    }

    @Override
    public void deleteById(Long id) {
      roleRepository.deleteById(id);
    }
}
