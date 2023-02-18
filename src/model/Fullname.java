package model;

public class Fullname {
    private String firstName;
    private String middleName;
    private String lastName;

    public void setLastName(String str){
        lastName = str;
    }
    public void setFirstName(String str){
        firstName = str;
    }
    public void setMiddleName(String str){
        middleName = str;
    }
    public int getLenght(){
        return lastName.length() + firstName.length() + middleName.length();
    }
    public String toString(){
        return firstName + " " + middleName + " " + lastName;
    }
}
