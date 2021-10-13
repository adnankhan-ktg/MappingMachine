package com.api.MappingMachine.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HOD {

    //HOD private properties...
    @Id
    @GeneratedValue
    @Column(name = "hod_id")
    private int id;
    @Column(name = "hod_first_name")
    private String firstName;
    @Column(name = "hod_last_name")
    private String lastName;
    @Column(name = "hod_age")
    private int age;
    @Column(name = "hod_married_status")
    private boolean married;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "hod")
    private List<Student> students;
}
