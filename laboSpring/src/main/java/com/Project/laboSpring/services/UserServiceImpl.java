package com.Project.laboSpring.services;

import com.Project.laboSpring.Mapper.GeneralMapper;
import com.Project.laboSpring.dto.UserDTO;
import com.Project.laboSpring.entities.User;
import com.Project.laboSpring.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final GeneralMapper mapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, GeneralMapper mapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.mapper = mapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("User with username : "+username+"not found"));
    }

    @Override
    public List<UserDTO> getAll() {
        return this.userRepository
                .findAll()
                .stream()
                .map(mapper::toUserDTO)
                .collect(Collectors.toList());
    }

    @Override
    public boolean insert(User u) {
        User uInserted=null;
        if(u!=null)
        {
            u.setAccountNonExpired(true);
            u.setAccountNonLocked(true);
            u.setCredentialsNonExpired(true);
            u.setEnabled(true);
            u.setPassword(passwordEncoder.encode(u.getPassword()));
            uInserted=this.userRepository.save(u);
        }
        return uInserted != null?this.userRepository.existsById(uInserted.getId()):false;
    }
}
