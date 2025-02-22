package Funciones;

public class Funcion3 {
    public static void letraRepetida(String letra, int num){
        int i = 0;
        while(i<num){
            System.out.println(letra);
            i++;
        }
    }

    public static void main(String[] args){

        letraRepetida("A", 3);


    }
    
}
