package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class ChildrenDTO {
    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String document;
    private char sexChild;
    private Long parentId; // Referência ao pai/mãe
    private Set<Long> disabilityIds; // Referências às deficiências
    private Set<Long> allergyIds; // Referências às alergias
}
