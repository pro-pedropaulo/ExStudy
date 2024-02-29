package com.app.ExStudy.DTOS;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonitorsChildDTO {
    private Long idMonitorChild;
    private MonitorsDTO monitors;
    private ChildDTO child;
}
