package com.angerbytes.models;

import java.util.Objects;

public class Provider {
    private String name;

    public Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(name, provider.name);
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
