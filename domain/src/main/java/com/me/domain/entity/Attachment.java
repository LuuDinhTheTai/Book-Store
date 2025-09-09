package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Attachment extends BaseEntity {

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String MIMEType;

    @Column(nullable = false)
    private Long fileSize;

    @Column(nullable = false)
    private String storageUrl;

    @Column(nullable = false)
    private String fileType;

    @ManyToOne
    private Book book;
}
