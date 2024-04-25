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
        this.leido = false; 
        this.genero = genero;

    }

    public String mostrarInformacion(){
        return "Titulo " + titulo + ", " + "Autor " + autor + ", " + "Ano de publicacion " + anoPublicacion + ", " + "Genero " + genero;
    }

  public String marcarLeido() {
    this.leido = true;
    return "El libro ya fue leído.";
}

    public boolean esAntiguo() {
    int anoActual = 2024;
    return anoActual - anoPublicacion > 50;
}
}
  
