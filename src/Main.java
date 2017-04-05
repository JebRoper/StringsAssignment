import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        String firstOne = "Nothing gold can stay";

        if (firstOne.contains("gold")) {
            System.out.println("Success - gold is in the statement  " + firstOne);
        } else {
            System.out.println("Error - gold should have been in the statement");
        }

        if (firstOne.contains("silver")) {
            System.out.println("Error - The statement does not contain silver");
        } else {
            System.out.println("Success - it does not contain silver");
        }

        if (firstOne.endsWith("stay")) {
            System.out.print("Success - Stay is the last word of the statment");
        } else {
            System.out.println("Error - That is not the last word of the statement");
        }
        if (firstOne.endsWith("gold")) {
            System.out.print("Fail - It does not end with gold");
        } else {
            System.out.println("\nSuccess - It does not end with gold");
        }

        if (firstOne.equalsIgnoreCase(firstOne)) {
            System.out.print("Success - The string is equal to itself");
        } else {
            System.out.println("FAIL - There is an error");
        }
        if (firstOne.equalsIgnoreCase(null)) {
            System.out.print("Fail - The string is not equal to itself");
        } else {
            System.out.println("\nGood - There is an error");
        }

        if (firstOne.lastIndexOf("stay") == 17) {
            System.out.println("Success - stay starts at 17");
        } else {
            System.out.println("Fail - stay does not start at 17");
        }
        if (firstOne.lastIndexOf("stay") == 10) {
            System.out.println("Fail - stay starts at 17");
        } else {
            System.out.println("Good - stay does not start at 10");
        }

        if (firstOne.replace("gold", "red").equals("Nothing red can stay")) {
            System.out.println("Success - it replaced the word correctly ");
        } else {
            System.out.println("Fail - the gold was not replaced");
        }
        if (firstOne.replace("gold", "red").equals("Nothing gold can stay")) {
            System.out.println("Fail it did not replace the gold");
        } else {
            System.out.println("Good - the fail test worked");
        }

        if (firstOne.toLowerCase().equals("nothing gold can stay")) {
            System.out.println("Success - it converted everything to lower case");
        } else {
            System.out.println("Fail - it did not convert");
        }
        if (firstOne.toLowerCase().equals("Nothing gold can stay")) {
            System.out.println("Fail - it did not convert");
        } else {
            System.out.println("Good - the fail test worked");
        }
    }
}














