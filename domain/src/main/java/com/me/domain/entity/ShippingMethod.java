package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShippingMethod extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private Date estimatedDeliveryDate;
}
