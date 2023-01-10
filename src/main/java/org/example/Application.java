package org.example;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String FizzBuzz(int in) {
        if (in == 0)
            return "0";
        String result = "";
        if (in % 3 == 0)
            result += "Fizz";
        if (in % 5 == 0)
            result += "Buzz";
        return result == "" ? String.valueOf(in) : result;
    }
}