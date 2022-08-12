package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {

    int id;
    String number;
    List<Item> items = new ArrayList<>();

    public Invoice(String number) {
        this.number = number;
    }
    public Invoice() {}

    @Id
    @GeneratedValue
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "Id", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NUMBER", nullable = false)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @Column(name = "ITEMS", nullable = false)
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
