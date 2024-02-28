package com.app.ExStudy.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Entity
@Table(name = "tb_classroom")
@Getter
@Setter
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "nomenclature")
    private String nomenclature;

    @Column(name = "student_count")
    private int studentCount;

    @OneToMany(mappedBy = "classroom")
    private Set<Children> children;


}

