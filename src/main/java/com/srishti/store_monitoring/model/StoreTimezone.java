package com.srishti.store_monitoring.model;

import jakarta.persistence.*;

@Entity
@Table(name = "store_timezone")
public class StoreTimezone {

    @Id
    private String storeId;        // same id as store_status.storeId

    // e.g. "America/Chicago"
    @Column(nullable = false)
    private String timezoneStr;

    public StoreTimezone() {}

    public StoreTimezone(String storeId, String timezoneStr) {
        this.storeId = storeId;
        this.timezoneStr = timezoneStr;
    }

    public String getStoreId() { return storeId; }
    public void setStoreId(String storeId) { this.storeId = storeId; }
    public String getTimezoneStr() { return timezoneStr; }
    public void setTimezoneStr(String timezoneStr) { this.timezoneStr = timezoneStr; }
}
