package com.abhi.consumer.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "wikimedia")
@Data
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(length = 65555)
    private String eventData;

}
