public class RewardValue {
    double cash;
    double miles;
    public RewardValue(double cash) {
        this.cash = cash;
        miles = cash * 0.0035;
    }

    public double getCashValue(){
        return cash;
    }
    public double getMilesValue(){
        return miles;
    }
}