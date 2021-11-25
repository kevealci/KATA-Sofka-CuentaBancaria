package Admin;

import Account.*;
import Wrappers.Date;
import Wrappers.Money;

public class StartApp {
  public static void main(String[] args) {
    Account accountA = new Account(new Statement());

    accountA.deposit(new Money(1000), new Date("24/11/2021"));
    accountA.deposit(new Money(2000), new Date("25/11/2021"));
    accountA.withDraw(new Money(700), new Date("26/11/2021"));

    Account accountB = new Account(new Statement());
    accountB.deposit(new Money(1500), new Date("28/11/2021"));
    accountB.deposit(new Money(500), new Date("27/11/2021"));
    accountB.withDraw(new Money(200), new Date("27/11/2021"));

    accountA.sendTransfer(accountB,new Money(500),new Date("29/11/2021"));

    accountA.printStatements();
    accountB.printStatements();

    accountA.printDeposits();
    accountB.printWithDraws();
    accountA.printDatesFilter();

  }
}
