package com.mycompany.bibliotecapoo;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1) Ingresar un libro");
            System.out.println("2) Mostrar todos los libros");
            System.out.println("3) Buscar un libro");
            System.out.println("4) Marcar un libro como leído");
            System.out.println("5) Mostrar los libros no leídos");
            System.out.println("0) Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    ingresarLibro(scanner, biblioteca);
                    break;
                case 2:
                    biblioteca.mostrarLibros();
                    break;
                case 3:
                    buscarLibro(scanner, biblioteca);
                    break;
                case 4:
                    marcarLeido(scanner, biblioteca);
                    break;
                case 5:
                    biblioteca.mostrarLibrosNoLeidos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Esta opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void ingresarLibro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anoPublicacion = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el género del libro:");
        String genero = scanner.nextLine();

        Libro libro = new Libro(titulo, autor, anoPublicacion, false, genero);
        biblioteca.registrarLibro(libro);
        System.out.println("Libro registrado.");
    }

    public static void buscarLibro(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Ingrese el libro que quiere buscar");
        String palabraBusqueda = scanner.nextLine();
        Libro libroEncontrado = biblioteca.buscarLibro(palabraBusqueda);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            System.out.println(libroEncontrado.mostrarInformacion());
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void marcarLeido(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Ingrese el libro que quiere marcar como leído:");
        String titulo = scanner.nextLine();
        Libro libroEncontrado = biblioteca.buscarLibro(titulo);
        if (libroEncontrado != null) {
            libroEncontrado.marcarLeido();
            System.out.println("Libro marcado como leído.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}
