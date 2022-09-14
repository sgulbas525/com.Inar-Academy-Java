package Listings04;

public class Exercise04_03 {
    public static void main(String[] args) {
        String set1 =
            6 " 1 3 5 7\n" +
            7 " 9 11 13 15\n" +
            8 "17 19 21 23\n" +
            9 "25 27 29 31";
        10
        11 String set2 =
                12 " 2 3 6 7\n" +
                "10 11 14 15\n" +
                14 "18 19 22 23\n" +
                15 "26 27 30 31";
        16
        17 String set3 =
                18 " 4 5 6 7\n" +
                19 "12 13 14 15\n" +
                20 "20 21 22 23\n" +
                21 "28 29 30 31";
        22
        23 String set4 =
                24 " 8 9 10 11\n" +
                25 "12 13 14 15\n" +
                26 "24 25 26 27\n" +
                27 "28 29 30 31";
        28
        29 String set5 =
                30 "16 17 18 19\n" +
                31 "20 21 22 23\n" +
                32 "24 25 26 27\n" +
                33 "28 29 30 31";
        34
        35 int day = 0;
        36
        37 // Create a Scanner
        38 Scanner input = new Scanner(System.in);
        39
        40 // Prompt the user to answer questions
        41 System.out.print("Is your birthday in Set1?\n");
        42 System.out.print(set1);
        43 System.out.print("\nEnter 0 for No and 1 for Yes: ");
        44 int answer = input.nextInt();
        45
        46 if (answer == 1)
            47 day += 1;
        48
        49 // Prompt the user to answer questions
        50 System.out.print("\nIs your birthday in Set2?\n");
        51 System.out.print(set2);
        52 System.out.print("\nEnter 0 for No and 1 for Yes: ");
        53 answer = input.nextInt();
        54
        55 if (answer == 1)
            56 day += 2;
        57
        58 // Prompt the user to answer questions
        59 System.out.print("Is your birthday in Set3?\n");
        60 System.out.print(set3);
        61 System.out.print("\nEnter 0 for No and 1 for Yes: ");
        62 answer = input.nextInt();
        63
        64 if (answer == 1)
            65 day += 4;
        66
        67 // Prompt the user to answer questions
        68 System.out.print("\nIs your birthday in Set4?\n");
        69 System.out.print(set4);
        70 System.out.print("\nEnter 0 for No and 1 for Yes: ");
        71 answer = input.nextInt();
        if (answer == 1)
            74 day += 8;
        75
        76 // Prompt the user to answer questions
        77 System.out.print("\nIs your birthday in Set5?\n");
        78 System.out.print(set5);
        79 System.out.print("\nEnter 0 for No and 1 for Yes: ");
        80 answer = input.nextInt();
        81
        82 if (answer == 1)
            83 day += 16;
        84
        85 System.out.println("\nYour birthday is " + day + "!");