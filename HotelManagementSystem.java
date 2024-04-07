// HotelManagementSystem

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quant;
        int choice;

        // Quantity
        int Qrooms = 0, Qpasta = 0, Qburger = 0, Qnoodles = 0, Qshake = 0, Qchicken = 0;

        // Sold food items
        int Srooms = 0, Spasta = 0, Sburger = 0, Snoodles = 0, Sshake = 0, Schicken = 0;

        // Total process of item
        int Total_rooms = 0, Total_pasta = 0, Total_burger = 0, Total_noodles = 0, Total_shakes = 0, Total_chicken = 0;

        System.out.println("\n\t  Quantity of items we have");
        System.out.print("\n Rooms Available : ");
        Qrooms = scanner.nextInt();
        System.out.print("\n Quantity of pasta : ");
        Qpasta = scanner.nextInt();
        System.out.print("\n Quantity of burger : ");
        Qburger = scanner.nextInt();
        System.out.print("\n Quantity of noodles : ");
        Qnoodles = scanner.nextInt();
        System.out.print("\n Quantity of shake : ");
        Qshake = scanner.nextInt();
        System.out.print("\n Quantity of chicken : ");
        Qchicken = scanner.nextInt();

        while (true) {
            System.out.println("\n\t\t\t  please select from the menu option ");
            System.out.println("\n\n1) Rooms");
            System.out.println("\n\n2) pasta");
            System.out.println("\n\n3) burger");
            System.out.println("\n\n4) noodles");
            System.out.println("\n\n5) shakes");
            System.out.println("\n\n6) chicken-roll");
            System.out.println("\n\n7) info regarding sales and collection");
            System.out.println("\n\n8) Exit");

            System.out.print("\n\n  please enter your choice!");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\n\n enter the number of rooms you want: ");
                    quant = scanner.nextInt();
                    if (Qrooms - Srooms >= quant) {
                        Srooms = Srooms + quant;
                        Total_rooms = Total_rooms + quant * 1200;
                        System.out.println("\n\n\t\t" + quant + " room/rooms have been allotted to you !");
                    } else {
                        System.out.println("\n\tOnly " + (Qrooms - Srooms) + " Rooms remaining in the hotel");
                    }
                    break;

                case 2:
                    System.out.print("\n\n enter the Quantity of pasta you want: ");
                    quant = scanner.nextInt();
                    if (Qpasta - Spasta >= quant) {
                        Spasta = Spasta + quant;
                        Total_pasta = Total_pasta + quant * 250;
                        System.out.println("\n\n\t\t" + quant + " pasta is the order");
                    } else {
                        System.out.println("\n\tOnly " + (Qpasta - Spasta) + " pasta remaining in the hotel");
                    }
                    break;

                case 3:
                    System.out.print("\n\n enter the Quantity of burger you want: ");
                    quant = scanner.nextInt();
                    if (Qburger - Sburger >= quant) {
                        Sburger = Sburger + quant;
                        Total_burger = Total_burger + quant * 120;
                        System.out.println("\n\n\t\t" + quant + " burger is the order");
                    } else {
                        System.out.println("\n\tOnly " + (Qburger - Sburger) + " burger remaining in the hotel");
                    }
                    break;

                case 4:
                    System.out.print("\n\n enter the Quantity of noodles you want: ");
                    quant = scanner.nextInt();
                    if (Qnoodles - Snoodles >= quant) {
                        Snoodles = Snoodles + quant;
                        Total_noodles = Total_noodles + quant * 140;
                        System.out.println("\n\n\t\t" + quant + " noodles is the order");
                    } else {
                        System.out.println("\n\tOnly " + (Qnoodles - Snoodles) + " noodle remaining in the hotel");
                    }
                    break;

                case 5:
                    System.out.print("\n\n enter the Quantity of shakes you want: ");
                    quant = scanner.nextInt();
                    if (Qshake - Sshake >= quant) {
                        Sshake = Sshake + quant;
                        Total_shakes = Total_shakes + quant * 120;
                        System.out.println("\n\n\t\t" + quant + " shake is the order");
                    } else {
                        System.out.println("\n\tOnly " + (Qshake - Sshake) + " shake remaining in the hotel");
                    }
                    break;

                case 6:
                    System.out.print("\n\n enter the Quantity of chicken you want: ");
                    quant = scanner.nextInt();
                    if (Qchicken - Schicken >= quant) {
                        Schicken = Schicken + quant;
                        Total_chicken = Total_chicken + quant * 150;
                        System.out.println("\n\n\t\t" + quant + " chicken is the order");
                    } else {
                        System.out.println("\n\tOnly " + (Qchicken - Schicken) + " chicken remaining in the hotel");
                    }
                    break;

                case 7:
                    System.out.println("\n\t\t Details of sales and collection ");
                    System.out.println("\n\n Number of rooms we had : " + Qrooms);
                    System.out.println("\n\n Number of rooms we gave for rent : " + Srooms);
                    System.out.println("\n\n Remaining of  rooms : " + (Qrooms - Srooms));
                    System.out.println("\n\n Total rooms collection of the day: " + Total_rooms);

                    System.out.println("\n\n Number of pasta we had : " + Qpasta);
                    System.out.println("\n\n Number of pasta we gave for rent : " + Spasta);
                    System.out.println("\n\n Remaining of  pasta : " + (Qpasta - Spasta));
                    System.out.println("\n\n Total pasta collection of the day: " + Total_pasta);

                    System.out.println("\n\n Number of burger we had : " + Qburger);
                    System.out.println("\n\n Number of burger we gave for rent : " + Sburger);
                    System.out.println("\n\n Remaining of  burger : " + (Qburger - Sburger));
                    System.out.println("\n\n Total burger collection of the day: " + Total_burger);

                    System.out.println("\n\n Number of noodles we had : " + Qnoodles);
                    System.out.println("\n\n Number of noodles we gave for rent : " + Snoodles);
                    System.out.println("\n\n Remaining of  noodles : " + (Qnoodles - Snoodles));
                    System.out.println("\n\n Total noodles collection of the day: " + Total_noodles);

                    System.out.println("\n\n Number of shakes we had : " + Qshake);
                    System.out.println("\n\n Number of shakes we gave for rent : " + Sshake);
                    System.out.println("\n\n Remaining of  shakes : " + (Qshake - Sshake));
                    System.out.println("\n\n Total shakes collection of the day: " + Total_shakes);

                    System.out.println("\n\n Number of chicken we had : " + Qchicken);
                    System.out.println("\n\n Number of chicken we gave for rent : " + Schicken);
                    System.out.println("\n\n Remaining of  chicken : " + (Qchicken - Schicken));
                    System.out.println("\n\n Total chicken collection of the day: " + Total_chicken);
                    break;

                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nplease select the numbers mentioned above!");
            }
        }
    }
}
