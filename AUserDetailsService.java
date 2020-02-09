package com.milq.springSecurityJpaBaseApp;

import com.milq.springSecurityJpaBaseApp.model.User;
import com.milq.springSecurityJpaBaseApp.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userDetailsService")
public class AUserDetailsService  implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user =  userRepository.findByUsername(username);
        user.orElseThrow(()-> new UsernameNotFoundException("Not found"+username));
        return user.map(AUserDetails::new).get();
    }
}
