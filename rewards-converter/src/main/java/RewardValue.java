public class RewardValue {
    public double cashValues;
    public double miles;
    RewardValue(double cashValue){
        cashValues = cashValue;
    }


    public double getMilesValue(){
       miles = cashValues * 0.0035;
       return miles;
    }
}
