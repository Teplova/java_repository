package currrency;

/**
 * Created by 123 on 16.10.2018.
 */
public class Dollar extends AbstractCurrency implements FreeConverted {


    public Dollar(double baseKurs) {
        super(baseKurs);
    }

    @Override
    public String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isfreeConverted() {
        return true;
    }
}
