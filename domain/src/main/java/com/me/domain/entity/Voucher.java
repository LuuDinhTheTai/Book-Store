package com.me.domain.entity;

import com.me.domain.entity.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Voucher extends BaseEntity {

    private String name;

    private String description;

    private Date expiredAt;

    @ManyToOne
    private Account account;

    @ManyToMany(mappedBy = "vouchers")
    List<Book> books = new ArrayList<>();
}

