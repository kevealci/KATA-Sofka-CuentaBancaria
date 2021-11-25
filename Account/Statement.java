package Account;

import Movement.*;
import Transaction.*;
import Wrappers.*;

public class Statement {
  private Money globalBalance;
  private MovementList movementList;

  public Statement() {
    this.globalBalance = new Money(0);
    this.movementList = new MovementList();
  }

  public void deposit(Money amount, Date date){
    this.globalBalance = sumAmount(globalBalance, amount);
    movementList.addMovement( new Movement( globalBalance, new Deposit(amount,date) ) );
  }

  public void withDraw(Money amount, Date date) {
    globalBalance = minusAmount(globalBalance,amount);
    movementList.addMovement( new Movement( globalBalance, new Withdraw(amount,date) ) );

  }

  public void sendTransfer(Account account,Money amount, Date date) {
    globalBalance = minusAmount(globalBalance,amount);
    movementList.addMovement( new Movement( globalBalance, new Transfer(amount,date)));
    account.receiveTransfer(amount,date);
  }

  public void receiveTransfer(Money amount, Date date) {
    globalBalance = sumAmount(globalBalance,amount);
    movementList.addMovement( new Movement( globalBalance, new Transfer(amount,date)));
  }

  public Money sumAmount(Money amountA, Money amountB) {return new Money(amountA.getAmount()+amountB.getAmount());}

  public Money minusAmount(Money amountA, Money amountB) {return new Money(amountA.getAmount()-amountB.getAmount());}

  public void printStatements() {movementList.printMovements();}

  public void printDeposits() {movementList.printDeposits();}

  public void printWithDraws() {movementList.printWithDraws();}

  public void printDatesFilter() {movementList.dateFilter();}
}
