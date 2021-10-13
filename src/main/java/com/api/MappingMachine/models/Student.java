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
public class Student {

    //Student private states...
    @Id
    @GeneratedValue
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_first_name")
    private String firstName;
    @Column(name = "student_last_name")
    private String lastName;
    @Column(name = "student_age")
    private int age;
    @Column(name = "student_weight")
    private double weight;
    @Column(name = "student_adult_status")
    private boolean adult;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hod_id")
    private HOD hod;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "track_id")
    private Track track;

    @ManyToMany
    private List<Subject> subjects;



}
