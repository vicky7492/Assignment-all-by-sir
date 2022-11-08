import java.util.*;

public class StockInventory {

private static final int INVENTORY_SIZE = 12;
private Stock [] stocks;

public StockInvetory() {
    stocks = new Stock [INVENTORY_SIZE];

}

private static void StockInventory() {
       for (int i = 0; i<INVENTORY_SIZE; i++){
         Scanner console = new Scanner(System.in);

    System.out.println ("Stock's name:");
    String stockName = console.next();

    System.out.println ("Stock's rating");
    String stockRating= console.next();

    System.out.println ("Stock's price:");
    int stockPrice = console.nextInt();

    System.out.println ("Numbers of shares: ");
    int numberShares= console.nextInt();

          stocks [i]= new Stock(stockName, stockRatings, stockPrice, numberShares);
    }

public static void main (String [] args){
    StockInventory();
}
}
}