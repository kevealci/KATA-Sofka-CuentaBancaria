package Test;

import Transaction.Transaction;
import Transaction.Deposit;
import Transaction.Withdraw;
import Wrappers.Date;
import Wrappers.Money;

public class TransactionTest {
  public static void main(String[] args) {

    Deposit depositHerencia = new Deposit(new Money(1000), new Date("10/01/2021"));
    Withdraw withdrawHerencia = new Withdraw(new Money(2000), new Date("20/01/2021"));

    System.out.println(depositHerencia);
    System.out.println(withdrawHerencia);


    System.out.println(depositHerencia instanceof Transaction);
    System.out.println(withdrawHerencia instanceof Transaction);

    Transaction deposit = new Deposit(new Money(1000), new Date("10/01/2021"));
    Transaction withdraw = new Withdraw(new Money(2000), new Date("20/01/2021"));

    System.out.println(deposit);
    System.out.println(withdraw);


  }
}
