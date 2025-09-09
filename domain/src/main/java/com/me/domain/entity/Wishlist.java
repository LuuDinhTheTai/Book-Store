package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class Wishlist extends BaseEntity {

    @ManyToOne
    private Account account;

    @ManyToMany(mappedBy = "wishlists")
    private List<Book> books = new ArrayList<>();
}
