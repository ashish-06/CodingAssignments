////My  eman  is  hsihsA
/*
if you need to reverse the entire sentence then simply use a for loop and start printing the values from back side. (str.length()-1)
if the requirement is that you need to work on individual word then use split method and treat them an as individual word
 */
public class reverseString
{
    public static void main(String[] args)
    {
        String str= "My name is Ashish and soon I will become QAE in Amazon";
        String[] newStr= str.split(" ");
        String revStr= " ";
        int count=0;
        for (String c:newStr)
        {
            String temStr= " ";
            if(count%2==0)
            {
                temStr += newStr[count];
            }
            else
            {
            for(int i=c.length()-1; i>=0; i--)
                {
                    temStr += c.charAt(i);
                }
            }
                revStr += temStr + " ";
            count++;
            System.out.println(count);
        }
        System.out.println(revStr); //My  eman  is  hsihsA
    }


}
