package types;

import java.util.Scanner;

public class ReadInput {
    public static void main (String[] args) {
            // specify where data is to be read, terminal window or a file
        Scanner scanner = new Scanner(System.in);   //(system.in) - a field (more of a variable defined in class || reading from a terminal
        byte age = scanner.nextByte();
        System.out.println("You are " + age); //implicit casting - java converts byte var to string so they can be added together
    }
}
