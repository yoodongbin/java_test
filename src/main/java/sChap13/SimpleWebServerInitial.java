package sChap13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerInitial {

    public static void main(String[] args) {
        SimpleWebServerInitial server = new SimpleWebServerInitial();
        int port = 9000;
        server.start(port);
    }
    private final int BUFFER_SIZE = 2048;
    private void start(int port) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(port);
            while (true) {
                Socket socket = server.accept(); //새로운 소켓 연결을 기다리고, 연결이 되면 socket 객체를 리턴
                //REQUEST READ
                InputStream request = new BufferedInputStream(socket.getInputStream());
                byte[] receivedBytes = new byte[BUFFER_SIZE];
                request.read(receivedBytes);
                String requestData = new String(receivedBytes).trim();
                System.out.println("RequestData=\n"+requestData);
                System.out.println("--------------------------");

                //make response data and response
                PrintStream response = new PrintStream(
                        socket.getOutputStream()
                );
                response.println("HTTP/1.1 200 ok");
                response.println("connect - type : text / html");
                response.println();
                response.print("It is working");
                response.flush();
                response.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(server != null) {
                try {
                    server.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
