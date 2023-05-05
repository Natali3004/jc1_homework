package part5.task26;

import java.util.Scanner;

public class Bankomat {
    int nom20 = 100;
    int nom50 = 10;
    int nom100 = 10;
    int amount;

    public void getAmount() {
        amount = nom20 * 20 + nom50 * 50 + nom100 * 100;
        System.out.println("Your amount: " + amount);
        System.out.println("Number of banknotes of 20 $ : " + nom20);
        System.out.println("Number of banknotes of 50 $ : " + nom50);
        System.out.println("Number of banknotes of 100 $ : " + nom100);
    }

    public void newOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want: put money (0) or withdraw(1) or close the program (2)?");
        int num = scanner.nextInt();
        if (num == 0) {
            putMoney();
        } else if (num == 1) {
            withdrawMoney();
        } else if (num == 2) {
            exitProgramm();
        } else {
            System.out.println("Make the right choice");
            newOperation();
        }
    }

    public void exitProgramm() {
        System.out.println("The program is closed");
        System.exit(0);
    }

    public void putMoney() {
        System.out.println("How much do you put banknotes of 20 $ ?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        nom20 = nom20 + num;
        System.out.println("How much do you put banknotes of 50 $ ?");
        int num1 = scanner.nextInt();
        nom50 = nom50 + num1;
        System.out.println("How much do you put banknotes of 100 $ ?");
        int num2 = scanner.nextInt();
        nom100 = nom100 + num2;
        getAmount();
        newOperation();
    }

    public void withdrawMoney() {
        System.out.println("ATM dispenses 1000 $ at a time only banknotes of 20, 50, 100 dollars. Enter amount for withdrawing: ");
        boolean isNumberCorrect;
        Scanner scan = new Scanner(System.in);
        int num4 = scan.nextInt();
        int summa = nom100 * 100 + nom50 * 50 + nom20 * 20;
        isNumberCorrect = num4 <= summa;
        if (!isNumberCorrect && summa != 0) {
            System.out.println("Amount is not correct. You can withdraw no more than: " + summa + " $ .");
            withdrawMoney();
        } else if (summa == 0) {
            System.out.println("Money ran out. The program is closed");
            getAmount();
        }
        if (isNumberCorrect) {
            if (num4 <= 0 || num4 > 1000) {
                System.out.println("Enter the correct amount to withdraw money");
                withdrawMoney();
            } else if (num4 % 10 != 0 || num4 == 30) {
                withdrawMoney();
            } else if (num4 % 100 == 0 && nom100 >= num4 / 100) {
                nom100 = nom100 - num4 / 100;
                System.out.println("You withdrew: " + num4 + "$ banknotes of 100$ in the amount  " + num4 / 100);
            } else if (num4 % 50 == 0 && nom50 >= num4 / 50) {
                nom50 = nom50 - num4 / 50;
                System.out.println("You withdrew: " + num4 + "$ banknotes of 50$ in the amount  " + num4 / 50);
            } else if (num4 % 20 == 0 && nom20 >= num4 / 20) {
                nom20 = nom20 - num4 / 20;
                System.out.println("You withdrew: " + num4 + "$ banknotes of 20$ in the amount  " + num4 / 20);
            } else if (num4 == 70 && nom20 >= 1 && nom50 >= 1) {
                nom50 = nom50 - 1;
                nom20 = nom20 - 1;
                System.out.println("You withdrew: " + num4 + "$ two banknotes of 50$ and 20$. ");
            } else if (num4 == 90 && nom20 >= 2 && nom50 >= 1) {
                nom50 = nom50 - 1;
                nom20 = nom20 - 2;
                System.out.println("You withdrew: " + num4 + "$ two banknotes of 20$ and one banknote of 50$. ");
            } else if (num4 == 110 && nom20 >= 3 && nom50 >= 1) {
                nom50 = nom50 - 1;
                nom20 = nom20 - 3;
                System.out.println("You withdrew: " + num4 + "$ three banknotes of 20$ and one banknote of 50$.  ");
            } else if (num4 % 100 == 20 && nom100 >= num4 / 100 && nom20 >= 1) {
                nom100 = nom100 - num4 / 100;
                nom20 = nom20 - 1;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 100 + " banknotes of 100$ and one banknote of 20$.  ");
            } else if (num4 % 100 == 20 && nom50 >= num4 / 50 && nom20 >= 1 ) {
                nom50 = nom50 - num4 / 50;
                nom20 = nom20 - 1;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 50 + " banknotes of 50$ and one banknote of 20$.  ");
            } else if (num4 % 100 ==40  && nom100 >= num4 / 100 && nom20 >= 2) {
                nom100 = nom100 - num4 / 100;
                nom20 = nom20 - 2;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 100 + " banknotes of 100$ and two banknotes of 20$.  ");
            } else if (num4 % 100 == 40  && nom50 >= num4 / 50 && nom20 >= 2) {
                nom50 = nom50 - num4 / 50;
                nom20 = nom20 - 2;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 50 + " banknotes of 50$ and two banknotes of 20$.  ");
            } else if (num4 % 100 == 60 && nom100 >= num4 / 100 && nom20 >= 3) {
                nom100 = nom100 - num4 / 100;
                nom20 = nom20 - 3;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 100 + " banknotes of 100$ and three banknotes of 20$.  ");
            } else if (num4 % 100 == 60 && nom20 >= 3 && nom50 >= num4 / 50) {
                nom50 = nom50 - num4 / 50;
                nom20 = nom20 - 3;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 50 + " banknotes of 50$ and three banknotes of 20$.  ");
            } else if (num4 == 130 && nom20 >= 3 && nom50 >= 1) {
                nom50 = nom50 - 1;
                nom20 = nom20 - 3;
                System.out.println("You withdrew: " + num4 + "$ three banknotes of 20$ and one banknote of 50$.  ");
            } else if (num4 == 150 && nom100 == 1 && nom50 >= 2) {
                nom50 = nom50 - 2;
                nom100 = nom100 - 1;
                System.out.println("You withdrew: " + num4 + "$ two banknote of 50$ and one banknote one banknote of 100$.");
            } else if (num4 == 250 && nom100 == 1 && nom50 >= 3) {
                nom50 = nom50 - 3;
                nom100 = nom100 - 1;
                System.out.println("You withdrew: " + num4 + "$ three banknote of 50$ and one banknote one banknote of 100$.");
            } else if (num4 % 50 == 0 && nom100 >= num4 / 100 && nom50 >= 1) {
                nom50 = nom50 - 1;
                nom100 = nom100 - num4 / 100;
                System.out.println("You withdrew: " + num4 + "$ " + num4 / 100 + " banknote of 100$ and one banknote of 50$.");
            } else if (num4 == 170 && nom100 >= 1 && nom50 >= 1 && nom20 >= 1) {
                nom50 = nom50 - 1;
                nom20 = nom20 - 1;
                nom100 = nom100 - 1;
                System.out.println("You withdrew: " + num4 + " three banknotes of 100$, 50$ and 20$.");
            } else if (num4 == 190 && nom100 >= 1 && nom50 >= 1 && nom20 >= 2) {
                nom50 = nom50 - 1;
                nom20 = nom20 - 2;
                nom100 = nom100 - 1;
                System.out.println("You withdrew: " + num4 + " four banknotes of 100$, 50$ and 20$.");
            } else if (num4 % 100 == 70 && nom100 >= num4 / 100 && nom50 >= 1 && nom20 >= 1) {
                nom20 = nom20 - 1;
                nom50 = nom50 - 1;
                nom100 = nom100 - num4 / 100;
                System.out.println("You withdrew: " + num4 + " $ " + num4 / 100 + " banknotes of 100$ and one banknotes of 50$,20$.");
            } else if (num4 % 100 == 90 && nom100 >= num4 / 100 && nom50 >= 1 && nom20 >= 2) {
                nom20 = nom20 - 2;
                nom50 = nom50 - 1;
                nom100 = nom100 - num4 / 100;
                System.out.println("You withdrew: " + num4 + " $ " + num4 / 100 +
                        " banknotes of 100$ and one banknote of 50$, and two - 20$.");
//           TODO:           a lot of options, please check the general approach to solving the task
            } else {
                System.out.println("No banknotes for this amount. Please make another choice. ");
            }
            getAmount();
            newOperation();
        }

    }
}





