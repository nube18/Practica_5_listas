package com.example.practica_5_listas;

public class Films {
    private String titulo;
    private String imagen;

    public Films(String titulo, String imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImagen() {
        return imagen;
    }
}