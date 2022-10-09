/**Write  a program to find the factorial of a given number**/

import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        int facto;
        int Fsum=1;
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter a Number:");
        facto=scan.nextInt();
        for(int i=1;i<=facto;i++){
            Fsum=Fsum*i;
        }
        System.out.println("Value is:"+Fsum);
    }
}
