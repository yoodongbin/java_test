package sChap15;

import java.util.concurrent.RecursiveTask;
public class GetSum extends RecursiveTask<Long> {
    long from, to;

    public GetSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Long compute() {
        long gap = to - from;
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }

        log("From = " + from + " To=" + to);

        if(gap <= 3) {
            long tempSum = 0;
            for(long loop=from; loop<= to; loop++) {
                tempSum += loop;
            }
            log("Return!! = " + from + " To=" + to);
            return tempSum;
        }
        long middle = (from+to)/2;
        GetSum sumPre = new GetSum(from, middle);
        log("Pre   From="+from+"   To="+middle);
        sumPre.fork();
        GetSum sumPost = new GetSum(middle+1, to);
        log("Post   From="+from+"   To="+middle);
        return sumPost.compute()+sumPre.join();
    }

    public void log(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "  " +message);
//        System.out.println(message);
    }
}
