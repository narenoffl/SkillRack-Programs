//To show the given input belongs to 2 powers or not

public class TwoPowers {
    public static void main(String[] args)
    {
        int n = 1024;
        int base = 2;
        int rem,sumofrem=0;
        while(n != 0)
        {
            rem = n%base;
            sumofrem += rem;
            n /= base;
        }

        if(sumofrem == 1)
        {
            System.out.println("It is the power of 2");
        }
        else{
            System.out.println("It is not the power of 2");
        }
    }
}
