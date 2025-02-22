package Funciones;

public class Funcion4 {
    
    public static double cubica(double num1){
        double RaizCubica = Math.cbrt(num1);
        return RaizCubica;
    }

    public static void main(String[] args){

        double resultado = cubica(15);
        System.out.println(resultado);


    }
    
}
