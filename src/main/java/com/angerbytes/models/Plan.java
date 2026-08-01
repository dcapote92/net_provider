package com.angerbytes.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Plan {
    public static final BigDecimal YEARLY_DISCOUNT = new BigDecimal("0.15");

    private String name, speed, monthlyPrice;
    private final BigDecimal yearlyPrice;

    public Plan(String name, String speed, String monthlyPrice) {
        this.name = name;
        this.speed = speed;
        this.monthlyPrice = monthlyPrice;
        this.yearlyPrice = new BigDecimal(this.monthlyPrice).multiply(BigDecimal.valueOf(12)).multiply(BigDecimal.ONE.subtract(YEARLY_DISCOUNT)).setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public BigDecimal getMonthlyPrice() {
        return new BigDecimal(monthlyPrice);
    }

    public void setMonthlyPrice(String monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public BigDecimal getYearlyPrice() {
        return yearlyPrice;
    }

    public BigDecimal comparativeYearlyPrice() {
        return getMonthlyPrice().multiply(BigDecimal.valueOf(12)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name= '" + name + '\'' +
                ", speed= '" + speed + '\'' +
                ", Monthly Price= '" + monthlyPrice + '\'' +
                ", Yearly Price= " + comparativeYearlyPrice() +
                ", Yearly Price with discount= " + yearlyPrice +
                '}';
    }
}
