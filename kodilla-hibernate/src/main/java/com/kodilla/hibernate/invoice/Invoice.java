package com.kodilla.hibernate.invoice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Invoice {

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String number;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Item> items;


}
