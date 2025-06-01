import java.util.*;

public class Ejerccio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Libro> librosSet = new LinkedHashSet<>();

        String respuesta;
        do {
            System.out.print("Ingrese el ID del libro: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.print("Ingrese el titulo del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese la edicion del libro: ");
            String edicion = scanner.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();

            Libro libro = new Libro(id, titulo, edicion, autor);
            if (!librosSet.add(libro)) {
                System.out.println("Ya existe un libro con ese ID. No se agrego.");
            }

            System.out.print("¿Desea ingresar otro libro? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Convertimos el Set a lista y la ordenamos
        List<Libro> listaOrdenada = new ArrayList<>(librosSet);
        listaOrdenada.sort(Comparator.comparingInt(l -> l.id));

        // Mostrar libros ordenados
        System.out.println("\nLibros ingresados:");
        for (Libro libro : listaOrdenada) {
            System.out.println("ID: " + libro.id + " | Titulo: " + libro.titulo + " | Edicion: " + libro.edicion + " | Autor: " + libro.autor);
        }

        scanner.close();
    }

    // Clase interna Libro
    static class Libro {
        int id;
        String titulo;
        String edicion;
        String autor;

        public Libro(int id, String titulo, String edicion, String autor) {
            this.id = id;
            this.titulo = titulo;
            this.edicion = edicion;
            this.autor = autor;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Libro)) return false;
            Libro libro = (Libro) o;
            return id == libro.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}


