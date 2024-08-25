package com.example.insoftestmainservice.services;

import com.example.insoftestmainservice.dto.CodeDto;
import com.example.insoftestmainservice.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new User(username, user.getPassword(), new ArrayList<>());
    }

    public List<CodeDto> save(com.example.insoftestmainservice.models.User user) {
        userRepository.save(user);
        return findAll();
    }

    public List<CodeDto> findAll() {
        var users = userRepository.findAll();
        return users.stream()
                .map(it -> new CodeDto(it.getName(), it.getPassword()))
                .toList();
    }
}
