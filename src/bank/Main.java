package bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PinCode pinCode = new PinCode();

        pinCode.askNumberOfCard();

        pinCode.askPinCode();

        OperationsWithMoney operationsWithMoney = new OperationsWithMoney();
        System.out.println("Choose what operation you want to do: 1 - BALANCE," +
                " 2 - ADD MONEY, 3 - TAKE MONEY, etc - EXIT");
        Scanner inputAnswer = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            int answer = inputAnswer.nextInt();
            switch (answer) {
                case 1:
                    operationsWithMoney.checkMoney();
                    System.out.println("Anything else?");
                    break;
                case 2:
                    operationsWithMoney.addMoney();
                    System.out.println("Anything else?");
                    break;
                case 3:
                    operationsWithMoney.takeMoney();
                    System.out.println("Anything else?");
                    break;
                default:
                    System.out.println("GOODBYE");
                    System.exit(0);
            }
        }
    }
}