package com.mindera.mindswap;

import com.mindera.mindswap.utils.Messages;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ServerUDP {
    private final int PORT = 8080;
    private List<String> messages;

    public static void main(String[] args) {

        ServerUDP serverUDP = new ServerUDP();
        try {
            serverUDP.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ServerUDP() {
        messages = new ArrayList<>();
    }

    private void start() throws IOException {

        getMessages();
        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {

            // buffer
            byte[] receiveData = new byte[1024];

            while (serverSocket.isBound()) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                System.out.println(Messages.WAITING);

                serverSocket.receive(receivePacket); // BLOCKING

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.printf(Messages.RECEIVED, message);

                if (!message.equalsIgnoreCase(Messages.HIT_ME)) {
                    sendMessage(serverSocket, receivePacket, Messages.INSTRUCTIONS);
                    System.out.println(Messages.ERROR_MESSAGE_SENT);
                    continue;
                }
                sendMessage(serverSocket, receivePacket, getRandomMessage());
            }
        }
    }

    private void getMessages() throws IOException {
        Files.lines(Paths.get("resources/inspirationalDB.txt"))
                .forEach(messages::add);
    }

    private void sendMessage(DatagramSocket serverSocket, DatagramPacket receivePacket, String message) throws IOException {
        InetAddress address = receivePacket.getAddress();
        int port = receivePacket.getPort();
        String messageToSend = message + "\n";
        DatagramPacket sendPacket = new DatagramPacket(messageToSend.getBytes(), messageToSend.getBytes().length, address, port);
        serverSocket.send(sendPacket);
    }

    private String getRandomMessage() {
        int index = (int) (Math.random() * messages.size());
        return messages.get(index);
    }
}
