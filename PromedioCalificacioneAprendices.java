// El area academica requiere un sistema que permita calcular el promedio de calificaciones de un grupo de aprendices el usuario debera ingresar las notas de los aprendices y el programa calculara el promedio general

import java.util.Scanner;

public class PromedioCalificacioneAprendices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el numero de notas a calcular el promedio: ");
        int numNotesApprentices = Integer.parseInt(scan.nextLine());
        int savedNotes = 0;
        for (int i = 0; i < numNotesApprentices; i++) {
            System.out.print("Ingrese la nota del estudiante: ");
            savedNotes = savedNotes + Integer.parseInt(scan.nextLine());
        }
        int promedio = savedNotes / numNotesApprentices;
        System.out.print("El promedio es: " + promedio);
        scan.close();
    }
}
