package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Entity
@Table(name = "tb_disease")
@Getter
@Setter
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDisease;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToMany(mappedBy = "diseases")
    private Set<Child> children;
}

