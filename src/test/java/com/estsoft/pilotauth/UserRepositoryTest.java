package com.estsoft.pilotauth;

import com.estsoft.pilotauth.domain.user.entity.User;
import com.estsoft.pilotauth.domain.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void createUser() {
        userRepository.save(User.builder()
                .uid("user")
                .password(passwordEncoder.encode("pass"))
                .name("user")
                .email("jin0849@gmail.com")
                .roles(Collections.singletonList("ROLE_USER"))
                .build());
    }
}