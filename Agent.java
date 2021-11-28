import java.util.Scanner;

public class Agent extends Client {

    // Scanner in Agent.java - redundant as Agent inherits what's in Client.java
    public static Scanner scan = new Scanner(System.in);

    // Crypto Prices in USD
    protected float BTCPrice = 52284.95f;
    protected float DOTPrice = 34.5f;
    protected float KSMPrice = 400.2f;

    // Crypto Price List Function
    protected void CryptoPrices() {

        System.out.println("BTC price today is: " + BTCPrice);

    }

    // BTC Agent Functions -----------------------

    // Agent Buy
    void AgentBuyBTC() {
        System.out.print("How much BTC would you like to buy today?");
        float amount = scan.nextFloat();
        if ((amount * BTCPrice) <= ClientUSDBalance) {
            ClientUSDBalance = ClientUSDBalance - (amount * BTCPrice);
            ClientBTCBalance = ClientBTCBalance + amount;
        } else {
            System.err.println("Transaction cancelled due to insufficient funds available");
        }
    }

    // Agent Sell
    void AgentSellBTC() {
        System.out.print("How much BTC would you like to sell today? \n");
        float amount = scan.nextFloat();
        if (amount <= ClientBTCBalance) {
            ClientBTCBalance = ClientBTCBalance - amount;
            ClientUSDBalance = ClientUSDBalance + (amount * BTCPrice);
        } else {
            System.err.println("Transaction cancelled due to insufficient funds available");
        }
    }

    void AgentBuyDOT() {
        System.out.print("How much DOT would you like to buy today?");
        float amount = scan.nextFloat();
        if ((amount * DOTPrice <= ClientUSDBalance)) {
            ClientUSDBalance = ClientUSDBalance - (amount * DOTPrice);
            ClientBTCBalance = ClientDOTBalance + amount;
        } else {
            System.err.println("Transaction cancelled due to insufficient funds available");
        }
    }

    void AgentSellDOT() {
        System.out.print("How much DOT would you like to sell today? \n");
        float amount = scan.nextFloat();
        if (amount <= ClientDOTBalance) {
            ClientDOTBalance = ClientDOTBalance - amount;
            ClientUSDBalance = ClientUSDBalance + (amount * DOTPrice);
        } else {
            System.err.println("Transaction cancelled due to insufficient funds available");
        }
    }

    void AgentBuyKSM() {
        System.out.print("How much KSM would you like to buy today?");
        float amount = scan.nextFloat();
        if ((amount * KSMPrice <= ClientUSDBalance)) {
            ClientUSDBalance = ClientUSDBalance - (amount * KSMPrice);
            ClientKSMBalance = ClientKSMBalance + amount;
        } else {
            System.err.println("Transaction cancelled due to insufficient funds available");
        }
    }

    void AgentSellKSM() {
        System.out.print("How much KSM would you like to sell today? \n");
        float amount = scan.nextFloat();
        if (amount <= ClientKSMBalance) {
            ClientKSMBalance = ClientKSMBalance - amount;
            ClientUSDBalance = ClientUSDBalance + (amount * KSMPrice);
        } else {
            System.err.println("Transaction cancelled due to insufficient funds available");
        }
    }

    // Price Lookup
    void AgentPriceLookUpBTC() {
        System.out.println("The current price of 1 BTC is: " + "$" + BTCPrice + " USD");
    }

}
