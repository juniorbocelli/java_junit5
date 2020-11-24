package com.bocelli.ifsp.tcp.test;

import com.bocelli.ifsp.tcp.model.Mechanic;
import com.bocelli.ifsp.tcp.model.Shop;
import com.bocelli.ifsp.tcp.model.Vehicle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    private Shop shop;
    private Mechanic initialMechanic;
    private Vehicle initialVehicle;

    @BeforeEach
    public void createShop() {
        shop = new Shop();
    }

    @BeforeEach
    public void createInitialEntities() {
        initialMechanic = new Mechanic("222.222.222-22", "Júnior Bocelli", "06/06/2020", "M", "1000,00", "bocelli@gmail.com", "(16)3333-1234");
        initialVehicle = new Vehicle("ABC", 1234, "São Carlos", "SP", "Passeio", "Peugeot", "Sport", 2000, 3, 4, "GASOLINA", "AZUL", "Comum");
    }

    @Test
    @Order(1)
    @DisplayName("Testando adição de mecânico")
    public void addMechanic() {
        ArrayList<Mechanic> my_array = new ArrayList<>();
        my_array.add(initialMechanic);

        assertAll("shop",
                ()->assertTrue(shop.addMechanic(initialMechanic)),
                ()->assertFalse(shop.addMechanic(initialMechanic)),
                ()->assertIterableEquals(my_array, shop.getMechanicList()));
    }

    @Test
    @Order(2)
    @DisplayName("Testando visualização de um mecânico")
    public void getMechanic() {
        shop.addMechanic(initialMechanic);

        assertAll("shop",
                ()->assertEquals(initialMechanic, shop.getMechanic(0)),
                ()->assertSame(initialMechanic, shop.getMechanic(0)));
    }

    @Test
    @Order(3)
    @DisplayName("Testando remoção de um mecânico")
    public void removeMechanic() {
        shop.addMechanic(initialMechanic);
        Mechanic secondMechanic = new Mechanic("322.222.222-22", "Júnior Bocelli", "06/06/2020", "M", "1000,00", "bocelli@gmail.com", "(16)3333-1234");
        shop.addMechanic(secondMechanic);

        assertAll("shop",
                ()->assertTrue(shop.removeMechanic(initialMechanic)),
                ()->assertEquals(secondMechanic, shop.getMechanic(0)),
                ()->assertSame(secondMechanic, shop.getMechanic(0)));
    }

    @Test
    @Order(4)
    @DisplayName("Testando edição de um mecânico")
    public void editMechanic() {
        shop.addMechanic(initialMechanic);
        Mechanic secondMechanic = new Mechanic("322.222.222-22", "Júnior Bocelli", "06/06/2020", "M", "1000,00", "bocelli@gmail.com", "(16)3333-1234");
        Mechanic mechanicToEdit = shop.getMechanic(0);
        mechanicToEdit.setCpf("322.222.222-22");

        assertAll("shop",
                ()->assertEquals(secondMechanic, shop.getMechanic(0)),
                ()->assertSame(secondMechanic, shop.getMechanic(0)));
    }


    @Test
    @Order(5)
    @DisplayName("Testando adição de veículo")
    public void addVehicle() {
        ArrayList<Vehicle> my_array = new ArrayList<>();
        my_array.add(initialVehicle);

        assertAll("shop",
                ()->assertTrue(shop.addVehicle(initialVehicle)),
                ()->assertFalse(shop.addVehicle(initialVehicle)),
                ()->assertIterableEquals(my_array, shop.getVehicleList()));
    }

    @Test
    @Order(6)
    @DisplayName("Testando visualização de um veículo")
    public void getVehicle() {
        shop.addVehicle(initialVehicle);

        assertAll("shop",
                ()->assertEquals(initialVehicle, shop.getVehicle(0)),
                ()->assertSame(initialVehicle, shop.getVehicle(0)));
    }

    @Test
    @Order(7)
    @DisplayName("Testando remoção de um veículo")
    public void removeVehicle() {
        shop.addVehicle(initialVehicle);
        Vehicle secondVehicle = new Vehicle("ABC", 1234, "São Carlos", "SP", "Passeio", "Peugeot", "Sport", 2000, 3, 4, "GASOLINA", "AZUL", "Comum");
        shop.addVehicle(secondVehicle);

        assertAll("shop",
                ()->assertTrue(shop.removeVehicle(initialVehicle)),
                ()->assertEquals(secondVehicle, shop.getVehicle(0)),
                ()->assertSame(secondVehicle, shop.getVehicle(0)));
    }

    @Test
    @Order(8)
    @DisplayName("Testando edição de um veículo")
    public void editVehicle() {
        shop.addVehicle(initialVehicle);
        Vehicle secondVehicle = new Vehicle("AAA", 1234, "São Carlos", "SP", "Passeio", "Peugeot", "Sport", 2000, 3, 4, "GASOLINA", "AZUL", "Comum");
        Vehicle vehicleToEdit = shop.getVehicle(0);
        vehicleToEdit.setCarPlateLetters("AAA");

        assertAll("shop",
                ()->assertEquals(secondVehicle, shop.getMechanic(0)),
                ()->assertSame(secondVehicle, shop.getMechanic(0)));
    }
}
