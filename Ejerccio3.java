import java.util.Scanner;

public class Ejerccio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        String resultado = "";
        boolean mayuscula = true;

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);

            if (mayuscula && letra != ' ') {
                if (letra >= 'a' && letra <= 'z') {
                    letra = (char)(letra - 32); // convertir a mayúscula
                }
                mayuscula = false;
            } else if (letra == ' ') {
                mayuscula = true;
            }

            resultado += letra;
        }

        System.out.println("Cadena modificada: " + resultado);
    }
}
