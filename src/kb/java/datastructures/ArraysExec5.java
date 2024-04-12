/*
Criar vetor A com 10 elementos;
Criar vetor B com mesmo tipo e tamanho de A, sendo que cada elemento de B deverá ser o seu respectivo elemento de A multiplicado por sua posição:
B[i] = A[i] * i
 */

package kb.java.datastructures;

public class ArraysExec5 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];

        arrayA[0] = 1;
        arrayA[1] = 2;
        arrayA[2] = 3;
        arrayA[3] = 4;
        arrayA[4] = 5;
        arrayA[5] = 6;
        arrayA[6] = 7;
        arrayA[7] = 8;
        arrayA[8] = 9;
        arrayA[9] = 10;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " A[i] * i > " + "B: " + (arrayB[i] = arrayA[i] * i));
        }
    }
}
