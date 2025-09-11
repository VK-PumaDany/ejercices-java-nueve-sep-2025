import java.util.Scanner;

public class LetraMayusOMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una letra del abecedario: ");
        String letra = sc.nextLine();
        char primeraLetra = letra.charAt(0);
        if (Character.isUpperCase(primeraLetra)) {
            System.out.println("La letra es mayúscula");
        } else {
            System.out.println("La letra no es mayúscula");
        }
        sc.close();
    }
}
