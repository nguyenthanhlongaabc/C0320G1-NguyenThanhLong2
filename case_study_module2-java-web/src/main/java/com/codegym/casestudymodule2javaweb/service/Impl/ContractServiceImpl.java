package com.codegym.casestudymodule2javaweb.service.Impl;

import com.codegym.casestudymodule2javaweb.entity.Contract;
import com.codegym.casestudymodule2javaweb.repository.ContractRepository;
import com.codegym.casestudymodule2javaweb.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Override
    public void saveContract(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public List<Contract> getAllContract() {
        return contractRepository.findAll();
    }
}
