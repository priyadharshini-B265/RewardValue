public class RewardValue {
    public double cashValues;
    public static double ConversionRate = 0.0035;
    public RewardValue(double cashValue){
        this.cashValues = cashValue;
    }
    public RewardValue(int milesValue){

        this.cashValues = convertToCash(milesValue);
    }
    private static int convertToMiles(double cashValues){

        return (int) (cashValues/ConversionRate);
    }
    private static double convertToCash(int milesValue){

        return milesValue*ConversionRate;
    }
    public double getMilesValue(){

        return convertToMiles(this.cashValues);
    }
    public double getCashValues(){

        return cashValues;
    }
}
