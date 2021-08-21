//To find out running,walking,jogged numbers

public class TypesNumbers {
    public static void main(String[]args)
    {
        int num,diff,d1,d2;
        num = 1233;
        d1 = num%10;
        num /= 10;
        d2 = num%10;
        num /=10;
        diff = d2-d1;
        do{
            d1 = d2;
            d1 = num%10;
            num /= 10;
        }
        while(num != 0 && (d2-d1) == diff);
        {
            if(num != 0)
            {
                System.out.println("Jogged");
            }
            else if(diff == 1)
            {
                System.out.println("Walking");
            }
            else{
                System.out.println("Jagged");
            }
        }
    }
}
