import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
        System.out.println(
                "Este algoritmo le permite convertir Pies a metros, pulgadas a centimetros, millas a kilometros y metros a centimetros.");
        convertidor();
    }

    public static double piesAMetros() {
        // 1 pie equivale a 0.3048 metros
        double pie = 0.3048;
        return pie;
    }

    public static double pulgadasACentimetros() {
        // 1 pulgada equivale a 2.54cm
        double pulgada = 2.54;
        return pulgada;
    }

    public static double millasAKilometros() {
        // 1 milla equivale a 1.6093km
        double kilometro = 1.6093;
        return kilometro;
    }

    public static double metrosACentimetros() {
        // 1 metro equivale a 100cm
        double metro = 100;
        return metro;
    }

    public static String convertidor() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Que valor desea convertir (Pies, Pulgadas, millas o metros)");
        String convertidor = Scanner.nextLine();
        switch (convertidor) {
            case "pies":
                System.out.println("Ingrese el numero de pies");
                double objetivo = Scanner.nextDouble();
                double resultadoObjetivo = objetivo * piesAMetros();
                System.out.println(objetivo + " pies equivalen a " + resultadoObjetivo + " metros");
                break;
            case "pulgadas":
                System.out.println("Ingrese el numero de pulgadas");
                double objetivo1 = Scanner.nextDouble();
                double resultadoObjetivo1 = objetivo1 * pulgadasACentimetros();
                System.out.println(objetivo1 + " pulgadas equivalen a " + resultadoObjetivo1 + " centimetros");
                break;
            case "millas":
                System.out.println("Ingrese el numero de millas");
                double objetivo2 = Scanner.nextDouble();
                double resultadoObjetivo2 = objetivo2 * millasAKilometros();
                System.out.println(objetivo2 + " millas equivalen a " + resultadoObjetivo2 + " kilometros");
                break;
            case "metros":
                System.out.println("Ingrese la cantidad de metros");
                double objetivo3 = Scanner.nextDouble();
                double resultadoObjetivo3 = objetivo3 * metrosACentimetros();
                System.out.println(objetivo3 + " metros equivalen a " + resultadoObjetivo3 + " centimetros");
                break;
            default:
                System.out.println("Valor invalido");
        }
        return convertidor;
    }
}
