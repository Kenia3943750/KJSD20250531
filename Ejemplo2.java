import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {

        Integer num1 = new Integer(500), num2 = new Integer(500);

        if (num1.equals(num2)) {
            System.out.println("Los números son iguales");
        }

        //trabajar con una clase propia
        Estudiante est1 = new Estudiante("Carlos", "Mata", 25);
        Estudiante est2 = new Estudiante("Luis", "Guzman", 22);
        Estudiante est3 = new Estudiante("Carlos", "Mata", 25);

        //comprobar est1 con est2
        if (est1.equals(est2)) {
            System.out.println("El estudiante 1 es igual al estudiante 2");
        }

        //comprobar el est1 con est3
        if (est1.equals(est3)) {
            System.out.println("El estudiante 1 es igual al estudiante 3");
        } else {
            System.out.println("No son iguales");
        }

        //obtener información sobre la clase Estudiante
        System.out.println(est1.getClass().getName());
        System.out.println(est1.getClass().getSuperclass().getName());

        //obtener información de la clase Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.getClass().getName());
        System.out.println(sc.getClass().getSuperclass().getName());

        //aplicación del método toString()
        System.out.println(Thread.currentThread().toString());
        System.out.println(new Integer(44).toString());
        System.out.println(est1.toString());
        System.out.println(est2.toString());
    }
}

class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Estudiante) {
            Estudiante tmp = (Estudiante) obj;
            return tmp.nombre == this.nombre && tmp.apellido == this.apellido;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}