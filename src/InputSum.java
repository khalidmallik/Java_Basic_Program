/**Write a program to sum of user input until users input ‘q’ from keyboard**/

import java.util.Scanner;
public class InputSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter a number:");
        Scanner scan = new Scanner(System.in);

        while (true){
            int num=scan.nextInt();
            sum=sum+num;
            System.out.println("Value is:"+sum);
            if(num == 'q'){
                break;
            }
        }

    }
}
