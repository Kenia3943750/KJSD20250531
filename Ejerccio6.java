import java.util.Scanner;

public class Ejerccio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        boolean esPalindromo = true;
        int n = palabra.length();

        for (int i = 0; i < n / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(n - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
    }
}
