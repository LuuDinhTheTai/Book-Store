package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Review extends BaseEntity {

    private String content;

    private Integer rating;

    private int likeCount;

    @ManyToOne
    private Account account;

    @ManyToOne
    private Book book;
}
