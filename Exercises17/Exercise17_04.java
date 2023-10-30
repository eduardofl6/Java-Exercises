package Exercises17;
import java.io.*;
import java.util.*;

public class Exercise17_04 {
    public static void main(String [] args)throws IOException{
        if(args.length != 2){
            System.out.print("Insufficient amount of arguments");
            System.exit(0);
        }

        File fileText = new File("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\" + args[0]);
        File fileBin = new File("C:\\Users\\eduar\\Desktop\\Exercises\\src\\Exercises17\\" + args[1]);

        DataOutput output = new DataOutputStream(new FileOutputStream(fileBin,false));
        Scanner input = new Scanner(fileText);

        while(input.hasNextLine()){
            output.writeUTF(input.nextLine());
        }

        System.out.print("Done");
    }
}
