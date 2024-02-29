package com.app.ExStudy.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_monitors_child")
@Getter
@Setter
public class MonitorsChild {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMonitorChild;

    @ManyToOne
    @JoinColumn(name = "id_monitors")
    private Monitors monitors;

    @ManyToOne
    @JoinColumn(name = "id_child")
    private Child child;

}
