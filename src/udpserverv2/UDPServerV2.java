package udpserverv2;

/**
 *
 * @author Faisal
 */
import java.net.*;
import java.io.*;

public class UDPServerV2 {

    public static void main(String[] args) throws SocketException, IOException{
        DatagramSocket socket = new DatagramSocket(2245);
        
        //Receiving from client
        byte[] bufRcv = new byte[1024];
        DatagramPacket dpRcv = new DatagramPacket(bufRcv, bufRcv.length);
        socket.receive(dpRcv);
        //System.out.println(new String(dpRcv.getData()));
        
        //Seding Data back to client
        //byte[] bufSend = 
        //InetAddress ipAddr = InetAddress.getLocalHost();
        DatagramPacket dpSend = new DatagramPacket(dpRcv.getData(), dpRcv.getLength(), dpRcv.getAddress(), dpRcv.getPort());
        socket.send(dpSend);
    }
    
}
