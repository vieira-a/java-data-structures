/*
Criar vetor A com 15 elementos inteiros;
Criar vetor B com mesmo tipo e tamanho do vetor A, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento do vetor A
* */

package kb.java.datastructures;

public class ArraysExec3 {
    public static void main(String[] args) {
        int[] arrayA = new int[15];
        int[] arrayB = new int[15];

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
        arrayA[10] = 11;
        arrayA[11] = 12;
        arrayA[12] = 13;
        arrayA[13] = 14;
        arrayA[14] = 15;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " A² > " + "B: " + (arrayB[i] = arrayA[i] * arrayA[i]));
        }

    }
}
