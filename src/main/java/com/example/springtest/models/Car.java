package com.example.springtest.models;

import java.util.Objects;

public class Car {
    private String herrsteller;
    private int reifen;
    private boolean tuv;

    public Car() {
    }

    public Car(String herrsteller, int reifen, boolean tuv) {
        this.herrsteller = herrsteller;
        this.reifen = reifen;
        this.tuv = tuv;
    }

    public String getHerrsteller() {
        return herrsteller;
    }

    public void setHerrsteller(String herrsteller) {
        this.herrsteller = herrsteller;
    }

    public int getReifen() {
        return reifen;
    }

    public void setReifen(int reifen) {
        this.reifen = reifen;
    }

    public boolean isTuv() {
        return tuv;
    }

    public void setTuv(boolean tuv) {
        this.tuv = tuv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (reifen != car.reifen) return false;
        if (tuv != car.tuv) return false;
        return Objects.equals(herrsteller, car.herrsteller);
    }

    @Override
    public int hashCode() {
        int result = herrsteller != null ? herrsteller.hashCode() : 0;
        result = 31 * result + reifen;
        result = 31 * result + (tuv ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "herrsteller='" + herrsteller + '\'' +
                ", reifen=" + reifen +
                ", tuv=" + tuv +
                '}';
    }
}
