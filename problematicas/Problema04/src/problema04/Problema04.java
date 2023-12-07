package problema04;

public class Problema04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }
            // en el system.out.print tenemos el simbolo 
            System.out.println();
            // con este system.out.println para que no muestre en pantalla todo junto
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
