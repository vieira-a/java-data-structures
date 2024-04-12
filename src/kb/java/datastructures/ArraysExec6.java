/*
Criar vetor A e B com 10 elementos inteiros;
Criar vetor C, onde cada elemento de C é a soma dos elementos A com os elementos de B;
* */

package kb.java.datastructures;

public class ArraysExec6 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayC = new int[10];

        for(int i = 0; i < arrayA.length; i++) {
            arrayA[i] = i + 2;
        }

        for(int i = 0; i < arrayB.length; i++) {
            arrayB[i] = i + 3;
        }

        for(int i = 0; i < arrayC.length; i++) {
            System.out.println("A " + arrayA[i] + " + B " + arrayB[i] + " = C " + (arrayA[i] + arrayB[i]));

        }
    }
}
