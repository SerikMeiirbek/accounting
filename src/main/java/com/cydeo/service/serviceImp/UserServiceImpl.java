package com.cydeo.service.serviceImp;

import com.cydeo.dto.UserDTO;
import com.cydeo.model.User;
import com.cydeo.repository.UserRepository;
import com.cydeo.service.UserService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final MapperUtil mapperUtil;



    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<UserDTO> findAllUsers() {
        List<User> userList = userRepository.findAll();
       return userList.stream().map(u -> mapperUtil.convert(u, new UserDTO())).collect(Collectors.toList());
    }

    @Override
    public UserDTO registerAUser(UserDTO userDTO) {

        //User user = userRepository.save(mapperUtil.convert(userDTO, new User()));
        User user = mapperUtil.convert(userDTO,new User());
        userRepository.save(user);

        return mapperUtil.convert(user, new UserDTO());
    }

    @Override
    public UserDTO findById(Long id) {

         Optional<User> user = userRepository.findById(id);
         return mapperUtil.convert(user, new UserDTO());

    }

    @Override
    public void update(UserDTO userDTO) {
        User user = userRepository.findById(userDTO.getId()).get();
        User convertedUser = mapperUtil.convert(userDTO, new User());
        convertedUser.setId(user.getId());
        userRepository.save(convertedUser);

    }

    @Override
    public void deleteById(Long id) {

      userRepository.deleteById(id);


    }
}
