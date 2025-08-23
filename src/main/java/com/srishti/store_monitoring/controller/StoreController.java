package com.srishti.store_monitoring.controller;

import com.srishti.store_monitoring.model.Store;
import com.srishti.store_monitoring.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    private final StoreService service;

    public StoreController(StoreService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<Store> create(@RequestBody Store s) {
        return ResponseEntity.ok(service.create(s));
    }

    @GetMapping
    public List<Store> all() { return service.getAll(); }

    @GetMapping("/{id}")
    public Store one(@PathVariable Long id) { return service.getById(id); }

    @PutMapping("/{id}")
    public Store update(@PathVariable Long id, @RequestBody Store s) {
        return service.update(id, s);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
