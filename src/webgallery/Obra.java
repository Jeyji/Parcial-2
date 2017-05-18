/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author Estudiante
 */
public class Obra {
    private String nombre;
    private String descripcion;
    private String estilo;
    private int valor;

    public Obra(String nombre, String descripcion, String estilo, int valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstilo() {
        return estilo;
    }

    public int getValor() {
        return valor;
    }
    
    
}
