package com.arwest.springit.domain;


import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NonNull
public class Vote {


    @Id
    @GeneratedValue
    private Long id;

    private int vote;
    // user
    // link


}
