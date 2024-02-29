package com.app.ExStudy.DTOS;

import com.app.ExStudy.DTOS.AllergyDTO;
import com.app.ExStudy.DTOS.ChildDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllergyChildDTO {
    private Long idAllergyChild;
    private AllergyDTO allergy;
    private ChildDTO child;
}