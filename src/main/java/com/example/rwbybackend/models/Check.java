package com.example.rwbybackend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private String operatorLastname;
    private String defectoType;
    private String defectoscopeNumber;
    private String workRegion;
    private CheckTrackInfo checkTrackInfo;
    private Rail rail;
    private Defect defect;

}
