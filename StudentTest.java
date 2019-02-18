/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
/**
 *
 * @author ahashmi
 */
public class StudentTest {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   Student student = new Student("John","Smith",80,96,93);
   
   student.SetFirstName("Mark");
    String FirstName = student.GetFirstName();
   System.out.printf("print name is %s%n", FirstName);
   
   student.SetLastName("Burch");
   String LastName = student.GetLastName();
   System.out.printf("print name is%s%n",LastName);
   
   student.SetExam1Grades(95);
   student.SetExam2Grades(85);
   student.SetExam3Grades(96);
          
  
     double ExamGrades  = student.GetAverage();
     System.out.printf("print average %f",ExamGrades);
     
     
                  
   
   
   
   
   
   
    
    
 
}
    
}
