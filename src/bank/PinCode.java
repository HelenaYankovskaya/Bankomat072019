package bank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCode {

    public static String fileName = "C:/Users/N/IdeaProjects/ATM2019/Bankomat072019/a.txt";

    static void askNumberOfCard() {

        System.out.println("Please, enter number of your card. It must have next format: XXXX-XXXX-XXXX-XXXX");
        boolean cardNumberFlag = false;
        while (!cardNumberFlag) {
            Scanner scan = new Scanner(System.in);
            String cardNumber = scan.next().trim();
            Pattern p = Pattern.compile("^\\d{4}([-]|)\\d{4}([-]|)\\d{4}([-]|)\\d{4}$");
            Matcher m = p.matcher(cardNumber);
            if (m.find()) {
                System.out.println("Success");
                String text = cardNumber.replaceAll("-", " ");
                Filetxt file = new Filetxt();
                file.write(fileName, text);
                cardNumberFlag = true;
            } else {
                System.out.println(m.find());
                System.out.println("Format of number of card is NOT CORRECT. Try one more time, please");
            }
        }
    }

    static void askPinCode() {
        System.out.println("Please, enter PIN of your card:");
        Scanner scan = new Scanner(System.in);
        String pinCode = "0026";
        for (int i = 1; i <= 3; i++) {
            if (pinCode.equals(scan.next().trim())) {
                System.out.println("Success");
                Filetxt file1 = new Filetxt();
                file1.write(fileName, pinCode);
                break;
            } else {
                if (i != 3) {
                    System.out.println("Wrong Password");
                } else {
                    System.out.println("Card is Locked for 24 hours");
                    System.exit(0);
                }
            }
        }
    }
}