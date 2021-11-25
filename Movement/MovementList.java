package Movement;

import java.util.ArrayList;

public class MovementList {

  private ArrayList<Movement> movements;

  public MovementList() {this.movements = new ArrayList<Movement>();}

  public void addMovement(Movement movement) {movements.add(movement);}

  public ArrayList<Movement> depositFilter() {
    ArrayList<Movement> deposits = new ArrayList<Movement>();
    movements.forEach(movement -> { if(movement.isDeposit()) deposits.add(movement);});
    return deposits;
  }

  private ArrayList<Movement> withDrawFilter() {
    ArrayList<Movement> withDraws = new ArrayList<Movement>();
    movements.forEach(movement -> {if(movement.isWithDraw()) withDraws.add(movement);});
    return withDraws;
  }

  public void dateFilter() {printHeader();movements.forEach(Movement::DateFilter);}

  private void printFilter(ArrayList<Movement> movements) {movements.forEach(System.out::println);}

  public void printWithDraws() {printHeader();printFilter(withDrawFilter());}

  public void printDeposits() {printHeader();printFilter(depositFilter());}

  public void printMovements() {printHeader();printFilter(movements);}

  public void printHeader() {
    System.out.println("----------------Movements----------------");
    System.out.println("   Date     Deposit   WithDraw   Transfer   Balance");
  }
}
