
import java.util.Scanner;

public class CuentaBanco {
    // Funciones

    public static double consultaSaldo(){
        double saldo = 12432345.3;
        System.out.println("Su saldo es: " + saldo+"\n");
        return saldo;
    }

    public static double hacerRetiro(){
        Scanner scanner1 =new Scanner(System.in);
        System.out.println("Cuanto desea retirar?");
        double valor = scanner1.nextDouble();
        Double saldo = 12432345.3;
        if (valor < saldo){
            double nuevosaldo = saldo-valor;
            System.out.println("Su nuevo saldo disponible es: "+ nuevosaldo+"\n");
        }
        else{
            System.out.println("No tiene fondos suficientes");
        }
       
        return saldo;

    }
    public static double hacerConsignacion(){
        Scanner scanner2 =new Scanner(System.in);
        System.out.println("Cuanto dinero desea ingresar?");
        double valor = scanner2.nextDouble();
        Double saldo = 12432345.3;
        double nuevosaldo = saldo + valor;
        System.out.println("Su nuevo saldo disponible es: "+ nuevosaldo+"\n");
        
        return nuevosaldo;
    }
    

    public static void main(String[] args){
        String usuario = "Luis Herrera";
        
        while(true){
            System.out.println("Hola Usuario ");
            System.out.println("¿Qué quieres hacer el día de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignación");
            System.out.println("4. Salir");
            
            Scanner scanner =new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion== 4){
                System.out.println("Saliendo del sistema");
                break;
            }

            switch (opcion){
                case 1:{
                    consultaSaldo();
                    break;

                }
                case 2:{
                    hacerRetiro();
                    
                    break;

                }
                case 3:{
                    hacerConsignacion();
                    
                    break;

                }
                default:{
                    System.out.println("La opcion no es valida");
                    break;
                }
            }



    }

}

}
