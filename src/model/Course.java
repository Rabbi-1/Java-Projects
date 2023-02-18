package model;

public class Course {
    private String coursename;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor instr, TextBook text){
        coursename = name;
        instructor = new Instructor(instr);
        textBook = new TextBook(text);
    }
    public String getName(){
        return coursename;
    }
    public Instructor getInstructor(){
        return new Instructor(instructor);
    }
    public TextBook getTextBook(){
        return new TextBook(textBook);
    }
    public String toString(){
        String str = "Course name: " + coursename +
                "\nInstructor Information:\n" +
                instructor + "\nTextbook Information:\n" + textBook;
        return str;
    }
}
