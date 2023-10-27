/* Hotel Management System */

#include <iostream>
using namespace std;

int main()
{
    int quant;
    int choice;

    // Quantity
    int Qrooms = 0, Qpasta = 0, Qburger = 0, Qnoodles = 0, Qshake = 0, Qchicken = 0;

    // Sold food items
    int Srooms = 0, Spasta = 0, Sburger = 0, Snoodles = 0, Sshake = 0, Schicken = 0;

    // Total process of item
    int Total_rooms = 0, Total_pasta = 0, Total_burger = 0, Total_noodles = 0, Total_shakes = 0, Total_chicken = 0;

    cout << "\n\t  Quantity of items we have";
    cout << "\n Rooms Available : ";
    cin >> Qrooms;
    cout << "\n Quantity of pasta : ";
    cin >> Qpasta;
    cout << "\n Quantity of burger : ";
    cin >> Qburger;
    cout << "\n Quantity of noodles : ";
    cin >> Qnoodles;
    cout << "\n Quantity of shake : ";
    cin >> Qshake;
    cout << "\n Quantity of chicken : ";
    cin >> Qchicken;

m:
    cout << "\n\t\t\t  please select from the menu option ";
    cout << "\n\n1) Rooms";
    cout << "\n\n2) pasta";
    cout << "\n\n3) burger";
    cout << "\n\n4) noodles";
    cout << "\n\n5) shakes";
    cout << "\n\n6) chicken-roll";
    cout << "\n\n7) info regarding sales and collection";
    cout << "\n\n8) Exit";

    cout << "\n\n  please enter your choice!";
    cin >> choice;

    switch (choice)
    {
    case 1:
        cout << "\n\n enter the number of rooms you want: ";
        cin >> quant;
        if (Qrooms - Srooms >= quant)
        {
            Srooms = Srooms + quant;
            Total_rooms = Total_rooms + quant * 1200;
            cout << "\n\n\t\t" << quant << " room/rooms have been alloted to you !";
        }
        else
        {
            cout << "\n\tOnly " << Qrooms - Srooms << " Rooms remaining in the hotel";
        }
        break; // Added 'break' to exit the switch case.

    case 2:
        // Similar changes as in case 1 for other cases.
        cout << "\n\n enter the Quantity of pasta you want: ";
        cin >> quant;
        if (Qpasta - Spasta >= quant)
        {
            Spasta = Spasta + quant;
            Total_pasta = Total_pasta + quant * 250;
            cout << "\n\n\t\t" << quant << " pasta is the order";
        }
        else
        {
            cout << "\n\tOnly " << Qpasta - Spasta << " pasta remaining in the hotel";
        }
        break;

    case 3:
        // Similar changes as in case 1 for other cases.
        cout << "\n\n enter the Quantity of burger you want: ";
        cin >> quant;
        if (Qburger - Sburger >= quant)
        {
            Sburger = Sburger + quant;
            Total_burger = Total_burger + quant * 120;
            cout << "\n\n\t\t" << quant << " burger is the order";
        }
        else
        {
            cout << "\n\tOnly " << Qburger - Sburger << " burger remaining in the hotel";
        }
        break;

    case 4:
        // Similar changes as in case 1 for other cases.
        cout << "\n\n enter the Quantity of noodles you want: ";
        cin >> quant;
        if (Qnoodles - Snoodles >= quant)
        {
            Snoodles = Snoodles + quant;
            Total_noodles = Total_noodles + quant * 140;
            cout << "\n\n\t\t" << quant << " noodles is the order";
        }
        else
        {
            cout << "\n\tOnly " << Qnoodles - Snoodles << " noodle remaining in the hotel";
        }
        break;

    case 5:
        // Similar changes as in case 1 for other cases.
        cout << "\n\n enter the Quantity of shakes you want: ";
        cin >> quant;
        if (Qshake - Sshake >= quant)
        {
            Sshake = Sshake + quant;
            Total_shakes = Total_shakes + quant * 120;
            cout << "\n\n\t\t" << quant << " shake is the order";
        }
        else
        {
            cout << "\n\tOnly " << Qshake - Sshake << " shake remaining in the hotel";
        }
        break;

    case 6:
        // Similar changes as in case 1 for other cases.
        cout << "\n\n enter the Quantity of chicken you want: ";
        cin >> quant;
        if (Qchicken - Schicken >= quant)
        {
            Schicken = Schicken + quant;
            Total_chicken = Total_chicken + quant * 150;
            cout << "\n\n\t\t" << quant << " chicken is the order";
        }
        else
        {
            cout << "\n\tOnly " << Qchicken - Schicken << " chicken remaining in the hotel";
        }
        break;

    case 7:
        cout << "\n\t\t Details of sales and collection ";
        cout << "\n\n Number of rooms we had : " << Qrooms;
        cout << "\n\n Number of rooms we gave for rent : " << Srooms;
        cout << "\n\n Remaining of  rooms : " << Qrooms - Srooms;
        cout << "\n\n Total rooms collection of the day: " << Total_rooms;

        cout << "\n\n Number of pasta we had : " << Qpasta;
        cout << "\n\n Number of pasta we gave for rent : " << Spasta;
        cout << "\n\n Remaining of  pasta : " << Qpasta - Spasta;
        cout << "\n\n Total pasta collection of the day: " << Total_pasta;

        cout << "\n\n Number of burger we had : " << Qburger;
        cout << "\n\n Number of burger we gave for rent : " << Sburger;
        cout << "\n\n Remaining of  burger : " << Qburger - Sburger;
        cout << "\n\n Total burger collection of the day: " << Total_burger;

        cout << "\n\n Number of noodles we had : " << Qnoodles;
        cout << "\n\n Number of noodles we gave for rent : " << Snoodles;
        cout << "\n\n Remaining of  noodles : " << Qnoodles - Snoodles;
        cout << "\n\n Total noodles collection of the day: " << Total_noodles;

        cout << "\n\n Number of shakes we had : " << Qshake;
        cout << "\n\n Number of shakes we gave for rent : " << Sshake;
        cout << "\n\n Remaining of  shakes : " << Qshake - Sshake;
        cout << "\n\n Total shakes collection of the day: " << Total_shakes;

        cout << "\n\n Number of chicken we had : " << Qchicken;
        cout << "\n\n Number of chicken we gave for rent : " << Schicken;
        cout << "\n\n Remaining of  chicken : " << Qchicken - Schicken;
        cout << "\n\n Total chicken collection of the day: " << Total_chicken;
        break;

    case 8:
        exit(0);
        break;

    default:
        cout << "\nplease select the numbers mentioned above!";
    }
    goto m;
}
