
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author ahahsmi
 */
public class Student {

    private String firstName; //instance variable
    private String lastName;
   private double Exam1;
   private double Exam2;
   private double Exam3;
   
    public Student(String FirstName, String LastName, double Exam1, double Exam2, double Exam3)
       
   { 
    this.firstName = FirstName; // store the first name 
    this.lastName = LastName;
    this.Exam1 = Exam1;
    this.Exam2 = Exam2;
    this.Exam3 = Exam3;
}
  
  public String GetFirstName ()
  {
      return firstName;
  }

   public void SetFirstName(String FirstName)
   {
       this.firstName = FirstName;
   }
   
public String GetLastName ()
{
    return lastName;
}
public void SetLastName(String LastName)
{
    this.lastName =LastName;
}
  public double GetExam1Grades()
  {
      return Exam1;
      
  }
     public void SetExam1Grades(double Exam1)
     {
         this.Exam1 = Exam1;
                 
     }
      public double GetExam2Grades() 
      {
          return Exam2;
      }
      public void SetExam2Grades(double Exam2)
      {
          this.Exam2 =Exam2;
          
      }
     public double GetExam3Grades() 
     {
         return Exam3;
     }
             
public void SetExam3Grades(double Exam3)
{
    this.Exam3 = Exam3;
}
  public double GetAverage()
  {
      double avarage = (Exam1 + Exam2 + Exam3)/2;
      return avarage;
  }
    
   }



    


