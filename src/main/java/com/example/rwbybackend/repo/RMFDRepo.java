package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.RMFDirectory;
import org.springframework.data.repository.CrudRepository;

public interface RMFDRepo extends CrudRepository<RMFDirectory, Long> {
}
