package com.api.MappingMachine.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {


    //Private subject states..............
    @Id
    @GeneratedValue
    @Column(name = "subject_id")
    private int id;
    @Column(name = "subject_name")
    private String name;
    @Column(name = "subject_active_status")
    private boolean active;

    @ManyToMany
    private List<Student> students;



}
