/**Write a program to calculate GPA and find grade**/

import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        int num;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your mark:");
        num=scan.nextInt();

        if(num<=100 && num>=80){
            System.out.println("Your grade is A+");
        }
        else if(num<=79 && num>=75){
            System.out.println("Your grade is A");
        }
        else if(num<=74 && num>=70){
            System.out.println("Your grade is A-");
        }
        else if(num<=69 && num>=65){
            System.out.println("Your grade is B+");
        }
        else if(num<=64 && num>=60){
            System.out.println("Your grade is B");
        }
        else if(num<=59 && num>=55){
            System.out.println("Your grade is B-");
        }
        else if(num<=54 && num>=50){
            System.out.println("Your grade is C+");
        }
        else if(num<=49 && num>=45){
            System.out.println("Your grade is C");
        }
        else if(num<=44 && num>=40){
            System.out.println("Your grade is D");
        }
        else if(num<40){
            System.out.println("Your grade is F");
        }
        else {
            System.out.println("Enter a value between 0 to 100");
        }
    }
}
