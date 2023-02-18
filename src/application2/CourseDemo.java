package application2;

import model.Course;
import model.Instructor;
import model.TextBook;

public class CourseDemo {
    public static void main(String[] args){
        Instructor myInstructor = new Instructor("Krama","Shawn","RH!123");
        TextBook myTextBook = new TextBook("Starting out with java","Gaddis", "Addison-Wesley");
        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);
        System.out.println(myCourse);
    }
}

