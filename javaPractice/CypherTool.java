package javaPractice;

import java.util.Scanner;

public class CypherTool {
    public static void main(String[] args){
        InputData input =  getInput();

            // encryption code
            String res = ""; // placeholder for the message string

            if (input.operation == 1) {
                res = switch (input.choice) {
                    case 1 -> encryptRot13(input.message);
                    case 2 -> encryptAtbash(input.message);
                    default -> "Invalid Choice of encyption";
                };
// decryption of the message
            } else if (input.operation == 2) {
                res = switch (input.choice) {
                    case 1 -> decryptRot13(input.message);
                    case 2 -> decryptAtbash(input.message);
                    default -> "Invalid choice of decyption";
                };
            }

            System.out.println(res);
        };

    public static InputData getInput() {
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        int choice = 0;
        System.out.println("Welcome to the Cypher Tool! ");

        while (true) {
            System.out.print("""
                    Select operation:
                    1. Encrypt
                    2. Decrypt
                    :>\s""");
            if (scanner.hasNextInt()) {
                operation = scanner.nextInt();

                if (operation == 1 || operation == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please select 1 or 2.\n");
                }

            } else {
                System.out.println("Please Enter a valid number!\n");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("""
                    Select Cypher:
                    1. ROT13
                    2. Atbash
                    3. encryption_of_your_choice
                    :>\s""");

            if (scanner.hasNext()) {
                choice = scanner.nextInt();

                if (choice == 1 || choice == 2 || choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please select 1, 2 or 3.\n");
                }

            } else {
                System.out.println("Please Enter a valid number!\n");
                scanner.next();
            }
        }


        scanner.nextLine();

    System.out.print("Enter your message: ");
    String message = scanner.nextLine();
    System.out.println(message);


        return new InputData(operation, choice, message);
    }
    public static String encryptRot13(String s){
        if( s==null||s.isEmpty()){
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            // handle all the uppercase letters
            if(c >= 'A' && c<= 'Z'){
                if(c <= 'M'){
                    c += 13;
                }else{
                    c -= 13;
                }
            }

            // Handling all the Lowercase letters
            if(c >= 'a' && c<= 'z'){
                if(c <= 'm'){
                    c += 13;
                }else{
                    c -= 13;
                }
            }
            sb.append(c);
        }

        System.out.println();
        System.out.println("Message after encrypted");
        return sb.toString();
    }
    public static String encryptAtbash(String s){
        if(s == null || s.isEmpty()){
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();

        // handling upper case
        for(char ch: s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                char encrypted = (char) ('Z' - (ch - 'A'));
                sb.append(encrypted);

                //Handling lower case
            }else if(ch >= 'a' && ch <= 'z'){
                char encrypted = (char) ('a' - (ch - 'a'));
                sb.append(encrypted);

            }else{
                sb.append(ch);
            }

        }

        System.out.println();
        System.out.println("Message after encrypted");
        return sb.toString();
    }

    public static String decryptRot13(String s){

        s = " Hello decryptRot";

        System.out.println();
        System.out.println("Message after Decrypted");
        return s;
    }
    public static String decryptAtbash(String s){
        s = " Hello decryptAtBash";

        System.out.println();
        System.out.println("Message after Decrypted");
        return s;
    }
}

