package com.example.dosify.Model;

import com.example.dosify.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor")
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "age")
    int age;
    @Column(name = "email_id",unique = true)
    String emailId;

    @Column(name = "mob_no",unique = true)
    String mobNo;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    Gender gender;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    List<Appointment> appointments = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    VaccinationCenter vaccinationcenter;



}
