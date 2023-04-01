package com.bilgeadam.like.entity;

import com.bilgeadam.like.common.entity.BaseEntity;
import com.bilgeadam.like.consts.EntityConstants;
import com.bilgeadam.like.consts.MessageConstants;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.validation.constraints.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@SQLDelete(sql = "UPDATE like.links set state=0 where id= ? and version=?")
@Where(clause = EntityConstants.WHERE_CLAUSE)
@Table(name = "links")
public class Link extends BaseEntity {

    /**
     * Link category information
     */
    @NotBlank(message = MessageConstants.MESSAGE_NOT_BLANK)
    @Column(name = "category")
    private String category;


    /**
     * Link information
     */
    @NotBlank(message = MessageConstants.MESSAGE_NOT_BLANK)
    @Size(min = 4, max = 500)
    @Column(name = "information")
    private String information;

    /**
     * Points user relation
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}