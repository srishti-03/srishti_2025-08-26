package com.srishti.store_monitoring.repo;

import com.srishti.store_monitoring.model.StoreStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

public interface StoreStatusRepository extends JpaRepository<StoreStatus, Long> {

    Optional<StoreStatus> findFirstByOrderByTimestampUtcDesc();

    List<StoreStatus> findByStoreIdAndTimestampUtcBetweenOrderByTimestampUtcAsc(
            String storeId, OffsetDateTime start, OffsetDateTime end
    );

    Optional<StoreStatus> findFirstByStoreIdAndTimestampUtcLessThanEqualOrderByTimestampUtcDesc(
            String storeId, OffsetDateTime t
    );

    @Query("select distinct s.storeId from StoreStatus s")
    List<String> findDistinctStoreIds();
}
