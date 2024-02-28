package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParentsDTO {
    private Long id;
    private String name;
    private String document;
    private List<Long> childrenIds;
}
