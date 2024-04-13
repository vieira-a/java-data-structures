/*
Criar um vetor A com 5 elementos inteiros;
Criar um vetor B com os mesmos elementos do vetor A;
B[i] = A[i]
*/

package kb.java.datastructures;

public class ArraysExec1 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 10, 100, 1000, 10000};
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " = " + "B: " + (arrayB[i] = arrayA[i]));
        }
    }
}
