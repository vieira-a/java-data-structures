/*
Criar um vetor A com 5 elementos inteiros;
Criar um vetor B com os mesmos elementos do vetor A;
B[i] = A[i]
*/

package kb.java.datastructures;

public class ArraysExec1 {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];

        arrayA[0] = 1;
        arrayA[1] = 10;
        arrayA[2] = 100;
        arrayA[3] = 1000;
        arrayA[4] = 10000;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " = " + "B: " + (arrayB[i] = arrayA[i]));
        }
    }
}
