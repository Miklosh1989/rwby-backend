package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
