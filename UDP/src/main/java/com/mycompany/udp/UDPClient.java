
package com.mycompany.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPClient {

    public static void main(String[] args) {
        DatagramSocket socket = null;
        
        try {
            socket = new DatagramSocket(); // Create a UDP socket
            
            String message = "Hello, UDP Server!";
            byte[] sendData = message.getBytes();
            
            InetAddress serverAddress = InetAddress.getByName("localhost"); // Server address
            int serverPort = 12345; // Server port
            
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
            socket.send(sendPacket); // Send data to server
            
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket); // Receive response from server
            
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
