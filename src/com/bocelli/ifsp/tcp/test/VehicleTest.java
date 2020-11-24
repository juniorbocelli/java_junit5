package com.bocelli.ifsp.tcp.test;

import com.bocelli.ifsp.tcp.model.Vehicle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Order(1)
    @ParameterizedTest
    @ValueSource(strings = {"", "123", "a12", "aa1", "1aa", "11a", "a", "aa", "abcd"})
    @DisplayName("Testanto letras da placa: todos devem subir exceção")
    public void testLettersPlateNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setCarPlateLetters(atr);
        });
    }

    @Order(2)
    @ParameterizedTest
    @ValueSource(strings = {"aaa", "abc", "wew", "ddd", "1aa"})
    @DisplayName("Testanto letras da placa: nenhum deve subir exceção e devem corresponder ao get")
    public void testLettersPlateA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setCarPlateLetters(atr);
        });
        assertEquals(atr.toUpperCase(), my_car.getCarPlateLetters());
    }

    @Order(3)
    @ParameterizedTest
    @ValueSource(ints = {1, 12, 123, 12345})
    @DisplayName("Testanto números da placa: todos devem subir exceção")
    public void testNumbersPlateNa(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setCarPlateNumbers(atr);
        });
    }

    @Order(4)
    @ParameterizedTest
    @ValueSource(ints = {1111, 1234})
    @DisplayName("Testanto números da placa: nenhum deve subir exceção e devem corresponder ao get")
    public void testNumbersPlateA(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setCarPlateNumbers(atr);
        });
        assertEquals(atr, my_car.getCarPlateNumbers());
    }

    @Order(5)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto cidade da placa: todos devem subir exceção")
    public void testCarPlateCityNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setCarPlateCity(atr);
        });

    }

    @Order(6)
    @ParameterizedTest
    @ValueSource(strings = {"Jaú", "São Carlos"})
    @DisplayName("Testanto cidade da placa: nenhum deve subir exceção e devem corresponder ao get")
    public void testCarPlateCityA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setCarPlateCity(atr);
        });
        assertEquals(atr, my_car.getCarPlateCity());
    }

    @Order(7)
    @ParameterizedTest
    @ValueSource(strings = {"a", "aaa", ""})
    @DisplayName("Testanto estado da placa: todos devem subir exceção")
    public void testCarPlateStateNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setCarPlateState(atr);
        });
    }

    @Order(8)
    @ParameterizedTest
    @ValueSource(strings = {"aa", "ab"})
    @DisplayName("Testanto estado da placa: nenhum deve subir exceção e devem corresponder ao get")
    public void testCarPlateStateA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setCarPlateState(atr);
        });
        assertEquals(atr.toUpperCase(), my_car.getCarPlateState());
    }

    @Order(9)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto tipo: todos devem subir exceção")
    public void testTypeNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setType(atr);
        });
    }

    @Order(10)
    @ParameterizedTest
    @ValueSource(strings = {"Passeio", "SUV"})
    @DisplayName("Testanto tipo: nenhum deve subir exceção e devem corresponder ao get")
    public void testTypeA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setType(atr);
        });
        assertEquals(atr, my_car.getType());
    }

    @Order(11)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto marca: todos devem subir exceção")
    public void testBrandNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setBrand(atr);
        });
    }

    @Order(12)
    @ParameterizedTest
    @ValueSource(strings = {"Peugeot", "FIAT"})
    @DisplayName("Testanto marca: nenhum deve subir exceção")
    public void testBrandA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setBrand(atr);
        });
        assertEquals(atr, my_car.getBrand());
    }

    @Order(13)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto modelo: todos devem subir exceção")
    public void testModelNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setModel(atr);
        });
    }

    @Order(14)
    @ParameterizedTest
    @ValueSource(strings = {"Sport", "Completo"})
    @DisplayName("Testanto modelo: nenhum deve subir exceção")
    public void testModelA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setModel(atr);
        });
        assertEquals(atr, my_car.getModel());
    }

    @Order(15)
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -10, 1, 11, 111, 11111})
    @DisplayName("Testanto ano: todos devem subir exceção")
    public void testYearNa(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setYear(atr);
        });
    }

    @Order(16)
    @ParameterizedTest
    @ValueSource(ints = {2000, 1982, 2022})
    @DisplayName("Testanto ano: nenhum deve subir exceção")
    public void testYearA(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setYear(atr);
        });
        assertEquals(atr, my_car.getYear());
    }

    @Order(17)
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -10})
    @DisplayName("Testanto portas: todos devem subir exceção")
    public void testDoorsNa(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setDoor(atr);
        });
    }

    @Order(18)
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 20})
    @DisplayName("Testanto portas: nenhum deve subir exceção")
    public void testDoorsA(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setDoor(atr);
        });
        assertEquals(atr, my_car.getDoor());
    }

    @Order(19)
    @ParameterizedTest
    @ValueSource(ints = {0, -1, -10})
    @DisplayName("Testanto lugares: todos devem subir exceção")
    public void testSeatsNa(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setSeats(atr);
        });
    }

    @Order(20)
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 20})
    @DisplayName("Testanto lugares: nenhum deve subir exceção")
    public void testSeatsA(Integer atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setSeats(atr);
        });
        assertEquals(atr, my_car.getSeats());
    }

    @Order(21)
    @ParameterizedTest
    @ValueSource(strings = {"", "putônio", "água"})
    @DisplayName("Testanto combustível: todos devem subir exceção")
    public void testFuelNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setFuel(atr);
        });
    }

    @Order(22)
    @ParameterizedTest
    @ValueSource(strings = {"gasolina", "flex", "FLEX", "diesel"})
    @DisplayName("Testanto combustível: nenhum deve subir exceção")
    public void testFuelA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setFuel(atr);
        });
        assertEquals(atr.toUpperCase(), my_car.getFuel());
    }

    @Order(23)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto cor: todos devem subir exceção")
    public void testColorNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setColor(atr);
        });
    }

    @Order(24)
    @ParameterizedTest
    @ValueSource(strings = {"amarelo", "vermelho", "azul", "burro quando foge"})
    @DisplayName("Testanto cor: nenhum deve subir exceção")
    public void testColorA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setColor(atr);
        });
        assertEquals(atr, my_car.getColor());
    }

    @Order(25)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto acessórios: todos devem subir exceção")
    public void testFeaturesNa(String atr) {
        Vehicle my_car = new Vehicle();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_car.setFeatures(atr);
        });
    }

    @Order(26)
    @ParameterizedTest
    @ValueSource(strings = {"ar condicionado", "alarme", "camêra traseira"})
    @DisplayName("Testanto acessórios: nenhum deve subir exceção")
    public void testFeaturesA(String atr) {
        Vehicle my_car = new Vehicle();
        assertDoesNotThrow(()->{
            my_car.setFeatures(atr);
        });
        assertEquals(atr, my_car.getFeatures());
    }
}
