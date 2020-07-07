package com.codegym.casestudymodule2javaweb.service.Impl;

import com.codegym.casestudymodule2javaweb.entity.Service;
import com.codegym.casestudymodule2javaweb.repository.ServiceRepository;
import com.codegym.casestudymodule2javaweb.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ServiceServiceimpl implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Page<Service> getAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Service> getAllServiceByName(String search, Pageable pageable) {
        return serviceRepository.findAllByServiceNameContaining(search, pageable);
    }

    @Override
    public void saveService(Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Service> getAllService() {
        return serviceRepository.findAll();
    }
}
