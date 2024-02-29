package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_allergies_child")
@Getter
@Setter
public class AllergyChild {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAllergyChild;

    @ManyToOne
    @JoinColumn(name = "id_allergy")
    private Allergy allergy;

    @ManyToOne
    @JoinColumn(name = "id_child")
    private Child child;

}
