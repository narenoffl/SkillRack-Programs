import java.util.*;

public class MinDigit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int min_digit = 10;
        int digit;

        while(input>0)
        {
            digit = input%10;
            if(digit < min_digit){
                min_digit = digit;
            }
            input = input/10;
        }
        System.out.println(min_digit);
        sc.close();
    }   
}
