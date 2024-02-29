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
    private Long idParent;

    @Column(name = "name_woman_responsible")
    @NotNull
    private String nameWomanResponsible;

    @Column(name = "name_man_responsible")
    private String nameManResponsible;

    @Column(name = "phone_woman_responsible")
    @NotNull
    private String phoneWomanResponsible;

    @Column(name = "phone_man_responsible")
    private String phoneManResponsible;

    @Column(name = "document_woman_responsible")
    @NotNull
    private String documentWomanResponsible;

    @Column(name = "document_man_responsible")
    private String documentManResponsible;

    @Column(name = "observation")
    private String observation;

    @OneToMany(mappedBy = "parents")
    private List<Child> child;//     um responsavel pode ter mais de um filho

    // um responsavel pode ter mais de um endereco
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
