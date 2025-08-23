package com.srishti.store_monitoring.repo;

import com.srishti.store_monitoring.model.BusinessHour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessHourRepository extends JpaRepository<BusinessHour, Long> {
    List<BusinessHour> findByStoreId(String storeId);
}

