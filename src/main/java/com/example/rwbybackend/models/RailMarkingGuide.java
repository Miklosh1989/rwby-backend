package com.example.rwbybackend.models;

import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RailMarkingGuide {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
