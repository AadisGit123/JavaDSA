package oops.inheritance.Super;

public class Super {
    static String Fname = "A R";
    static String Lname = "Rajath";


    public Super(String Fname, String Lname) {
        Super.Fname = Fname;
        Super.Lname = Lname;
    }

    public static void main(String[] args) {
        Student student = new Student(Fname, Lname);
        student.printName();
    }
}

class Student extends Super{
    int rollNo;

    Student(String Fname, String Lname){
        super(Fname, Lname);
        int rollNo1 = this.rollNo;
    }

    void printName(){
        System.out.println("Name: " + Fname + " " + Lname);
    }
}
