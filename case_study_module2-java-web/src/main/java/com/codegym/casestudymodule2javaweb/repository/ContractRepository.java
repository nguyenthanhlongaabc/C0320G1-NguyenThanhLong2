package com.codegym.casestudymodule2javaweb.repository;

import com.codegym.casestudymodule2javaweb.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract,Long> {
}
