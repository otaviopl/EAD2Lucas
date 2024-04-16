package prod;

import java.util.Scanner;

public class IntercalateArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores:");
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        int[] C = intercalateArrays(A, B);

        System.out.println("Vetor resultante após intercalação:");
        for (int num : C) {
            System.out.print(num + " ");
        }

        scanner.close();
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
