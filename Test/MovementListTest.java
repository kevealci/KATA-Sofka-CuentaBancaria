package Test;

import Movement.*;
import Transaction.Deposit;
import Transaction.Withdraw;
import Wrappers.Date;
import Wrappers.Money;

public class MovementListTest {
  public static void main(String[] args) {

    Deposit depositA = new Deposit(new Money(300), new Date("11/01/2021"));
    Movement movementA = new Movement(new Money(1000), depositA);

    Deposit depositB = new Deposit(new Money(300), new Date("10/02/2021"));
    Movement movementB = new Movement(new Money(500), depositB);

    Withdraw withdrawA = new Withdraw(new Money(500), new Date("22/03/2021"));
    Movement movementC = new Movement(new Money(1000), withdrawA);

    Withdraw withdrawB = new Withdraw(new Money(200), new Date("20/04/2021"));
    Movement movementD = new Movement(new Money(600), withdrawB);

    MovementList movementList = new MovementList();
    movementList.addMovement(movementA);
    movementList.addMovement(movementB);
    movementList.addMovement(movementC);
    movementList.addMovement(movementD);

    movementList.printHeader();
    movementList.printDeposits();
    movementList.printHeader();
    movementList.printWithDraws();
    movementList.printHeader();
    movementList.dateFilter();
    movementList.printHeader();
    movementList.printMovements();

  }
}
