package chapters.chapter_07.Checkpoints07;

import chapters.chapter_07.Listings07.Listing07_08_SelectionSort;

public class Checkpoint07_24_25 {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSortInDecreasing(list);
        Listing07_08_SelectionSort.displayArray(list);
    }
        //Checkpoint07_24
        /** Omitted */


        //Checkpoint07_25
        public static void selectionSortInDecreasing(double[] list){

            for (int i = 0; i < list.length - 1; i++) {
                double currentMax = list[i];
                int currentMaxIndex = i;

                for (int j = i + 1; j < list.length; j++) {
                    if (currentMax < list[j]) {
                        currentMaxIndex = j;
                        currentMax = list[j];
                    }
                }

                if (currentMaxIndex != i) {
                    list[currentMaxIndex] = list[i];
                    list[i] = currentMax;
                }
            }
        }
    }
