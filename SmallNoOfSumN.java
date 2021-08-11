//Find the smallest number such that the sum of digits is N and divisible by 10^N
import java.util.*;

public class SmallNoOfSumN {
    public static void main(String []args)
    {
        Scanner var = new Scanner(System.in);
        int n = var.nextInt();
        int rem,quo,ctr;
        rem = n%9;
        if(rem != 0){
            System.out.print(rem);
        }
        quo = n/9;
        for(ctr=0; ctr<quo; ctr++)
        {
            System.out.print("9");
        }
         for(ctr=0; ctr<n; ctr++)
         {
             System.out.print("0");
         }

        //sc.close();

    }
}
