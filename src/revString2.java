//yM  eman  si  hsihsA
public class revString2
{
    public static void main(String[] args)
    {
        String str= "My name is Ashish";
        String[] newStr= str.split(" ");
        String finStr=" ";
        for (String w: newStr)
        {
            String revStr= " ";
            for (int i = w.length()-1; i >= 0; i--)
            {
                revStr += w.charAt(i);
            }
            finStr+=revStr+ " ";

        }
        System.out.println(finStr); //yM  eman  si  hsihsA

    }
}
