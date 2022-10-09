/**Write a program to enter the numbers till the user wants and at the end,
 the program should display the largest and smallest numbers user entered.**/

import java.util.Scanner;
public class GreaterSmaller {
    public static void main(String[] args) {
        int Largest=0,Smallest=0,num;
        System.out.print("Enter the number you want to input here: ");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        num=input.nextInt();
        Smallest=num;
        for (int i=1;i<=n;i++){
            num=input.nextInt();

            if (num>Largest){
                Largest=num;
            }else if (num<Smallest){
                Smallest=num;
            }
        }
        System.out.println("largest number is:" + Largest);
        System.out.println("Smallest number is:" + Smallest);
    }
}
