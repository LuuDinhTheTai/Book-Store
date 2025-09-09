package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account extends BaseEntity {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String password;

    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Date dateOfBirth;

    @OneToMany(mappedBy = "account")
    private List<Address> addresses = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private List<Wishlist> wishlists = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private List<Voucher> vouchers = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private List<Review> reviews = new ArrayList<>();
}
