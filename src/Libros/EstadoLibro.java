/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Libros;

/**
 *
 * @author Luisk
 */
public enum EstadoLibro {
    DISPONIBLE("Disponible"),
    PRESTADO("Prestado"),
    EN_REPARACION("En reparación");

    private final String texto;

    private EstadoLibro(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}
