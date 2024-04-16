package kb.java.datastructures;

import java.util.Scanner;

public class MatrixIrregular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of people interviewed:");
        int totalInterviewed = scan.nextInt();

        String[][] totalSons = new String[totalInterviewed][];

        for (int i=0; i<totalSons.length; i++){

            System.out.println("Enter amount of sons: ");
            int amountSons = scan.nextInt();

            totalSons[i] = new String[amountSons];

            for (int j=0; j<totalSons[i].length; j++){

                System.out.println("Enter son's name " + (j+1));

                totalSons[i][j] = scan.next();
            }
        }

        for (int i=0; i<totalSons.length; i++){
            System.out.println("People " + i + " has " + totalSons[i].length + " sons");
            for (int j=0; j<totalSons[i].length; j++){
                System.out.println(totalSons[i][j]);
            }
        }
    }
}
