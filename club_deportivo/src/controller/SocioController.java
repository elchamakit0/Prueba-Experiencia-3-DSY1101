/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.util.ArrayList;
import java.util.List;
import models.Socio;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Cetecom
 */
public class SocioController {
    
    Conexion cx;
    public SocioController(){
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Socio> obtenerSocios(){
        List<Socio> socios = new ArrayList<>();
        String query = "SELECT * FROM SOCIO";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            while(rs.next()){
                socios.add(new Socio(rs.getInt("rut"), rs.getString("nombre"), rs.getString("fecha_nac"), rs.getString("direccion"), rs.getBoolean("membresia")));
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return socios;
    }
    
    public void agregarSocio(int rut, String Nombre, String fechaNac, String direccion){
        String query = "INSERT INTO `SOCIO` (rut, nombre, fecha_nac, direccion) VALUES (?,?,?,?)";
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(query);
            st.setInt(1, rut);
            st.setString(2, Nombre);
            st.setString(3, fechaNac);
            st.setString(4, direccion);
            st.executeUpdate();
            System.out.println("Socio Agregado.");
        } 
        catch (Exception e) {
            System.out.println("Error al agregar socio."+e.getMessage());
        }
    }
    
    public Socio listarSocios(){
        Socio find = null;
        String query = "SELECT * FROM LIBRO";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            if(rs.next()){
                find = new Socio();
                find.setRut(rs.getInt("rut"));
                find.setNombre(rs.getString("nombre"));
                find.setFecha_nac(rs.getString("fecha_nac"));
                find.setDireccion(rs.getString("direccion"));
                find.setMembresia(rs.getBoolean("membresia"));
            }
        } 
        catch (Exception e) {
            System.out.println("Error al listar los socios." + e.getMessage());
        }
        return find;
    }
    
    public void editarSocio(){
        
    }
}
