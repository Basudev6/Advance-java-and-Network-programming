
package com.mycompany.udp;


import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
           DatagramSocket socket = null;
        
        try {
            socket = new DatagramSocket(12345); // Create a UDP socket on port 9876
            
            byte[] receiveData = new byte[1024];
            
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket); // Receive data from client
                
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from client: " + message);
                
                // Respond to the client
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String response = "Hello, UDP Client";
                byte[] responseData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }
}
