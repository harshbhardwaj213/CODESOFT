import java.util.*;

class Calculator{

    public int total_marks=0;
    public float avg_percentage;

    public void subjects_marks(){
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter number of subjects: ");
       int subjects=sc.nextInt();
       int [] marks=new int[subjects];
       for(int i=0;i<subjects;i++){
            System.out.println("Enter the marks of Subject "+(i+1)+":");
            marks[i]=sc.nextInt();
            total_marks += marks[i];
       }
       System.out.println("Total Marks: "+total_marks);
       avg_percentage=(float)total_marks/subjects;
       System.out.println("Average Percentage: "+avg_percentage+"%");
    }

    public void grades(){
        if(avg_percentage>=90){
            System.out.println("Grade: A");
        }
        else if(avg_percentage<90 && avg_percentage>=80){
            System.out.println("Grade: B");
        }
        else if(avg_percentage<80 && avg_percentage>=70){
            System.out.println("Grade: C");
        }
        else if(avg_percentage<70 && avg_percentage>=60){
            System.out.println("Grade: D");
        }
        else if(avg_percentage<60 && avg_percentage>=50){
            System.out.println("Grade: E");
        }
        else if(avg_percentage<50 && avg_percentage>=33){
            System.out.println("Grade: F");
        }
        else{
            System.out.println("Fail");
        }
    }
}

public class Grade_calculator {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.subjects_marks();
        cal.grades();
    }
}
