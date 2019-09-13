package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice(String number) {
        this.number = number;
    }

    public Invoice() {
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany (mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
