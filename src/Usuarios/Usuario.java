/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Persons.Person;
import java.time.LocalDate;



/**
 *
 * @author Luisk
 */
public class Usuario extends Person {
    public Usuario(String id, String name, LocalDate birthDate, String phone) {
        super(id, name, birthDate, phone);
    }
    public String toString() {
        return "id=" + id + ", name=" + name + ", birthDate=" + birthDate + " +, phone=" + phone;
    }
    
}
