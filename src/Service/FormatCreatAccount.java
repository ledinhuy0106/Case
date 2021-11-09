package Service;
import model.Regex;

import java.util.Scanner;

public class FormatCreatAccount {
    public static String inputPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        String clientPhoneNumber;
        boolean invalidPhoneNUmber;
        do {
            System.out.print("Enter client phone number: ");
            clientPhoneNumber = scanner.nextLine();
            invalidPhoneNUmber = Regex.validate(clientPhoneNumber, Regex.PHONE_NUMBER_REGEX);
            if (invalidPhoneNUmber) System.out.println("Wrong format of phone number. ");
        } while (invalidPhoneNUmber);
        return clientPhoneNumber;
    }

    public static String inputClientAccount() {
        Scanner scanner = new Scanner(System.in);
        String clientAccount;
        boolean invalidAccount;
        do {
            System.out.print("Enter new account: ");
            clientAccount = scanner.nextLine();
            invalidAccount = Regex.validate(clientAccount, Regex.USER_NAME_REGEX);
            if (invalidAccount) System.out.println("Wrong format of account. ");
        } while (invalidAccount);
        return clientAccount;
    }

    public static String inputClientPassword() {
        Scanner scanner = new Scanner(System.in);
        String clientPassword;
        boolean invalidPassword;
        do {
            System.out.print("Enter client password: ");
            clientPassword = scanner.nextLine();
            invalidPassword = Regex.validate(clientPassword, Regex.PASSWORD_REGEX);
            if (invalidPassword) System.out.println("Wrong format of password. ");
        } while (invalidPassword);
        return clientPassword;
    }

    public static String inputEmail() {
        Scanner scanner = new Scanner(System.in);
        String clientEmail;
        boolean invalidEmail;
        do {
            System.out.print("Enter client email: ");
            clientEmail = scanner.nextLine();
            invalidEmail = Regex.validate(clientEmail, Regex.LICENSE_REGEX);
            if (invalidEmail) System.out.println("Wrong format of email. ");
        } while (invalidEmail);
        return clientEmail;
    }
}