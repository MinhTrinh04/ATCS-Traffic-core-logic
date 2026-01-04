package com.traffic.core_logic.model.entity;

import com.traffic.core_logic.model.enums.IntervalMode;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "intervals")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Interval {
    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chain_id")
    private Chain chain;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "phase_id")
    private Phase phase;

    @Column(name = "sequence_order")
    private Byte sequenceOrder;

    @Column(name = "start_time")
    private Byte startTime; // Giây bắt đầu trong chu kỳ

    @Column(name = "end_time")
    private Byte endTime;   // Giây kết thúc

    @Enumerated(EnumType.STRING)
    @Column(name = "mode")
    private IntervalMode mode;
}