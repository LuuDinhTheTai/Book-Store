package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "orders")
public class Order extends BaseEntity {

    @Column(nullable = false)
    private String orderCode;

    @Column(nullable = false)
    private float totalPrice;

    @Column(nullable = false)
    private String note;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    private Address address;

    @ManyToOne
    private PaymentMethod paymentMethod;

    @ManyToOne
    private ShippingMethod shippingMethod;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();
}
