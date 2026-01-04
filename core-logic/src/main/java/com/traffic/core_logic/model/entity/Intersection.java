package com.traffic.core_logic.model.entity;

import com.traffic.core_logic.model.enums.ControlMode;
import com.traffic.core_logic.model.entity.Controller;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "intersections")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Intersection {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "number")
    private Byte number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "controller_id")
    private Controller controller;

    @Column(name = "location")
    private String location;

    @Enumerated(EnumType.STRING)
    @Column(name = "control_mode")
    private ControlMode controlMode;

    // Các biến trạng thái runtime (có thể update liên tục)
    @Column(name = "current_chain")
    private Short currentChain;

    @Column(name = "current_phase")
    private Byte currentPhase;

    @Column(name = "current_plan")
    private Short currentPlan;
}