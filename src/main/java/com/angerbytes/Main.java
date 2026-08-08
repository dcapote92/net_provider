package com.angerbytes;


import com.angerbytes.models.Client;
import com.angerbytes.utils.MaskText;

public class Main {
    static void main() {
        Client cl1 = new Client("Jhon Doe");
        cl1.setPhone(MaskText.phone("085920005853"));
        cl1.setEmail("daniel@email.com");
        System.out.println(cl1);
    }
}
