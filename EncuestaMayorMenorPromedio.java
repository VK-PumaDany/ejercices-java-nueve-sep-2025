// En una encuesta apliacada a 10 participantes se requiere almacenar sus edades y el sistema debe determinar la edad mayor la edad menor y el promedio de edades

import java.util.Scanner;

public class EncuestaMayorMenorPromedio {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Esribe el numero para hacer la tabla de multplicar: ");
        int ageMayor = 0;
        int ageMinor = 0;
        int ageTotal = 0;
        System.out.print("\n");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la edad del participante numero [" + (i + 1) + ".] : ");
            int ageWrited = Integer.parseInt(scan.nextLine());

            if (ageMayor == 0) {
                ageMayor = ageWrited;
            }
            if (ageMinor == 0) {
                ageMinor = ageWrited;
            }

            if (ageWrited > ageMayor) {
                ageMayor = ageWrited;
            }

            if (ageWrited < ageMinor) {
                ageMinor = ageWrited;
            }

            ageTotal = ageTotal + ageWrited;
        }
        int promedio = ageTotal / 10;
        System.out.print("El promedio es: " + promedio + "\n");
        System.out.print("La edad menor es: " + ageMinor + "\n");
        System.out.print("la edad mayor es: " + ageMayor);
        scan.close();

    }
}
