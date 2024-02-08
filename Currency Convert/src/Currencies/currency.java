package Currencies;
//Used to connect the currencies and to complete calculations of each conversion
//enables conversion to and from CAD
//Each currency subclass has its own exchange rate that is made in response to our default CAD
public abstract class currency {

    private final double convertToCAD;
    //Constructs a currency object with its specified exchange rate to CAD
    public currency(double convertToCAD) {
        this.convertToCAD = convertToCAD;
    }
    //converts a currency to CAD
    public double toCAD(double amount) {
        return amount * convertToCAD;
    }
    // converts a value from CAD to another currency
    public double fromCAD(double amount) {
        return amount / convertToCAD;
    }
}