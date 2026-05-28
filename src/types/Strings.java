package types;

public class Strings {
    public static void main (String[] args) {
        String message = new String("Hello, world!");  //reference type - original method of declaration
        String myMessage = "Hello, world" + "!!";  //short way of declaring

        System.out.println(myMessage);

//        accessing methods of the String class
        System.out.println(myMessage.endsWith("!!"));
        System.out.println(myMessage);  //startsWith
        System.out.println(myMessage); // length - check length of input of the user
        System.out.println(myMessage); // indexOf - index of the first occurrence of the char. Non-existent char returns -1

        System.out.println(myMessage); // replace(target, replacement) - doesn't  modify the original string, it returns a new string
        System.out.println(myMessage); //toLowerCase - returns a new string
        System.out.println(myMessage); // get rif of whitespaces

//        Escape Sequences - including special characters in strings

        String text = "Hello, \"Mosh\"";
        System.out.println(text);

        String path = "C:\\Windows\\...";
        System.out.println(path);

        // newLine
        path = "C:\nWindows\\...";
        System.out.println(path);

        //tab
        text = "Hello,\t\"Mosh\"";
        System.out.println(text);




    }
}
