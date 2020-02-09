package com.milq.springSecurityJpaBaseApp.respository;

import com.milq.springSecurityJpaBaseApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String Username);
}
