package org.example;

public class StandardCalculator {

    private static final String Version = "1.0";
    private final int num1;
    private final int num2;
    private double result;
    
    public StandardCalculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void printVersion(){
        System.out.println("Standard Calculator V: " + Version);
    }

    public void clearResult(){
        this.result = 0;
    }

    public double getResult(){
        return result;
    }

    // private void setResult(int value){
    //     this.result = value;
    // }
    
    public void add(int num1, int num2){
        this.result = num1 + num2;
    }

    public void subtract(int num1, int num2){
        this.result = num1 - num2;
    }

    public void multiply(int num1, int num2){
        this.result = num1 * num2;
    }

    public void division(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        this.result = (double) num1 / num2;
    }

    public void printResult(){
        System.out.printf("Standard Calculator Result: %.2f%n", result);
    }
}
