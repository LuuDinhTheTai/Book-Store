package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PaymentMethod extends BaseEntity {

    @Column(nullable = false)
    private String methodName;
}
