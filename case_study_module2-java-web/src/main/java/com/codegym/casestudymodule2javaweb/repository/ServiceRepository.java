package com.codegym.casestudymodule2javaweb.repository;

import com.codegym.casestudymodule2javaweb.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ServiceRepository extends PagingAndSortingRepository<Service,Long> {
    Page<Service> findAllByServiceNameContaining(String serviceName, Pageable pageable);
}
