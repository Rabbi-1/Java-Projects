package application2;
import model.CompSciStudent;

import java.util.Scanner;
public class CompSciStudentDemo {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String idNumber;
        int years;
        int mathHours, csHours, genEdHours;
        System.out.println("What's ur name?");
        name = keyboard.nextLine();
        System.out.println("What's ur idNumber?");
        idNumber = keyboard.nextLine();
        System.out.println("What year?");
        years = keyboard.nextInt();
        CompSciStudent csStudent = new CompSciStudent(name, idNumber, years);
        System.out.println("Mathhours: ");
        mathHours = keyboard.nextInt();
        System.out.println("CsHours: ");
        csHours = keyboard.nextInt();
        System.out.println("GenEdHours: ");
        genEdHours = keyboard.nextInt();
        csStudent.setMathHours(mathHours);
        csStudent.setCsHours(csHours);
        csStudent.setGenEdHours(genEdHours);
        System.out.println(csStudent);
        System.out.println("Hours remaining: " + csStudent.getRemainingHouse());
    }
}
