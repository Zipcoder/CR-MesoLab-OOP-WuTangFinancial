package susnick_andrea_exchangeRateLab;

public enum Currency {

    USA_DOLLAR(1.00),
    EURO(0.94),
    BRITISH_POUND(0.82),
    INDIAN_RUPEE(68.32),
    AUSTRALIAN_DOLLAR(1.35),
    CANADIAN_DOLLAR(1.32),
    SINGAPORE_DOLLAR(1.43),
    SWISS_FRANC(1.01),
    MALAYSIAN_RINGGIT(4.47),
    JAPAN_YEN(115.84),
    CHINESE_YUAN_RENMINBI(6.92);

    final double exchangeRate;

    Currency(double exchangeRate){
        this.exchangeRate = exchangeRate;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }
}
