package br.com.orion.authorizationserver.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("arilson", "{bcrypt}$2a$10$b.5xuw87h1jnzK51DeUBv.RvHbU2xaVVQAV5iyuc7xQsmz63t49pS", new ArrayList<>());
    }
    
}