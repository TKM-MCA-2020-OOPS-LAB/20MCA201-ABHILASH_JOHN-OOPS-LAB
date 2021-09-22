package CO6Q5;
import java.io.*;
import java.net.*;
public class CO6Q5_MyClient {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",7011);
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF("Client Call!!!");
            dout.flush();
            dout.close();
            socket.close();
        }catch(Exception e){System.out.println(e);}
    }
}