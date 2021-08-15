public class ReverseNum {
    public static void main(String []args) {
        int input = 6513,digit,rev_num=0;
        while(input > 0)
        {
            digit = input%10;
            rev_num = rev_num*10 + digit;
            input = input/10;
        }
        System.out.print(rev_num);
    }
}
