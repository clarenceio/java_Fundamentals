package controlFlow;

public class LogicalOperators {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;  // both conditions must be true
        System.out.println(isWarm);
    }
}
