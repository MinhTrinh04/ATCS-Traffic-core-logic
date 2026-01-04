package com.traffic.core_logic.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "controllers")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Controller {
    @Id
    @Column(name = "id")
    private Integer id; // User define ID, not Auto Increment per schema? Or Map from external?
    // Nếu muốn Auto Inc: @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cabinet_id")
    private Integer cabinetId; // Tham chiếu module thiết bị

    @Column(name = "number")
    private Integer number;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "timezone")
    private Integer timezone;

    @Column(name = "number_of_intersection")
    private Byte numberOfIntersection;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}