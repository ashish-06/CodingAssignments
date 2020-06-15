//Ashish is name My
public class revString3
{
    public static void main(String[] args)
    {
        String str = "My name is Ashish";
        String[] newStr = str.split(" ");
        String tempStr= " ";
        for (int i=newStr.length-1;i >=0;i--)
        {
            tempStr += newStr[i] + " ";
        }
        System.out.println(tempStr);
    }
}
