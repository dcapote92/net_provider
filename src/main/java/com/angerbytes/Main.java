package com.angerbytes;


import com.angerbytes.models.Plan;

public class Main {
    static void main() {
        Plan basicPlan = new Plan("Básico","200Mbs", "69.90");
        System.out.println(basicPlan);
    }
}
