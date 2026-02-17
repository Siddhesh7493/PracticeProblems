/*
Problem Title: The Lucky Draw
Problem Statement

A classroom is arranged in a perfect 9×9 grid, consisting of 9 rows (indexed 1 to 9) and 9 positions per row (indexed 1 to 9). Each student is assigned a unique Lucky ID based on their seat:

The student in Row r at Position p has the ID: 10r+p.

        For example, the student in Row 2, Position 5 has the ID 25.

The teacher has a box containing chits numbered from 11 to 99. A chit is drawn at random. A draw is considered Valid only if:

The chit number C is between 11 and 99 inclusive.

The units digit of the chit is not zero (C(mod10)

        =0).

Given a drawn chit number, determine if it is a valid choice. If valid, identify the Row and Position of the winning student.

Input Format

A single integer C representing the number on the drawn chit.

        Output Format

If the chit is invalid, print "Incorrect Choice!".

If the chit is valid, print "Winner Found at Row R, Position P" where R and P are the calculated coordinates.

Constraints

1≤C≤200 (Note: Chits outside the 11-99 range are possible in the input).

Example 1

Input:
        25
Output:
Winner Found at Row 2, Position 5

Example 2

Input:
        30
Output:
Incorrect Choice!*/
import java.util.*;

public class LuckyDraw {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int j = 1; j <= 9; j++) {
                currentRow.add((i * 10) + j);
            }
            rows.add(currentRow);
        }

        int drawnChit = rn.nextInt(200) + 1;
        System.out.println("Chit Drawn: " + drawnChit);

        if (drawnChit < 11 || drawnChit > 99 || drawnChit % 10 == 0) {
            System.out.println("Incorrect Choice!");
        } else {
            int rowNo = drawnChit / 10;
            int position = drawnChit % 10;

            int winnerID = rows.get(rowNo - 1).get(position - 1);

            if (drawnChit == winnerID) {
                System.out.println("Winner Found at Row " + rowNo + ", Position " + position);
            }
        }
    }
}