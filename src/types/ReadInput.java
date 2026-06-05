package types;

import java.util.Scanner;

public class ReadInput {
    public static void main (String[] args) {
            // specify where data is to be read, terminal window or a file
        Scanner scanner = new Scanner(System.in);   //(system.in) - a field (more of a variable defined in class || reading from a terminal
            // add a label - use print
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        .nextFloat(); - read float
//        .nextDouble(); - read double
//        .next or nextln - read string

//        System.out.println("You are " + age); //implicit casting - java converts byte var to string so they can be added together

        System.out.print("Name: ");
//        String name = scanner.next();  //reads only one token (word)

//        String name = scanner.nextLine();  // reads the entire line regardless of space b/n the words
            //get rid of spaces
        String name = scanner.nextLine().trim();  // reads the entire line regardless of space b/n the words
        System.out.println("You are " + name);
//       words are tokens - every time the next method is called, it reads one token
    }
}
