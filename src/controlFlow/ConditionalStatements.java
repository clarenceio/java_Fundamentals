package controlFlow;

public class ConditionalStatements {
    public static void main (String[] args) {
//        If statements - make decisions based on certain conditions
        /*
        If temp is greater than 30
            It's a hot day
            Drink plenty of water
        Otherwise if it's between 20 and 30
            It's a nice day
        Otherwise
            It's cold
         */

        int temp = 22;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20) {
            System.out.println("It's a nice day");
        }                                                       //can do away with the {} if block has only one statement
        else {
            System.out.println("It's cold");
        }

//        simplifying if statements
        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000)
//        System.out.println(hasHighIncome);

        String className = income > 100_000 ? "First Class" : "Economy Class";
        System.out.println(className);



//        Switch Statements - execute different parts of code depending on the value of the expression
        String role = "guest";
        switch (role) {
            case "admin" :
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }

    }

}
