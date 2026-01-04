package com.traffic.core_logic.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "plans")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    @Column(name = "number")
    private Short number;

    @Column(name = "description")
    private String description; // "Weekday", "Holiday"...

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
    private List<TimeSlot> timeSlots;
}
