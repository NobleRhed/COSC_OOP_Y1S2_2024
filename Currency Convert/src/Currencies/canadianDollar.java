package Currencies;
//extends the abstract currency class
//Allows the framework for conversion to and from CAD
//CAD was chosen as the base rate

public class canadianDollar extends currency {
    //Contrscts a CanadianDollar object with the defined exchange rate
    //its the base, so the rate is set to 1
    public canadianDollar() {
        super(1); //Exchange rate: 1
    }

//Override so that conversion from CAD to CAD just results in the same value
//As mentioned above, CAD is the default so we need the input to return with no conversion
    @Override
    public double toCAD(double cash) {
        return cash;
    }
    @Override
    public double fromCAD(double cash) {
        return cash;
    }

}
