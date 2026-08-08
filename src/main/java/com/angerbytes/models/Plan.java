package com.angerbytes.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Plan {
    public static final BigDecimal YEARLY_DISCOUNT = new BigDecimal("0.15");

    private String name;
    private int speedMbps;
    private BigDecimal monthlyPrice;
    private final BigDecimal yearlyPrice;

    public Plan(String name, int speedMbps, String montlhyPrice) {
        this.name = name;
        this.speedMbps = speedMbps;
        this.monthlyPrice = new BigDecimal(montlhyPrice).setScale(2, RoundingMode.HALF_UP);
        this.yearlyPrice = this.monthlyPrice.multiply(BigDecimal.valueOf(12)).multiply(BigDecimal.ONE.subtract(YEARLY_DISCOUNT)).setScale(2, RoundingMode.HALF_UP);
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

    public BigDecimal getMontlhyPrice() {
        return monthlyPrice;
    }

    public void setMontlhyPrice(BigDecimal montlhyPrice) {
        this.monthlyPrice = montlhyPrice;
    }

    public BigDecimal getYearlyPrice() {
        return yearlyPrice;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", speed=" + speedMbps + "Mbps"+
                ", monthlyPrice= R$ " + monthlyPrice +
                ", yearlyPrice= R$ " + yearlyPrice +
                '}';
    }
}
