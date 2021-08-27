import java.util.*;

public class ProdDiscount {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int no_of_products = sc.nextInt();
        int discount = sc.nextInt();
        int discount_count = 0;
        for(int ctr=1; ctr<=no_of_products; ctr++)
        {
            int product = sc.nextInt();
            if(product>0 && discount%product == 0)
            {
                discount_count++;
            }
        }

        System.out.println(discount_count);
        sc.close();
    }
}
