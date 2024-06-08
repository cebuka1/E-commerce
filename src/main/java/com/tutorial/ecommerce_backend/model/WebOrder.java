package com.tutorial.ecommerce_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "web_order")
public class WebOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private LocalUser user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public LocalUser getUser() {
        return user;
    }
    public void setUser(LocalUser user) {
        this.user = user;
    }
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }
}
