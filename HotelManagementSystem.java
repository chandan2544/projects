import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant;
        int choice;

        // Quantity
        int Qrooms = 0, Qpasta = 0, Qburger = 0, Qnoodles = 0, Qshake = 0, Qchicken = 0;

        // Sold food items
        int Srooms = 0, Spasta = 0, Sburger = 0, Snoodles = 0, Sshake = 0, Schicken = 0;

        // Total process of item
        int Total_rooms = 0, Total_pasta = 0, Total_burger = 0, Total_noodles = 0, Total_shakes = 0, Total_chicken = 0;

        System.out.println("\n\tQuantity of items we have");
        System.out.print("\nRooms Available: ");
        Qrooms = sc.nextInt();
        System.out.print("\nQuantity of pasta: ");
        Qpasta = sc.nextInt();
        System.out.print("\nQuantity of burger: ");
        Qburger = sc.nextInt();
        System.out.print("\nQuantity of noodles: ");
        Qnoodles = sc.nextInt();
        System.out.print("\nQuantity of shake: ");
        Qshake = sc.nextInt();
        System.out.print("\nQuantity of chicken: ");
        Qchicken = sc.nextInt();

        while (true) {
            System.out.println("\n\t\t\tPlease select from the menu option");
            System.out.println("\n1) Rooms");
            System.out.println("2) Pasta");
            System.out.println("3) Burger");
            System.out.println("4) Noodles");
            System.out.println("5) Shakes");
            System.out.println("6) Chicken-roll");
            System.out.println("7) Info regarding sales and collection");
            System.out.println("8) Exit");

            System.out.print("\nPlease enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the number of rooms you want: ");
                    quant = sc.nextInt();
                    if (Qrooms - Srooms >= quant) {
                        Srooms = Srooms + quant;
                        Total_rooms = Total_rooms + quant * 1200;
                        System.out.println("\n\t" + quant + " room/rooms have been allotted to you!");
                    } else {
                        System.out.println("\nOnly " + (Qrooms - Srooms) + " Rooms remaining in the hotel");
                    }
                    break;

                case 2:
                    System.out.print("\nEnter the quantity of pasta you want: ");
                    quant = sc.nextInt();
                    if (Qpasta - Spasta >= quant) {
                        Spasta = Spasta + quant;
                        Total_pasta = Total_pasta + quant * 250;
                        System.out.println("\n\t" + quant + " pasta is the order");
                    } else {
                        System.out.println("\nOnly " + (Qpasta - Spasta) + " pasta remaining in the hotel");
                    }
                    break;

                case 3:
                    System.out.print("\nEnter the quantity of burger you want: ");
                    quant = sc.nextInt();
                    if (Qburger - Sburger >= quant) {
                        Sburger = Sburger + quant;
                        Total_burger = Total_burger + quant * 120;
                        System.out.println("\n\t" + quant + " burger is the order");
                    } else {
                        System.out.println("\nOnly " + (Qburger - Sburger) + " burger remaining in the hotel");
                    }
                    break;

                case 4:
                    System.out.print("\nEnter the quantity of noodles you want: ");
                    quant = sc.nextInt();
                    if (Qnoodles - Snoodles >= quant) {
                        Snoodles = Snoodles + quant;
                        Total_noodles = Total_noodles + quant * 140;
                        System.out.println("\n\t" + quant + " noodles is the order");
                    } else {
                        System.out.println("\nOnly " + (Qnoodles - Snoodles) + " noodles remaining in the hotel");
                    }
                    break;

                case 5:
                    System.out.print("\nEnter the quantity of shakes you want: ");
                    quant = sc.nextInt();
                    if (Qshake - Sshake >= quant) {
                        Sshake = Sshake + quant;
                        Total_shakes = Total_shakes + quant * 120;
                        System.out.println("\n\t" + quant + " shake is the order");
                    } else {
                        System.out.println("\nOnly " + (Qshake - Sshake) + " shakes remaining in the hotel");
                    }
                    break;

                case 6:
                    System.out.print("\nEnter the quantity of chicken you want: ");
                    quant = sc.nextInt();
                    if (Qchicken - Schicken >= quant) {
                        Schicken = Schicken + quant;
                        Total_chicken = Total_chicken + quant * 150;
                        System.out.println("\n\t" + quant + " chicken is the order");
                    } else {
                        System.out.println("\nOnly " + (Qchicken - Schicken) + " chicken remaining in the hotel");
                    }
                    break;

                case 7:
                    System.out.println("\n\tDetails of sales and collection");
                    System.out.println("\nNumber of rooms we had: " + Qrooms);
                    System.out.println("Number of rooms we gave for rent: " + Srooms);
                    System.out.println("Remaining rooms: " + (Qrooms - Srooms));
                    System.out.println("Total rooms collection of the day: " + Total_rooms);

                    System.out.println("----------------------------------------------");

                    System.out.println("\nNumber of pasta we had: " + Qpasta);
                    System.out.println("Number of pasta we gave: " + Spasta);
                    System.out.println("Remaining pasta: " + (Qpasta - Spasta));
                    System.out.println("Total pasta collection of the day: " + Total_pasta);

                    System.out.println("----------------------------------------------");

                    System.out.println("\nNumber of burger we had: " + Qburger);
                    System.out.println("Number of burger we gave: " + Sburger);
                    System.out.println("Remaining burger: " + (Qburger - Sburger));
                    System.out.println("Total burger collection of the day: " + Total_burger);

                    System.out.println("----------------------------------------------");

                    System.out.println("\nNumber of noodles we had: " + Qnoodles);
                    System.out.println("Number of noodles we gave: " + Snoodles);
                    System.out.println("Remaining noodles: " + (Qnoodles - Snoodles));
                    System.out.println("Total noodles collection of the day: " + Total_noodles);

                    System.out.println("----------------------------------------------");

                    System.out.println("\nNumber of shakes we had: " + Qshake);
                    System.out.println("Number of shakes we gave: " + Sshake);
                    System.out.println("Remaining shakes: " + (Qshake - Sshake));
                    System.out.println("Total shakes collection of the day: " + Total_shakes);

                    System.out.println("----------------------------------------------");

                    System.out.println("\nNumber of chicken we had: " + Qchicken);
                    System.out.println("Number of chicken we gave: " + Schicken);
                    System.out.println("Remaining chicken: " + (Qchicken - Schicken));
                    System.out.println("Total chicken collection of the day: " + Total_chicken);

                    System.out.println("----------------------------------------------");

                    int totalEaring = Total_rooms+Total_pasta+Total_burger+Total_noodles+Total_shakes+Total_chicken;
                    System.out.println("Total collection of the day: " + totalEaring);
                    
                    break;

                case 8:
                System.out.println("--Successfully Exit--");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nPlease select the numbers mentioned above!");
            }
        }
    }
}
