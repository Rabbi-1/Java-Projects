package model;

public class Instructor {
    private String lastname;
    private String firstname;
    private String officeNumber;
    public Instructor(String lname, String fname, String office){
        lastname = lname;
        firstname = fname;
        officeNumber = office;
    }
    public Instructor(Instructor object2){
        lastname = object2.lastname;
        firstname = object2.firstname;
        officeNumber = object2.officeNumber;
    }
    public void set(String lname, String fname, String office){
        lastname = lname;
        firstname = fname;
        officeNumber = office;
    }
    public String toString(){
        String str = "Last name: " + lastname + "\nFirst Name: " + firstname + "\nOfficer Number: " + officeNumber;
        return str;
    }
}
