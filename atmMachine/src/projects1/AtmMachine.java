package projects1;

import java.util.Scanner;

public class AtmMachine {
    private  double totalBal = 100;
    Scanner scn = new Scanner(System.in);

    public int userAccount(){
        System.out.print("Enter your account number: ");
        int account;
        account = scn.nextInt();
        return account;
    }

    public int userPin(){
        System.out.print("Enter your pin number: ");
        int pin ;
        pin = scn.nextInt();
        return pin;
    }

    public void startAtm(){
        userAccount();
        userPin();
        drawMainMenu();
    }

    private void drawMainMenu() {
        int selection;
        System.out.println("\nATM main menu");
        System.out.println("1 - View account balance");
        System.out.println("2 - Withdraw  funds");
        System.out.println("3 - Add funds");
        System.out.println("4 - Terminate transaction");
        System.out.println("Choice: ");
        selection = scn.nextInt();

        switch (selection){
            case 1:
                viewAccountInfo();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                addFunds();
                break;
            case 4:
                System.out.println("Thank you for using this ATM!!! GOODBYE");
        }
    }




    private void viewAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("\t -- Total balance: $"+totalBal);
        drawMainMenu();
    }
    public void deposit(int depAmount){
        System.out.println("\n***Please insert your money now...***");
        totalBal = totalBal + depAmount;
    }
    public void checkNsf(int withdrawAmount){
        if(totalBal - withdrawAmount < 0){
            System.out.println("\n*** ERROR!!! Insufficient funds in your account***");

        }else{
            totalBal = totalBal - withdrawAmount;
            System.out.println("\n*** Please take your money now...***");
        }
    }

    private void addFunds() {
        int addSelection;
        System.out.println("Deposit funds:");
        System.out.println("1 - $20");
        System.out.println("2 - $40");
        System.out.println("3 - $60");
        System.out.println("4 - $100");
        System.out.println("5 - Back to main menu");
        System.out.println("Choice:");
        addSelection = scn.nextInt();
        switch (addSelection){
            case 1:
                deposit(20);
                drawMainMenu();
                break;
            case 2:
                deposit(40);
                drawMainMenu();
                break;
            case 3:
                deposit(60);
                drawMainMenu();
                break;
            case 4:
                deposit(100);
                drawMainMenu();
                break;
            case 5:
                drawMainMenu();
                break;
        }
    }

    private void withdraw() {
        int withdrawSelection;
        System.out.println("Withdraw money:");
        System.out.println("1 - $20");
        System.out.println("2 - $40");
        System.out.println("3  - $60");
        System.out.println("4 - $100");
        System.out.println("5 - Back to main menu");
        System.out.println("Choice:");
        withdrawSelection = scn.nextInt();
        switch (withdrawSelection){
            case 1:
               checkNsf(20);
                drawMainMenu();
                break;
            case 2:
                checkNsf(40);
                drawMainMenu();
                break;
            case 3:
                checkNsf(60);
                drawMainMenu();
                break;
            case 4:
                checkNsf(100);
                drawMainMenu();
                break;
            case 5:
                drawMainMenu();
                break;
        }
    }

}
