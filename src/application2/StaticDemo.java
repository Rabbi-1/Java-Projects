package application2;

import model.Countable;

public class StaticDemo {
    public static void main (String[] args){
        int objectCount;
        Countable o1 = new Countable();
        Countable o2 = new Countable();
        Countable o3 = new Countable();
        objectCount = o1.getInstanceCount();
        System.out.println(objectCount);
    }
}
