package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_disease_child")
@Getter
@Setter
public class DiseaseChild {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idDiseaseChild;

        @ManyToOne
        @JoinColumn(name = "id_disease")
        private Disease disease;

        @ManyToOne
        @JoinColumn(name = "id_child")
        private Child child;
}
