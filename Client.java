import java.util.Scanner;

public class Client {

    // Scanner Set up in Client.java
    public static Scanner scan = new Scanner(System.in);

    // Customer's Starting Currency balances
    float ClientUSDBalance = 5000000.00f;
    float ClientBTCBalance = 0.00f;
    float ClientDOTBalance = 0.00f;
    float ClientKSMBalance = 0.00f;

    public String CustomerName;

    // Function for inputting Cx name
    public void InputCustomerName() {
        System.out.println("Please enter your name");
        CustomerName = scan.nextLine();
    }

    public String PrintCustomerName() {
        return CustomerName;
    }

    public float ClientUSDBalance() {
        return ClientUSDBalance;

    }

    public float ClientBTCBalance() {
        return ClientBTCBalance;
    }

    public float ClientDOTBalance() {
        return ClientDOTBalance;
    }

    public float ClientKSMBalance() {
        return ClientKSMBalance;
    }
}
