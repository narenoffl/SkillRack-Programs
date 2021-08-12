// To fing the start day of the given year

public class StartDay {
    public static void main(String[]args) {
        int startDay,startYear,targetYear,tempYear,targetDay;
        startDay = 1;
        startYear = 1990;
        targetYear = 2021;
        targetDay = startDay;

        for(tempYear = startYear+1; tempYear <= targetYear; tempYear++)
        {
            targetDay += (tempYear%4 == 0 && tempYear%100 != 0) || tempYear%400 == 0 ? 2 : 1;

            if(targetDay > 7){
                targetDay -= 7;
            }

            switch(targetDay)
            {
                case 1 :
                    System.out.println("Monday");
                    break;
                case 2 :
                    System.out.println("Tuesday");
                    break; 
                case 3 :
                    System.out.println("Wednesday");
                    break;
                case 4 :
                    System.out.println("Thursday");
                    break;
                case 5 :
                    System.out.println("Friday");
                    break;
                case 6 :
                    System.out.println("Saturday");
                    break;
                case 7 :
                    System.out.println("Sunday");
                    break;                   
            }
        }
    }
}
