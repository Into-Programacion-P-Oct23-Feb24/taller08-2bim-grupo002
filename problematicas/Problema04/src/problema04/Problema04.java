package problema04;

public class Problema04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }
            // en el system.out.print tenemos el simbolo 
            System.out.println();
            // con este system.out.println ira agregando la cantidad de simbolos que apareceran desde 1 hasta 5 veces
        }
        for (int i = 5; i >= 1; i--){
            for (int a = 1; a <= i; a++){
                System.out.print("*");
                // igualmente hara lo mismo pero en orden decreciente
            }
            System.out.println();
        }
    }
}
