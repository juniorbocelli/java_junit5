package com.bocelli.ifsp.tcp.model;

import com.bocelli.ifsp.tcp.model.utils.Validator;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Mechanic {
    private String cpf;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String salary;
    private String email;
    private String phone;

    public String getCpf() {
        return cpf;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(this.getCpf().replace(".", "").replace("-", ""));
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Mechanic) && ((Mechanic) o).getCpf().equals(this.getCpf())) {
            return true;
        } else
            return false;
    }

    public void setCpf(String cpf) {
        if(!Validator.isCpf(cpf)) throw new IllegalArgumentException("CPF inválido!");
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) throw new IllegalArgumentException("Nome inválido");
        if(name.isEmpty()) throw new IllegalArgumentException("Nome inválido");
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        LocalDate newTime;

        try {
            String[] dateParts = new String[3];
            dateParts = dateOfBirth.split("/");
            newTime = LocalDate.of(Integer.parseInt(dateParts[2]), Integer.parseInt(dateParts[1]), Integer.parseInt(dateParts[0]));
        } catch (DateTimeException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Data inicial inválida!");
        }

        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!(gender.equals("M") || gender.equals("F"))) throw new IllegalArgumentException("Sexo inválido!");
        this.gender = gender.toUpperCase();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        if(!Validator.isMoney(salary.toString())) throw new IllegalArgumentException("Salário inválido!");
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!Validator.isEmail(email)) throw new IllegalArgumentException("Email inválido!");
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(!Validator.isEmail(email)) throw new IllegalArgumentException("Telefone inválido!");
        this.phone = phone;
    }
}
