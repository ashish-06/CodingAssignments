import java.util.Scanner;

public class vowelConsonentsCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to test the vowel and consonents: ");
        String str= sc.nextLine();
        //String str = "Abrak";
        int vcount=0, ccount=0;
        str= str.toLowerCase();
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vcount++;
            }
            else if(ch>='a'&&ch<='z')
            {
                ccount++;

            }

        }
        System.out.println("vowel count: "+vcount);
        System.out.println("consonents count: "+ccount);

    }
}
