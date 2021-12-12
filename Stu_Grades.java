import java.util.Scanner;
public class StudentGrade
  {
   public static void main(String a[])
     {
       int studentmarks;
       Scanner in=new Scanner(System.in);
       System.out.println("enter the marks of student");
       studentmarks=in.nextInt();
       if((studentmarks>=300)&&(studentmarks<=500))
         {
           System.out.println("A Grade");
         }
       if((studentmarks>=225)&&(studentmarks<=299))
         {
           System.out.println("B Grade");
         }
       if((studentmarks>=165)&&(studentmarks<=224))
         {
           System.out.println("C Grade");
         }
       if(studentmarks<165)
         {
           System.out.println("FAIL");
         }
     }
   }
