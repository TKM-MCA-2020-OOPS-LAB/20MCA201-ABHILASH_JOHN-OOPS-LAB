package CO6Q6;
import java.io.*;
import java.net.*;

public class CO6Q6_Myserver {
    public static void main(String[] args) throws IOException {
        DatagramSocket server=new DatagramSocket(9000);
        byte[] buf=new byte[256];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        server.receive(packet);
        String response =new String(packet.getData());
        System.out.println(" Server : "+response);
        server.close();
    }
}
