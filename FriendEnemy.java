public class FriendEnemy {
    public static void main(String[]args)
    {
        int n1,n2,small,flag=0,control;
        n1 = 46;
        n2 = 26;
        small = n1 < n2 ? n1 : n2;
        for(control = 2; control <= small; control++)
        {
            if(n1 % control == 0 && n2 % control == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(n1+" and "+n2+ " are best friends");
        }
        else
        {
            System.out.println(n1+" and "+n2+ " are enemies");
        }
    }
}
