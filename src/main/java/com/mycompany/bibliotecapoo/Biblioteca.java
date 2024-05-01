package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> libros;

    public Biblioteca() {
        this.libros = new LinkedList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.mostrarInformacion());
        }
    }

    public void mostrarLibrosNoLeidos() {
        for (Libro libro : libros) {
            if (libro.marcarLeido()) {
            } else {
                System.out.println(libro.mostrarInformacion());
            }
        }
    }

    public Libro buscarLibro(String palabraBusqueda) {
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(palabraBusqueda.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }
}
