package com.devix.recyclerview;
/*
 *Created by Carlos Anguiano on 14/03/17.
 *For more info contact : c.joseanguiano@gmail.com
 */

public class Cube {
        private int imagen;
        private String nombre;

    public Cube(int imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
