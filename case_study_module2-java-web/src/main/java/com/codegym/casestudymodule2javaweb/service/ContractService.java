package com.codegym.casestudymodule2javaweb.service;

import com.codegym.casestudymodule2javaweb.entity.Contract;

import java.util.List;

public interface ContractService {
    void saveContract(Contract contract);
    List<Contract> getAllContract();
}
