package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.RailMarkingGuide;
import org.springframework.data.repository.CrudRepository;

public interface RMGRepo extends CrudRepository<RailMarkingGuide, Long> {
}
