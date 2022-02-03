package sChap13;

import java.net.Socket;

public class RequestHandler {
    Thread thread = new Thread();

    public void run(Socket socket) {
        System.out.println("run ~ run ~~");
    }
}
