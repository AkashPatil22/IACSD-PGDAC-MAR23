package ConceptsOfProgramming.Assignment_1;

import java.util.Scanner;

public class PoweredNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = in.nextInt();

        System.out.println("Enter the power to your number: ");
        int pow = in.nextInt();

        int n = 1;

        while(pow!=0){
            n = n * num ;
            pow--;
        }
        System.out.println("Your answer is: " + n);
    }
}
