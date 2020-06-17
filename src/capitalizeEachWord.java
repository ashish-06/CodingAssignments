/*
1. Take input a string
2. split it into a string array
3. use foreach loop to traverse all the values
4. store first letter that needs to be capitalized in one string variable, using substring(0,1)
5. store rest of letter in second string var, //afterStr= c.substring(1);
6. convert the first string var to uppercase using irst.toUpperCase() and concat the second string var, then print the result   1
 */

public class capitalizeEachWord
{
    public static void main(String[] args)
    {
        String str= "hello qae ashish singh";
        String[] newStr = str.split(" ");
        for(String c : newStr)
        {
            String first= c.substring(0,1);
            String afterStr= c.substring(1);
            String finalStr=first.toUpperCase()+afterStr;
            System.out.print(finalStr+ " "); //Hello Qae Ashish Singh

        }

    }
}
