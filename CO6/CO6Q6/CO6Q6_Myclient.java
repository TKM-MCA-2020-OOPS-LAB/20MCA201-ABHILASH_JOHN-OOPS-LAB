package CO6Q6;
import java.io.*;
import java.net.*;
public class CO6Q6_Myclient {
    public static void main(String[] args) throws IOException {
        DatagramSocket client= new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String str ="** Message to Server from Client **";
        byte[] bufBytes = str.getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,9000);
        client.send(datagramPacket);
        client.close();
    }
}