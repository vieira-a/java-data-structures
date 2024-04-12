/*
Criar vetor A com 15 elementos inteiros;
Criar vetor B com mesmo tamanho e valores do vetor A, sendo que o vetor B deverá ser raiz quadrada do respectivo elemento de A:
B[i] = sqrt(A[i])
**/

package kb.java.datastructures;

public class ArraysExec4 {
    public static void main(String[] args) {
        double[] arrayA = new double[15];
        double[] arrayB = new double[15];

        arrayA[0] = 2;
        arrayA[1] = 4;
        arrayA[2] = 9;
        arrayA[3] = 16;
        arrayA[4] = 25;
        arrayA[5] = 36;
        arrayA[6] = 49;
        arrayA[7] = 64;
        arrayA[8] = 81;
        arrayA[9] = 100;
        arrayA[10] = 121;
        arrayA[11] = 144;
        arrayA[12] = 169;
        arrayA[13] = 196;
        arrayA[14] = 225;

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " sqrt(A) > " + "B: " + (arrayB[i] = Math.sqrt(arrayA[i])));
        }
    }
}
