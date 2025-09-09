package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart extends BaseEntity {

    private float totalPrice;

    private boolean isActive = false;

    @ManyToOne
    private Account account;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems = new ArrayList<>();
}
