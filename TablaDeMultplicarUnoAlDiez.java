//Un instructor del sena solicta un software que al ingresar genere su tabla de multiplica del 1 al 10

import java.util.Scanner;

public class TablaDeMultplicarUnoAlDiez {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Esribe el numero para hacer la tabla de multplicar: ");
    String valor = scan.nextLine();

    int valorInt = Integer.parseInt(valor);
    int multiplicador = 1;

    while ( multiplicador <= 10 ){
        int resultado = multiplicador * valorInt;
        System.out.print(multiplicador + " * " + valorInt + " = " + resultado);
        System.out.print("\n");
        multiplicador++;
    }

  }
}
