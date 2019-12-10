package com.kodilla.hibernate.invoice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Item {

    public Item (Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = BigDecimal.valueOf(quantity).multiply(price);
    }

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @ManyToOne
    private Product product;

    @NotNull
    private BigDecimal price;

    @NotNull
    private int quantity;

    @NotNull
    private BigDecimal value;

    @ManyToOne
    private Invoice invoice;
}
