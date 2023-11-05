/**
 *
 * @author zseba
 */
public class ProyectoIntegradorLogica {

    public static void main(String[] args) {
        System.out.println(
                "Esta es una calculadora de materiales para concreto con una franja de cuatro resistencias en (Psi). Los valores ingresados deben de ser en miles y van desde 3000 a 6000 psi");
        System.out.println("-------------------------------------------------");
        // Creamos una variable de tipo entero o dependiendo de que valores vayas a
        // trabajar.
        int resistenciaObjetivo;
        System.out.println("Ingrese la resistencia deseada en miles: ");
        Scanner Scanner = new Scanner(System.in);
        resistenciaObjetivo = Scanner.nextInt();
        // Aqui creamos otra variable de tipo entero para pedir al usuario que ingrese
        // la cantidad de metros cubicos (m^3) que necesita.
        int cantidad;
        System.out.println("Ingrese la cantidad de m^3 deseados: ");
        cantidad = Scanner.nextInt();
        int metrosCubicos = resistenciaObjetivo * cantidad;

        // Definimos las cantidades de los materiales por cada m^3 para cada
        // resistencia.
        // Para la restencia de 3000psi
        int cemento3000psi = 195; // kg m^3
        int grava3000psi = 944; // kg m^3
        int arena3000psi = 1152; // kg m^3
        int agua3000psi = 180; // kg m^3
        int adictivo3000psi1 = 1653; // kg m^3
        int adictivo3000psi2 = 0; // kg m^3

        // Para la restencia de 4000psi
        int cemento4000psi = 239; // kg m^3
        int grava4000psi = 944; // kg m^3
        int arena4000psi = 1113; // kg m^3
        int agua4000psi = 180; // kg m^3
        int adictivo4000psi1 = 2025; // kg m^3
        int adictivo4000psi2 = 200; // kg m^3

        // Para la restencia de 5000psi
        int cemento5000psi = 268; // kg m^3
        int grava5000psi = 944; // kg m^3
        int arena5000psi = 1087; // kg m^3
        int agua5000psi = 180; // kg m^3
        int adictivo5000psi1 = 2273; // kg m^3
        int adictivo5000psi2 = 220; // kg m^3

        // Para la restencia de 6000psi
        int cemento6000psi = 305; // kg m^3
        int grava6000psi = 944; // kg m^3
        int arena6000psi = 1031; // kg m^3
        int agua6000psi = 180; // kg m^3
        int adictivo6000psi1 = 2584; // kg m^3
        int adictivo6000psi2 = 240; // kg m^3

        // Se crean seis variables para calcular los materiales requeridos por cada
        // resistencia y se multiplican por la cantidad que necesita el usuario.
        int cementoRequerido, gravaRequerida, arenaRequerida, aguaRequerida, adictivo1Requerido, adictivo2Requerido;

        if (resistenciaObjetivo == 3000) {
            cementoRequerido = cemento3000psi * cantidad;
            gravaRequerida = grava3000psi * cantidad;
            arenaRequerida = arena3000psi * cantidad;
            aguaRequerida = agua3000psi * cantidad;
            adictivo1Requerido = adictivo3000psi1 * cantidad;
            adictivo2Requerido = adictivo3000psi2 * cantidad;
        } else if (resistenciaObjetivo == 4000) {
            cementoRequerido = cemento4000psi * cantidad;
            gravaRequerida = grava4000psi * cantidad;
            arenaRequerida = arena4000psi * cantidad;
            aguaRequerida = agua4000psi * cantidad;
            adictivo1Requerido = adictivo4000psi1 * cantidad;
            adictivo2Requerido = adictivo4000psi2 * cantidad;
        } else if (resistenciaObjetivo == 5000) {
            cementoRequerido = cemento5000psi * cantidad;
            gravaRequerida = grava5000psi * cantidad;
            arenaRequerida = arena5000psi * cantidad;
            aguaRequerida = agua5000psi * cantidad;
            adictivo1Requerido = adictivo5000psi1 * cantidad;
            adictivo2Requerido = adictivo5000psi2 * cantidad;
        } else if (resistenciaObjetivo == 6000) {
            cementoRequerido = cemento6000psi * cantidad;
            gravaRequerida = grava6000psi * cantidad;
            arenaRequerida = arena6000psi * cantidad;
            aguaRequerida = agua6000psi * cantidad;
            adictivo1Requerido = adictivo6000psi1 * cantidad;
            adictivo2Requerido = adictivo6000psi2 * cantidad;
        } else {
            System.out.println("La resistencia ingresada no es valida. Recuerde que debe ser en miles de 3000 a 6000");
            return;
            // El return nos ayuda a guardar los datos y poder imprimirlos en pantalla
            // acontinuacion
        }
        // Imprimir los resultados
        System.out.println("El material necesario para " + cantidad + "m^3 de concreto, con una resistencia de "
                + resistenciaObjetivo + " psi es");
        System.out.println("Cemento: " + cementoRequerido + "kg/m^3");
        System.out.println("Grava: " + gravaRequerida + "kg/m^3");
        System.out.println("Arena: " + arenaRequerida + "kg/m^3");
        System.out.println("Agua: " + aguaRequerida + "kg/m^3");
        System.out.println("Adictivo 1: " + adictivo1Requerido + "kg/m^3");
        System.out.println("Adictivo 2: " + adictivo2Requerido + "kg/m^3");

    }
}
