public class Palindromic {
    public static void main(String[] args)
    {
        int input = 1221,rev_num=0,digit,copy;
        copy=input;
        while(input>0)
        {
            digit = input%10;
            rev_num = rev_num*10 + digit;
            input = input/10;
        }
        input=copy;
        if(rev_num==input)
        {
            System.out.println(input + " is a Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
    
}
