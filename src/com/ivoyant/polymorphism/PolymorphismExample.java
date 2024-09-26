package com.ivoyant.polymorphism;

class Payment {
    void processPayment(double amount) {
        System.out.println("Payments class");
    }
}

class Paytm extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paying amount from paytm of Rs:" + amount);
    }
}

class CashPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Paying amount from cash of Rs:" + amount);
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Payment paytm = new Paytm();
        Payment cashPayment = new CashPayment();

        paymentGateway(paytm, 500.0);
        paymentGateway(cashPayment, 7000.0);
    }

    static void paymentGateway(Payment payment, double amount) {
        payment.processPayment(amount);
    }
}