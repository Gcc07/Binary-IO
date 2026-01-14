import java.io.*;
import java.util.Date;

/**
 * Exercise 2: Write and read binary data
 * 
 * Requirements:
 * Part 1 - WRITE:
 * - Store an array of five int values: 1, 2, 3, 4, 5
 * - Store a Date object for the current time
 * - Store the double value 5.5
 * - Write all to file named Exercise17_02.dat
 * 
 * Part 2 - READ:
 * - In the same program, read the data back
 * - Display all values to verify they were stored correctly
 * 
 * @author Gabriel Cardenas
 */
public class Exercise17_02 {
    
    public static void main(String[] args) throws IOException {
        
        // Data to write
        int[] numbers = {1, 2, 3, 4, 5};
        Date currentTime = new Date();
        double value = 5.5;

        DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));
        for (int number : numbers) {
            output.writeInt(number);
        }
        output.writeLong(currentTime.getTime());
        output.writeDouble(value);
        output.close();
        
        System.out.println("Data written to Exercise17_02.dat");

        DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02.dat"));
        int[] newIntArray = new int[5];
        newIntArray[0] = input.readInt();
        newIntArray[1] = input.readInt();
        newIntArray[2] = input.readInt();
        newIntArray[3] = input.readInt();
        newIntArray[4] = input.readInt();
        Long dateObject = input.readLong();
        double inputDouble = input.readDouble();
        input.close();
        System.out.println("\nData read from Exercise17_02.dat:");
    }
}