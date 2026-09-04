package com.angerbytes.models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Plan {
    public static final BigDecimal YEARLY_DISCOUNT = new BigDecimal("0.15");

    private final UUID id;
    private String name;
    private int speedMbps;
    private BigDecimal monthlyPrice;
    private final BigDecimal yearlyPrice;
    private List<Subscription> subscriptions =  new ArrayList<>();

    public Plan(String name, int speedMbps, String monthlyPrice) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.speedMbps = speedMbps;
        this.monthlyPrice = new BigDecimal(monthlyPrice).setScale(2, RoundingMode.HALF_UP);
        this.yearlyPrice = this.monthlyPrice.multiply(BigDecimal.valueOf(12)).multiply(BigDecimal.ONE.subtract(YEARLY_DISCOUNT)).setScale(2, RoundingMode.HALF_UP);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedMbps() {
        return speedMbps;
    }

    public void setSpeedMbps(int speedMbps) {
        this.speedMbps = speedMbps;
    }

    public BigDecimal getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(BigDecimal monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public BigDecimal getYearlyPrice() {
        return yearlyPrice;
    }

    public List<Subscription> getSubscriptions() {
        subscriptions.forEach(System.out::println);
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "yearlyPrice=" + yearlyPrice +
                ", subscriptions=" + subscriptions +
                ", monthlyPrice=" + monthlyPrice +
                ", speedMbps=" + speedMbps +
                ", name='" + name + '\'' +
                '}';
    }
}
