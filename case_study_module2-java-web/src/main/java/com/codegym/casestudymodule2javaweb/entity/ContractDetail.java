package com.codegym.casestudymodule2javaweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contractDetail_quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;


}
