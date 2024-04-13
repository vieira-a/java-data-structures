/*
Criar vetor A com 15 elementos inteiros;
Criar vetor B com mesmo tipo e tamanho do vetor A, sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento do vetor A
* */

package kb.java.datastructures;

public class ArraysExec3 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arrayB = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " A² > " + "B: " + (arrayB[i] = arrayA[i] * arrayA[i]));
        }

    }
}
