package sChap9;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    private void runBasic() {
        RunnableSample runnable = new RunnableSample();
        ThreadSample thread = new ThreadSample();
        new Thread(runnable).start(); //runnable 실행방법
        thread.start();
        System.out.println("RunThreads.runBasic() methods is ended.");
    }
}
