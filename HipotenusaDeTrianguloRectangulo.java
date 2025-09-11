import java.util.Scanner;

public class HipotenusaDeTrianguloRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del cateto A: ");
        double catetoA = sc.nextDouble();
        System.out.print("Ingrese la longitud del cateto B: ");
        double catetoB = sc.nextDouble();
        double res = (catetoA * catetoA) + (catetoB * catetoB);
        double hipotenusa = Math.sqrt(res);
        System.out.print("La hipotenusa es: " + hipotenusa);
        sc.close();
    }
}
