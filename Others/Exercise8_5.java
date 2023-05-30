public class Exercise8_5 {
    
    // To display the student with the highest score, and his score, with create a variable studentsCount, that is equal to 0, since you can't get lower than that in a test
    // then we compare this variable with every students grade, once the students grade is higher than this variable, the variable students keep the students number and the variable
    // studentsCount keep the grade
    
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

            int students = 0;
            int studentsCount = 0;

             for (int i = 0; i < answers.length; i++) {
             // Grade one student
             int correctCount = 0;
             for (int j = 0; j < answers[i].length; j++) {
             if (answers[i][j] == keys[j])
             correctCount++;
             }
            if(correctCount >= studentsCount){
                studentsCount = correctCount;
                students = i;
            }
             System.out.println("Student " + i + "'s correct count is " +
             correctCount);
             }
             System.out.print("The student with the highest score is Student " + students + "'s with " + studentsCount + " correct answers");
             }
             
             //Exercise 8.6.1
             // If we enter just one point, a runTimeError will happen, a OutOfBoundsException error, cause
             /*
              * 18 int p1 = 0, p2 = 1; // Initial two points
                19 double shortestDistance = distance(points[p1][0], points[p1][1],
                20 points[p2][0], points[p2][1]); // Initialize shortestDistance
                when you acesses points[p2], you're trying to access an higher index of elements 
              */

            //Exercise 8.7.1
            /*
             * the comparison !(row == i && col == j) happens because if they're the same, there is no need to compare grid[row][col] == grid[i][j]
             * using row != i && col != j means that if one of them is false, grid[row][col] == grid[i][j] won't be compared, what is bad, because (i,j) an (row,collum) are always meant to
             * be compared at the same time, the're locations
             */
    
}
