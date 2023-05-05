public class RewardValue {
    /* Accepts a cash value and returns the corresponding value in miles
       Must have two constructors: one that accepts a cash value and one that accepts a value in miles.
       Must have a getCashValue() method, which returns the cash value of the RewardValue.
       Must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
       Must convert from miles to cash at a rate of 0.0035. */
    public double cashValue;
    public double milesValue = cashValue * 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
