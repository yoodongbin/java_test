package sChap8;

import java.math.BigDecimal;

public class BigDecimalCalcSample {

    public static void main(String[] args) {
        BigDecimalCalcSample sample = new BigDecimalCalcSample();
        sample.normalDoubleCalc();
    }

    private void normalDoubleCalc() {

        BigDecimal value = new BigDecimal("1.0");
        BigDecimal addValue = new BigDecimal("0.1");
        for(int loop = 0; loop<10; loop++) {
            value = value.add(addValue);
            System.out.println(value);
        }

    }

}
