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
public class Category extends BaseEntity {

    private String name;

    @ManyToOne
    private Category parent;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books = new ArrayList<>();
}
