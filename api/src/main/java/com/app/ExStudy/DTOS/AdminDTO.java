package com.app.ExStudy.DTOS;

import com.app.ExStudy.Model.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
public class AdminDTO {
    private Long idAdmin;
    private String name;
    private String employeeCode;
    private String password;
    private String role;
    private AddressDTO address;
    private Long idAddress;
}
