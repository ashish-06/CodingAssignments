/*
take a word and reverse it using reverse a string logic and then compare the reverse value with the initial value
 */
import java.util.Scanner;

public class Palindrome1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a word to test if it's palindrome or not: ");
        String str= sc.next();
        reverse(str);
    }
    static void reverse(String str)
    {
        String tempStr= " ";
        for(int i=str.length()-1; i>=0;i--) //reverse a string logic
        {
            tempStr += str.charAt(i);

        }

        if(str.equals(tempStr.trim())) //trim removes the extra spaces from starting and ending of a string
        {
            System.out.println(str+ " is a palindrome");
        }
        else
        {
            System.out.println(str+ " is not palindrome");
        }

    }
}
