import java.util.*;

public class EmployeeDistance {
    public static void main(String[]args)
    {
        Scanner sc =  new Scanner(System.in);
        int total_inputs,start_range,end_range,value,abs_value,res_flag=0;
        total_inputs = sc.nextInt();
        start_range = sc.nextInt();
        end_range = sc.nextInt();

        for(int ctr=1; ctr<=total_inputs;ctr++)
        {
            value = sc.nextInt();

            if(value<0)
            {
                abs_value = value*(-1);
            }
            else{
                abs_value = value;
                
            }

            if(abs_value>=start_range && abs_value<=end_range)
            {
                System.out.println("Value: "+value);
                res_flag = 1;
            }
        }

        if(res_flag == 0)
        {
            System.out.println("1");
        }
        sc.close();
    }
}
