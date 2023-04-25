import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        int balance = 1000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automatic Teller Machine");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Transition History");
            System.out.println("Choose 4 for Transfer");
            System.out.println("Choose 5 for Quit");
            System.out.println("Choose the operation you want to perform");

            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter money to withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;

                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;

                    System.out.println("Your money has been successfully deposited");
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);

                default:
                    break;
            }

        }
    }

}
