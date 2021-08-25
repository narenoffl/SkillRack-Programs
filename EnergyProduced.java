import java.util.*;

public class EnergyProduced {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int current_energy,initial_energy,times,rate;
        initial_energy = sc.nextInt();
        times = sc.nextInt();
        rate = sc.nextInt();

        current_energy = initial_energy;
        System.out.println("Current Energy : "+current_energy);

        for(int ctr = 1;ctr<times;ctr++)
        {
            current_energy = current_energy*rate;
            System.out.println("Current energy after process : "+current_energy);
        }

        sc.close();
    }
}
