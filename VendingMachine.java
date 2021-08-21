//Vending Machine

import java.util.*;
public class VendingMachine {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        char main_menu = sc.next().charAt(0);
        int sub_choice = sc.nextInt();

        switch(main_menu)
        {
            case 'c':
            case 'C':
                switch(sub_choice){
                    case 1:
                    System.out.println("Welcome to CCD\n Enjoy your Espresso Coffee");
                    break;

                    case 2:
                    System.out.println("Welcome to CCD\n Enjoy your Cappucino Coffee");
                    break;

                    case 3:
                    System.out.println("Welcome to CCD\n Enjoy your Latte Coffee");
                    break;

                    default:
                    System.out.println("Invalid Input");
                    break;
                }
                break;

             case 't':
             case 'T':
                switch(sub_choice) 
                {
                    case 1:
                    System.out.println("Welcome to CCD\n Enjoy your Plain Tea");
                    break;

                    case 2:
                    System.out.println("Welcome to CCD\n Enjoy your Assam Tea");
                    break;

                    case 3:
                    System.out.println("Welcome to CCD\n Enjoy your Ginger Tea");
                    break;

                    case 4:
                    System.out.println("Welcome to CCD\n Enjoy your Cardamom Tea");
                    break;

                    case 5:
                    System.out.println("Welcome to CCD\n Enjoy your Masala Tea");
                    break;

                    case 6:
                    System.out.println("Welcome to CCD\n Enjoy your Lemon Tea");
                    break;

                    case 7:
                    System.out.println("Welcome to Organic Darjeeling Tea");
                    break;

                    default:
                    System.out.println("Invalid Input");
                }  
                break;

            case 's':
            case 'S':
                switch(sub_choice){
                    case 1:
                    System.out.println("Welcome to CCD\n Enjoy your Hot and Sour Soup");
                    break;

                    case 2:
                    System.out.println("Welcome to CCD\n Enjoy your Veg Corn Soup");
                    break;

                    case 3:
                    System.out.println("Welcome to CCD\n Enjoy your Tomato Soup");
                    break;

                    case 4:
                    System.out.println("Welcome to CCD\n Enjoy your Spicy Tomato Soup");
                    break;

                    default:
                    System.out.println("Invalid Input");
                }    
                break;

            case 'd':
            case 'D':
                switch(sub_choice)
                {
                    case 1:
                    System.out.println("Welcome to CCD\n Enjoy your Badam Drink");
                    break;

                    case 2:
                    System.out.println("Welcome to CCD\n Enjoy your Pista Drink");
                    break;

                    case 3:
                    System.out.println("Welcome to CCD\n Enjoy your Rose Milk");
                    break;

                    default:
                    System.out.println("Invalid Input");
                    break;
                }    
                break;

            default:
            System.out.println("Invalid Input");    
        }

        sc.close();
    }
}
