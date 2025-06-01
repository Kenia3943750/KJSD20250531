import java.util.Scanner;

public class Ejerccio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                resultado += cadena.charAt(i);
            }
        }

        System.out.println("Cadena sin espacios: " + resultado);
        scanner.close(); // <- Esto elimina la advertencia
    }
}
