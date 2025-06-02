import java.util.Scanner;

public class Ejerccio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa una cadena: ");
            String cadena = scanner.nextLine();

            String resultado = "";
            boolean mayuscula = true;

            for (int i = 0; i < cadena.length(); i++) {
                char letra = cadena.charAt(i);

                if (letra == ' ') {
                    mayuscula = true;
                    resultado += letra;
                } else {
                    if (mayuscula) {
                        if (letra >= 'a' && letra <= 'z') {
                            letra = (char)(letra - 32);
                        }
                        mayuscula = false;
                    } else {
                        if (letra >= 'A' && letra <= 'Z') {
                            letra = (char)(letra + 32);
                        }
                    }
                    resultado += letra;
                }
            }

            System.out.println("Cadena modificada: " + resultado);
        }
    }
}