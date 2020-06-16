/*
before reversing:Good Morning
After reversing:Morning Good
used the formula of swap two numbers without using temp var logic
a = a+b;
b = a-b;
a = a-b;
 */

public class swapStringWithoutTempVar
{
    public static void main(String[] args)
    {
        //swapString("Good","Morning");
        String str1= "Good";
        String str2= "Morning";
        System.out.println("before reversing:"+str1+" "+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length(),str1.length());
        System.out.println("After reversing:"+str1+" "+str2);

    }
   /* static void swapString(String str1, String str2)
    {
        String str= str1+str2;
        str2= str.substring(0,str.length()-str1.length());

    }

    */

}
