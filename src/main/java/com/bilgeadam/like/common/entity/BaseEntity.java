package com.bilgeadam.like.common.entity;
/**
 * @author stkey
 * @since 29.03.2023
 */
import com.bilgeadam.like.consts.EntityConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@Setter
@Getter
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Where(clause = EntityConstants.WHERE_CLAUSE)
public abstract class BaseEntity {

    /**
     * Entity primaryKey UUID
     */
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private UUID id;

    /**
     * Entity Created Date
     */
    @CreatedDate
    @Column(name = "create_date", updatable = false)
    private LocalDateTime createDate;

    /**
     * Entity Created By
     */
    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private String createdUser;

    /**
     * State of entity
     * deleted = 0, undeleted=1
     */
    @Column(name = "state", nullable = false)
    private short state=1;

    /**
     * Entity Version
     */
    @Version
    @Column(name = "version")
    private Long version;
}
