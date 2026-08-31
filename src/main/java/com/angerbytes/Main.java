package com.angerbytes;


import com.angerbytes.models.Client;
import com.angerbytes.models.Plan;
import com.angerbytes.models.Subscription;
import com.angerbytes.utils.MaskText;

import java.time.LocalDateTime;

public class Main {
    static void main() {

        Client cl1 = new Client("Jhon Doe");
        cl1.setPhone(MaskText.phone("085920005853"));
        cl1.setEmail("daniel@email.com");

        Plan pl1 = new Plan("Basic", 250, "69.99");
        Subscription sub1 = new Subscription(pl1,cl1, LocalDateTime.now(), LocalDateTime.now());
        cl1.setSubscriptions(sub1);
        System.out.println(cl1.getSubscriptions());
        System.out.println(pl1);
    }
}
