package javaPractice;

import java.util.Scanner;

public class searchArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target;
        boolean isFound = false;

        int[] numbers = {1, 9, 2, 8, 3, 5, 4};

        // user input to check for element target
        System.out.print("Enter # to look if its present in the system: ");
        target = sc.nextInt();

        // performing liner searching
        for(int i = 0; i< numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the system!");
        }

    }
}
