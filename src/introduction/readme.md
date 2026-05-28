Introduction to Java Programming ...
Anatomy of a Java Program

Smallest building blocks in java programs are Functions.
Function - a block of code that performs a task. 
           eg. a function for sending emails to people
               a function for weight conversion

Writing functions in Java

    Start by specifying the return type of the function. (a number, a date, etc.).                                                                                                                                                  
        functions that don't return anything are termed as "void"

    Followed by a proper descriptive name (one that identifies the purpose of the function)                    
        - end with a pair of parenthesis () and a pair of curly braces {}

    Code is written inside the pair of curly braces
        NB: left brace must be on the same line where the function is defined

Every program in Java should have at least one function - main()

    void main(){ }  - that's the entry point to java programs

Whenever a java program is executed, the main() function get called and the code within it gets executed.

Class - a container for related functions. A function must always belong to a class. This is used to organize the code.
        
        Every Java program should have at least one class which contains the main function - class Main {}
        
        functions defined in the class belong to that particular class and that function is now termed as "method"

        All classes and methods should have an "access modifier" - a keyword that determines if other classes and methods in
        the program can access those classes and methods
        
        eg. public, private, etc - public is the common one

Naming Conventions

    PascalNamingConvention for naming classes
    camelNamingConvention for naming  methods