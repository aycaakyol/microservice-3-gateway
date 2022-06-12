package com.aa.microservice3gateway.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aa.microservice3gateway.model.User;
import com.aa.microservice3gateway.service.IUserService;

@Service
public class CustomUserDetailService implements UserDetailsService{

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("no user with this username"));
        return new UserPrinciple(user.getId(), user.getUsername(), user.getPassword());
    }
    
}
