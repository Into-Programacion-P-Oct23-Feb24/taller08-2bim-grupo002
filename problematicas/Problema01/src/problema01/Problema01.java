/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        double estatura;
        int edad;
        int contador = 0;
        double promedioEdad;
        double promedioEstatura;
        int sumaEdad = 0;
        double sumaEstatura = 0;
        String cadena1 = "Listado de jugadores\n";
        String cadena2 = "Listado de edades ";

        System.out.println("Ingrese la cantidad de jugadores que va a ingresar: ");
        int limite = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese el nombre de Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo que ocupa: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            contador = contador + 1;
            sumaEdad = sumaEdad + edad;
            sumaEstatura = sumaEstatura + estatura;
            cadena1 = String.format("%s%d. %s -%s-, edad %d, estatura "
                    + "%.2f\n",
                    cadena1,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            cadena2 = String.format("%s%d ",
                    cadena2,
                    edad);

        }
        
        promedioEdad = (double) sumaEdad / contador;
        promedioEstatura = sumaEstatura / contador;
        System.out.printf("%s%s\nPromedio de Edades: %.2f Promedio de edades: %.2f"
                + " \n"
                + "",
                cadena1,
                cadena2,
                promedioEdad,
                promedioEstatura);
    }
}
