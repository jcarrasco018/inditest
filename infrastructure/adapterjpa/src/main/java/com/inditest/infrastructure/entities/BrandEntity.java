package com.inditest.infrastructure.entities;

import jakarta.persistence.*;

@Entity(name = "Brand")
@Table(name = "Brand")
public class BrandEntity {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    public BrandEntity() {
    }

    public BrandEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
