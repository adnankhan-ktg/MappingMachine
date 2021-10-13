package com.api.MappingMachine.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Track {

    //Track private properties
    @Id
    @GeneratedValue
    @Column(name = "track_id")
    private int id;
    @Column(name = "track_name")
    private String trackName;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "track")
    private List<Student> students;

}
