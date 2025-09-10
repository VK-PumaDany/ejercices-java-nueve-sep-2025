// En el área de facturación de una empresa si un numero ingresado corresponde en un valor es par o impar el programa deberá solicitar un numero entero al usuario y de terminar su clasificación

import java.util.Scanner;

public class FacturacionParImpar  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Esribe el valor total del area facturada: ");
        int valorInt = scan.nextInt();
        if(valorInt % 2 == 0) {
          System.out.print("El area de facturacion es par");
        }else{
          System.out.print("El area de facturacion es impar");
        }
        scan.close();
    } 
}