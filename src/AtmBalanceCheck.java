/**Write a program to check balance and withdraw money from ATM booth using if else or switch case**/

import java.util.Scanner;
public class AtmBalanceCheck {
    public static void main(String[] args) {
        int balance=500000,withdraw,pin=7890;
        Scanner scan=new Scanner(System.in);
        Scanner pass=new Scanner(System.in);
        while (true){
            System.out.println("'Halal Bank Corporation'"
                    +'\n'+"Enter your pin number:"+'\n');

            int set=pass.nextInt();
            if(set==pin){
                System.out.println("Password Matched"
                        +'\n'+"Press '1' for check Balance."+'\n'
                        +"Press '2' for Withdraw money."+'\n'
                        +"Press '3' for Exit."+'\n');
                int select=pass.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Your current balance is:" + balance);
                        break;

                    case 2:
                        System.out.println("Balance will be withdrawn.");
                        withdraw = pass.nextInt();

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Cash-Out from ATM TK" + withdraw + '\n' + "Your current account balance:TK" + balance + '\n');

                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    case 3:
                        System.exit(0);
                }
            }
            else {
                System.out.println("Pin number not matched");
            }
        }
    }
}
