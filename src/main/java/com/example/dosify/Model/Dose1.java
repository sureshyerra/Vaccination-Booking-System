package com.example.dosify.Model;

import com.example.dosify.Enum.VaccineType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dose1")
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Dose1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String doseId;
    @Enumerated(EnumType.STRING)
    VaccineType vaccineType;
    @CreationTimestamp
    Date vaccinationDate;

    @OneToOne
    @JoinColumn
    User user;
}
