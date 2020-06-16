/*
1. take a number as input
2. divide that number from to num-1, if we get remainder as 0 then its not a prime number
 */
public class primeNumber
{
    public static void main(String[] args)
    {
        checkPrime(99);
    }
    static void checkPrime(int num)
    {
        Boolean status= true;
        for (int i=num-1;i>2;i--)
        {
            if(num%i==0)
            {
                status=false;
            }
        }
        if (status==true)
        {
            System.out.println(num+ " is a prime number");
        }
        else
        {
            System.out.println(num+ " is not a prime number");
        }
    }
}
