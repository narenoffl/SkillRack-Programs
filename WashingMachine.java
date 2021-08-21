//To check whether washing machine weight load

import java.util.*;

public class WashingMachine {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int weight_load = sc.nextInt();

        if(weight_load <=0)
        {
            System.out.println("Time estimated : 0 minutes");
        }
        else if(weight_load <= 2000)
        {
            System.out.println("Time estimated : 25 minutes");
        }
        else if(weight_load <= 4000)
        {
            System.out.println("Time estimated : 35 minutes");
        }
        else if(weight_load <= 7000)
        {
            System.out.println("Time estimated : 45 minutes");
        }
        else{
            System.out.println("Overload");
        }

        sc.close();
    }
}
