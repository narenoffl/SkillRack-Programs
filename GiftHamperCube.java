import java.util.*;

public class GiftHamperCube {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int total_products = sc.nextInt();
        int price;
        int total_price = 0;

        for(int i=1;i<=total_products;i++)
        {
            price = sc.nextInt();
            total_price = total_price + price;
            
        }
        
        int num;
        for(num=1;num*num*num<total_price;num++); // will check till the total price

            if(num*num*num == total_price){
                System.out.println("Yes");
            }
            else{
                System.out.print((num*num*num)-total_price);
            }
        
           
        sc.close();

    }
}
