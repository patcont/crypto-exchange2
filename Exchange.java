import java.util.Scanner;

public class Exchange {
    public static Scanner scan = new Scanner(System.in);
    public static Agent a = new Agent();

    public static void main(String[] args) {

        System.out.println("Welcome");
        System.out.println("");

        // Input Customer Name to bring up menu
        a.InputCustomerName();
        a.PrintCustomerName();
        System.out.println("");

        // Main Menu
        System.out.println("");
        while (true) {

            int choice;

            {
                System.out.println("Welcome to the No Fee Crypto Exchange" + " " + a.PrintCustomerName() + "\n");
                System.out.println("Main Menu\n");
                System.out.print("1. Check your balances \n");
                System.out.print("2. Check today's crypto prices \n");
                System.out.print("3. Buy BTC \n");
                System.out.print("4. Sell BTC \n");
                System.out.print("13. Exit \n");
                System.out.print("");
                System.out.print("\n Please Enter Your Menu Choice: ");

                // Recording Customer Selection
                choice = scan.nextInt();

                switch (choice) {
                case 1:
                    // Check Your Balances
                    currentBalance();
                    System.out.println("");
                    pushEnter();
                    break;
                case 2:
                    // Check today's crypto prices
                    a.CryptoPrices();
                    System.out.println("");
                    pushEnter();
                    break;
                case 3:
                    a.AgentBuyBTC();
                    System.out.println("");
                    currentBalance();
                    System.out.println("");
                    pushEnter();
                    break;
                case 4:
                    a.AgentSellBTC();
                    System.out.println("");
                    currentBalance();
                    System.out.println("");
                    pushEnter();
                    break;

                default:
                    System.out.print("Option not valid, please try another option");
                    break;
                }

            }
        }

    }

    public static void currentBalance() {
        // Customer Balances
        System.out.println(a.PrintCustomerName() + "'s current balances are: ");
        System.out.println("USD Balance = $" + a.ClientUSDBalance() + " USD");
        System.out.println("BTC Balance = " + a.ClientBTCBalance() + " BTC" + " or " + " $"
                + (a.ClientBTCBalance() * a.BTCPrice) + " USD");

    }

    public static void pushEnter() {
        System.out.println("");
        System.out.println("Press Enter to continue...");
        Scanner input = new Scanner(System.in);
        String cont = input.nextLine();
        while (cont.equals(" ")) {
            cont = input.nextLine();
        }

    }

}
