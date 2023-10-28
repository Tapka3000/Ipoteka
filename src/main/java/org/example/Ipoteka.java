package org.example;

public class Ipoteka {
    public static void main(String[] args) {
        int cost = 2500000;
        double firstPayment = 20.0;
        double firstContibution = (double)(cost / 100) * firstPayment;
        System.out.println("Первоначальный взнос " + firstContibution + " рублей");
    }
}
