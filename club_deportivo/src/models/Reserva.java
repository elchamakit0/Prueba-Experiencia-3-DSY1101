/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Cetecom
 */
public class Reserva {
    
    private int id, id_instalacion, rut_socio;
    private String fecha_res, hora_res;

    public Reserva() {
    }

    public Reserva(int id, int id_instalacion, int rut_socio, String fecha_res, String hora_res) {
        this.id = id;
        this.id_instalacion = id_instalacion;
        this.rut_socio = rut_socio;
        this.fecha_res = fecha_res;
        this.hora_res = hora_res;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_instalacion() {
        return id_instalacion;
    }

    public void setId_instalacion(int id_instalacion) {
        this.id_instalacion = id_instalacion;
    }

    public int getRut_socio() {
        return rut_socio;
    }

    public void setRut_socio(int rut_socio) {
        this.rut_socio = rut_socio;
    }

    public String getFecha_res() {
        return fecha_res;
    }

    public void setFecha_res(String fecha_res) {
        this.fecha_res = fecha_res;
    }

    public String getHora_res() {
        return hora_res;
    }

    public void setHora_res(String hora_res) {
        this.hora_res = hora_res;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", id_instalacion=" + id_instalacion + ", rut_socio=" + rut_socio + ", fecha_res=" + fecha_res + ", hora_res=" + hora_res + '}';
    }
    
    
}
