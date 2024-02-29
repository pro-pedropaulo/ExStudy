package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class MonitorsDTO {
    private Long idMonitor;
    private String name;
    private String document;
    private LocalDate dateOfBirth;
    private String phone;
    private String observation;
    private ClassroomDTO classroom;
    private AddressDTO address;
    private Set<ChildDTO> children;
}
