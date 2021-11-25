package Transaction;

import Wrappers.*;

public class Transfer extends Transaction {
  public Transfer(Money amount, Date date) {super(amount, date);}

  @Override
  public String toString() {return super.date + "                        " + super.amount + "   " ;}
}
