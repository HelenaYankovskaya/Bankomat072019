package bank;

import java.util.Scanner;

public class OperationsWithMoney {


    private static int value1 = 5000;
    private static int value = 0;
    private static int allCardMoney = 0;
    private static int moneyInBancomat = 50000;


    public void checkMoney() {
        System.out.println("Your cardBalance is: " + value1 + " Dollars");
    }

    public void addMoney() {
        System.out.println("Enter the amount you want to add to the card: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        boolean flag1 = false;
        while (!flag1) {
            if (value > 1000000) {
                System.out.println("Amount must be less then 1 000 000 Dollars");
                value = input.nextInt();
            } else {
                allCardMoney = value1 + value;
                System.out.println("Adding is success. Now You have " + allCardMoney + " Dollars");
                value1 = allCardMoney;
                flag1 = true;
            }
        }
    }

    static void takeMoney() {
        System.out.println("Enter the amount you want to take: ");
        Scanner input1 = new Scanner(System.in);
        int summa = input1.nextInt();
        boolean flag = false;
        while (!flag) {
            if (summa > value1) {
                System.out.println("Not enough money on the card)");
                flag = false;
                summa = input1.nextInt();
            } else {
                if (summa > moneyInBancomat) {
                    System.out.println("The limit of money  is " + moneyInBancomat);
                    flag = false;
                    summa = input1.nextInt();
                } else {
                    flag = true;
                    int rest = value1 - summa;
                    System.out.println("Success. The rest in card  is: " + rest + " Dollars");
                    value1 = rest;
                    break;
                }
            }
        }
    }
}
