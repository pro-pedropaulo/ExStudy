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
    private Long idClassroom;

    @Column(name = "type")
    @NotNull
    private String type;

    @Column(name = "namecloture")
    private String nameCloture;

    @Column(name = "count_children")
    private int countChildren;

//     uma sala de aula pode ter muitas crianças
    @OneToMany(mappedBy = "classroom")
    private Set<Child> child;


}

