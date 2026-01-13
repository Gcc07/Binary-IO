import java.io.*;

/**
 * Exercise 1: Write 100 random integers to a text file
 *
 * Requirements:
 * - Create a file named Exercise17_01.txt if it does not exist
 * - If the file already exists, APPEND new data (don't overwrite)
 * - Write 100 integers created randomly (use Math.random())
 * - Integers should be separated by a space
 * - Use text I/O (PrintWriter)
 *
 * @author Gabriel Cardenas
 */
public class Exercise17_01 {

    public static void main(String[] args) throws IOException {
        File file = new File("Exercise17_01.txt");
        PrintWriter output = new PrintWriter(new FileWriter(file, true));

        for (int i = 0; i < 100; i++) {
            int myNum = (int)(Math.random() * 101);
            output.print(myNum + " ");
        }

        // TODO: Close the file (or use try-with-resources)
        output.close();


        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}
