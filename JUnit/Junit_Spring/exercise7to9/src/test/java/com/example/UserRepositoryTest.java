package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName() {

        // given
        User user1 = new User("Lavanya");
        User user2 = new User("Lavanya");
        User user3 = new User("Kumar");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        // when
        List<User> result = userRepository.findByName("Lavanya");

        // then
        assertThat(result).hasSize(2);
        assertThat(result).extracting(User::getName)
                .containsOnly("Lavanya");
    }
}