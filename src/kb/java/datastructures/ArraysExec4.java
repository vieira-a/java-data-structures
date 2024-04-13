/*
Criar vetor A com 15 elementos inteiros;
Criar vetor B com mesmo tamanho e valores do vetor A, sendo que o vetor B deverá ser raiz quadrada do respectivo elemento de A:
B[i] = sqrt(A[i])
**/

package kb.java.datastructures;

public class ArraysExec4 {
    public static void main(String[] args) {
        double[] arrayA = new double[]{2, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225};
        double[] arrayB = new double[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            System.out.println("A: " + (arrayA[i]) + " sqrt(A) > " + "B: " + (arrayB[i] = Math.sqrt(arrayA[i])));
        }
    }
}
