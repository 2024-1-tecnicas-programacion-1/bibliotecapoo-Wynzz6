package com.mycompany.bibliotecapoo;

public class Libro {
    String titulo;
    String autor;
    int anoPublicacion;
    boolean leido;
    String genero;

    public Libro(String titulo, String autor, int anoPublicacion, boolean leido, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.leido = leido; 
        this.genero = genero;
    }

    public String mostrarInformacion(){
        return "Titulo " + titulo + ", " + "Autor " + autor + ", " + "Ano de publicacion " + anoPublicacion + ", " + "Genero " + genero;
    }

    public boolean marcarLeido() {
        if (!leido) {
            leido = true;
            return true;
        } else {
            return false; // El libro ya estaba marcado como leído
        }
    }

    public boolean esLeido() {
        return leido;
    }

    public boolean esAntiguo() {
        int anoActual = 2024;
        return anoActual - anoPublicacion > 50;
    }
     public String getTitulo() {
        return titulo;
}
}
  
