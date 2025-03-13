public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 496);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, 328);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 1000);


        System.out.println("Libro 1:");
        System.out.println("  Título: " + libro1.getTitulo());
        System.out.println("  Autor: " + libro1.getAutor());
        System.out.println("  Año de publicación: " + libro1.getAñoPublicacion());

        System.out.println("\nLibro 2:"); // Agregamos una línea en blanco para separar los libros
        System.out.println("  Título: " + libro2.getTitulo());
        System.out.println("  Autor: " + libro2.getAutor());
        System.out.println("  Año de publicación: " + libro2.getAñoPublicacion());

        System.out.println("\nLibro 3:");
        System.out.println("  Título: " + libro3.getTitulo());
        System.out.println("  Autor: " + libro3.getAutor());
        System.out.println("  Año de publicación: " + libro3.getAñoPublicacion());
    }
}