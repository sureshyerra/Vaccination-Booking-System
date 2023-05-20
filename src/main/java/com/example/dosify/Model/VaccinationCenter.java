package com.example.dosify.Model;

import com.example.dosify.Enum.CenterType;
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
@Table(name = "vaccinationcenter")
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String location;
    @Enumerated(EnumType.STRING)
    CenterType centerType;

    @OneToMany(mappedBy = "vaccinationcenter",cascade = CascadeType.ALL)
    List<Doctor> doctors = new ArrayList<>();




}
