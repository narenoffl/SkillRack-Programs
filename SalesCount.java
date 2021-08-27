import java.util.*;

public class SalesCount{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int salesCount = sc.nextInt();
        if(salesCount <= 50){      
        System.out.println("D");
        }
        else if(salesCount<=60){
        System.out.println("C");
        }
        else if(salesCount<=80){

        System.out.println("B");
        }
        else if(salesCount<=100){
            System.out.println("A");

          sc.close();  
    }
}
}