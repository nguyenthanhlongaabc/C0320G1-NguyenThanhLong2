package com.codegym.casestudymodule2javaweb.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Pattern(regexp = "^KH-[0-9]{4}$",message = "Wrong format!!. Format is KH-XXXX (X is 0-9)")
    @Column(name = "customer_code")
    private String codeCustomer;

    @Column(name = "customer_name")
    private String name;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "customer_birthday")
    private Date birthday;

    @Pattern(regexp = "(^[0-9]{9}$)|(^[0-9]{12}$)", message = "cmnd format is XXXXXXXXX or XXXXXXXXXXXX !!")
    @Column(name = "customer_cmnd")
    private String cmnd;

    @Pattern(regexp = "(^09[01][0-9]{7}$)|(^\\(84\\)\\+9[01][0-9]{7}$)", message = "Wrong format!!")
    @Column(name = "customer_phone")
    private String phone;

//    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "Email format is abc@abc.com !!")
    @Email
    @Column(name = "customer_email")
    private String email;

    @NotBlank
    @Column(name = "customer_address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "typeCustomer_id")
    private TypeCustomer typeCustomer;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

}
