package com.revisaocapdois.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
     private Instant moment;
     private OrderStatus status;

     @ManyToOne
     @JoinColumn(name = "client_id")
     private User client;

    public Order() {
    }

    public Order(Instant moment, Long id, OrderStatus status, User client) {
        this.moment = moment;
        this.id = id;
        this.status = status;
        this.client = client;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
