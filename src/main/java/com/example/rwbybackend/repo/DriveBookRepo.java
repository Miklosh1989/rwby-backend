package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.DriveBook;
import org.springframework.data.repository.CrudRepository;

public interface DriveBookRepo extends CrudRepository<DriveBook,Long> {
}
