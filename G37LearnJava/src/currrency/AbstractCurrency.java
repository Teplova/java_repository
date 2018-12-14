package currrency;

/**
 * Created by 123 on 16.10.2018.
 */
abstract public class AbstractCurrency {
    private double kursNBU;
    private double margine = 10;



    public AbstractCurrency(double baseKurs) {

        this.kursNBU = baseKurs;
    }


    public double getKursNBU() {
        return kursNBU;

    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMargine() {
        return margine;

    }

    abstract public String getCurrencyName();


    public void setMargine(double baseMargine) {
        this.margine = baseMargine;
    }

    public  double convertGrnToCurrency(int grnValue) {
        double tempResult = grnValue / kursNBU * (1 - margine / 100);
        System.out.println("Convert " + grnValue + " to " + tempResult+" "+ getCurrencyName());
        return tempResult;
    }

    public  double convertCurrancyrToGrn(int currencyValue){
        double tempResult = currencyValue* kursNBU*(1-margine / 100);
        System.out.println(
                String.format("Convert %s %s to %s grn", currencyValue, getCurrencyName(), tempResult
                ));
        return tempResult;
    }




}

