package kb.java.datastructures;

public class Matrices {
    public static void main(String[] args) {
        double[][] studentsNotes = new double[2][4];

        studentsNotes[0][0] = 9;
        studentsNotes[0][1] = 8.5;
        studentsNotes[0][2] = 7;
        studentsNotes[0][3] = 8;

        studentsNotes[1][0] = 7;
        studentsNotes[1][1] = 9.5;
        studentsNotes[1][2] = 6;
        studentsNotes[1][3] = 7.5;

        for (int i = 0; i < studentsNotes.length; i++) {
            for (int j = 0; j < studentsNotes[i].length; j++) {
                System.out.print(studentsNotes[i][j] + " ");
            }
            System.out.println();
        }
    }

}
