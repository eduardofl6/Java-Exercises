import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.*;

public class Exercise17_4_11 {
public static void main(String[] args)
throws java.io.IOException {
try (DataOutputStream output = new DataOutputStream(
new FileOutputStream("t.dat")); ) {
output.writeInt(1234);
output.writeInt(5678);
output.close();
}
    
DataInputStream input = new DataInputStream( new FileInputStream("t.dat"));try
}
}