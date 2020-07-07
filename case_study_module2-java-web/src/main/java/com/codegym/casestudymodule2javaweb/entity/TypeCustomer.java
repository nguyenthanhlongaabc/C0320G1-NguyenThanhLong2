package com.codegym.casestudymodule2javaweb.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "type_customer")
public class TypeCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "typeCustomer_name")
    private String nameTypeCustomer;

    public TypeCustomer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }

}
