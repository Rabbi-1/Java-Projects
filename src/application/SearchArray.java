package application;

public class SearchArray {
    public static void main (String[] args){
        int[] test = {87, 90, 100,78, 100};
        int result;
        result = sequentialSearch(test, 100);
        if (result == -1){
            System.out.println("no 100");
        }
        else {
            System.out.println("u got 100 on test " +(result + 1));
        }
    }
    public static int sequentialSearch (int[] array, int value){
        int index = 0;
        int element = -1;
        boolean found = false;

        while (!found && index < array.length){
            if (array[index] == value){
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }
}
