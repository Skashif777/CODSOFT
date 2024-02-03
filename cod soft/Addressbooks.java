package addressbook;
import java.util.Scanner;

class Addressbooks
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //create a table to hold information

        String[][] addressbooks = new String[100][8];

        addressbooks[0][0]="Mobile Number";
        addressbooks[0][1]="First Name";
        addressbooks[0][2]="Last Name";
        addressbooks[0][3]="Address";
        addressbooks[0][4]="City";
        addressbooks[0][5]="County";
        addressbooks[0][7]="Telephone Number";

        //pre-populate address book for testing purposes and records

        addressbooks[1][0]="1";
        addressbooks[1][1]="kashif";
        addressbooks[1][2]="imtiyaz";
        addressbooks[1][3]="hussain, syaeed";
        addressbooks[1][4]="king";
        addressbooks[1][5]="dubai";
        addressbooks[1][6]="086-1581077";
        addressbooks[1][7]="098-45368";

        addressbooks[2][0]="2";
        addressbooks[2][1]="Mc";
        addressbooks[2][2]="lovin";
        addressbooks[2][3]="Hawaii";
        addressbooks[2][4]="Hawaii";
        addressbooks[2][5]="Hawaii";
        addressbooks[2][6]="12345";
        addressbooks[2][7]="412-555-1234";

        //menu options
        System.out.print("Welcome to my Address book!");
        System.out.print("\n");
        System.out.print("\n1 - Insert a New Contact \n2 - Search Contact by Last Name \n3 - Delete Contact \n4 - Show All Contacts \n5 - Exit " );
        System.out.print("\n");
        System.out.print("\nChoose your option: ");

        int option = input.nextInt();

        if (option ==1)
        {
            System.out.print("\nPlease enter your First Name : ");
        }
        if (option ==2)
        {
        }

        if (option ==3)
        {
        }

        if (option ==4)
        {
        System.out.println(addressbooks[1][0]+
        "\t"+addressbooks[1][2]+ ", "+addressbooks[1][1]+
        "\n\t"+addressbooks[1][3]+
        "\n\t"+addressbooks[1][4]+ ", "+addressbooks[1][5]+ " "+addressbooks[1][6]+
        "\n\t"+addressbooks[1][7]);
        }

        if (option ==5)
        {
        }

    }
}