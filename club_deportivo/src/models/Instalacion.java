/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Instalacion {
    
    private int id, capacidad, instalacion;
    private String nombre;
    private boolean disponible;

    public Instalacion() {
    }

    public Instalacion(int id, int capacidad, int instalacion, String nombre, boolean disponible) {
        this.id = id;
        this.capacidad = capacidad;
        this.instalacion = instalacion;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(int instalacion) {
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Instalacion{" + "id=" + id + ", capacidad=" + capacidad + ", instalacion=" + instalacion + ", nombre=" + nombre + ", disponible=" + disponible + '}';
    }
    
    
    
}
