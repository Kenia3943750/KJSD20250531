import java.util.Scanner;

public class Ejerccio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        int i = frase.length() - 1;

        // Eliminar espacios al final
        while (i >= 0 && frase.charAt(i) == ' ') {
            i--;
        }

        // Retroceder hasta encontrar el último espacio
        while (i >= 0 && frase.charAt(i) != ' ') {
            i--;
        }

        String nuevaFrase = frase.substring(0, i).trim();
        System.out.println("Frase sin la última palabra: " + nuevaFrase);
    }
}
