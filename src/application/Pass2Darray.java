package application;

public class Pass2Darray {
    public static void main (String[] args){
        int[][] numbers = {{34,234,234,234}, {234,22,32,42},{24,24,22}};
        System.out.println("Here are the values in the array.");
        showArray(numbers);
        System.out.println("Sum: " + arraySum(numbers));

    }
    private static void showArray(int[][] array){
        for (int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++)
                System.out.print(array[row][col] + " ");
            System.out.println();
        }
    }
    private static int arraySum(int[][] array){
        int total = 0;

        for(int row = 0; row < array.length; row++){
            for(int col = 0;col < array[row].length; col++)
                total += array[row][col];
        }
        return total;
    }
}
