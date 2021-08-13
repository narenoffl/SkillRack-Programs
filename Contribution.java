public class Contribution {
    public static void main(String[]args)
    {
        int input = 100;
        int contribute = 5;

        while(input%contribute == 0){
            input = input / contribute;
        }
        System.out.print(input);
    }
}
