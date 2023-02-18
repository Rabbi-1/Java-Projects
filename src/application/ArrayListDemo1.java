package application;
import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main (String[] args){
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Jame");
        nameList.add("joe");
        nameList.add("how");
        System.out.println("The arraylist has " + nameList.size() + " objects stored in it.");
        for(int index = 0; index<nameList.size(); index++)
            System.out.print(nameList.get(index) + " ");
    }
}
