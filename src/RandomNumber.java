/**Write a program to generate 2 random numbers which will not be shown to the user.
 Take a user input and match it with any of the random numbers.
 If correct give it 1 point and if incorrect, do not give it any point.
 Finally, repeat this for 10 times and count the point user achieved.**/

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<5;i++){
            Random rand=new Random();
            int randomnumber1= rand.nextInt(10);
            //System.out.println("Random number1 is:"+randomnumber1);
            int randomnumber2= rand.nextInt(10);
            // System.out.println("Random number2 is:"+randomnumber2);

            Scanner scan =new Scanner(System.in);
            System.out.println("Enter a Number:");
            int num1=scan.nextInt();
            if (num1==randomnumber1 || num1==randomnumber2){
                System.out.println("Score is added");
                count++;
            }
            else {
                System.out.println("Didn't gain any score");
            }
        }
        System.out.println("Total score is:" + count);
    }
}
