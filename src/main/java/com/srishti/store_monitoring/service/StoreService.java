package com.srishti.store_monitoring.service;

import com.srishti.store_monitoring.model.Store;
import com.srishti.store_monitoring.repo.StoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    private final StoreRepository repo;

    public StoreService(StoreRepository repo) { this.repo = repo; }

    public Store create(Store s) { return repo.save(s); }

    public List<Store> getAll() { return repo.findAll(); }

    public Store getById(Long id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Store not found"));
    }

    public Store update(Long id, Store incoming) {
        Store s = getById(id);
        s.setName(incoming.getName());
        s.setLocation(incoming.getLocation());
        s.setManagerName(incoming.getManagerName());
        return repo.save(s);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

