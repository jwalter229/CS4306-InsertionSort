import java.util.*;



public class Main {

    public static void main(String[] args) {

        // create array named arrOne,
        // of size 20 and fill with random integers under 100
        int arrOne [] = new int [20];
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            arrOne[i] =  rand.nextInt(100);
        }

        //Print unsorted arrOne
        System.out.print("The Unsorted array: ");
        for(int i : arrOne) {
            System.out.print(i);
            System.out.print(", ");
        }

        // creating new empty line
        System.out.println();
        // creating new empty line
        System.out.println();

        //create array, arrTwo
        // to hold sorted integers from arrOne
        int arrTwo [] = SortAlgorithm(arrOne);

        //print sorted array, arrTwo
        System.out.print("The Sorted array: ");
        for(int i : arrTwo) {
            System.out.print(i);
            System.out.print(", ");
        }
    }// end of main block


    // start of SortAlgorithm method
    public static int[] SortAlgorithm(int [] sort) {
        int temp, i, j;

        for (i = 0; i < 10; i++) {

            for(j = i; j > 0; j--) {

                if(sort[j] < sort[j - 1]) {
                    temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;
                }
            }
        }
        return sort;

    }// end of SortAlgorithm method

}// end of main class
