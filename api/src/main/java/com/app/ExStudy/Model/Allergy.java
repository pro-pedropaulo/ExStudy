package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;

@Entity
@Table(name = "tb_allergies")
@Getter
@Setter
public class Allergy {
    @Id
    @Column(name = "id_allergy")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAllergy;

    @Column(name = "description")
    @NotNull
    private String description;

    @ManyToMany(mappedBy = "allergies")
    private Set<Child> children;

}
