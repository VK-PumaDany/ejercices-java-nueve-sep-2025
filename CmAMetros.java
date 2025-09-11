import java.util.Scanner;

public class CmAMetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero en cm: ");
        float cm = sc.nextFloat();
        float resM = cm / 100;
        System.out.print("El numero convertido es: " + resM);
        sc.close();
    }
}