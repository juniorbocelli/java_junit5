package com.bocelli.ifsp.tcp.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Mechanic> mechanics;
    private List<Vehicle> vehicles;

    public Shop() {
        mechanics = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public boolean addMechanic(Mechanic mechanic) {
        if(mechanics.indexOf(mechanic) != -1) return false;
        mechanics.add(mechanic);
        return true;
    }

    public boolean removeMechanic(Mechanic mechanic) {
        if(mechanics.indexOf(mechanic) != -1) return false;
        mechanics.remove(mechanic);
        return true;
    }

    public Mechanic getMechanic(int i) {
        if(i < 0 || i > mechanics.size()) return null;
        return mechanics.get(i);
    }

    public boolean editMechanic(int i, Mechanic mechanic) {
        if(!mechanic.equals(getMechanic(i))) {
            if(mechanics.indexOf(mechanic) != -1) {
                return false;
            } else {
                mechanics.remove(i);
                mechanics.add(i, mechanic);
            }
        } else {
            mechanics.remove(i);
            mechanics.add(i, mechanic);
        }

        return true;
    }

    public void listMechanics() {
        for(int i = 0; i < mechanics.size(); i++) {
            System.out.println(Integer.toString(i) + mechanics.get(i).toString());
        }
    }


    public boolean addVehicle(Vehicle vehicle) {
        if(vehicles.indexOf(vehicle) != -1) return false;
        vehicles.add(vehicle);
        return true;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        if(vehicles.indexOf(vehicle) != -1) return false;
        vehicles.remove(vehicle);
        return true;
    }

    public Vehicle getVehicle(int i) {
        if(i < 0 || i > vehicles.size()) return null;
        return vehicles.get(i);
    }

    public boolean editVehicle(int i, Vehicle vehicle) {
        if(!vehicle.equals(getVehicle(i))) {
            if(vehicles.indexOf(vehicle) != -1) {
                return false;
            } else {
                vehicles.remove(i);
                vehicles.add(i, vehicle);
            }
        } else {
            vehicles.remove(i);
            vehicles.add(i, vehicle);
        }

        return true;
    }

    public void listVehicles() {
        for(int i = 0; i < vehicles.size(); i++) {
            System.out.println(Integer.toString(i) + vehicles.get(i).toString());
        }
    }
}
