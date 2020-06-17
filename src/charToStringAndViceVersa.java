public class charToStringAndViceVersa
{
    public static void main(String[] args)
    {
        char[] ch= {'A','S','H','I','S','H'};
        //String s= ch.toString();
        //System.out.println(ch); //ASHISH
        String str= "Ashish Singh";
        char[] chr=str.toCharArray();
        System.out.println(chr); //Ashish Singh

    }
}
