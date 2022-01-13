package chap6;

public class InterestManager {
    //1월10일
    double interestRate = 0.0;

    public double getInterestRate(int day) {
        if(day >= 365) {
            interestRate = day*0.005;
        } else if (day >= 181) {
            interestRate = day * 0.01;
        } else if (day >= 91) {
            interestRate = day * 0.02;
        } else if (day >= 1) {
            interestRate = day * 0.56;
        }
        return interestRate;
    }
    public double calculateAmount(int day, long amount) {
        double rate = getInterestRate(day);
        return rate + amount;
    }
}
