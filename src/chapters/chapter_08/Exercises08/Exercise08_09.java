package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_09 {
    public static void main(String[] args) {
// 00 12 01 00 10 20
        char[][] table = new char[3][3];
        fill(table, ' ');
        boolean XTurn = true;
        boolean isItDraw = true;

        while (!isOver(table)) {
            displayTable(table);
            promptThePLayerTicOrToe(table, XTurn);
            if (checkWins(table)) {
                displayTable(table);
                System.out.println((XTurn ? "X" : "Y") + " player won");
                isItDraw = false;
                break;
            }
            XTurn = !XTurn;
        }

        if (isItDraw) {
            displayTable(table);
            System.out.println("Game is over! It's draw!");
        }

    }

    public static void fill(char[][] table, char ch) {
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = ch;
            }
        }
    }

    public static boolean isOver(char[][] table) {
        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[r].length; c++) {
                if (table[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWins(char[][] table) {

        // Checking Rows & Columns
        for (int r = 0; r < table.length; r++) {
            if (table[r][0] != ' ' && table[r][0] == table[r][1] && table[r][0] == table[r][2]) {
                return true;
            }
            if (table[0][r] != ' ' && table[0][r] == table[1][r] && table[0][r] == table[2][r]) {
                return true;
            }
        }

        // Checks major diagonal
        if (table[0][0] != ' ' && table[0][0] == table[1][1] && table[0][0] == table[2][2]) {
            return true;
        }
        // Checks sub-diagonal
        if (table[0][2] != ' ' && table[0][2] == table[1][1] && table[0][2] == table[2][0]) {
            return true;
        }


        return false;
    }

    public static void displayTable(char[][] table) {
        for (int row = 0; row < table.length; row++) {
            System.out.println("-------------");
            for (int col = 0; col < table[row].length; col++) {
                System.out.print("| " + table[row][col] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void promptThePLayerTicOrToe(char[][] table, boolean XTurn) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a row (0, 1, 2) for player ");
            System.out.print(XTurn ? "X:" : "Y:");
            int row = input.nextInt();

            System.out.print("Enter a col (0, 1, 2) for player ");
            System.out.print(XTurn ? "X:" : "Y:");
            int col = input.nextInt();

            // For avoiding ArrayOuOfBounds
            if (0 > col || col > 2 || 0 > row || row > 2) {
                System.out.println("Please to another place!");
                continue;
            }

            // For avoiding replace a place that has been already filled
            if (table[row][col] == ' ') {
                table[row][col] = (XTurn ? 'X' : 'Y');
                break;
            }

            System.out.println("Please to another place!");
        }
    }
}