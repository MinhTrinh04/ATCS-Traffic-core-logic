package com.traffic.core_logic.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "conflict_matrix")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(ConflictMatrix.ConflictId.class)
public class ConflictMatrix {

    @Id
    @Column(name = "phase_a_id")
    private Integer phaseAId;

    @Id
    @Column(name = "phase_b_id")
    private Integer phaseBId;

    @Column(name = "is_conflict")
    private boolean isConflict;

    // ==========================================
    // Class định nghĩa khóa chính (Bắt buộc phải có trong JPA)
    // Nhưng nó chỉ là logic Java, không tạo bảng mới trong DB
    // ==========================================
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ConflictId implements Serializable {
        private Integer phaseAId;
        private Integer phaseBId;
    }
}
