package chap14;

public class ExceptionSample {
    public static void main(String[] args) throws MyException {
        ExceptionSample sample = new ExceptionSample();
//        sample.arrayOutOfBounds();
//        sample.finallySample();
        sample.throwException2(15);

    }
    public void arrayOutOfBounds() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
            System.out.println("This code should run.");
        }catch (Exception e) {
            System.out.println("exception occured");
        }
        System.out.println("out of try catch block ");
    }

    public void finallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        }catch (Exception e) {
            System.out.println(intArray.length);
        }finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code should run");
    }

    public void throwException2(int number) throws MyException {
        try {
            if(number > 12) {
                throw new MyException("number is over than 12");
            }
        }catch (MyException e) {
            e.printStackTrace();
        }
    }

    private class MyException extends Exception {
        public MyException() {
            super();
        }

        public MyException(String message) {
            super(message);
        }
    }
}
