package com.project;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}