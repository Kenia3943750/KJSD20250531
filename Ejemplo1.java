public class Ejemplo1 {
    public static void main(String[] args) {

        int a = 512;
        double b = 3.1416;
        boolean c = false;
        char d = '#';

        Integer x = a;
        Double y = b;
        Boolean z = c;
        Character w = d;

        String salida = x.toString();
        String salidadoble = y.toString();
        String otrasalida = "" + y.intValue();
        String salidabool = z.toString();
        String salidachar = "" + w.charValue();

        System.out.println(salida);
        System.out.println(salidadoble);
        System.out.println(otrasalida);
        System.out.println(salidabool);
        System.out.println(salidachar);
    }
}
