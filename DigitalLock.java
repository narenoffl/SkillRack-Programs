import java.util.*;

public class DigitalLock {
    public static void main(String args[])
        {
            int input, no_of_digits = 0, copy, digit, raised_val, sum, even_digit_sum, odd_digit_sum;
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            copy = input;
            while(input > 0)
            {
                no_of_digits++;
                input = input/10;
            }
            input = copy;
            sum = 0;
            even_digit_sum = 0;
            odd_digit_sum = 0;
            while(input > 0)
            {
                digit = input % 10;
                input = input / 10;
                raised_val = powerRaiser(digit, no_of_digits);
                sum = sum + raised_val;
                if(digit % 2 == 0)
                 even_digit_sum = even_digit_sum + digit;
                else 
                 odd_digit_sum = odd_digit_sum + digit;
            }
            input = copy;
            if(input == sum)
             System.out.println(even_digit_sum);
            else 
             System.out.println(odd_digit_sum);

             sc.close();
        }

        

        public static int powerRaiser(int num, int no_times)
        {
            int ctr, power_val = 1;
            for(ctr = 1; ctr<=no_times; ctr++)
            {
                power_val = power_val*num;
            }
            return power_val;
        }
}
