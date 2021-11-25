package Transaction;

import Wrappers.*;

public class Transaction {
    protected Money amount;
    protected Date date;

    public Transaction(Money amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public Date getDate() {return date;}

    @Override
    public String toString() {return date + "   " + amount;}
}
