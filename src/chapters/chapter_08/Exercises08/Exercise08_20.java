package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_20 {
    public static void main(String[] args) {
        playConnectFour();
    }

    public static void playConnectFour() {
        int whoseTurn = 0;
        char[][] board = new char[6][7];
        fillBoard(board, ' ');

        while (true) {

            displayBoard(board);
            dropADisk(board, whoseTurn);

            if (isOver(board, whoseTurn) == 0) {
                displayBoard(board);
                System.out.print("The red player won!");
                break;
            } else if (isOver(board, whoseTurn) == 1) {
                displayBoard(board);
                System.out.println("The yellow player won!");
                break;
            } else if (isOver(board, whoseTurn) == 2) {
                displayBoard(board);
                System.out.println("It's draw!");
                break;
            }
            whoseTurn++;
        }
    }

    public static void fillBoard(char[][] board, char c) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = c;
            }
        }
    }

    public static int isOver(char[][] board, int whoseTurn) {
        if (checkDisks(board)) {
            return whoseTurn % 2;
        } else {
            boolean isDraw = true;// Starts with assume

            for (int row = 0; row < board.length; row++) {
                for (int col = 0; col < board[row].length; col++) {
                    // If there is a ' ', it means the game has not over yet.
                    if (board[row][col] == ' ') {
                        isDraw = false;
                        break;
                    }
                }
                // If we find the ' ' no need to look at the remainder of loops
                if (!isDraw) {
                    break;
                }
            }
            if (isDraw) {
                return 2;
            }
        }
        return 3;
    }

    public static boolean checkDisks(char[][] board) {
        // Same rules as Exercise08_19
        return (isConsecutiveFourAtRows(board) ||
                isConsecutiveFourAtColumns(board) ||
                isConsecutiveFourAtRightDiagonal(board) ||
                isConsecutiveFourAtLeftDiagonal(board));
    }

    public static void dropADisk(char[][] board, int whoseTurn) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Drop a" + ((whoseTurn % 2 == 0) ? " red " : " yellow ") +
                    "disk at column (0-6): ");
            int col = input.nextInt();


            if (col < 0 || board[0].length <= col) {
                System.out.println("Invalid column!");
                continue;
            }

            for (int row = board.length - 1; row >= 0; row--) {
                if (board[row][col] == ' ') {
                    board[row][col] = (whoseTurn % 2 == 0) ? 'R' : 'Y';
                    return;
                }
            }
            System.out.println("Column " + col + " is full!");
        }

    }


    public static boolean isFull(int col, char[][] board) {
        return (board[0][col] == 'R' || board[0][col] == 'Y');
    }


    public static void displayBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }

    public static boolean isConsecutiveFourAtRows(char[][] board) {
        int count;
        for (int row = 0; row < board.length; row++) {
            count = 1;
            for (int col = 0; col < board[row].length - 1; col++) {
                if (board[row][col] == board[row][col + 1] && board[row][col] != ' ') {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourAtColumns(char[][] board) {
        int count;
        for (int col = 0; col < board[0].length; col++) {
            count = 1;
            for (int row = 0; row < board.length - 1; row++) {
                if (board[row][col] == board[row + 1][col] && board[row][col] != ' ') {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    // I hope you may understand, if you won't try it on a matrix
    public static boolean isConsecutiveFourAtRightDiagonal(char[][] board) {
        int count;
        for (int startsPoint = board.length - 4; startsPoint > 0; startsPoint--) {
            count = 1;
            for (int col = 0, row = startsPoint; row < board.length - 1; col++, row++) {
                if (board[row][col] == board[row + 1][col + 1] && board[row][col] != ' ') {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        for (int startPoint = 0; startPoint <= board.length - 4; startPoint++) {
            count = 1;
            for (int row = 0, col = startPoint; col < board.length - 1; row++, col++) {
                if (board[row][col] == board[row + 1][col + 1] && board[row][col] != ' ') {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    // I hope you may understand, if you won't try it on a board
    public static boolean isConsecutiveFourAtLeftDiagonal(char[][] board) {
        int count;

        for (int startsPoint = board.length - 4; startsPoint > 0; startsPoint--) {
            count = 1;
            for (int row = startsPoint, col = board[startsPoint].length - 1; row < board.length - 1; row++, col--) {
                if (board[row][col] == board[row + 1][col - 1] && board[row][col] != ' ') {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        for (int startPoint = board[1].length - 1; startPoint >= board[1].length - 4; startPoint--) {
            count = 1;
            for (int row = 0, col = startPoint; row < board.length - row - 1; row++, col--) {
                if (board[row][col] == board[row + 1][col - 1] && board[row][col] != ' ') {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}

