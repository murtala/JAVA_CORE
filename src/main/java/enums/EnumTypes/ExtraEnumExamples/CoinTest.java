package enums.EnumTypes.ExtraEnumExamples;

public class CoinTest {
    public static void main(String[] args) {
        for (Coin c : Coin.values())
            System.out.println(c + ": \t"
            + c.value() +"¢ \t" + color(c));
    }
    private enum CoinColor { COPPER, NICKEL, SILVER }

    private static CoinColor color(Coin c) {
        switch(c) {
            case PENNY: return CoinColor.COPPER;
            case NICKEL: return CoinColor.NICKEL;
            case DIME:
            case QUARTER: return CoinColor.SILVER;
            default: throw new AssertionError("Unknown coin: " + c);
        }
    }
}