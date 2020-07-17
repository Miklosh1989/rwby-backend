package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.DefectDirectory;
import org.springframework.data.repository.CrudRepository;

public interface DDRepo extends CrudRepository<DefectDirectory, Long> {
}
