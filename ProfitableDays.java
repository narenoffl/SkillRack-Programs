import java.util.*;

public class ProfitableDays {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int no_of_days = sc.nextInt();
        int sales;
        int no_of_profit_days = 0;

        for(int ctr=1; ctr<=no_of_days; ctr++)
        {
            sales = sc.nextInt();
            if(sales>0)
            {
                no_of_profit_days++;
            }
        }
        System.out.println("No of profit days : "+no_of_profit_days);

        sc.close();
    }
}
