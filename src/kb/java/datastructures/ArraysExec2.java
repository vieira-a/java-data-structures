/*
Criar um vetor A com 8 elementos inteiros;
Criar um vetor B o mesmo tipo e tamanho do vetor A multiplicado por 2;
B[i] = A[i] * 2
* */

package kb.java.datastructures;

public class ArraysExec2 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3, 4, 5};
        int[] arrayB = new int[arrayA.length];

       for (int i = 0; i < arrayA.length; i++) {
           System.out.println("A: " + (arrayA[i]) + " A*2 > " + "B: " + (arrayB[i] = arrayA[i] * 2));
       }
    }
}
