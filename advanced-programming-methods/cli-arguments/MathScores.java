
import java.util.Arrays;

public class MathScores {

    public static void main(String[] args) {
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        int[] mathScores = new int[students.length];
        mathScores[0] = 64;
        mathScores[2] = 76;
        mathScores[1] = 57;
        mathScores[3] = 98;
        System.out.println(Arrays.toString(mathScores));

        System.out.println(students[0] + ": " + mathScores[0]);
        System.out.println(students[1] + ": " + mathScores[1]);
        System.out.println(students[2] + ": " + mathScores[2]);
        System.out.println(students[3] + ": " + mathScores[3]);

    }
}
