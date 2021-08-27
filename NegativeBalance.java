import java.util.*;

public class NegativeBalance {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int customers = sc.nextInt();
        int neg_bal = 0;
        int balance;

        for(int ctr = 1; ctr<=customers; ctr++)
        {
            balance = sc.nextInt();
            if(balance<0){
                neg_bal++;
            }
        }
        System.out.println(neg_bal);
        sc.close();
    }
}
