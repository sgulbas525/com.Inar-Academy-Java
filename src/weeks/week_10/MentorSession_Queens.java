package weeks.week_10;

public class MentorSession_Queens {
    /*
    0 Q _ _ _ _ _ _ _
    1 _ _ Q _ _ _ _ _
    2 _ _ _ _ Q _ _ _----_ _ _ _
    3 _ _ _ _ _ _ Q _
    4 _ Q _ _ _ _ _ _   i = 1 qP = 2
    5 X _ _ _ _ _ Q _  chessTable[i] + (row - i) --> 6
    6 _ _ _ X _ _ _ _ i = 3 qp =6
    7                   chessTable[i] - (row - i) ---> 3
 */
    public static void main(String[] args) {
        int[] chessTable = new int[8];
        int row = 0;

        while (row < chessTable.length) {
            if (isThereAnyPlaceToPutAQueen(chessTable, row)) {
                putQueen(chessTable, row);
                row++;
            } else {
                row = 0;
            }
        }

        displayChessTable(chessTable);
    }

    public static boolean isThereAnyPlaceToPutAQueen(int[] chessTable, int row) {
        boolean[] places = new boolean[8];
        java.util.Arrays.fill(places, true);
        for (int i = 0; i < row; i++) {
            places[chessTable[i]]= false;
            if ((chessTable[i] + (row - i)) < 8){
                places[chessTable[i] + (row - i)] = false;
            }
            if ((chessTable[i] - (row - i)) >= 0){
                places[chessTable[i] - (row - i)] = false;
            }
        }
        for (int i = 0; i < places.length; i++) {
            if (places[i]){
                return true;
            }
        }
        return false;
    }

    public static void putQueen(int[] chessTable, int row) {
        int queensPlace;
        while (true) {
            queensPlace = (int) (Math.random() * 8);
            if (isThatPLaceAvailable(queensPlace, chessTable, row)) {
                break;
            }
        }
        chessTable[row] = queensPlace;
    }

    public static boolean isThatPLaceAvailable(int queensPlace, int[] chessTable, int row) {
        boolean[] places = new boolean[8];
        java.util.Arrays.fill(places, true);

        for (int i = 0; i < row; i++) {
            places[chessTable[i]] = false;
            if ((chessTable[i] + (row - i)) < 8) {
                places[chessTable[i] + (row - i)] = false;
            }
            if ((chessTable[i] - (row - i)) >= 0){
                places[chessTable[i] - (row - i)] = false;
            }
        }
        return places[queensPlace];


    }
    /*
    0 Q _ _ _ _ _ _ _
    1 _ _ Q _ _ _ _ _
    2 _ _ _ _ Q _ _ _----_ _ _ _
    3 _ _ _ _ _ _ Q _
    4 _ Q _ _ _ _ _ _   i = 1 qP = 2
            5 X _ _ _ _ _ Q _  chessTable[i] + (row - i) --> 6
            6 _ _ _ X _ _ _ _*/

    public static void displayChessTable(int[] chessTable) {
        for (int i = 0; i < chessTable.length; i++) {
            System.out.print("|");
            for (int j = 0; j < chessTable[i]; j++) {
                System.out.print(" |");
            }
            System.out.print("Q| ");
            for (int j = chessTable[i] + 1; j < chessTable.length; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }

}
