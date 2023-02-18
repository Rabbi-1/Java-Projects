package application;

public class StringCompare {
    public static void main (String[]args){
        String name1 = "Fuad";
        String name2 = "Fuad";
        String name3 = "Sabah";
         if (name1.equals(name2)){
             System.out.println(name1 + " and " + name2 + " are the same");
         }
         else {
             System.out.println(name1 + " and " + name2 + " are NOT the same.");
         }
         if (name1.equals(name3)){
             System.out.println(name1 + " and " + name3 + " are the same" );
         }
         else {
             System.out.println(name1 + " and " + name3 + " are NOT the same");
         }
    }
}
