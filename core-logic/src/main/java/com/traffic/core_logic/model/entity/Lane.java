package com.traffic.core_logic.model.entity;

import com.traffic.core_logic.model.enums.Direction;
import com.traffic.core_logic.model.enums.LaneType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lanes")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lane {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "sequence_order")
    private Byte sequenceOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private LaneType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "direction")
    private Direction direction;
}