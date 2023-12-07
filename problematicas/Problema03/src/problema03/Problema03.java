package problema03;

public class Problema03 {

    public static void main(String[] args) {
        double gradosc;
        double gradosf = 20;
        String cadena = "";
        int i;
        // declaramos las variables que usaremos
        for (i = 0; i < 20; i++){
                gradosc = (gradosf-32)* 5/9;
                cadena = String.format("%s%s = %.2f\n", cadena, gradosf, gradosc);
                gradosf += 4;
                // gradosf ira cada vez aumentando 4 valores por cada que pase por el ciclo
        }
        System.out.printf("%s", cadena);
    }
    
}
