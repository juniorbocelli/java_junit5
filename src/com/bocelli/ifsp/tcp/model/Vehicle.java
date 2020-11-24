package com.bocelli.ifsp.tcp.model;

import com.bocelli.ifsp.tcp.model.utils.Validator;

import java.util.Objects;

public class Vehicle {
    private String carPlateLetters;
    private Integer carPlateNumbers;
    private String carPlateCity;
    private String carPlateState;
    private String type;
    private String brand;
    private String model;
    private Integer year;
    private Integer door;
    private Integer seats;
    private String fuel;
    private String color;
    private String features;

    @Override
    public int hashCode() {
        return Objects.hash(carPlateLetters, carPlateNumbers, carPlateCity, carPlateState);
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Vehicle) && ((Vehicle) o).getCarPlateLetters().equals(this.getCarPlateLetters()) &&
                ((Vehicle) o).getCarPlateNumbers().equals(this.getCarPlateNumbers()) &&
                ((Vehicle) o).getCarPlateCity().equals(this.getCarPlateCity()) &&
                ((Vehicle) o).getCarPlateState().equals(this.getCarPlateState())) {
            return true;
        } else
            return false;
    }

    public String getCarPlateLetters() {
        return carPlateLetters;
    }

    public void setCarPlateLetters(String carPlateLetters) {
        if(!Validator.isPlateLetters(carPlateLetters)) throw new IllegalArgumentException("Letras de placa inválidas!");
        this.carPlateLetters = carPlateLetters.toUpperCase();
    }

    public Integer getCarPlateNumbers() {
        return carPlateNumbers;
    }

    public void setCarPlateNumbers(Integer carPlateNumbers) {
        if(!Validator.isPlateNumbers(Integer.toString(carPlateNumbers)));
        this.carPlateNumbers = carPlateNumbers;
    }

    public String getCarPlateCity() {
        return carPlateCity;
    }

    public void setCarPlateCity(String carPlateCity) {
        if(carPlateCity == null || carPlateCity.isEmpty()) throw new IllegalArgumentException("Cidade inválida!");
        this.carPlateCity = carPlateCity.toUpperCase();
    }

    public String getCarPlateState() {
        return carPlateState;
    }

    public void setCarPlateState(String carPlateState) {
        if(carPlateState == null || carPlateState.isEmpty()) throw new IllegalArgumentException("Estado Inválido!");
        if(!Validator.isPlateUf(carPlateState)) if(carPlateState == null || carPlateState.isEmpty()) throw new IllegalArgumentException("Estado Inválido!");
        this.carPlateState = carPlateState.toUpperCase();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type == null || type.isEmpty()) throw new IllegalArgumentException("Tipo inválido!");
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isEmpty()) throw new IllegalArgumentException("Marca inválida!");
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.isEmpty()) throw new IllegalArgumentException("Modelo inválido!");
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        if(!Validator.isFullYear(Integer.toString(year))) throw new IllegalArgumentException("Ano Inválido!");
        this.year = year;
    }

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        if(door == null || door <= 0) throw new IllegalArgumentException("Número de portas inválida!");
        this.door = door;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        if(seats == null || seats <= 0) throw new IllegalArgumentException("Número de assentos inválida!");
        this.seats = seats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        fuel = fuel.toUpperCase();
        if(fuel != "GASOLINA" && fuel != "ALCOOL" &&
                fuel != "FLEX" && fuel != "DIESEL" &&
                fuel != "ELÉTRICO" && fuel != "HÍBRIDO")
            throw new IllegalArgumentException("Combustível Inválido!");
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()) throw new IllegalArgumentException("Cor inválida!");
        this.color = color;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        if(features == null || features.isEmpty()) throw new IllegalArgumentException("Acessórios inválidos!");
        this.features = features;
    }
}
