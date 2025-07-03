/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Usuario {
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String telefono;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean validarTelefono(String telefono) {
        if (telefono == null || telefono.isEmpty()) {
            return true; 
        }

        if (telefono.length() != 8) return false;

        char primerDigito = telefono.charAt(0);
        if (primerDigito != '2' && primerDigito != '6' && primerDigito != '7' && primerDigito != '8') {
            return false;
        }

        for (int i = 0; i < telefono.length(); i++) {
            if (!Character.isDigit(telefono.charAt(i))) return false;
        }

        return true;
    }
    
    public boolean modificarTelefono(String nuevoTelefono) {
        if (validarTelefono(nuevoTelefono)) {
            this.telefono = nuevoTelefono;
            return true;
        } else {
            return false;
        }
    }

    public Usuario(int id, String nombre, LocalDate fechaNacimiento, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        
        if (validarTelefono(telefono)){
            this.telefono = telefono;
        }else{
            this.telefono = null;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + '}';
    }
   
}
