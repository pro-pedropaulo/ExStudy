package com.app.ExStudy.DTOS;

import com.app.ExStudy.Model.Child;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class ClassroomDTO {
    private Long idClassroom;
    private String type;
    private String nameCloture;
    private int countChildren;
    private Set<ChildDTO> children;
}