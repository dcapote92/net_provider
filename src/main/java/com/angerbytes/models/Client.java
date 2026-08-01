package com.angerbytes.models;

import java.util.Objects;

public class Client {
    private String name;
    private String cpf;
    private final String birthDate;
    private String email;
    private String phone;
    private String address;

    public Client(String name, String cpf, String birthDate, String email, String phone, String address) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(cpf, client.cpf) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String cpfMask(){
        return String.format("%s.%s.%s-%s",
                cpf.substring(0,3),
                cpf.substring(3,6),
                cpf.substring(6,9),
                cpf.substring(9,11)
        );
    }

    public String phoneMask(){
        phone = phone.startsWith("0") ? phone.substring(1) : phone;
        return String.format("(%s) %s-%s",
                phone.substring(0,2),
                phone.substring(2,6),
                phone.substring(6)
        );
    }
}
