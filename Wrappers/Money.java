package Wrappers;

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {return String.valueOf(amount);}
}
