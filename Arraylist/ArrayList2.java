package Arraylist;
import java.util.*;

class Student {
    private String name;

    private double gpa;

    // constructor, getters, setters

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {return name;}

    public double getGpa() { return gpa;}
}


public class ArrayList2 {
public static void main(String[] args) {

    List<Student> students = new ArrayList<>();  
    students.add(new Student("Alice",3.2));
    
    students.add(new Student("bob",3.8));
    
    students.add(new Student("charlie",3.6));
    
    students.add(new Student("herry",2.2));
    
    students.add(new Student("jon",4.5));

    //natural ordering of the sort is accending order 
    students.sort((o1,o2) -> { // here we have use lambda expresion
    if (o2.getGpa() - o2.getGpa() > 0) {
        return 1;
    } else if (o2.getGpa() - o1.getGpa() < 0) {
        return  -1;
    } else {
        return 0;
    }
    } );

    for (Student s : students) {
        System.out.println(s.getName() + ":" + s.getGpa());
    }
}
}


// or instend of using lambda expresion 
// students.sort((o1,o2) -> { // here we have use lambda expresion
//     if (o2.getGpa() - o2.getGpa() > 0) {
//         return 1;
//     } else if (o2.getGpa() - o1.getGpa() < 0) {
//         return  -1;
//     } else {
//         return 0;
//     }
//     } );


// we can do it using method comparator.comparing 

// Comparator.comparing(Student::getGpa);
// comparing method me function jata hai () ke ander 
// here student is the method reference 

                                                            //:: isko method reference bolte hai ( student class mei konsa mthod call krnna hai )
//Comparator<Student> comparator = Comparator.comparing(Student::getGpa); 
                   // ye comparator obj hai 

// Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

// .reversed method sort the list in decreasing order 
// .thenComapring(classname::methoname) compare the gpa first then compare them using name 

// now we can pass this object comparator in sort method instend of the lambsa funciton 

// students.sort(comparator);
//  for (Student s : students) {
//         System.out.println(s.getName() + ":" + s.getGpa());
//     }

// .thenComapring(classname::methoname) compare the gpa first then compare them using name 
// this same thing can be done inside the lamba function show as follows
// students.sort((o1,o2) -> { // here we have use lambda expresion
//     if (o2.getGpa() - o2.getGpa() > 0) {
//         return 1;
//     } else if (o2.getGpa() - o1.getGpa() < 0) {
//         return  -1;
//     } else {
//         return o1.getName().compareTo(o2.getName());
//     }
//     } );
