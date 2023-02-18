package application;
import java.util.ArrayList;
public class ArrayListDemo4 {
    public static void main (String[] args){
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Joe");
        nameList.add("whayer");
        nameList.add("helo");
        nameList.add("nill");
        for (int index = 0; index < nameList.size(); index++){
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        }
        nameList.clear();
        System.out.println("Just add");
        for (int index = 0; index < nameList.size(); index++){
            System.out.println("Index: " + index + " Name:" + nameList.get(index));
        }
    }
}

