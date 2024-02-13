package ATM;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    // define an ATM class to represent ATM system. It provides all business requirements.
    // including: showing atm welcome page, open account, etc.

    // storing all user information
    private ArrayList<Account> accounts = new ArrayList<Account>(); // []
    private Scanner sc = new Scanner(System.in);
    private Account loggedAcc; // to remember logged-in user account


    // start ATM system, display welome page
    public void start(){
        while (true) {
            System.out.println("===Welcome to ATM System!===");
            System.out.println("1. User Login");
            System.out.println("2. Open an account");
            System.out.println("Please enter 1 or 2: ");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // user login
                    login();
                    break;
                case 2:
                    createAccount();
                    // open account
                    break;
                default:
                    System.out.println("Your choice can not be recognized!");
            }
        }
    }

    // complete user login operation
    private void login(){
        System.out.println("==System Login==");
        // 1. determine if system has accounts object, only show next step when object exists, else end operation
        if(accounts.size() == 0){
            System.out.println("There is no account in the system! Please open an account first!");
            return; // end login operation
        }

        while (true) {
            // 2. accounts object exist in system, start login operation
            System.out.println("Please enter your card number: ");
            String cardId = sc.next();

            // 3. check if cardid exists
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                // the card number does not exist
                System.out.println("The card number you entered does not match any of our record, please try again!");
            }else {
                while (true) {
                    // card number exists
                    System.out.println("Please enter your password: ");
                    String pw = sc.next();
                    // 4. check if password matches
                    if(acc.getPassword().equals(pw)){
                        loggedAcc = acc;
                        // password matches, login successful
                        System.out.println("Congratulations " + loggedAcc.getName() + " ! You have successfully logged in! Your card number is: " + acc.getId());
                        // display user operation page after login
                        showUserCommand();
                        return; // when show user command ends, go back to start method, so we need to end current login method
                    }else{
                        System.out.println("The password you entered is incorrect! Please try again!");
                    }
                }
            }
        }
    }

    // show user command page after login
    private void showUserCommand(){
        while (true) {
            System.out.println("Hello " + loggedAcc.getName() + "! How can we help you today?====");
            System.out.println("1. Balance check");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Update password");
            System.out.println("6. Log out");
            System.out.println("7. Close account");
            System.out.println("Please make your choice from 1 to 7: ");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    // show account basic info and balance
                    showLoginAccount();
                    break;
                case 2:
                    // deposit
                    depositMoney();
                    break;
                case 3:
                    // withdraw
                    withdrawMoney();
                    break;
                case 4:
                    //transfer
                    transferMoney();
                    break;
                case 5:
                    // password update
                    updatePW();
                    return;
                case 6:
                    // log out, back to welcome page
                    System.out.println(loggedAcc.getName() + ", you have successfully logged out!");
                    return; // end current show user command method, back to start method
                case 7:
                    // close acct
                    if(closeAccount()){
                        // close account successful, back to start(welcome page)
                        return;
                    }
                    break;
                default:
                    System.out.println("Sorry! We could not recognize your choice! Please enter a number from 1 to 7!");
            }
        }

    }

    private void updatePW() {
        System.out.println("==Update Password==");
        while (true) {
            // 1. remind user to verify current password
            System.out.println("Please enter current password: ");
            String pw = sc.next();

            // 2. verify current password
            if(loggedAcc.getPassword().equals(pw)){
                // verification passed
                while (true) {
                    // 3. start updating password
                    System.out.println("Please enter your new password: ");
                    String newPW1 = sc.next();

                    System.out.println("Please confirm your new password: ");
                    String newPW2 = sc.next();

                    // 4. check if passwords match
                    if(newPW2.equals(newPW1)){
                        loggedAcc.setPassword(newPW2);
                        System.out.println("Password update successfully!");
                        return;
                    }else{
                        System.out.println("The passwords you entered does not match! Please enter again!");
                    }
                }
            }else{
                System.out.println("The password you entered is incorrect!");
            }
        }
    }

    // delete account operation
    private boolean closeAccount() {
        System.out.println("==Close Account==");
        // 1. check with user
        System.out.println("Are you sure to close your account? y/n");
        String command = sc.next();
        switch (command){
            case "y":
                // close account operation
                // 2. check if account still has balance
                if(loggedAcc.getBalance() != 0){
                    System.out.println("Sorry! Your account still has money left! Please transfer out or withdraw!");
                    return false;
                }else{
                    accounts.remove(loggedAcc);
                    System.out.println("Account is successfully closed!");
                    return true;
                }
            default:
                System.out.println("Thank you for staying with us!");
                return false;
        }
    }

    private void transferMoney() {
        System.out.println("==Transfer Money==");
        // 1. check if there is other accounts to receive money
        if(accounts.size() < 2){
            System.out.println("There is only one account in system. Can not perform transfer.");
            return;
        }

        // 2. check if account has money
        if(loggedAcc.getBalance() == 0){
            System.out.println("There is no balance for transfer. Can not perform transfer.");
            return;
        }

        while (true) {
            // 3. start transfer process
            System.out.println("Please enter transferee's card number: ");
            String cardId = sc.next();

            // 4. check if card number is correct
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("The card number you entered does not exist");
            }else{
                // account exist, verify last name
                while (true) {
                    System.out.println("Please enter the amount to transfer: " );
                    double money = sc.nextDouble();

                    // 5. check if balance is enough to transfer
                    if(loggedAcc.getBalance() >= money){
                        // can transfer
                        // update both account's balance
                        loggedAcc.setBalance(loggedAcc.getBalance() - money);
                        acc.setBalance(acc.getBalance() + money);
                        System.out.println("Transfer completed! Your new account balance is: " + loggedAcc.getBalance() + ".");
                        return; // end the method, back to show user command
                    }else{
                        // can not transfer
                        System.out.println("Sorry! Your account balance is: " + loggedAcc.getBalance() + ". ");
                    }
                }
            }
        }
    }

    private void withdrawMoney() {
        System.out.println("==Withdraw==");
        // 1. check if account balance is more than $5, if less, only transfer is allowed
        if(loggedAcc.getBalance() < 5){
            System.out.println("Sorry! Your account balance is less than $5! Only deposit or transfer is allowed!");
            return;
        }

        while (true) {
            // 2. let user enter withdrawal amount
            System.out.println("Please enter the amount you want to withdraw: ");
            double money = sc.nextDouble();

            // 3. check if balance is enough for withdrawal
            if(loggedAcc.getBalance() >= money){
                // enough money to withdraw
                // 4. check if amount entered is over limit
                if(money > loggedAcc.getLimit()){
                    System.out.println("Sorry! Your withdrawal limit is $" + loggedAcc.getLimit() + ".");
                }else{
                    // now user can withdraw, update balance
                    loggedAcc.setBalance(loggedAcc.getBalance() - money);
                    System.out.println("Your request to withdraw $" + money + " is successful!");
                    System.out.println("Your current balance is $" + loggedAcc.getBalance() + ".");
                    break; // end while, then nothing to run, so withdraw money method will stop, back to show user command method
                }
            }else{
                System.out.println("Sorry! Your account balance is $" + loggedAcc.getBalance() + ".");
            }
        }
    }

    private void depositMoney() {
        System.out.println("==Deposit==");
        System.out.println("Please enter your deposit amount: ");
        double money = sc.nextDouble();

        // Update account balance
        loggedAcc.setBalance(loggedAcc.getBalance() + money);
        System.out.println("Congratulations! You have successfully deposited " + money + "!");
        System.out.println("Your current balance is： " + loggedAcc.getBalance() + ".");
    }

    private void showLoginAccount() {
        System.out.println("==Your Account Information==");
        System.out.println("Card Number: " + loggedAcc.getId());
        System.out.println("Name: " + loggedAcc.getName());
        System.out.println("Gender: " + loggedAcc.getGender());
        System.out.println("Account Balance: " + loggedAcc.getBalance());
        System.out.println("Withdrawal Limit: " + loggedAcc.getLimit());
    }

    // complete account opening operation
    private void createAccount(){
        System.out.println("==Bank account opening operation==");
        // 1. create an account object to encapsulate user account info
        Account acc = new Account();
        sc.useDelimiter("\n");

        //2. user input account opening info, assign them to account object
        System.out.println("Please enter your name: ");
        String name = sc.next();
        acc.setName(name);

        while (true) {
            System.out.println("Please enter your gender(M/F/L/G/B/T/Q): ");
            char gender = sc.next().charAt(0);
            if (gender == 'M' || gender == 'F'|| gender == 'L'|| gender == 'G'|| gender == 'B'|| gender == 'T'|| gender == 'Q') {
                acc.setGender(gender);
                break;
            }else{
                System.out.println("The gender you entered is unrecognized. Please enter again!");
            }
        }

        while (true) {
            System.out.println("Please enter your account password: ");
            String pw1 = sc.next();
            System.out.println("Please confirm your account password: ");
            String pw2 = sc.next();
            if(pw1.equals(pw2)){
                acc.setPassword(pw2);
                break;
            }else{
                System.out.println("The 2 passwords you entered are not the same! Please try again!");
            }
        }

        System.out.println("Please enter your withdrawal limit for each withdraw: ");
        double limit = sc.nextDouble();
        acc.setLimit(limit);

        // we also need to generate a distinct card number for this account(automatically generated by system, 8 digits)
        String newCardNumber = createCardNumber();
        acc.setId(newCardNumber);

        //3. store the account object to accounts collection
        accounts.add(acc);
        System.out.println("Congratulations " + acc.getName() + "! Your account is opened successfully! " );
        System.out.println("Your card number is: " + newCardNumber);
    }

    //return a distinct 8 digits card number
    private String createCardNumber(){
        while (true) {
            // 1. define a 8 digits String to record card number
            String cardNumber = "";

            // 2. loop 8 times to generate 8 random digit to concatenate to cardNumber
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int digit = r.nextInt(10); // 0~9
                cardNumber += digit;
            }

            // 3. determine if the card number we just generated is already exist, we can only return new card number
            // use another function because we will use this method in later user login or account transfer
            Account acc = getAccountByCardId(cardNumber);
            if(acc == null){
                // could not find account object by card number, which means card number does not exist yet, return
                return cardNumber;
            }
        }
    }

    // return account object by card number
    private Account getAccountByCardId(String cardId){
        // iterate all account objects
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            // determine if acc's card number is the one we are searching for
            if(acc.getId().equals(cardId)){
                return acc;
            }
        }
        return null; // card number does not exist
    }
}
