package com.example.rwbybackend.repo;

import com.example.rwbybackend.models.DirectoryOfResponsiblePersons;
import org.springframework.data.repository.CrudRepository;

public interface DoRPRepo extends CrudRepository<DirectoryOfResponsiblePersons, Long> {
}
