package com.app.ExStudy.DTOS;

import com.app.ExStudy.Model.Children;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class ClassroomDTO {
    private Long id;
    private String type;
    private String nomenclature;
    private int studentCount;
    private Set<Children> children;
}
