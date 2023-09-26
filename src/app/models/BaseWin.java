package app.models;

public class BaseWin {
    private double result;

    public BaseWin(double deposit, int winPercent, int taxPercent) {
        result = deposit / 100 * winPercent;
        if (taxPercent != 0) {
            result = result - (result / 100 * taxPercent);
        }
    }

    public double getWinAmount() {
        return result;
    }
}
