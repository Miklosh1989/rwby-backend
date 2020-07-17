package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.ReferenceStation;
import org.springframework.data.repository.CrudRepository;

public interface RSRepo extends CrudRepository<ReferenceStation, Long> {
}
