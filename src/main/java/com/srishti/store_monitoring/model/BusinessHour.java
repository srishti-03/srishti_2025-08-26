package com.srishti.store_monitoring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "business_hours", indexes = {
        @Index(name = "ix_bh_store_dow", columnList = "storeId,dayOfWeek")
})
public class BusinessHour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // e.g. "101"
    @Column(nullable = false)
    private String storeId;

    // 0 = Monday ... 6 = Sunday
    @Column(nullable = false)
    private Integer dayOfWeek;

    // local times as strings "HH:mm:ss" (we’ll normalize while ingesting)
    @Column(nullable = false)
    private String startTimeLocal;

    @Column(nullable = false)
    private String endTimeLocal;

    public BusinessHour() {}

    public BusinessHour(String storeId, Integer dayOfWeek, String startTimeLocal, String endTimeLocal) {
        this.storeId = storeId;
        this.dayOfWeek = dayOfWeek;
        this.startTimeLocal = startTimeLocal;
        this.endTimeLocal = endTimeLocal;
    }

    public Long getId() { return id; }
    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }
    public Integer getDayOfWeek() { return dayOfWeek; }
    public void setDayOfWeek(Integer dayOfWeek) { this.dayOfWeek = dayOfWeek; }
    public String getStartTimeLocal() { return startTimeLocal; }
    public void setStartTimeLocal(String startTimeLocal) { this.startTimeLocal = startTimeLocal; }
    public String getEndTimeLocal() { return endTimeLocal; }
    public void setEndTimeLocal(String endTimeLocal) { this.endTimeLocal = endTimeLocal; }
}
