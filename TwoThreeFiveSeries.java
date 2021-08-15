public class TwoThreeFiveSeries {
    public static void main(String[]args)
    {
        int num,work_val;
        for(num=1 ; num<=100;  num++)
        {
            work_val=num;
            while(work_val%2==0)
                work_val=work_val/2;
            while(work_val%3==0)
                work_val=work_val/3;
            while(work_val%5==0)
                work_val=work_val/5;

            if(work_val == 1)
            {
                System.out.print(" "+num);
            }    
        }
    }
}
