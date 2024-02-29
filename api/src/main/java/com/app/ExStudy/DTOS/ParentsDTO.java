package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ParentsDTO {
    private Long idParent;
    private String nameWomanResponsible;
    private String nameManResponsible;
    private String phoneWomanResponsible;
    private String phoneManResponsible;
    private String documentWomanResponsible;
    private String documentManResponsible;
    private String observation;
    private AddressDTO address;
}
