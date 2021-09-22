package CO6Q5;
import java.io.*;
import java.net.*;
public class CO6Q5_MyServer {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket=new ServerSocket(7011);
            Socket socket=serverSocket.accept();
            //establishes connection

            DataInputStream dis=new DataInputStream(socket.getInputStream());
            String  str=(String)dis.readUTF();
            System.out.println("message= "+str);
            serverSocket.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}