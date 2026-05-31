In this section, we'll delve into 
Variables and constants
Primitive and Reference Types
Casting 
Numbers, Strings, Arrays
Read Inputs

Two data types;
Primitive Types - stores simple values

type   byte    range
byte    1   [-128, 127]
short   2   [-32K, 32K]
int     4   [-2B, 2B]
long    8
// decimals
float   4
double  8
char    2   A,B,C, ...

boolean 1   true/false

Reference Types - stores complex objects eg. date, mail message

Major difference b/n primitive and reference types
    
        When declaring primitive types, you don't need to allocate memory. Memory is allocated and released by JRE,
        But, you should always allocate memory for reference types and JRE would automatically release the memory.

        Primitive types don't have members but Reference types have members that could be accessed using the (.) operator

        When a primitive variable is declared, the value assigned to the variable would be stored in that memory location.
        When a reference type is used, the variable holds the address of the point object in memory, not the actual point object.

Arrays
Use arrays to store a list of items - numbers, people, messages, etc