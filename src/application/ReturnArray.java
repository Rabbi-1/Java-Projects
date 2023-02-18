package application;

public class ReturnArray {
    public static void main (String[] args){
        double[] values;
        values = getarray();
        for(double val : values)
            System.out.println(val + " ");
    }
    public static double[] getarray(){
        double[] array = {1.1, 1.2,1.3};
        return array;
    }
}
