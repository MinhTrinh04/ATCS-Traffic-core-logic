package com.traffic.core_logic.model.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Table(name = "chains")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Chain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    @Column(name = "number")
    private Short number;

    @Column(name = "cycle")
    private Integer cycle; // Tổng thời gian chu kỳ (seconds)

    @Column(name = "offset")
    private Integer offset; // Lệch pha (cho làn sóng xanh)

    @Column(name = "phase_coordination")
    private Byte phaseCoordination;

    // Một Chain chứa nhiều Interval
    @OneToMany(mappedBy = "chain", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Interval> intervals;
}