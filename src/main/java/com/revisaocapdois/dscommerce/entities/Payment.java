package com.revisaocapdois.dscommerce.entities;

import java.time.Instant;

public class Payment {

    private Long id;
    private Instant moment;

    public Payment(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
}
