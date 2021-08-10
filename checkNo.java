// Given input - check that the range of odd numbers and even numbers should be squared and cubed respectively

import java.util.*;
public class checkNo{
    public static void main(String[] args){
        int num, N;
        N = 21;
        for(num=1; num<=N; num++)
        {
            if(num%2==0){
                System.out.print(" "+num*num*num);
            }
            else{
                System.out.print(" "+num*num);
            }
        }
    }
}