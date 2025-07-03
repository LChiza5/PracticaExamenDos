/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Libros.Libro;
import java.time.LocalDate;

/**
 *
 * @author ilope
 */
public class Bibliotecario extends Employee{
    
    private String[] actividades;
    private int cantActividades;

    public Bibliotecario(String[] actividades, int cantActividades, String id, String name, LocalDate birthDate, String phone) {
        super(id, name, birthDate, phone);
        this.actividades = new String[20];
        this.cantActividades = 0;
    }
    public boolean registrarLibro(Libro libro) {
        return registrarActividad("Registró el libro: " + libro.getTitulo());
    }
    
    private boolean registrarActividad(String descripcion) {
        if (cantActividades < actividades.length) {
            actividades[cantActividades++] = descripcion;
            return true;
        } else {
            System.out.println("No se pueden registrar más actividades para " + name);
            return false;
        }
    }
    public void mostrarActi(){
        for (int i = 0; i < cantActividades; i++) {
            System.out.println("- " + actividades[i]);
        }
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", phone=" + phone;
    }
    
}
