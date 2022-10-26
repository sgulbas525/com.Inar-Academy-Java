package chapters.chapter_07.Exercises07;

public class Exercise07_23 {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 100; // There is a locker for each student
        boolean[] locker = new boolean[NUMBER_OF_STUDENTS];// default value is false for boolean

        studentsAreEnteringThroughTheBuilding(locker);
        displayTheLockers(locker);
    }

    public static void studentsAreEnteringThroughTheBuilding(boolean[] locker) {
        for (int i = 0; i < locker.length; i++) {
            changeLockers(i, locker);
        }
    }

    public static void changeLockers(int i, boolean[] locker) {
        // We start with the ith student with the j's locker
        // Since i starts with 0, it must open all the lockers, so we must code j += i + 1
        for (int j = i; j < locker.length; j += i + 1) {
            locker[j] = !locker[j];
        }
    }

    public static void displayTheLockers(boolean[] locker) {
        System.out.println("The open lockers are:");

        for (int i = 0; i < locker.length; i++) {
            if (locker[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}

