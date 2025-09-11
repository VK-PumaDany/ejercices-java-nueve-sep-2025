import java.util.Scanner;

public class SetTenis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese juegos ganados por A: ");
        int a = sc.nextInt();

        System.out.print("Ingrese juegos ganados por B: ");
        int b = sc.nextInt();

        // Validación
        if (esValido(a, b)) {
            if (a > b) {
                System.out.println("El ganador es el Jugador A");
            } else if (b > a) {
                System.out.println("El ganador es el Jugador B");
            } else {
                System.out.println("Empate (resultado no válido en tenis)");
            }
        } else {
            System.out.println("Marcador incorrecto o el set aún no ha terminado.");
        }
        sc.close();
    }

    // Método para validar el marcador
    public static boolean esValido(int a, int b) {
        // Nadie puede supear 7 juegos 
        if (a > 7 || b > 7) return false;

        // Caso ganar con 6
            
        if (a == 6 && b <= 4)
            return true;
        if (b == 6 && a <= 4) return true;

        // Caso 7-5 o 7-6
            
        if (a == 7 && (b == 5 || b == 6))
            return true;
        if (b == 7 && (a == 5 || a == 6)) return true;

        return false; // Otros resultados no válidos
    }
}