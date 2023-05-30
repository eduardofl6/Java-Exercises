import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_11_13 {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt");

        try(java.io.PrintWriter output = new
        java.io.PrintWriter(file);)
        {
        output.printf("amount is %f %e\r\n", 32.32, 32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
        output.printf("%6b\r\n", (1 > 2));
        output.printf("%6s\r\n", "Java");
        output.close();
        }
        System.out.print(new java.util.Scanner(file).nextLine());

        File test = new File(("test.txt"));
        PrintWriter printer = new PrintWriter(test);
        printer.print("test");
        printer.close();

        System.out.println("\n"+test.exists() + "\ndeleting...");
        test.delete();
        System.out.print(test.exists());


    }
}
