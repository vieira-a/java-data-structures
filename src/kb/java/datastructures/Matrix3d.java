package kb.java.datastructures;

public class Matrix3d {
    public static void main(String[] args) {
        int[][][] matrix3d = new int[3][3][3];

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < matrix3d.length; i++) {
            for (int j = 0; j < matrix3d[i].length; j++) {
                for (int k = 0; k < matrix3d[i][j].length; k++) {

                    matrix3d[i][j][k] = i + j + k;
                    sum += matrix3d[i][j][k];

                    if (matrix3d[i][j][k] % 2 == 0) {
                        evenSum += matrix3d[i][j][k];
                    } else {
                        oddSum += matrix3d[i][j][k];
                    }
                }
            }
        }

        System.out.println("Total sum: " + sum);
        System.out.println("Total even: " + evenSum);
        System.out.println("Total odd: " + oddSum);

    }
}
