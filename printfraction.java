import java.util.*;
public class printfraction{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two inputs");
        int num = sc.nextInt();
        int den = sc.nextInt();
        int quo = num/den;
        int rem = num%den;
        System.out.println(quo);
        if(rem>0)
        {
            System.out.println(" "+quo + rem);
        }

        sc.close();
    }
}