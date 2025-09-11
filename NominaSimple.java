import java.util.Scanner;
import java.text.DecimalFormat;

public class NominaSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00"); // Para mostrar dos decimales

        // Entradas
        System.out.print("Ingrese el salario básico: ");
        double salarioBase = sc.nextDouble();

        System.out.print("Ingrese el número de horas extras: ");
        int horasExtras = sc.nextInt();

        System.out.print("Ingrese el valor unitario de cada hora extra: ");
        double valorHoraExtra = sc.nextDouble();

        // Cálculos
        double totalHorasExtras = horasExtras * valorHoraExtra;
        double subtotal = salarioBase + totalHorasExtras;
        double descuentoSalud = subtotal * 0.04;
        double descuentoPension = subtotal * 0.04;
        double salarioNeto = subtotal - (descuentoSalud + descuentoPension);

        // Salidas
        System.out.println("\n===== LIQUIDACIÓN DE NÓMINA =====");
        System.out.println("Salario base: $" + df.format(salarioBase));
        System.out.println("Valor total horas extras: $" + df.format(totalHorasExtras));
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Descuento salud (4%): $" + df.format(descuentoSalud));
        System.out.println("Descuento pensión (4%): $" + df.format(descuentoPension));
        System.out.println("--------------------------------");
        System.out.println("Salario neto a pagar: $" + df.format(salarioNeto));
        sc.close();
    }
}