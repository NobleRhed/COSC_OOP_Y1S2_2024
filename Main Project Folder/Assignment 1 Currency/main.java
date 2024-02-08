/* construct a unit converison program for currency */

public class cashConvert {
    
    private double canadianDollar = 1.00;
    private double usaDollar = 0.74;
    private double britPound = 0.59;
    private double chineseYuan = 5.27;
    private double japYen = 109.72;

    private double currencyConvert;
}
/*Pick a value and convert between one to the other */
public cashConvert(String unit){
    if unit = CAD{
        currencyConvert = canadianDollar;
    }
    else if unit = USD {
        currencyConvert = usaDollar;
    }
    else if unit = GBP { 
        currencyConvert = britPound;
    }
    else if unit = RMB {
        currencyConvert = chineseYuan;
    }
    else if unit = JPY {
        currencyConvert = japYen;
    }
}