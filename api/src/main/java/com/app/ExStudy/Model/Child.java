package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_child")
@Getter
@Setter
public class Child {
    @Id
    @Column(name = "id_child")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChild;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "date_of_birth")
    @NotNull
    private LocalDate dateOfBirth;

    @Column(name = "document")
    @NotNull
    private String document;

    @Column(name = "sex_child")
    @NotNull
    private char sex_child;

    @ManyToOne
    @JoinColumn(name = "id_classroom")
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "id_parents")
    private Parents parents;

    @ManyToMany
    @JoinTable(
            name = "tb_allergies_child",
            joinColumns = @JoinColumn(name = "id_child"),
            inverseJoinColumns = @JoinColumn(name = "id_allergy")
    )
    private Set<Allergy> allergies;

    @ManyToMany
    @JoinTable(
            name = "tb_disease_child",
            joinColumns = @JoinColumn(name = "id_child"),
            inverseJoinColumns = @JoinColumn(name = "id_disease")
    )
    private Set<Disease> diseases;

    @ManyToMany
    @JoinTable(
            name = "tb_monitors_child",
            joinColumns = @JoinColumn(name = "id_child"),
            inverseJoinColumns = @JoinColumn(name = "id_monitor")
    )
    private Set<Monitors> monitors;
}
