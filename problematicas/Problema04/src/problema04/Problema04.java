package problema04;

public class Problema04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--){
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
