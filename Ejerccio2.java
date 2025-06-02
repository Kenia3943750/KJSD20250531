import java.util.Scanner;

public class Ejerccio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int contador = 0;
        boolean dentroDePalabra = false;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ' && !dentroDePalabra) {
                dentroDePalabra = true;
                contador++;
            } else if (frase.charAt(i) == ' ') {
                dentroDePalabra = false;
            }
        }

        System.out.println("Cantidad de palabras: " + contador);
        scanner.close(); // Buena práctica para cerrar el Scanner
    }
}
