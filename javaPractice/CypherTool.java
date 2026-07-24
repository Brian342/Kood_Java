package javaPractice;

import java.util.Scanner;

public class CypherTool {
    public static void main(String[] args){

    }
    public static InputData getInput(){
        Scanner scanner = new Scanner(System.in);
        int operation;
        int choice;
        System.out.println("Welcome to the Cypher Tool! ");

        System.out.println("""
                Select operation:
                1. Encrypt
                2. Decrypt
                """);
        operation = scanner.nextInt();

        System.out.println("""
                Select Cypher:
                1. ROT13
                2. Atbash
                3. encryption_of_your_choice
                """);

        choice = scanner.nextInt();

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        return new InputData();
    }
    public static String encryptRot13(String s){

        return "";
    }
    public static String encryptAtbash(String s){
        return "";
    }

    public static String decryptRot13(String s){
        return "";
    }
    public static String decryptAtbash(String s){
        return "";
    }
}

