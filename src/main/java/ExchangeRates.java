import java.math.BigDecimal;

/**
 * Created by andrewwong on 5/22/17.
 */
public class ExchangeRates {
    private static final BigDecimal USD = new BigDecimal(1.00);
    private static final BigDecimal EUR = new BigDecimal(0.94);
    private static final BigDecimal GBP = new BigDecimal(0.82);
    private static final BigDecimal INR = new BigDecimal (68.32);
    private static final BigDecimal AUD = new BigDecimal(1.35);
    private static final BigDecimal CAD = new BigDecimal(1.32);
    private static final BigDecimal SGD = new BigDecimal(1.43);
    private static final BigDecimal CHF = new BigDecimal(1.01);
    private static final BigDecimal MYR = new BigDecimal(4.47);
    private static final BigDecimal JPY = new BigDecimal(115.84);
    private static final BigDecimal CNY = new BigDecimal(6.92);

    public static BigDecimal getUSD() {
        return USD;
    }

    public static BigDecimal getEUR() {
        return EUR;
    }

    public static BigDecimal getGBP() {
        return GBP;
    }

    public static BigDecimal getINR() {
        return INR;
    }

    public static BigDecimal getAUD() {
        return AUD;
    }

    public static BigDecimal getCAD() {
        return CAD;
    }

    public static BigDecimal getSGD() {
        return SGD;
    }

    public static BigDecimal getCHF() {
        return CHF;
    }

    public static BigDecimal getMYR() {
        return MYR;
    }

    public static BigDecimal getJPY() {
        return JPY;
    }

    public static BigDecimal getCNY() {
        return CNY;
    }

    public BigDecimal selectMenuOption(String s) throws InvalidMenuSelection{
        switch(s){
            case "1":
                return USD;
            case "2":
                return EUR;
            case "3":
                return GBP;
            case "4":
                return INR;
            case "5":
                return AUD;
            case "6":
                return CAD;
            case "7":
                return SGD;
            case "8":
                return CHF;
            case "9":
                return MYR;
            case "10":
                return JPY;
            case "11":
                return CNY;
            default:
                throw new InvalidMenuSelection();
        }
    }
}
