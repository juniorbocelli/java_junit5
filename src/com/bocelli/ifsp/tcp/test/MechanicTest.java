package com.bocelli.ifsp.tcp.test;

import com.bocelli.ifsp.tcp.model.Mechanic;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MechanicTest {

    @Order(1)
    @ParameterizedTest
    @ValueSource(strings = {"", "123", "111.111.111-1", "111.111111-12", "11111111112", "111111111-12"})
    @DisplayName("Testanto CPF: todos devem subir exceção")
    public void testCpfNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setCpf(atr);
        });
    }

    @Order(2)
    @ParameterizedTest
    @ValueSource(strings = {"123.456.123-23", "111.111.111-11", "223.227.558-26"})
    @DisplayName("Testanto CPF: nenhum deve subir exceção e devem corresponder ao get")
    public void testCpfA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setCpf(atr);
        });
        assertEquals(atr, my_mechanic.getCpf());
    }

    @Order(3)
    @ParameterizedTest
    @ValueSource(strings = {""})
    @DisplayName("Testanto nome: todos devem subir exceção")
    public void testNameNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setName(atr);
        });
    }

    @Order(4)
    @ParameterizedTest
    @ValueSource(strings = {"Bocelli", "Fulano", "Seu José das Couves"})
    @DisplayName("Testanto nome: nenhum deve subir exceção e devem corresponder ao get")
    public void testNameA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setName(atr);
        });
        assertEquals(atr, my_mechanic.getName());
    }

    @Order(5)
    @ParameterizedTest
    @ValueSource(strings = {"", "23-11-2022", "23/13/2022", "23112020", "2000/11/23", "11/23/2020"})
    @DisplayName("Testanto data de nascimento: todos devem subir exceção")
    public void testDateBirthNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setDateOfBirth(atr);
        });
    }

    @Order(6)
    @ParameterizedTest
    @ValueSource(strings = {"23/11/2020", "06/06/1982", "01/01/2000"})
    @DisplayName("Testanto data de nascimento: nenhum deve subir exceção e devem corresponder ao get")
    public void testDateBirthA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setDateOfBirth(atr);
        });
        assertEquals(atr, my_mechanic.getDateOfBirth());
    }

    @Order(7)
    @ParameterizedTest
    @ValueSource(strings = {"", "FF", "ff", "feminino", "masculino", "mm"})
    @DisplayName("Testanto sexo: todos devem subir exceção")
    public void testGenderNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setGender(atr);
        });
    }

    @Order(8)
    @ParameterizedTest
    @ValueSource(strings = {"f", "F", "m", "M"})
    @DisplayName("Testanto sexo: nenhum deve subir exceção e devem corresponder ao get")
    public void testGenderA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setGender(atr);
        });
        assertEquals(atr.toUpperCase(), my_mechanic.getGender());
    }

    @Order(9)
    @ParameterizedTest
    @ValueSource(strings = {"", "2.222,22", "22222,222", "3333,", ","})
    @DisplayName("Testanto salário: todos devem subir exceção")
    public void testSalaryNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setSalary(atr);
        });
    }

    @Order(10)
    @ParameterizedTest
    @ValueSource(strings = {"1000,0", "100,00"})
    @DisplayName("Testanto salário: nenhum deve subir exceção e devem corresponder ao get")
    public void testSalaryA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setSalary(atr);
        });
        assertEquals(atr, my_mechanic.getSalary());
    }

    @Order(11)
    @ParameterizedTest
    @ValueSource(strings = {"", "bocelli.com.br", "bocelli@.com", "bocelli@gmail.c,", "bocelli@gmailcom", ".bocelli@gmail.com"})
    @DisplayName("Testanto e-mail: todos devem subir exceção")
    public void testEmailNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setEmail(atr);
        });
    }

    @Order(12)
    @ParameterizedTest
    @ValueSource(strings = {"bocelli@gmail.com", "bocelli@gmail.ck", "junior.bocelli@gmail.com"})
    @DisplayName("Testanto e-mail: nenhum deve subir exceção e devem corresponder ao get")
    public void testEmailA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setEmail(atr);
        });
        assertEquals(atr, my_mechanic.getEmail());
    }

    @Order(13)
    @ParameterizedTest
    @ValueSource(strings = {"", "(1)1111-1111", "(163333-2345", "(11)23452345", "(2345-2345"})
    @DisplayName("Testanto telefone: todos devem subir exceção")
    public void testPhoneNa(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertThrows(IllegalArgumentException.class, ()-> {
            my_mechanic.setPhone(atr);
        });
    }

    @Order(14)
    @ParameterizedTest
    @ValueSource(strings = {"(11)1111-1111", "(16)3333-2345", "(11)2345-2345"})
    @DisplayName("Testanto telefone: nenhum deve subir exceção e devem corresponder ao get")
    public void testPhoneA(String atr) {
        Mechanic my_mechanic = new Mechanic();
        assertDoesNotThrow(()->{
            my_mechanic.setPhone(atr);
        });
        assertEquals(atr, my_mechanic.getPhone());
    }
}
