package sChap12;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();

    }

    private void sendSocketSample() {
        for(int i=0; i<3; i++) {
            sendSocketData("I liked java at "+new Date());
        }
        sendSocketData("EXIT");
    }

    private void sendSocketData(String s) {
        Socket socket = null;
        try {
            System.out.println("Client : Connecting");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("Client : Connect status = " + socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = s.getBytes();
            out.write(bytes);
            System.out.println("Client : Sent data");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                socket.close();
            }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
