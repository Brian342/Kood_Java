package javaPractice;

import java.util.Scanner;

public class CypherTool {
    public static void main(String[] args){
        InputData input =  getInput();

        // encryption code
        String res = ""; // placeholder for the message string

        if(input.operation == 1){
            res = switch(input.choice){
               case 1 -> encryptRot13(input.message);
               case 2 -> encryptAtbash(input.message);
               default -> "Invalid Choice of encyption";
           };
// decryption of the message
        }else if(input.operation == 2){
            res = switch (input.choice){
                case 1 -> decryptRot13(input.message);
                case 2 -> decryptAtbash(input.message);
                default -> "Invalid choice of decyption";
            };
        }

    }
    public static InputData getInput(){
        Scanner scanner = new Scanner(System.in);
        int operation;
        int choice;
        System.out.println("Welcome to the Cypher Tool! ");

        System.out.print("""
                Select operation:
                1. Encrypt
                2. Decrypt
                :\s""");
        operation = scanner.nextInt();

        System.out.print("""
                Select Cypher:
                1. ROT13
                2. Atbash
                3. encryption_of_your_choice
                :\s""");

        choice = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        System.out.print(message);

        return new InputData(operation, choice, message);
    }
    public static String encryptRot13(String s){

        return "Hello Rot13";
    }
    public static String encryptAtbash(String s){
        return "Hello AtBash";
    }

    public static String decryptRot13(String s){
        return "Hello decyptRot";
    }
    public static String decryptAtbash(String s){
        return "Hello decyptAtBash";
    }
}

