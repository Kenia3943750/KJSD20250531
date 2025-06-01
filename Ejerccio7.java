import java.util.Scanner;
import java.util.TreeSet;

public class Ejerccio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();

        String respuesta;
        do {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
