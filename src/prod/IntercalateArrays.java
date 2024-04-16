package prod;

import java.util.Scanner;

public class IntercalateArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores:");
        int N = scanner.nextInt();

        int[] A = readArray(scanner, N, "A");
        int[] B = readArray(scanner, N, "B");

        int[] C = intercalateArrays(A, B);

        System.out.println("Vetor resultante após intercalação:");
        printArray(C);

        scanner.close();
    }

    private static int[] readArray(Scanner scanner, int size, String name) {
        System.out.println("Digite os elementos do vetor " + name + ":");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] intercalateArrays(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        int indexA = 0, indexB = 0;
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) {
                C[i] = A[indexA];
                indexA++;
            } else {
                C[i] = B[indexB];
                indexB++;
            }
        }

        return C;
    }
}
