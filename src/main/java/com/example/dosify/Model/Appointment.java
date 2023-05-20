package com.example.dosify.Model;

import com.example.dosify.Enum.DoseNo;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment")
@Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String appointmentNo;
    @CreationTimestamp
    Date dateOfAppointment;
    @Enumerated(EnumType.STRING)
    DoseNo doseNo;

    @ManyToOne
    @JoinColumn
    User user;

   @ManyToOne
    @JoinColumn
    Doctor doctor;

}
