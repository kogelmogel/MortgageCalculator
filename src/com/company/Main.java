package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

	    Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int totalAmount = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float interestRate = scanner.nextFloat();
        float monthlyInterestRate = interestRate / percent / monthsInYear;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * monthsInYear;

        double mortgage = totalAmount
                        * (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfPayments))
                        / (Math.pow(1+monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
