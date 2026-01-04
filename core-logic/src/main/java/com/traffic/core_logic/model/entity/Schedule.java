package com.traffic.core_logic.model.entity;

import io.hypersistence.utils.hibernate.type.array.ListArrayType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;
import java.util.List;

@Entity
@Table(name = "schedules")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "intersection_id")
    private Intersection intersection;

    @Column(name = "number")
    private Byte number;

    @Column(name = "priority")
    private Short priority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    private Plan plan; // Plan nào sẽ được kích hoạt?

    // --- Array Types Mapped to Java List ---

    @Type(ListArrayType.class)
    @Column(name = "month", columnDefinition = "integer[]")
    private List<Integer> months; // [1, 2, ... 12]

    @Type(ListArrayType.class)
    @Column(name = "day", columnDefinition = "integer[]")
    private List<Integer> days;   // [1, 15, 20] (Ngày trong tháng)

    @Type(ListArrayType.class)
    @Column(name = "day_of_week", columnDefinition = "integer[]")
    private List<Integer> daysOfWeek; // [1=Mon, 7=Sun] (Tùy quy ước)
}
