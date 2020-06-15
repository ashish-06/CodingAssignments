/*
take 2 string as input and do following:
1. remove all the extra spaces
2. check if length of both string are same or not, if not then they are not an anagram
3. If length is same, then convert those into lowercase into charArray.
4. sort the new char string (using Arrays.sort())
5. compare both string
 */
import java.util.Arrays;

public class Anagram
{
    public static void main(String[] args)
    {
        isAnagram("keep", "peek");

    }
    static void isAnagram(String str1, String str2)
    {
        String s1= str1.replaceAll("\\s", " ");
        String s2= str2.replaceAll("\\s", " ");
        Boolean status= true;
        if (s1.length()!=s2.length())
        {
            status =false;
        }
        else
        {
            char[] Arrays1= s1.toLowerCase().toCharArray();
            char[] Arrays2= s2.toLowerCase().toCharArray();
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);
            status= Arrays.equals(Arrays1,Arrays2);
        }
        if (status)
        {
            System.out.println(str1+ " "+ str2+ " are Anagram");
        }
        else {
            System.out.println(str1+ " "+ str2+ " are not Anagram");
        }

    }
}
