package currrency;

/**
 * Created by 123 on 16.10.2018.
 */
public class Euro extends AbstractCurrency {


    public Euro(double baseKurs) {
        super(baseKurs);
    }

    @Override
    public String getCurrencyName() {
        return "Euro";
    }
}
