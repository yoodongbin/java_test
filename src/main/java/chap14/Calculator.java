package chap14;

import com.sun.source.tree.InstanceOfTree;

public class Calculator {

    public static void main(String[] args) throws zeroException{

        Calculator cal = new Calculator();
        cal.printDivide(1,2);
        cal.printDivide(1,0);
    }
    public void printDivide(double d1, double d2) throws zeroException{
        double result = 0.0;
        try {
            result = d1 / d2;
            if(result>=0) {
                throw new zeroException("0으로 나누면 나누기가 되겠니 ?");
            }
        }catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println(result);
    }

    public class zeroException extends Exception
    {
        public zeroException() {
            super();
        }
        public zeroException(String message) {
            super(message);
        }
    }
}
