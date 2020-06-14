public class reverseString
{

    public static void main(String[] args)
    {
        String str = "My name is Ashish";
        String[] words= str.split(" ");
        String revString = " ";

        for (String w:words)
        {
            String revWords= " ";
            for (int i=w.length()-1;i>=0; i--)
            {
                revWords=revWords+w.charAt(i);
            }
            revString = revString + revWords + " ";
        }
        System.out.println(revString); //yM  eman  si  hsihsA
    }


}
