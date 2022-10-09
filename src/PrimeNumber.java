/**Write a program to print prime numbers from 2 to n**/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int n,count=0,totalPrime=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        n=scan.nextInt();
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
                totalPrime++;
            }
            count=0;
        }
        System.out.println("Total Prime number is:"+totalPrime);
    }
}
