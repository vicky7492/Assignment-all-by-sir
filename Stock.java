public class Stock {

private String companyName;
private String stockRating;
private int price;
private int numberOfShares;

public String getCompanyName() {
    return companyName;
}

public int getStockRating() {
    return stockRating;
}

public String getPrice() {
    return price;
}

public int getNumberOfShares() {
    return numberOfShares;
}

public Stock(String companyName, String stockRating, int price, int numberOfShares) {
    super();
    this.companyName = companyName;
    this.stockRating = stockRating;
    this.price = price;
    this.numberOfShares = numberOfShares;
}
}