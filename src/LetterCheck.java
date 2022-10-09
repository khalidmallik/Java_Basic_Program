/**Write a program to check if inputted letter is small or capital**/
import java.util.Scanner;
public class LetterCheck {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Letter:");
        ch=scan.next().charAt(0);

        if (ch>= 65 && ch<=90){
            System.out.println(ch+" is a capital letter.");
        }
        else if(ch>=97 && ch<=122){
            System.out.println(ch+" is a small letter.");
        }
        else{
            System.out.println(ch+" is not a character.");
        }

    }

}
