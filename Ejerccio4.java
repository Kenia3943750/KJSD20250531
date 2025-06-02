import java.util.Scanner;

public class Ejerccio4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa una frase: ");
            String frase = scanner.nextLine();

            String fraseProcesada = frase.trim();

            if (fraseProcesada.isEmpty()) {
                System.out.println("Frase sin la última palabra: ");
                return;
            }

            int ultimoEspacioIndex = fraseProcesada.lastIndexOf(' ');

            String nuevaFrase;

            if (ultimoEspacioIndex == -1) {
                nuevaFrase = "";
            } else {
                nuevaFrase = fraseProcesada.substring(0, ultimoEspacioIndex);
            }

            System.out.println("Frase sin la última palabra: " + nuevaFrase);
        }
    }
}