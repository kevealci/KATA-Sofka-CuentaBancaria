package Transaction;

import Wrappers.*;

public class Deposit extends Transaction{
  public Deposit(Money amount, Date date) {super(amount, date);}

  @Override
  public String toString() {return super.date + "   " + super.amount + "                       ";}
}
