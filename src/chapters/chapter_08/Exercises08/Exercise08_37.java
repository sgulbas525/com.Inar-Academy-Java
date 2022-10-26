package chapters.chapter_08.Exercises08;

import java.util.Scanner;

public class Exercise08_37 {
    public static void main(String[] args) {
       String[][] statesAndTheirCapitals = getStatesAndTheirCapitals();
       int correctCount = askUser(statesAndTheirCapitals);
       displayResult(correctCount);
    }

    public static String[][] getStatesAndTheirCapitals() {
        /* String[][] statesAndTheirCapitals = {
    			{ "Arkansas", "Little Rock" }, { "Alabama", "Montgomery" }, { "Alaska", "Juneau" },
    			{ "California", "Sacramento" }, { "Arizona", "Phoenix" }, { "Colorado", "Denver" },
    			{ "Connecticut", "Hartford" }, { "Delaware", "Dover" }, { "Florida", "Tallahassee" },
    			{ "Georgia", "Atlanta" }, { "Hawaii", "Honolulu" }, { "Idaho", "Boise" },
    			{ "Illinois", "Springfield" }, { "Indiana", "Indianapolis" }, { "Iowa", "Des Moines" },
    			{ "Kansas", "Topeka" }, { "Kentucky", "Frankfort" }, { "Louisiana", "Baton Rouge" },
    			{ "Maine", "Augusta" }, { "Maryland", "Annapolis" }, { "Massachusetts", "Boston" },
    			{ "Michigan", "Lansing" }, { "Minnesota", "St. Paul" }, { "Mississippi", "Jackson" },
                { "Missouri", "Jefferson City" }, { "Montana", "Helena" }, { "Nebraska", "Lincoln" },
                { "Nevada", "Carson City" }, { "New Hampshire", "Concord" }, { "New Jersey", "Trenton" },
                { "New Mexico", "Santa Fe" }, { "New York", "Albany" }, { "North Carolina", "Raleigh" },
                { "North Dakota", "Bismarck" }, { "Ohio", "Columbus" }, { "Oklahoma", "Oklahoma City" },
                { "Oregon", "Salem" }, { "Pennsylvania", "Harrisburg" }, { "Rhode Island", "Providence" },
                { "South Carolina", "Columbia" }, { "South Dakota", "Pierre" }, { "Tennessee", "Nashville" },
                { "Texas", "Austin" }, { "Utah", "Salt Lake City" }, { "Vermont", "Montpelier" },
                { "Virginia", "Richmond" }, { "Washington", "Olympia" }, { "West Virginia", "Charleston" },
                { "Wisconsin", "Madison" }, { "Wyoming", "Cheyenne" },
    	};*/

        Scanner input = new Scanner(System.in);

        String[][] statesAndTheirCapitals = new String[50][2];
        for (int n = 0; n < statesAndTheirCapitals.length; n++) {
            System.out.println("Enter a state: ");
            statesAndTheirCapitals[n][0] = input.nextLine();

            System.out.println("Enter capital of " + statesAndTheirCapitals[n][0] + ": ");
            statesAndTheirCapitals[n][1] = input.nextLine();
        }
        return statesAndTheirCapitals;
    }

    public static int askUser(String[][] statesAndTheirCapitals) {
        int correctCount = 0;
        String answer ;
        Scanner input = new Scanner(System.in);

        for (int n = 0; n < statesAndTheirCapitals.length; n++) {
            System.out.println("What is the capital of " + statesAndTheirCapitals[n][0] + ": ");
            answer = input.nextLine(). toUpperCase();
            // if the answer is correct increase correctCount by 1
            if (statesAndTheirCapitals[n][1].toUpperCase().equals(answer)){
                System.out.println("Your answer is correct\n");
                correctCount++;
            }else {
                System.out.println("The correct answer should be " + statesAndTheirCapitals[n][1] + "\n");
            }
        }
        return  correctCount;
    }

    private static void displayResult(int correctCount) {
        System.out.println("The correct count is " + correctCount);

    }
}
