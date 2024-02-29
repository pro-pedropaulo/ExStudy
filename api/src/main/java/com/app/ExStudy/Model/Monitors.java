package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_monitors")
@Getter
@Setter
public class Monitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMonitor;

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "phone")
    private String phone;

    @Column(name = "observation")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(mappedBy = "monitors")
    private Set<Child> children;


}
