
package ex3_10;

import java.util.Scanner;


public class Ex3_10 {

    
    public static void main(String[] args) {
         
        System.out.println("I can tell you how many days are in  month.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number between 1 to 12 representing a month in the year: ");
        int month = keyboard.nextInt();

        switch (month)
        {
        case 1:
            System.out.println("  31 days in Januaray ");
            break;
        case 2:
            System.out.println(" 28 days in Febuarary ");
            break;
        case 3:
            System.out.println(" 31 days in March ");
            break;
        case 4:
            System.out.println(" 30 days in April ");
            break;
        case 5:
            System.out.println(" 31 days in May ");
            break;
        case 6:
            System.out.println(" 30 days in June ");
            break;
        case 7:
            System.out.println(" 31 days in July ");
            break;
        case 8:
            System.out.println(" 31 days in Auguest ");
            break;
        case 9:
            System.out.println(" 30 days in September ");
            break;
        case 10:
            System.out.println(" 31 days in October ");
            break;
        case 11:
            System.out.println(" 30 days in November ");
            break;
        case 12:
            System.out.println(" 31 days in December ");
            break;
        default:
            System.out.println(" which is invalid. ");
            break;
        }
    }
    
}
