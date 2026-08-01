package com.angerbytes;


import com.angerbytes.models.Client;
import com.angerbytes.models.Plan;

public class Main {
    static void main() {
        Client cl1 = new Client("Jhon Doe", "11122233344","01/01/1999", "jhon@mail.com", "1122223333", "1st AV, 123 - NY");
        System.out.println(cl1.cpfMask());
        System.out.println(cl1.phoneMask());
    }
}
