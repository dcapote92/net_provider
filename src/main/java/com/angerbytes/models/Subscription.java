package com.angerbytes.models;

import java.time.LocalDateTime;

public class Subscription {
    private final Plan plan;
    private final Client client;
    private LocalDateTime invoiceDate, paymentDate;
    private boolean active;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Subscription(Plan plan, Client client, LocalDateTime invoiceDate, LocalDateTime paymentDate) {
        this.plan = plan;
        this.client = client;
        this.invoiceDate = invoiceDate;
        this.paymentDate = paymentDate;
        this.active = true;
        this.createdAt = LocalDateTime.now();
    }

    public Plan getPlan() {
        return plan;
    }


    public Client getClient() {
        return client;
    }



    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
