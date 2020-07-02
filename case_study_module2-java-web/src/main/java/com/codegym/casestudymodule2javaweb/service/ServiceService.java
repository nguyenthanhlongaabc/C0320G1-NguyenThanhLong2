package com.codegym.casestudymodule2javaweb.service;

import com.codegym.casestudymodule2javaweb.entity.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ServiceService {
    Page<Service> getAllService(Pageable pageable);

    Page<Service> getAllServiceByName(String search, Pageable pageable);

    void saveService(Service service);

    void deleteService(Long id);

    Service getServiceById(Long id);

    Iterable<Service> getAllService();
}
