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
public class Artista extends Usuario{
    private String curriculum;
    private String distinciones;

    public Artista(String curriculum, String distinciones, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public String getDistinciones() {
        return distinciones;
    }

    
}
