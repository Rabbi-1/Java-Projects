package application;
import java.util.ArrayList;
public class ARrayListDemo2 {
    public static void main(String[] args){
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Kpe");
        nameList.add("koee");
        nameList.add("ssa");
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");
        for (String name : nameList)
            System.out.print(name + " ");
        nameList.remove(1);
        for (String name : nameList)
            System.out.print(name + " ");
    }
}
