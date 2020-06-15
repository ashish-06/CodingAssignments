/*
1. take input a number then use a while till that number becomes 0
2. use divide a number logic (find reminder and keep adding the remainder)
3. also keep diving the number from 10, so that everytime you get new last digit as remainder
4. put condition if number==0&& sum>9 then replace the number from the sum to repeat the process and put the sum value as 0.
 */
public class addNumberToSingleDigit
{
    public static void main(String[] args)
    {
        int number= 4673, sum=0, rem=0;
        while(number!=0)
        {
            rem=number%10;
            sum +=rem;
            number=number/10;

            if(number==0&&sum>9)
            {
                number= sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }
}
