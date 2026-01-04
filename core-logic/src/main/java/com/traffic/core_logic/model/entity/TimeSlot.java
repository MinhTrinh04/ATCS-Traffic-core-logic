package com.traffic.core_logic.model.entity;

import com.traffic.core_logic.model.enums.ControlMode;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalTime;

@Entity
@Table(name = "time_slots")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimeSlot {
    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    private Plan plan;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chain_id")
    private Chain chain; // Chain nào sẽ chạy trong khung giờ này?

    @Column(name = "start_time")
    private LocalTime startTime; // Ví dụ: 06:30:00

    @Enumerated(EnumType.STRING)
    @Column(name = "control_mode")
    private ControlMode controlMode;
}