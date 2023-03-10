package model;

public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;
    public Student(String name,String idNumber, int yearAdmitted){
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;
    }
    public String toString(){
        String str;
        str = "Name: " + name + "\nID number: " + idNumber + "\nYEar Admitted: "
                + yearAdmitted;
        return str;
    }
    public abstract int getRemainingHouse();
}
