package application2;

public class InterfaceDemo {
    public static void main(String[] args){
        FinalExam3 exam1 = new FinalExam3(100, 20);
        FinalExam3 exam2 = new FinalExam3(100, 30);
        System.out.println("Exam 1: " + exam1.getScore());
        System.out.println("Exam 2: " + exam2.getScore());
        if(exam1.isGreater(exam2))
            System.out.println("Exam 1 higher");
        if(exam1.isLess(exam2))
            System.out.println("exam 1 lower");
        if(exam1.equal(exam2))
            System.out.println("They equal");
    }
}
