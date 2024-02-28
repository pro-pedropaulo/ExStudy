package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table(name = "tb_parents")
@Getter
@Setter

public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "document")
    @NotNull
    private String document;

//    // Relação com Children (muitos para um)
//    @OneToMany(mappedBy = "parent")
//    private List<Children> children;
}
