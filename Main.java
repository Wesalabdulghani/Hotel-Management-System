package hotelmanagementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel() ;
        int ch, ch2;

        char wish;

        x:

        do {

            System.out.println("\nEnter your choice :\n1.Display room availability \n2.Book\n3.Order food\n4.Checkout\n5.Exit\n");
            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    hotel.availability();
                    break;
                case 2:
                    hotel.bookroom();
                    break;
                case 3:
                    System.out.print("Room Number -");
                    ch2 = sc.nextInt();
                    if (ch2 > 60) {
                        System.out.println("Room doesn't exist");
                    } else if (ch2 > 40) {
                        hotel.order(ch2 - 41, 4);
                    } else if (ch2 > 30) {
                        hotel.order(ch2 - 31, 3);
                    } else if (ch2 > 10) {
                        hotel.order(ch2 - 11, 2);
                    } else if (ch2 > 0) {
                        hotel.order(ch2 - 1, 1);
                    } else {
                        System.out.println("Room doesn't exist");
                    }
                    break;
                case 4:
                    System.out.print("Room Number -");
                    ch2 = sc.nextInt();
                    if (ch2 > 60) {
                        System.out.println("Room doesn't exist");
                    } else if (ch2 > 40) {
                        hotel.deallocate(ch2 - 41, 4);
                    } else if (ch2 > 30) {
                        hotel.deallocate(ch2 - 31, 3);
                    } else if (ch2 > 10) {
                        hotel.deallocate(ch2 - 11, 2);
                    } else if (ch2 > 0) {
                        hotel.deallocate(ch2 - 1, 1);
                    } else {
                        System.out.println("Room doesn't exist");
                    }
                    break;
                case 5:
                    break x;

            }

            System.out.println("\nContinue : (y/n)");
            wish = sc.next().charAt(0);
            if (!(wish == 'y' || wish == 'Y' || wish == 'n' || wish == 'N')) {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                wish = sc.next().charAt(0);
            }

        } while (wish == 'y' || wish == 'Y');

    }

}
