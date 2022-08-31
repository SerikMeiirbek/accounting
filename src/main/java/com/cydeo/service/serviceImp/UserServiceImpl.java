package com.cydeo.service.serviceImp;

import com.cydeo.dto.UserDTO;
import com.cydeo.model.User;
import com.cydeo.repository.UserRepository;
import com.cydeo.service.UserService;
import com.cydeo.util.MapperUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final MapperUtil mapperUtil;
    private final PasswordEncoder passwordEncoder;


    public UserServiceImpl(UserRepository userRepository, MapperUtil mapperUtil, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.mapperUtil = mapperUtil;
        this.passwordEncoder = passwordEncoder;
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
        user.setPassWord(passwordEncoder.encode(user.getPassWord()));
        userRepository.save(user);

        return mapperUtil.convert(user, new UserDTO());
    }

    @Override
    public UserDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email);
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
        convertedUser.setPassWord(passwordEncoder.encode(userDTO.getPassWord()));
        convertedUser.setId(user.getId());
        userRepository.save(convertedUser);

    }

    @Override
    public void deleteById(Long id) {
      userRepository.deleteById(id);
    }

}
