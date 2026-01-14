import javax.xml.crypto.Data;
import java.io.*;

/**
 * Exercise 3: Track how many times a program has been executed
 * 
 * Requirements:
 * - Store an execution count in a file named Exercise17_03.dat
 * - Each time this program runs, increment the count by 1
 * - Display the current count
 * - Use the file persistence pattern:
 *   1. Read existing count (if file exists)
 *   2. Increment the count
 *   3. Write updated count back to file
 * 
 * @author Gabriel Cardenas
 */
public class Exercise17_03 {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("Exercise17_03.dat");
        int count = 0;
        if (file.exists()) {
            DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"));
            count = input.readInt();
            input.close();
        }
        count++;
        DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
        output.writeInt(count);
        output.close();
        
        // Display the result
        System.out.println("This program has been executed " + count + " time(s).");
    }
}