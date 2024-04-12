/*
Criar vetores A e B com 10 elementos inteiros;
Criar vetor C, sendo que cada elemento será a multiplicação dos elementos dos vetores A e B.
*/

package kb.java.datastructures;

public class ArraysExec8 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayC = new int[10];

        for(int i = 0; i < arrayA.length; i++) {
            arrayA[i] = (i+1) * 2;
        }

        for(int i = 0; i < arrayB.length; i++) {
            arrayB[i] = (i+2) * 3 ;
        }

        for(int i = 0; i < arrayC.length; i++) {
            System.out.println("A " + arrayA[i] + " * B " + arrayB[i] + " = C: " + (arrayC[i] = (arrayA[i] * arrayB[i])));
        }
    }
}
