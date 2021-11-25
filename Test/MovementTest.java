package Test;

import Movement.Movement;
import Transaction.Deposit;
import Transaction.Withdraw;
import Wrappers.Date;
import Wrappers.Money;

public class MovementTest {
  public static void main(String[] args) {

    Money moneyA = new Money(1300);
    Deposit deposit = new Deposit(new Money(300), new Date("10/01/2021"));
    Movement movementA = new Movement(moneyA, deposit);

    Money moneyB = new Money(1500);
    Withdraw withdraw = new Withdraw(new Money(500), new Date("20/01/2021"));
    Movement movementB = new Movement(moneyB, withdraw);

    System.out.println(movementA);
    System.out.println(movementB);
  }
}
