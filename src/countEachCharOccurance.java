/*{@=2, b=1, d=1, $=2, D=1, %=2, &=2, F=1, g=1, G=2, h=2, H=1, *=2, L=2, m=2, M=1, O=2, R=1, T=1, v=1, z=2}
1. take string as input
2. split that string into an array of character using split()
3. Use hashmap (it stores unique value)
 */

import java.util.HashMap;

public class countEachCharOccurance
{
    public static void main(String[] args)
    {
        charCount("zmzmbvhdgh@%$@%$*&&*MLOOLGGTHFDR");
    }
    static void charCount(String str)
    {
        String[] str1=str.split("");

        HashMap <String, Integer> hm = new HashMap<String, Integer>();
        for(String tempStr: str1)
        {
            if(hm.get(tempStr)!=null)
            {
                hm.put(tempStr,hm.get(tempStr)+1);
            }
            else hm.put(tempStr,1);

        }
        System.out.println(hm);

    }
}
