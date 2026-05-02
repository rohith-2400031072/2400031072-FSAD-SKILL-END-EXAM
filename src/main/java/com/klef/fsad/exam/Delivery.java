package com.klef.fsad.exam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Delivery 
{
    @Id
    private Integer deliveryId;   // manual ID (must not be null)
    private String name;
    private String status;

    public Integer getDeliveryId() { return deliveryId; }
    public void setDeliveryId(Integer deliveryId) { this.deliveryId = deliveryId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}