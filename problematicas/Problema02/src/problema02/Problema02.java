/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 10;
        for (int numero = 30; numero >= contador; numero--) {
            /* el valor de numero se inicializa en 30 y el ciclo repetitivo
            se repite mientras que el valor de numero sea mayor o igual que 
            contador, en donde tambien en el ciclo va a disminuir en 1 el valor
            de numero
            */
            System.out.printf("%d-%d-%d-%d\n",numero,numero*2,numero*3,
            numero*4);
            /*
            el valor de numero cada vez se multiplica por 2,3,4
            */
        } 
    }
    
}
