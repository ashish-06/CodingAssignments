/*
to check the leap year, below are the two conditions that must be followed:
1. year%400==0
or
2. year%4==0 && year%100!=0
 */

public class leapYear
{
    public static void main(String[] args)
    {
        isLeapyear(2020);

    }
    static void isLeapyear(int year)
    {
        if((year%400==0 )|| (year%4==0 && year%100!=0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" not leap year");
        }

    }
}
