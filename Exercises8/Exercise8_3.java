package Exercises8;

public class Exercise8_3 {
    public static void main(String[] args){
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
           
            // Key to the questions
           char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
           
            // Grade all answers

            int[] grades = new int[answers.length];
            for (int i = 0,v=0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
            if (answers[i][j] == keys[j])
            correctCount++;
            }
            grades[v++] = correctCount;

            }
            int[] students = new int[grades.length];

            for(int i = 0; i < students.length;i++){
                students[i] = i;
            }

            bubbleSort(grades, students);
            for(int i = 0; i < students.length;i++){
                System.out.println("Student " + students[i] + " grade " + grades[i] );
            }
            }

            public static void bubbleSort(int[] numbers,int[] sts){

                for(int i = 1; !(inOrder(numbers)) && i < numbers.length;i++){
                    if(numbers[i-1] > numbers[i]){
                        swap(numbers,i-1,i);
                        swap(sts,i-1,i);
                    }
                }
        
                if(!(inOrder(numbers)))
                    bubbleSort(numbers,sts);
            }
        
            public static boolean inOrder(int[] array){
                for(int i = 1; i < array.length;i++){
                    if(array[i-1] > array[i]){
                        return false;
                    }
                }
                return true;
            }
        
            public static void swap(int[] num, int x, int y){
                int temp = num[x];
                num[x] = num[y];
                num[y] = temp;
            }

            public static void swap(double[] num, int x, int y){
                double temp = num[x];
                num[x] = num[y];
                num[y] = temp;
            }
    }

