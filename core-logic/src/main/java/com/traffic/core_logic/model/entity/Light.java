package com.traffic.core_logic.model.entity;

import com.traffic.core_logic.model.enums.LightStatus;
import com.traffic.core_logic.model.enums.LightType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lights")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Light {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lane_id")
    private Lane lane;

    @Column(name = "number")
    private Byte number;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private LightType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "current_status")
    private LightStatus currentStatus;
}
