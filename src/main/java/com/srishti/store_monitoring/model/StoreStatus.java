package com.srishti.store_monitoring.model;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "store_status", indexes = {
        @Index(name = "ix_store_time", columnList = "storeId,timestampUtc")
})
public class StoreStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String storeId;

    @Column(nullable = false)
    private OffsetDateTime timestampUtc; // must be UTC

    @Column(nullable = false)
    private String status; // "active" | "inactive"

    public StoreStatus() {}

    public StoreStatus(String storeId, OffsetDateTime timestampUtc, String status) {
        this.storeId = storeId;
        this.timestampUtc = timestampUtc;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }
    public OffsetDateTime getTimestampUtc() { return timestampUtc; }
    public void setTimestampUtc(OffsetDateTime timestampUtc) { this.timestampUtc = timestampUtc; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
