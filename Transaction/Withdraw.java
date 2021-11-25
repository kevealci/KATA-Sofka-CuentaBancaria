package Transaction;

import Wrappers.*;

public class Withdraw extends Transaction{
  public Withdraw(Money amount, Date date) {super(amount, date);}

  @Override
  public String toString() {return super.date + "             " + super.amount + "              " ;}
}
