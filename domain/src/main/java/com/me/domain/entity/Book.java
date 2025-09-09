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
public class Book extends BaseEntity {

    @Column(nullable = false)
    private String bookCode;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String supplier;

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private String author;

    private String translator;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private int pageCount;

    @Column(nullable = false)
    private String coverType;

    @Column(nullable = false)
    private int publicationYear;

    @Column(nullable = false)
    private float weight;

    @Column(nullable = false)
    private float length;

    @Column(nullable = false)
    private float width;

    @Column(nullable = false)
    private float height;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private int soldCount = 0;

    @OneToMany(mappedBy = "book")
    private List<Attachment> attachments = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "book_category",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id")

    )
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<CartItem> cartItems = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "wishlist_book",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "wishlist_id", referencedColumnName = "id")
    )
    private List<Wishlist> wishlists = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "book_voucher",
            joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "voucher_id", referencedColumnName = "id")
    )
    private List<Voucher> vouchers = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "book")
    private List<OrderItem> orderItems = new ArrayList<>();
}
