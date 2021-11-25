package Movement;

import Transaction.*;
import Wrappers.*;

public class Movement {
  private Money balance;
  private Transaction transaction;

  public Movement(Money balance, Deposit deposit) {
    this.balance = balance;
    this.transaction = deposit;
  }

  public Movement(Money balance, Withdraw withdraw) {
    this.balance = balance;
    this.transaction = withdraw;
  }

  public Movement(Money balance, Transfer transfer) {
    this.balance = balance;
    this.transaction = transfer;
  }

  public boolean isDeposit() {return transaction instanceof Deposit;}

  public boolean isWithDraw() {return transaction instanceof Withdraw;}

  public void DateFilter() {System.out.println(transaction.getDate() + "                                   " + balance);}

  @Override
  public String toString() {
    return transaction + "   " + balance;
  }
}
