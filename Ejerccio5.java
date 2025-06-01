import java.util.Scanner;

public class Ejerccio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        System.out.println("Cantidad de veces que aparece 'a' o 'A': " + contador);
    }
}
