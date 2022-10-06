package chapters.chapter_08;

public class Exercise08_16 {
    public static void main(String[] args) {
        int[][] list = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        displayArray(list);

        sort(list);
        displayArray(list);
    }

    public static void sort(int[][] list) {
        int point ;
        for (int i = 0; i < list.length - 1; i++) {
            point = i;// Start with assume
            for (int j = i + 1; j < list.length; j++) {
                // Compares x's assign the smaller one to points
                if (list[j][0] < list[point][0]) {
                    point = j;
                }// If x's are equal compares y's and assign the smaller one
                else if (list[j][0] == list[point][0]) {
                    if (list[j][1] < list[i][1]) {
                        point = j;
                    }
                }
            }
            if(point != i){
                // Exchanging x
                int temp = list[i][0];
                list[i][0] = list[point][0];
                list[point][0] = temp;
                // Exchanging y
                temp = list[i][1];
                list[i][1] = list[point][1];
                list[point][1] = temp;
            }
        }
    }

    public static void displayArray(int[][] list) {
        for (int[] point : list) {
            System.out.print("(" + point[0] + ", " + point[1] + ")  ");
        }
        System.out.println();
    }

}
