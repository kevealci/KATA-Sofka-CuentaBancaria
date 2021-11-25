package Account;

import Wrappers.*;

public class Account {
  private Statement statement;

  public Account(Statement statement){
    this.statement = statement;
  }

  public void deposit(Money amount, Date date) {statement.deposit(amount,date);}

  public void withDraw(Money amount, Date date) {statement.withDraw(amount,date);}

  public void sendTransfer(Account account, Money amount, Date date) {statement.sendTransfer(account,amount,date);}

  public void receiveTransfer(Money amount, Date date) {statement.receiveTransfer(amount,date);}

  public void printStatements() {statement.printStatements();}

  public void printDeposits() {statement.printDeposits();}

  public void printWithDraws() {statement.printWithDraws();}

  public void printDatesFilter() {statement.printDatesFilter();}
}
