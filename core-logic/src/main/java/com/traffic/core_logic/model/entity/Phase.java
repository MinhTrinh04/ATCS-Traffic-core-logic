package com.traffic.core_logic.model.entity;

import com.traffic.core_logic.model.enums.PhaseStatus;
import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "phases")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Phase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    @Column(name = "number")
    private Byte number;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PhaseStatus status;

    // Timing parameters (Safety constraints)
    @Column(name = "min_green")
    private Integer minGreen;

    @Column(name = "max_green_1")
    private Integer maxGreen1;

    @Column(name = "max_green_2")
    private Integer maxGreen2;

    @Column(name = "yellow_clearance")
    private Integer yellowClearance;

    @Column(name = "red_clearance")
    private Integer redClearance;

    @Column(name = "extension_time")
    private Integer extensionTime;

    // Quan hệ N-N với Lights (thông qua bảng light_phase)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "light_phase",
            joinColumns = @JoinColumn(name = "phase_id"),
            inverseJoinColumns = @JoinColumn(name = "light_id")
    )
    private Set<Light> lights = new HashSet<>();
}