/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros;

/**
 *
 * @author Luisk
 */
public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String categoria;
    private String estado;
    
    private boolean validarCodigo(String codigo) {
        if (codigo.length() != 6) return false;
        char letra = codigo.charAt(0);
        char guion = codigo.charAt(1);
        String numeros = codigo.substring(2);
        return Character.isLetter(letra) && guion == '-' && esNumeroDe4Digitos(numeros);
    }

    private boolean esNumeroDe4Digitos(String texto) {
        if (texto.length() != 4) return false;
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(texto.charAt(i))) return false;
        }
        return true;
    }
    
    private boolean validarAnio(int anio) {
        int anioActual = java.time.LocalDate.now().getYear();
        return anio <= anioActual;
    }
    
     public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Libro(String codigo, String titulo, String autor, int anioPublicacion, String categoria, String estado) {
        if (!validarCodigo(codigo)) {
            throw new IllegalArgumentException("Código inválido. Debe ser formato L-0000");
        }
        if (!validarAnio(anioPublicacion)) {
            throw new IllegalArgumentException("Año inválido. No puede ser un año futuro.");
        }

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.categoria = categoria;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", categoria=" + categoria + ", estado=" + estado + '}';
    }
    
    
}
