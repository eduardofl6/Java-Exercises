package Exercises7;
import java.util.*;

public class Exercise7_1 {
    

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        double[] grade = new double[n];

        System.out.print("Enter " + n + " scores: ");
        for(int i = 0; i < n; i++){
            grade[i] = input.nextDouble();
        }

        printScores(grade);


    }


    public static void printScores(double[] grade){
        double max = grade[0];
        for(int i = 1; i < grade.length;i++){
            if(max < grade[i]){
                max = grade[i];
            }
        }

        for(int i = 0; i < grade.length; i++){
            System.out.print("Student " + i + " score is " + grade[i] + " and grade is ");
            if(grade[i] >= max-5){
                System.out.println("A");
            }else if(grade[i] >= max-10){
                System.out.println("B");
            }else if(grade[i] >= max-15){
                System.out.println("C");
            }else if(grade[i] >= max-20){
                System.out.println("D");
            }else 
                System.out.println("F");

        }

    }

    
    public static void printArray(double arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


}
