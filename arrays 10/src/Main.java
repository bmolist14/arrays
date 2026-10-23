//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        System.out.println("Introdueix 5 números per a l'array A:");
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Introdueix 5 números per a l'array B:");
        for (int i = 0; i < 5; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            resultat[i] = a[i] + b[i];
        }

        System.out.println("Array A: " + Arrays.toString(a));
        System.out.println("Array B: " + Arrays.toString(b));
        System.out.println("Resultat: " + Arrays.toString(resultat));
    }
}