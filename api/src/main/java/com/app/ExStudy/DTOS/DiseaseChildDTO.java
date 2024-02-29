package com.app.ExStudy.DTOS;

import com.app.ExStudy.DTOS.ChildDTO;
import com.app.ExStudy.DTOS.DiseaseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiseaseChildDTO {
    private Long idDiseaseChild;
    private DiseaseDTO disease;
    private ChildDTO child;
}